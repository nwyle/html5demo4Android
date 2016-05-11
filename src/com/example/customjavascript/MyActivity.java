package com.example.customjavascript;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Html5ReportWebView webView1 = new Html5ReportWebView("http://192.168.101.254:8075/WebReport/ReportServer?reportlet=testChart.cpt&op=h5", this);
        webView1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1000));

        Html5ReportWebView webView2 = new Html5ReportWebView("http://192.168.101.254:8075/WebReport/ReportServer?reportlet=testChart.cpt&op=h5", this);
        webView2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1000));

        LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.setOrientation(LinearLayout.VERTICAL);

        layout.addView(webView1);
        layout.addView(webView2);

        setContentView(layout);
    }
}
