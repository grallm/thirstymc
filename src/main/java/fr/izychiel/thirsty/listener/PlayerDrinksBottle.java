package fr.izychiel.thirsty.listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerDrinksBottle implements Listener {
    @EventHandler
    private void onDrinkWater (PlayerItemConsumeEvent e){
        if(e.getItem().getType() == Material.POTION) {
            List<PotionType> badBottles = new ArrayList<PotionType>(Arrays.asList(PotionType.AWKWARD, PotionType.THICK, PotionType.MUNDANE));
            PotionMeta drinkedPotion = (PotionMeta) e.getItem().getItemMeta();

            // If water
            if (drinkedPotion.getBasePotionData().getType() == PotionType.WATER) {
                e.getPlayer().sendMessage("BU !");

            }else if(badBottles.contains(drinkedPotion.getBasePotionData().getType())){ // Drinked other potion
                e.getPlayer().sendMessage("Potion");
            }

        }else if(e.getItem().getType() == Material.MILK_BUCKET) { // Drinked milk
            e.getPlayer().sendMessage("Lait");
        }
    }
}
