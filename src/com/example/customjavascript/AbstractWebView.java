package com.example.customjavascript;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by kunsnat on 2016/5/11.
 */
public class AbstractWebView extends WebView {

    public AbstractWebView(Context context) {
        super(context);

        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWebChromeClient(new WebChromeClient());

        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    }
}
