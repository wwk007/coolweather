package com.coolweather.app.util;

import android.util.Log;

public class LogUtils {
    private static String TAG = "weikang";
    private static boolean debug = true;

    public static void d(String msg){
        if(debug){
            Log.d(TAG,msg);
        }
    }
}
