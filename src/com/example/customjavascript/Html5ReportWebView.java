package com.example.customjavascript;

import android.content.Context;

/**
 * Created by kunsnat on 2016/5/11.
 * 展示html5报表的webview
 */
public class Html5ReportWebView extends AbstractWebView {

    public Html5ReportWebView (String url, Context context) {
        super(context);
        //定义处理html发送过来的请求
        IFJSJavaScriptInterface myJavaScriptInterface = new IFJSJavaScriptInterface(getContext());
        //名字一定要是JSBridge
        addJavascriptInterface(myJavaScriptInterface, "JSBridge");
        //加载url
        loadUrl(url);
    }

}
