package com.example.bookforum;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class connect {
	public static void send(String message) {  
        //message = (message == null ? "Hello IdeasAndroid!" : message);  
        System.out.print(message);
        int server_port = 12345;  
        DatagramSocket s = null;  
        try {  
            s = new DatagramSocket(10001);  
        } catch (SocketException e) {  
            e.printStackTrace();  
        }  
        InetAddress local = null;  
        try {  
            // »»³É·þÎñÆ÷¶ËIP  
            local = InetAddress.getByName("192.168.1.19");  
        } catch (UnknownHostException e) {  
            e.printStackTrace();  
        }  
        int msg_length = message.length();  
        byte[] messageByte = message.getBytes();  
        DatagramPacket p = new DatagramPacket(messageByte, msg_length, local,  server_port);  
        try {  
            s.send(p);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    } 
}
