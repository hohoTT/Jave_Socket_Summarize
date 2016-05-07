package com.wt.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * @author hohoTT
 * 使用 URL 读取页面内容
 *
 */
public class URLTestTwo {

	public static void main(String[] args) {

		try {
			// 创建一个 URL 的实例
			URL url = new URL("http://www.hohott.wang");

			//通过 URL 的 openStream 方法获取 URL 对象所表示的资源的字节输入流
			InputStream inputStream = url.openStream();
			
			//将字节输入流转换为字符输入流, 以及将编码指定为 UTF-8
			InputStreamReader iStreamReader = new InputStreamReader(inputStream, "utf-8");
			
			//为字符输入流添加缓冲
			BufferedReader bufferedReader = new BufferedReader(iStreamReader);
			
			// 读取数据
			String data = bufferedReader.readLine();
			while(data != null){
				//输出数据
				System.out.println(data);
				data = bufferedReader.readLine();
			}
			
			// 关闭
			bufferedReader.close();
			iStreamReader.close();
			inputStream.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
