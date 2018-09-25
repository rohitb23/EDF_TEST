package PG_E2E;

import java.io.InputStream;
import java.util.Properties;

import com.jcraf
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.seleniumhq.jetty9.io.Connection;

public class FileFlow {

	public static void main(String[] args) {
		 
		String host = "test.rebex.net";
		String user = "demo";
		String password = "password";
		String command = "ls -ltr";
		try {
			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			// Create a JSch session to connect to the server
			Session session = jsch.getSession(user, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			// Establish the connection
			session.connect();
			System.out.println("Connected...");
 
			ChannelExec channel = (ChannelExec) session.openChannel("exec");
			channel.setCommand(command);
			channel.setErrStream(System.err);
 
			InputStream in = channel.getInputStream();
			channel.connect();
			byte[] tmp = new byte[1024];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0) {
						break;
					}
					System.out.print(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					System.out.println("Exit Status: "
							+ channel.getExitStatus());
					break;
				}
				Thread.sleep(1000);
			}
			channel.disconnect();
			session.disconnect();
			System.out.println("DONE!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
