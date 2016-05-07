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
 * ���� TCP Э��� Socket ͨ�ţ�ʵ���û���¼
 * ��������
 *
 */
public class Server {

	public static void main(String[] args) {
		
		try {
			// 1. ����һ���������� Socket���� ServerSocket��ָ���󶨵Ķ˿ڣ��������˶˿�
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			
			Socket socket = null;
			
			// ��¼�ͻ��˵�����
			int count = 0;
			
			// ����һ��ѭ���ļ���������ѭ��
			// ѭ���������ȴ��ͻ��˵�����
			while(true){
				// 2. ���� accept() ������ʼ�������ȴ��ͻ��˵�����
				// ֻҪ���ã�����������������ȴ��ͻ��˵�����
				socket = serverSocket.accept();
				
				// ����һ���µ��߳�
				ServerThead serverThead = new ServerThead(socket);
				// �����߳�
				serverThead.start();
				
				// ͳ�ƿͻ��˵�����
				count++;
				// ����ͻ��˵�����
				System.out.println("�ͻ��˵����� : " + count);
				
				InetAddress address = socket.getInetAddress();
				
				System.out.println("��ǰ�ͻ��˵� IP : " + address.getHostAddress());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
