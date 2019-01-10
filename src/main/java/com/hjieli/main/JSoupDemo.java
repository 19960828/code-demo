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
		//��ȡ��ҳ����������
		System.out.println(baiduDoc.text());
		//��ȡ��ҳ��ǩ����
		System.out.println(baiduDoc.html());
		//���ݱ�ǩ��ȡ<title>����Ĵ���������
		System.out.println(baiduDoc.select("title").text());
		
		
	}
}

