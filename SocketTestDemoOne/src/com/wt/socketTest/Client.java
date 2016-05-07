package com.wt.socketTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			
			// ����Ϊ�ͻ��˻�ȡ����˵���Ӧ�Ĳ���
			// 3. ��ȡ�������������ȡ����������Ӧ��Ϣ
			InputStream inputStream = socket.getInputStream();
			
			// ���ֽ�����װ(ת��)Ϊ�ַ���
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			
			// Ϊ��������ӻ���
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			String info = null;
			
			// ѭ����ȡ�������˵���Ϣ
			while((info = bufferedReader.readLine()) != null){
				// �������������Ӧ����Ϣ
				System.out.println("�ͻ��˵õ��� ����������Ӧ����Ϣ Ϊ �� " + info);
			}
			
			
			
			// �ر������������Դ
			
			bufferedReader.close();
			inputStream.close();
			
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
