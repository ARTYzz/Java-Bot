package com.artyz.Bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import javax.security.auth.login.LoginException;

public class connectBot {

    private static JDA jda;

        public static void connect() {
            JDABuilder builder = JDABuilder.createDefault("token");

            // Disable parts of the cache
            builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
            // Enable the bulk delete event
            builder.setBulkDeleteSplittingEnabled(false);
            // Set activity (like "playing Something")
            builder.setActivity(Activity.watching("TV"));

            try {
                builder.build();
            } catch (LoginException e) {
                e.printStackTrace();
            }

        }
}
