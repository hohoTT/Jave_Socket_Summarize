package com.wt.test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * @author hohoTT
 * URL �ĳ��÷���
 *
 */

public class URLTest {
	
	public static void main(String[] args) {
		
		try {
			// ����һ�� URL ��ʵ��
			URL hohoTT = new URL("http://www.hohott.wang");
			
			// ? �����ʾ��Ϊ������# �����ʾ��Ϊê��
			URL url = new URL(hohoTT, "/portfolio?username=hohoTT#test");
			
			System.out.println("Э��Ϊ ��" + url.getProtocol());
			
			System.out.println("���� ��" + url.getHost());

			// ���δָ���˿ںţ���ʹ��Ĭ�ϵĶ˿ںţ���ʱ getPort() ��������ֵΪ -1 
			System.out.println("�˿ں�  ��" + url.getPort());
			System.out.println("�ļ�·�� ��" + url.getPath());
			System.out.println("�ļ����� ��" + url.getFile());
			System.out.println("���·�� ��" + url.getRef());
			System.out.println("��ѯ�ַ��� ��" + url.getQuery());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

}
