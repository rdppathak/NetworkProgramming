import java.io.IOException;

import lib.server.ServerAgent;

public class ServerInitializer {
	public static void main(String args[]) throws IOException{
		ServerAgent sa = new ServerAgent();
		sa.serverForEver();
	}
}
