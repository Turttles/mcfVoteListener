package me.Turttles;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;

public class Main extends JavaPlugin implements Listener{
	
	
	public void onEnable() {
	Bukkit.getPluginManager().registerEvents(this, this);
		
	}
	@EventHandler
	public void Vote(VotifierEvent e) {
		String name = e.getVote().getUsername();
		String srv = e.getVote().getServiceName();
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "cc give p xcrate 3 " + name);
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "acb " + name + " 65");
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 150");
		Bukkit.broadcastMessage("§8[§6MCFriendly§8] §e" + name + " §avoted @ §e"+ srv + " §afor cool rewards!");
		
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("vote")) {
			Player p = (Player) sender;
			p.sendMessage("§c§l❤ §b§lVoting Links §c§l❤");
			p.sendMessage("§9§lClick Here §b➤ §a§nhttps://mcfriendly.enjin.com/vote");
			p.sendMessage("§c(Make sure you leave a  space in your inventory to receive the keys!)");
			return true;
			
		}
		return super.onCommand(sender, command, label, args);
	}
	

}
