package com.xiaoxiao.qiaobademo;

import android.content.Context;
import android.widget.Toast;

import com.xiaoxiao.qiaoba.annotation.communication.Provider;

/**
 * Created by wangfei on 16/12/6.
 */
@Provider({"test", "test2","test"})
public class TestService {

    public void doService(Context context, String str, TestCallback callback){
        Toast.makeText(context,"come from main module : "+ str + ";;; num from other mudule : " + callback.getNum(), Toast.LENGTH_SHORT).show();
        callback.showHello("hello");
    }

}