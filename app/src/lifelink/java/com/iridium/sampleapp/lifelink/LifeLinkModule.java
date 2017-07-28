package com.iridium.sampleapp.lifelink;

import com.iridium.sampleapp.MainModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 7/27/2017.
 */

@Module
public class LifeLinkModule extends MainModule {

    @Provides
    String providesGreeting() {
        return "Hello from LifeLink Module :)";
    }
}
