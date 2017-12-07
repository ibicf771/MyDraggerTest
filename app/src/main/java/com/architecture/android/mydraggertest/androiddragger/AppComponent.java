package com.architecture.android.mydraggertest.androiddragger;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by yangsimin on 2017/12/6.
 */

@Singleton
@Component(modules = {
        BuildersModule.class,
        AndroidSupportInjectionModule.class
})
interface AppComponent extends AndroidInjector<MyApplication>{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {}

}
