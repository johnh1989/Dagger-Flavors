package com.iridium.sampleapp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 7/27/2017.
 */

@Module
public class MainModule {

    @Provides
    String providesGreeting() {
        return "Hello from Main";
    }
}
