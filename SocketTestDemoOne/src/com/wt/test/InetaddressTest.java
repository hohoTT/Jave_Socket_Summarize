package com.wt.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * 
 * @author hohoTT
 * Inetaddress ��
 *
 */

public class InetaddressTest{
	
	public static void main(String[] args) throws UnknownHostException {
		
		// ��ȡ���� Inetaddress ��ʵ��
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("����Ϊ��ȡ���� Inetaddress ��ʵ��");
		
		// �鿴��ǰ�����������
		System.out.println("����������� : " + address.getHostName());
		
		// �鿴��ǰ������ IP ��ַ
		System.out.println("IP ��ַ : " + address.getHostAddress());
		
		// ��ȡ�ֽ�������ʽ�� IP ��ַ
		byte[] bytes = address.getAddress();
		System.out.println("�ֽ�������ʽ�� IP ��ַ : " + Arrays.toString(bytes));
		
		// ֱ����� InetAddress ����
		System.out.println("InetAddress ���� : " + address);
		
		
		// ----------------------------------------------------------------
		System.out.println("---------------------------------");
		
		
		// ������������ȡ InetAddress ʵ��
		InetAddress address2 = InetAddress.getByName("WIN7-20140419VW");
		
		System.out.println("����Ϊ������������ȡ InetAddress ʵ��");
		
		// �鿴��ǰ�����������
		System.out.println("����������� : " + address2.getHostName());
		
		// �鿴��ǰ������ IP ��ַ
		System.out.println("IP ��ַ : " + address2.getHostAddress());
		
		
		
		// ----------------------------------------------------------------
		System.out.println("---------------------------------");
		
		
		// ����  IP ��ַ��ȡ InetAddress ʵ��
		InetAddress address3 = InetAddress.getByName("192.168.41.35");
		
		System.out.println("����Ϊ����  IP ��ַ��ȡ InetAddress ʵ��");
		
		// �鿴��ǰ�����������
		System.out.println("����������� : " + address3.getHostName());
		
		// �鿴��ǰ������ IP ��ַ
		System.out.println("IP ��ַ : " + address3.getHostAddress());
	}
	

}
