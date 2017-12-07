package com.architecture.android.mydraggertest.androiddragger;

import android.app.Application;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by yangsimin on 2017/12/6.
 */

public class MyApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
