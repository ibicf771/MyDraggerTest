package com.architecture.android.mydraggertest.androiddragger;

import com.architecture.android.mydraggertest.MainModule;
import com.architecture.android.mydraggertest.Penson;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by yangsimin on 2017/12/6.
 */

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract SecondActivity secondActivityInjector();
}
