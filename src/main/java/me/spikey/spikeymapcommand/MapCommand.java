package me.spikey.spikeymapcommand;


import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;




public class MapCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        ComponentBuilder comp = new ComponentBuilder().appendLegacy(ChatColor.RED + "" + ChatColor.BOLD + "(" + ChatColor.BLUE + "" + ChatColor.BOLD + "!" + ChatColor.RED + "" + ChatColor.BOLD + ") " + ChatColor.RESET + "" + org.bukkit.ChatColor.RESET + "" + ChatColor.GREEN + "Hey! Click Here to see the Server Map!");
        comp.event(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://144.217.10.223:8121/"));
        commandSender.sendMessage(comp.create());
        return true;
    }
}
