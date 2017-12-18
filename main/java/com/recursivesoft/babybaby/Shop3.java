package com.recursivesoft.babybaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Shop3 extends AppCompatActivity {

    WebView webView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop3);

        webView3 = (WebView)findViewById(R.id.web3);
        webView3.setWebViewClient(new WebViewClient());

        WebSettings settings = webView3.getSettings();
        settings.setJavaScriptEnabled(true);
        webView3.loadUrl("http://www.zipbanchan.co.kr/shop/goods/goods_list.php?category=002011");
    }
}
