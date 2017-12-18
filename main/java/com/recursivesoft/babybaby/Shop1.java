package com.recursivesoft.babybaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Shop1 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop1);

        webView1 = (WebView)findViewById(R.id.web1);
        webView1.setWebViewClient(new WebViewClient());

        WebSettings settings = webView1.getSettings();
        settings.setJavaScriptEnabled(true);
        webView1.loadUrl("http://www.m.mamomshop.co.kr/");
    }
}
