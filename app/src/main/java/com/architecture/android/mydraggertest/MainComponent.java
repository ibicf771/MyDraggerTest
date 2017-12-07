package com.architecture.android.mydraggertest;

import dagger.Component;

/**
 * Created by yangsimin on 2017/12/5.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
