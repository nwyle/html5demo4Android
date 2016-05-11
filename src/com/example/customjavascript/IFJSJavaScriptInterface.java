package com.example.customjavascript;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.webkit.JavascriptInterface;

/**
 * Created by kunsnat on 2016/5/11.
 */
public class IFJSJavaScriptInterface {


    private Handler loadHandler = new Handler(); // 统一的hand, 保持
    private Context context;

    public IFJSJavaScriptInterface(Context context) {
        this.context = context;
    }


    @JavascriptInterface
    public void handleHyperLink(final String reportlet) {

        getLoadHandler().post(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(context, WebViewActivity.class);
                intent.putExtra("url",  IFChartWebView.URL + reportlet);
                context.startActivity(intent);
            }
        });
    }

    private Handler getLoadHandler() {
        if(loadHandler == null) {
            loadHandler = new Handler();
        }
        return loadHandler;
    }


    @JavascriptInterface
    public String toString() {
        return "injectedObject";
    }

}
