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
 * ���� TCP Э��� Socket ͨ�ţ�ʵ���û���¼
 * ��������
 *
 */
public class Server {

	public static void main(String[] args) {
		
		try {
			// 1. ����һ���������� Socket���� ServerSocket��ָ���󶨵Ķ˿ڣ��������˶˿�
			ServerSocket serverSocket = new ServerSocket(8888);
			
			// 2. ���� accept() ������ʼ�������ȴ��ͻ��˵�����
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			// ֻҪ���ã�����������������ȴ��ͻ��˵�����
			Socket socket = serverSocket.accept();
			
			// 3. ��ȡ��������������ȡ�ͻ��˵���Ϣ
			// �ֽ�������
			InputStream inputStream = socket.getInputStream();
			
			// ���ֽ�����װ(ת��)Ϊ�ַ���
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			
			// Ϊ��������ӻ���
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// ���ݶ�ȡ
			String info = null;

			// ѭ����ȡ�ͻ��˵���Ϣ
			while((info = bufferedReader.readLine()) != null){
				// ����ͻ����ύ����Ϣ
				System.out.println("�������õ��� �ͻ����ύ����Ϣ Ϊ �� " + info);
			}
			
			// �ر�������
			socket.shutdownInput();
			
			// 4. �ر���ص���Դ
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			socket.close();
			serverSocket.close();
			
			//ѭ�������ȴ��ͻ��˵�����
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
