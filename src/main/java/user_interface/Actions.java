package user_interface;

import java.io.IOException;

import config.ProxyConfig;
import http.HttpManager;
import proxy.ProxyMode;

public class Actions {

	/**
	 * Test the connection with proxy settings
	 * @param url
	 * @return
	 */
	public static boolean testConnection(String url) {
		boolean success;
		try {
			HttpManager.get(url);
			success = true;
		} catch (IOException e) {
			e.printStackTrace();
			success = false;
		}
		
		return success;
	}
	
	/**
	 * Save the configuration
	 * @param mode
	 * @param hostname
	 * @param port
	 * @throws IOException 
	 */
	public static void save(ProxyMode mode, String hostname, String port, String user, String passwd) throws IOException {
		ProxyConfig config = new ProxyConfig();
		config.setProxyMode(mode);
		config.setProxyHostname(hostname);
		config.setProxyPort(port);
		config.setProxyUser(user);
		config.setProxyPasswd(passwd);
	}
}
