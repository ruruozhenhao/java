package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket(6000);
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		ds.receive(dp);
		
		String ip = dp.getAddress().getHostAddress();
		
		int port = dp.getPort();
		
		int length = dp.getLength();
		
		System.out.println(new String(data, 0, length) + ip + ":" + port);

		ds.close();
	}
}
