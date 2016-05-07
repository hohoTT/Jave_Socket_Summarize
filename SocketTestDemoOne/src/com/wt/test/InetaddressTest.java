package com.wt.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * 
 * @author hohoTT
 * Inetaddress 类
 *
 */

public class InetaddressTest{
	
	public static void main(String[] args) throws UnknownHostException {
		
		// 获取本机 Inetaddress 的实例
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("以下为获取本机 Inetaddress 的实例");
		
		// 查看当前计算机的名称
		System.out.println("计算机的名称 : " + address.getHostName());
		
		// 查看当前主机的 IP 地址
		System.out.println("IP 地址 : " + address.getHostAddress());
		
		// 获取字节数组形式的 IP 地址
		byte[] bytes = address.getAddress();
		System.out.println("字节数组形式的 IP 地址 : " + Arrays.toString(bytes));
		
		// 直接输出 InetAddress 对象
		System.out.println("InetAddress 对象 : " + address);
		
		
		// ----------------------------------------------------------------
		System.out.println("---------------------------------");
		
		
		// 根据主机名获取 InetAddress 实例
		InetAddress address2 = InetAddress.getByName("WIN7-20140419VW");
		
		System.out.println("以下为根据主机名获取 InetAddress 实例");
		
		// 查看当前计算机的名称
		System.out.println("计算机的名称 : " + address2.getHostName());
		
		// 查看当前主机的 IP 地址
		System.out.println("IP 地址 : " + address2.getHostAddress());
		
		
		
		// ----------------------------------------------------------------
		System.out.println("---------------------------------");
		
		
		// 根据  IP 地址获取 InetAddress 实例
		InetAddress address3 = InetAddress.getByName("192.168.41.35");
		
		System.out.println("以下为根据  IP 地址获取 InetAddress 实例");
		
		// 查看当前计算机的名称
		System.out.println("计算机的名称 : " + address3.getHostName());
		
		// 查看当前主机的 IP 地址
		System.out.println("IP 地址 : " + address3.getHostAddress());
	}
	

}
