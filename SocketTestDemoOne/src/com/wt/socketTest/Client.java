package com.wt.socketTest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author hohoTT
 * 客户端
 */
public class Client {
	
	public static void main(String[] args) {
		
		try {
			// 1. 创建一个客户端 Socket, 指定服务器地址和端口
			Socket socket = new Socket("localhost", 8888);
			
			// 2. 获取输出流，向服务器端发送信息
			// 获取字节输出流
			OutputStream outputStream = socket.getOutputStream();
			
			// 将输出流包装为一个打印流
			PrintWriter printWriter = new PrintWriter(outputStream);
			printWriter.write("用户名：hohoTT; 密码：123");
			
			// 刷新缓存
			printWriter.flush();
			
			// 关闭输出流
			socket.shutdownOutput();
			
			// 关闭其他的相关资源
			printWriter.close();
			outputStream.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
