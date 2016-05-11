package com.example.customjavascript;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kunsnat on 2016/5/11.
 */
public class WebViewActivity extends Activity {

    private Html5ReportWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView = new Html5ReportWebView(getIntent().getStringExtra("url"), this);
        this.setContentView(webView);
    }
}
