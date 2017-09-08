package socketServer;


import java.io.*;
import java.net.*;
import java.util.Date;


public class Server {
	public static void main(String[] arg) throws IOException {
		ServerSocket listener = new ServerSocket(9090);
		try {
			while(true) {
				System.out.println("begin listen");
				Socket socket = listener.accept();
				System.out.println("listening");
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
				} finally {
					socket.close();
					System.out.println("closing");
				}
			}
		}
		finally {
			listener.close();
			
		}
	}
	
}
