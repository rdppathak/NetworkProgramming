package client;

public class clientAgent {
	int port;
	String ipAddress;
	
	public clientAgent(){
		System.out.println("Initializing clientAgent class");
	}
	
	public int getPortNumber(){
		return port;
	}
	
	public void setPortNumber(int port){
		this.port = port;
	}
}
