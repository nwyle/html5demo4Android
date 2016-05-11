package com.example.customjavascript;

import android.content.Context;

/**
 * Created by kunsnat on 2016/5/11.
 */
public class IFChartWebView extends AbstractWebView {

    public static final String URL = "http://192.168.101.254:8075";


    public IFChartWebView(Context context) {
        super(context);


        loadJSON();
    }

    private void loadJSON() {
        IFJSJavaScriptInterface myJavaScriptInterface = new IFJSJavaScriptInterface(getContext());
        addJavascriptInterface(myJavaScriptInterface, "JSBridge");

        loadTemplate();
    }

    public void loadTemplate() {
        loadUrl(URL + "/WebReport/ReportServer?reportlet=testChart.cpt&op=h5");
//        loadUrl("http://www.baidu.com");
    }

}
