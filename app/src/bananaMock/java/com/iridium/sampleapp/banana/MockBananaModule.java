package com.iridium.sampleapp.banana;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 7/27/2017.
 */

@Module
public class MockBananaModule {

    @Provides
    String providesGreeting() {
        return "Hello from MockBananaModule, i am mocked";
    }
}
