package com.wt.test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * @author hohoTT
 * URL 的常用方法
 *
 */

public class URLTest {
	
	public static void main(String[] args) {
		
		try {
			// 创建一个 URL 的实例
			URL hohoTT = new URL("http://www.hohott.wang");
			
			// ? 后面表示的为参数，# 后面表示的为锚点
			URL url = new URL(hohoTT, "/portfolio?username=hohoTT#test");
			
			System.out.println("协议为 ：" + url.getProtocol());
			
			System.out.println("主机 ：" + url.getHost());

			// 如果未指定端口号，则使用默认的端口号，此时 getPort() 方法返回值为 -1 
			System.out.println("端口号  ：" + url.getPort());
			System.out.println("文件路径 ：" + url.getPath());
			System.out.println("文件名称 ：" + url.getFile());
			System.out.println("相对路径 ：" + url.getRef());
			System.out.println("查询字符串 ：" + url.getQuery());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

}
