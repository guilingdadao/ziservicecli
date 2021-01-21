package com.yeg.zi.ziservicecli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class TestHttpClient2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
//			创建客户端对象
			HttpClient client = HttpClients.createDefault();

			int id = 0;
// 创建get请求
			HttpGet request = new HttpGet("http://localhost:8080/ziservice/hello/"+id);
			request.setHeader("Accept", "application/JSON");
//			request.setHeader("Accept", "application/xml");
//			request.setHeader("Accept", "application/atom+xml");
//			request.setHeader("Accept", "application/rss+xml");
//			request.setHeader("Accept", "text/xml");
//执行get请求
			HttpResponse response = client.execute(request);
//			解析响应 数据
			HttpEntity entity = response.getEntity();

			br = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
//			br = new BufferedReader(new InputStreamReader(entity.getContent(), "GBK"));
			StringWriter sw = new StringWriter();

			String line = br.readLine();

			while (null != line) {
				sw.write(line);
				line = br.readLine();
			}

			System.out.println(sw.toString());
			System.out.println(entity.getContentEncoding());
			System.out.println(entity.getContentType());
			System.out.println(entity.getContentLength());

		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
