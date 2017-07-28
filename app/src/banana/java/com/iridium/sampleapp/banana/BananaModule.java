package com.iridium.sampleapp.banana;

import com.iridium.sampleapp.MainModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 7/27/2017.
 */

@Module
public class BananaModule extends MainModule {

    @Provides
    String providesGreeting() {
        return "Hello from BananaModule :)";
    }
}
