package com.iridium.sampleapp;

import android.util.Log;

import com.iridium.sampleapp.lifelink.App;

/**
 * Created by john on 7/28/2017.
 */

public class MockLifeLinkApplication extends App {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MockLifeLinkApplication", "onCreate()");
    }
}