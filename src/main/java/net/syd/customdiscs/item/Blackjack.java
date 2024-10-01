package net.syd.customdiscs.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtInt;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;

public class Blackjack extends Item {
    public Blackjack(Settings settings) {
        super(settings);
    }

    //use to create deck/reshuffle
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        NbtCompound nbt = stack.getOrCreateNbt();
        //if (!nbt.contains("scores")) {
            NbtList scores = new NbtList(); // Initialize the list for scores
            nbt.put("scores", scores);
       // }
       // if (!nbt.contains("cardsLeft")) {
           addCardsToNBT(nbt);
       // }

       // if (!nbt.contains("cardsDrawn")) {
            nbt.putInt("cardsLeftNum", 0); // Initialize cards drawn
       // }


        // user.sendMessage(Text.literal("Deck reshuffled!"), false);
        return TypedActionResult.pass(stack);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {

        if (!context.getWorld().isClient) {
            outputCardValue(context.getPlayer());
        }
        return ActionResult.SUCCESS;
    }

    private void outputCardValue(PlayerEntity player) {
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);
        NbtCompound nbt = stack.getNbt();
        if (nbt != null) {
            String card = drawCard(nbt);
            player.sendMessage(Text.literal(card), false);
            player.sendMessage(Text.literal("Cards left in deck: " + cardsLeft(nbt)), false);
        }
    }
    private void addCardsToNBT(NbtCompound nbt) {
        // Create an NbtList to store the drawn cards
        ArrayList<String> cardsLeft = createDeck();
        NbtList cardsLeftList = new NbtList();

        // Iterate over the ArrayList and add each card to the NbtList
        for (String card : cardsLeft) {
            cardsLeftList.add(NbtString.of(card)); // Convert each string to NbtString and add it
        }

        // Store the NbtList in the NbtCompound
        nbt.put("cardsLeft", cardsLeftList);
    }
    private ArrayList<String> createDeck() {
        ArrayList<String> cards = new ArrayList<>();
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        for (String suit : suits) {
            for (int j = 0; j < 13; j++) {
                String num;
                if (j == 0) {
                    num = "A"; // Ace
                } else if (j <= 10) {
                    num = Integer.toString(j + 1); // 2-10
                } else {
                    String[] faceCards = {"Jack", "Queen", "King"};
                    num = faceCards[j - 11]; // J, Q, K
                }
                cards.add(num + " of " + suit);
            }
        }
        Collections.shuffle(cards); // Shuffle the deck
        return cards;
    }

    // Method to draw a card
    public String drawCard(NbtCompound nbt) {
        NbtList cardsLeftList = nbt.getList("cardsLeft", 8);
        if (cardsLeftList.isEmpty()) {
            return "No cards left in the deck!";
        }

        String drawnCard = cardsLeftList.remove(cardsLeftList.size() - 1).asString(); // Draw the last card
        nbt.put("cardsLeft", cardsLeftList); // Update NBT with remaining cards

        // Update drawn cards count
        int cardsDrawn = nbt.getInt("cardsDrawn");
        nbt.putInt("cardsDrawn", cardsDrawn + 1);

        return drawnCard;
    }

    public int cardsLeft(NbtCompound nbt) {
        NbtList cardsLeftList = nbt.getList("cardsLeft", 8);
        return cardsLeftList.size();
    }

}