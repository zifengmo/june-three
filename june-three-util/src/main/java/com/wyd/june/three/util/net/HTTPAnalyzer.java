package com.wyd.june.three.util.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * 根据id下载等
 *
 * @author chufeng
 * @date 2020-03-31 10:06
 */
public class HTTPAnalyzer {
//	public static void main(String[] args) {
//		String url ="https://blog.csdn.net/dongp1994/article/details/100702200";
//		String param="";
//		String sendGET = GetUrl(url, param);
//		System.out.println(sendGET);
//
//	}

	public static String GetUrl(String url,String param){
		String result="";//访问返回结果
		BufferedReader read=null;//读取访问结果

		try {
			//创建url
			URL realurl=new URL(url+"?"+param);
			//打开连接
			URLConnection connection=realurl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			//建立连接
			connection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段，获取到cookies等
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			read = new BufferedReader(new InputStreamReader(
					connection.getInputStream(),"UTF-8"));
			String line;//循环读取
			while ((line = read.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(read!=null){//关闭流
				try {
					read.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}
