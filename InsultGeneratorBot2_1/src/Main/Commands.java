package main;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	// the prefix to all commands
	public String prefix = "!";
	static String test = "this bot is working";

	static ReadFile rFObj = new ReadFile();

	// runs when message recieved
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("  ");

		String channelID = event.getChannel().getId();
		String insultsChannel = "925961052162752613";

		if (channelID.equals(insultsChannel)) {
			if (args[0].equalsIgnoreCase("User manual")) {
				System.out.println(channelID);
				System.out.println(insultsChannel);
				System.out.println(channelID.length());
				System.out.println(insultsChannel.length());
				
				event.getChannel().sendMessage("Hello, world!").queue();
			}
			if (args[0].equalsIgnoreCase("Sauce me an insult")) {
				event.getChannel().sendMessage(rFObj.insult()).queue();
			}
		}
	}
}
