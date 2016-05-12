package com.example.customjavascript;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Html5ReportWebView webView = new Html5ReportWebView("http://env.finedevelop.com:56109/h5test/ReportServer?reportlet=nongxin/zhuxingtu.cpt&op=h5", this);

        setContentView(webView);
    }
}
