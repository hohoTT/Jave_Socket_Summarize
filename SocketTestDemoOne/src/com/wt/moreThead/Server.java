package com.wt.moreThead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author hohoTT
 * 基于 TCP 协议的 Socket 通信，实现用户登录
 * 服务器端
 *
 */
public class Server {

	public static void main(String[] args) {
		
		try {
			// 1. 创建一个服务器端 Socket，即 ServerSocket，指定绑定的端口，并监听此端口
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("***服务器即将启动，等待客户端的连接***");
			
			Socket socket = null;
			
			// 记录客户端的数量
			int count = 0;
			
			// 创建一个循环的监听，即死循环
			// 循环监听，等待客户端的连接
			while(true){
				// 2. 调用 accept() 方法开始监听，等待客户端的连接
				// 只要调用，则处于阻塞的情况，等待客户端的连接
				socket = serverSocket.accept();
				
				// 创建一个新的线程
				ServerThead serverThead = new ServerThead(socket);
				// 启动线程
				serverThead.start();
				
				// 统计客户端的数量
				count++;
				// 输出客户端的数量
				System.out.println("客户端的数量 : " + count);
				
				InetAddress address = socket.getInetAddress();
				
				System.out.println("当前客户端的 IP : " + address.getHostAddress());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
