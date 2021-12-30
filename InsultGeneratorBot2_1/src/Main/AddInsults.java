package Main;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AddInsults extends ListenerAdapter{
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("  ");

        if(args[0].equalsIgnoreCase("Add insult:")) {
            if(args.length < 1) {
                event.getChannel().sendMessage("Error adding insult :flushed:").queue();
            } else {
                
            }
        }
    }
}
