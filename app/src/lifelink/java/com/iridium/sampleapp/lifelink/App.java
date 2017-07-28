package com.iridium.sampleapp.lifelink;

import android.app.Application;
import android.util.Log;

import com.iridium.sampleapp.BuildConfig;

/**
 * Created by john on 7/27/2017.
 */

public class App extends Application {

    private LifeLinkComponent component;

    @Override
    public void onCreate() {
        Log.i("AppLifeLink", "onCreate");
        super.onCreate();
        buildComponent();
        component = buildComponent();
    }

    protected LifeLinkComponent buildComponent() {
        return DaggerLifeLinkComponent.builder()
                .lifeLinkModule(new LifeLinkModule())
                .build();
    }

    public LifeLinkComponent component() {
        return component;
    }
}
