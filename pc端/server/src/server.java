import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class server {
    public static void main(final String args[]) throws IOException {
		// UDP�����������Ķ˿�  
	    Integer port = 12345;  
	    // ���յ��ֽڴ�С���ͻ��˷��͵����ݲ��ܳ��������С  
	    byte[] message = new byte[1024];  
	    try {  
	        // ����Socket����  
	        DatagramSocket datagramSocket = new DatagramSocket(port);  
	        DatagramPacket datagramPacket = new DatagramPacket(message,  
	                message.length);  
	        try {  
	            while (true) {  
	                // ׼����������  
	                datagramSocket.receive(datagramPacket);  
	                System.out.print(datagramPacket.getAddress()  
	                        .getHostAddress().toString()  
	                        + ":" + new String(datagramPacket.getData()));  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    } catch (SocketException e) {  
	        e.printStackTrace();  
	    } 
	}
}
