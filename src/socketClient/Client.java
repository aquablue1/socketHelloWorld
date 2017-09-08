package socketClient;


import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

/**
 * Trivial client for the data server
 * */
public class Client {
	
	public static void main(String[] args) throws IOException {
		String serverAddress = JOptionPane.showInputDialog(
				"Enter IP address: \n" + 
				"running the data port on 9090:");
		Socket s = new Socket(serverAddress, 9090);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String answer = input.readLine();
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);
		
		s.close();

	}

}
