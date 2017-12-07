package com.architecture.android.mydraggertest;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by yangsimin on 2017/12/5.
 */

public class People {
    @Inject
    public People(){
        Log.d("People", "is people");
    }
}
