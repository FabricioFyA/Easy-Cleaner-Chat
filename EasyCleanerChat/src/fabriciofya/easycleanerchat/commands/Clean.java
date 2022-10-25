package fabriciofya.easycleanerchat.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import fabriciofya.easycleanerchat.EasyCleanerChat;

public class Clean implements CommandExecutor {
	
	private EasyCleanerChat plugin;
	
	public Clean(EasyCleanerChat plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command command, String strings, String[] args) {
		if (!(sender instanceof Player)){
		Bukkit.getConsoleSender().sendMessage(plugin.name+ChatColor.DARK_RED+"Wait, you can't execute this command here");
		return false;
	}
	else {
		Player player = (Player) sender;
		player.sendMessage(ChatColor.GOLD+"The chat has been cleaned");
		return true;
		}
	}
}
