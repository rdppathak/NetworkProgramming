package lib.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAgent {
	int port;
	String ipAddress;
	ServerSocket server;
	Socket client;
	
	public ServerAgent() throws IOException{
		System.out.println("Initializing serverAgent class");
		this.port = 9876;
		try {
			this.server = new ServerSocket(this.port);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void serverForEver() throws IOException{
		while(true){
			this.client = this.server.accept();
			System.out.println("Successfully connected with client");
			DataInputStream dis=new DataInputStream(this.client.getInputStream());  
			byte  b[] = new byte[1024];
			dis.read(b); 
			System.out.println("message= "+new String(b));
			this.client.close();  
			return ;
		}
	}
}
