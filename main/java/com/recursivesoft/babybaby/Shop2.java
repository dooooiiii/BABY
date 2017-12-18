package com.recursivesoft.babybaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Shop2 extends AppCompatActivity {
    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop2);

        webView2 = (WebView)findViewById(R.id.web2);
        webView2.setWebViewClient(new WebViewClient());

        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        webView2.loadUrl("http://m.storefarm.naver.com/zambus");
    }
}
