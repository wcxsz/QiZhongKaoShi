package com.example.qizhongkaoshi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class XiangQingActivity extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_qing);
        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        web = (WebView) findViewById(R.id.web);
        WebSettings settings = web.getSettings();
        settings.getJavaScriptEnabled();
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(url);
    }
}
