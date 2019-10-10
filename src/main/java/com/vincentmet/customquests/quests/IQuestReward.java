package com.vincentmet.customquests.quests;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public interface IQuestReward {
    void executeReward(PlayerEntity player);
    String toString();
    ItemStack getItemStack();
    JsonObject getJson();
}
