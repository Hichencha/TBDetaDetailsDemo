package com.chencha.tbdetadetailsdemo.utils;

import android.content.Context;
import android.content.res.Resources;

import com.chencha.tbdetadetailsdemo.App;

/**
 * Created by xiyuan on 2018/9/26.
 */

public class UIUtils {
    public static Context getContext() {
        return App.getInstance();
    }

    public static Resources getResource() {
        return getContext().getResources();
    }


    public static int getColor(int colorId) {
        return getResource().getColor(colorId);
    }

}
