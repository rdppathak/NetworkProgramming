import java.io.IOException;
import java.net.UnknownHostException;

import lib.client.ClientAgent;

public class ClientInitializer {
	public static void main(String args[]) throws UnknownHostException, IOException{
		ClientAgent ca = new ClientAgent();
		ca.connect();
		ca.sendData();		
	}
}
