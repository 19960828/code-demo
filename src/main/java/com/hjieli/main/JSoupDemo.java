package com.hjieli.main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JSoupDemo {

	public static Document getBaiDuHtml() {
		Document doc = null;
		try {
			doc = Jsoup.connect("http://www.baidu.com").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
		
	}
	
	public static void main(String[] args) {
		Document baiduDoc = getBaiDuHtml();
		//获取网页纯文字内容
		System.out.println(baiduDoc.text());
		//获取网页标签内容
		System.out.println(baiduDoc.html());
		//根据标签获取<title>里面的纯文字内容
		System.out.println(baiduDoc.select("title").text());
		
		
	}
}

