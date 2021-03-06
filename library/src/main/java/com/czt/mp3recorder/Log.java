package com.czt.mp3recorder;


/**
 * Created by Administrator on 2017/4/22.
 */

public class Log {

    public static void e(String msg){
        if(Mp3RecorderUtil.isDebug()){
            android.util.Log.e("mp3recoder",msg);
        }
    }
    public static void e(String tag,String msg){
        if(Mp3RecorderUtil.isDebug()){
            android.util.Log.e(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if(Mp3RecorderUtil.isDebug()){
            android.util.Log.i(tag,msg);
        }
    }

    public static void d(String tag,String msg){
        if(Mp3RecorderUtil.isDebug()){
            android.util.Log.d(tag,msg);
        }
    }
}
