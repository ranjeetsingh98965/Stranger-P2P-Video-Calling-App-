package com.android.stranger.models;

import android.webkit.JavascriptInterface;

import com.android.stranger.activities.CallActivity;

public class InterfaceJava {

    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity){
        this.callActivity = callActivity;

    }

    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();
    }
}
