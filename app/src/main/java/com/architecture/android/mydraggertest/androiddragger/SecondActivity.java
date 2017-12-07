package com.architecture.android.mydraggertest.androiddragger;

import android.os.Bundle;

import com.architecture.android.mydraggertest.Penson;
import com.architecture.android.mydraggertest.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by yangsimin on 2017/12/6.
 */

public class SecondActivity extends DaggerAppCompatActivity {
    @Inject
    Penson mPenson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPenson.toString();
    }
}
