package com.example.customjavascript;

import android.content.Context;

/**
 * Created by kunsnat on 2016/5/11.
 * չʾhtml5�����webview
 */
public class Html5ReportWebView extends AbstractWebView {

    public Html5ReportWebView (String url, Context context) {
        super(context);
        //���崦��html���͹���������
        IFJSJavaScriptInterface myJavaScriptInterface = new IFJSJavaScriptInterface(getContext());
        //����һ��Ҫ��JSBridge
        addJavascriptInterface(myJavaScriptInterface, "JSBridge");
        //����url
        loadUrl(url);
    }

}
