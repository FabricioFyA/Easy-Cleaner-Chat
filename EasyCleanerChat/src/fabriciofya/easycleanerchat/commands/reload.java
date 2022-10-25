package fabriciofya.easycleanerchat.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fabriciofya.easycleanerchat.EasyCleanerChat;

public class reload implements CommandExecutor {
	
	private EasyCleanerChat plugin;
	
	public reload(EasyCleanerChat plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
	if (!(sender instanceof Player)){
		Bukkit.getConsoleSender().sendMessage(plugin.name+ChatColor.GREEN+"The plugin has been reloaded");
		return true;
	}
	else{
		Player player = (Player) sender;
		player.sendMessage(plugin.name+ChatColor.GREEN+"The plugin has been reloaded");
		return true;
		}
	}
}