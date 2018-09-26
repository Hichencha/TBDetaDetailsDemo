package com.chencha.tbdetadetailsdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by xiyuan on 2018/9/26.
 */

public class App extends Application {
    private static App instance;
    public static Context mContext;


    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mContext = this;
    }
}
