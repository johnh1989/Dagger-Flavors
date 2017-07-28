package com.iridium.sampleapp.lifelink;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 7/27/2017.
 */

@Module
public class MockLifeLinkModule {

    @Provides
    String providesGreeting() {
        return "Hello from LifeLink Module, i am mocked";
    }
}
