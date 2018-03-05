package com.example.alex.testskillsapplication;


import android.content.Context;
import android.support.multidex.MultiDexApplication;

/**
 * Created by alex on 03.03.18.
 */

public class TestSkillsApplication extends MultiDexApplication {
   public static TestSkillsApplication instance;

    public static Context getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

}
