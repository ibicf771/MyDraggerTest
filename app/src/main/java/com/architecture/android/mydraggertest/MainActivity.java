package com.architecture.android.mydraggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    Penson mPenson;

    @Inject
    People mPeople;
    @Inject
    Lazy<Penson> lazyPerson; // 注入Lazy元素

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mPenson = new Penson();
        // 构造桥梁对象
        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();

        //注入
        component.inject(this);
//
//        Penson person = lazyPerson.get();
    }
}
