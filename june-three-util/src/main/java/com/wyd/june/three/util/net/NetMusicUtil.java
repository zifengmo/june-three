package com.wyd.june.three.util.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 网络工具
 *
 * @author chufeng
 * @date 2020-03-30 20:18
 */
public class NetMusicUtil {

	private static final String SEARCH_URL_PREF = "https://music.163.com/#/search/m/";

	public static String getFirstUrl(String musicName) {

		Map<String, String> params = new HashMap<>();
		params.put("s", musicName);
		params.put("type", "1");
		StringBuffer response = new StringBuffer("");

		BufferedReader reader = null;
		try {
			StringBuilder builder = new StringBuilder();
			for (Map.Entry<String, String> param : params.entrySet()) {
				if (builder.length() > 0) {
					builder.append('&');
				}
				builder.append(URLEncoder.encode(param.getKey(), "UTF-8"));
				builder.append('=');
				builder.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
			}

			URL url = new URL(SEARCH_URL_PREF + builder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(3000);
			conn.setReadTimeout(15000);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setDoOutput(true);

			reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

			String line = "";
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			System.out.println(conn.getResponseMessage());

			Map<String, List<String>> map = conn.getHeaderFields();
			// 遍历所有的响应头字段，获取到cookies等
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (Exception e) {
				}
			}
		}

		return response.toString();
	}

//	public static void main(String[] args) {
//		String netInfo = getFirstUrl("烟火");
//		System.out.println();
//	}

}
