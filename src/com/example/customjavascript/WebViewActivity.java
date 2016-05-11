package com.example.customjavascript;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kunsnat on 2016/5/11.
 */
public class WebViewActivity extends Activity {

    private AbstractWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new AbstractWebView(this);

        String url = getIntent().getStringExtra("url");
        loadUrl(url);

        this.setContentView(webView);
    }

    public void loadUrl(String url) {
        if(webView != null) {
            webView.loadUrl(url);
        }
    }
}
