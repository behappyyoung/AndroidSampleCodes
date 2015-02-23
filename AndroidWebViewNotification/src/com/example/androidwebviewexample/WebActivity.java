package com.example.androidwebviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.webcontent);

		webView = (WebView) findViewById(R.id.webView);

		webView.getSettings().setJavaScriptEnabled(true);

		webView.loadUrl("http://m.24meals.com");

		//String customHtml = "<html><body><h2> TEST HTML </h2></body></html>";
		//webView.loadData(customHtml, "text/html", "UTF-8");

	}

}