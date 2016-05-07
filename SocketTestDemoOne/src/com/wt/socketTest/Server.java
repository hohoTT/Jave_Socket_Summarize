package com.wt.socketTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			
			// 2. 调用 accept() 方法开始监听，等待客户端的连接
			System.out.println("***服务器即将启动，等待客户端的连接***");
			// 只要调用，则处于阻塞的情况，等待客户端的连接
			Socket socket = serverSocket.accept();
			
			// 3. 获取输入流，用来读取客户端的信息
			// 字节输入流
			InputStream inputStream = socket.getInputStream();
			
			// 将字节流包装(转换)为字符流
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			
			// 为输入流添加缓冲
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// 数据读取
			String info = null;

			// 循环读取客户端的信息
			while((info = bufferedReader.readLine()) != null){
				// 输出客户端提交的信息
				System.out.println("服务器得到的 客户端提交的信息 为 ： " + info);
			}
			
			// 关闭输入流
			socket.shutdownInput();
			
			// 4. 关闭相关的资源
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			socket.close();
			serverSocket.close();
			
			//循环监听等待客户端的连接
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
