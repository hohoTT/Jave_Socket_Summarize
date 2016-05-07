package com.wt.socketTest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author hohoTT
 * �ͻ���
 */
public class Client {
	
	public static void main(String[] args) {
		
		try {
			// 1. ����һ���ͻ��� Socket, ָ����������ַ�Ͷ˿�
			Socket socket = new Socket("localhost", 8888);
			
			// 2. ��ȡ���������������˷�����Ϣ
			// ��ȡ�ֽ������
			OutputStream outputStream = socket.getOutputStream();
			
			// ���������װΪһ����ӡ��
			PrintWriter printWriter = new PrintWriter(outputStream);
			printWriter.write("�û�����hohoTT; ���룺123");
			
			// ˢ�»���
			printWriter.flush();
			
			// �ر������
			socket.shutdownOutput();
			
			// �ر������������Դ
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
