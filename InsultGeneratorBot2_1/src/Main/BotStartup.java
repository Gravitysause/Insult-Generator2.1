package Main;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class BotStartup {
	static String token = "OTI1NDk0NjA0MTA1Njc4ODU4.Yct8BA.lP1XBdMdJkMVnMEkRr-jycf6RU8";

	static CreateFile iMObj = new CreateFile();
	static ReadFile rFObj = new ReadFile();
	
	public static void main(String[] args) throws LoginException {
		setupJDA();
		iMObj.createFile();
	}

	private static void setupJDA() throws LoginException {
		JDABuilder jda = JDABuilder.createDefault(token);
		jda.setActivity(Activity.watching("PornHub"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Commands());
		jda.build();
	}
}
