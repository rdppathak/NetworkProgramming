package lib.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientAgent {
	private int port;
	private String ipAddress;
	private Socket sock;
	
	public ClientAgent(){
		System.out.println("Initializing clientAgent class");
		this.port = 9876;
		this.ipAddress = "127.0.0.1";
	}
	
	public int getPortNumber(){
		return port;
	}
	
	public void setPortNumber(int port){
		this.port = port;
	}
	
	public void connect() throws UnknownHostException, IOException{
		this.sock = new Socket(this.ipAddress, this.port);
		System.out.println("Connection with "+ this.ipAddress+":"+this.port+" successful");
	}
	
	public void sendData() throws IOException{
		System.out.println("Sending data to server");
		DataOutputStream dout =  new DataOutputStream(this.sock.getOutputStream());
		byte[] b;
		b = "Some data".getBytes();
		dout.write(b);
		dout.flush();
		dout.close();
	}
}
