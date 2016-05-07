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
 * ʹ�� URL ��ȡҳ������
 *
 */
public class URLTestTwo {

	public static void main(String[] args) {

		try {
			// ����һ�� URL ��ʵ��
			URL url = new URL("http://www.hohott.wang");

			//ͨ�� URL �� openStream ������ȡ URL ��������ʾ����Դ���ֽ�������
			InputStream inputStream = url.openStream();
			
			//���ֽ�������ת��Ϊ�ַ�������, �Լ�������ָ��Ϊ UTF-8
			InputStreamReader iStreamReader = new InputStreamReader(inputStream, "utf-8");
			
			//Ϊ�ַ���������ӻ���
			BufferedReader bufferedReader = new BufferedReader(iStreamReader);
			
			// ��ȡ����
			String data = bufferedReader.readLine();
			while(data != null){
				//�������
				System.out.println(data);
				data = bufferedReader.readLine();
			}
			
			// �ر�
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
