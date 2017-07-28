package com.iridium.sampleapp.banana;

import android.app.Application;
import android.util.Log;

import com.iridium.sampleapp.BuildConfig;

/**
 * Created by john on 7/27/2017.
 */

public class App extends Application {

    private BananaComponent component;

    @Override
    public void onCreate() {
        Log.i("AppLifeLink", "onCreate");
        super.onCreate();
        buildComponent();
        component = buildComponent();
    }

    protected BananaComponent buildComponent() {
        return DaggerBananaComponent.builder()
                .bananaModule(new BananaModule())
                .build();
    }

    public BananaComponent component() {
        return component;
    }
}
