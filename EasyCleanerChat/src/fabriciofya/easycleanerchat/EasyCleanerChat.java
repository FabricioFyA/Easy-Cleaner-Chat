package fabriciofya.easycleanerchat;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import fabriciofya.easycleanerchat.commands.Clean;
import fabriciofya.easycleanerchat.commands.reload;

public class EasyCleanerChat extends JavaPlugin{
	PluginDescriptionFile pdffile = getDescription();
	public String name = pdffile.getName();
	public String version = pdffile.getVersion();
	public String UbicationConfig;
	
	public void onEnable(){
	Bukkit.getConsoleSender().sendMessage(name+ChatColor.GREEN+" The plugin has been enabled");
	Bukkit.getConsoleSender().sendMessage(name+ChatColor.YELLOW+" Running version in "+version);
	RegisterCommands();
	registerConfig();
	}
	
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage(name+ChatColor.RED+" The plugin has been desabled. Thank you  ~Fabricio FyA");
	}
	private void RegisterCommands(){
		this.getCommand("ClearChat").setExecutor(new Clean(this));
		this.getCommand("reload").setExecutor(new reload(this));
	}
	
	public void registerConfig(){
		File config = new File(this.getDataFolder(),"config.yml");
		UbicationConfig = config.getPath();
		if(!config.exists()){
			this.getConfig().options().copyDefaults(true);
			saveConfig();
			reloadConfig();
		}
	}
}
