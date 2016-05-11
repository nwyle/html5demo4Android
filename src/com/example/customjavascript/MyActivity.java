package com.example.customjavascript;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        IFChartWebView webView = new IFChartWebView(this);

        setContentView(webView);
    }
}
