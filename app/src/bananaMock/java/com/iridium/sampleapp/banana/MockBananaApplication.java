package com.iridium.sampleapp.banana;

import android.util.Log;


/**
 * Created by john on 7/28/2017.
 */

public class MockBananaApplication extends App {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MockLifeLinkApplication", "onCreate()");
    }

    @Override
    protected BananaComponent buildComponent() {
        return DaggerMockBananaComponent.builder()
                .mockBananaModule(new MockBananaModule())
                .build();
    }
}
