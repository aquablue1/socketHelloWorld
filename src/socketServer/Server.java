package socketServer;


import java.io.*;
import java.net.*;
import java.util.Date;


public class Server {
	public static void main(String[] arg) throws IOException {
		ServerSocket listener = new ServerSocket(9091);
		try {
			while(true) {
				Socket socket = listener.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
				} finally {
					socket.close();
					System.out.println();
				}
			}
		}
		finally {
			listener.close();
			
		}
	}
	
}
