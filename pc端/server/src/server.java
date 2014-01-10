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
		// UDP服务器监听的端口  
	    Integer port = 12345;  
	    // 接收的字节大小，客户端发送的数据不能超过这个大小  
	    byte[] message = new byte[1024];  
	    try {  
	        // 建立Socket连接  
	        DatagramSocket datagramSocket = new DatagramSocket(port);  
	        DatagramPacket datagramPacket = new DatagramPacket(message,  
	                message.length);  
	        try {  
	            while (true) {  
	                // 准备接收数据  
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
