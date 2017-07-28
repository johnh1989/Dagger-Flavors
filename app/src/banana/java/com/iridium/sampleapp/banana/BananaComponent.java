package com.iridium.sampleapp.banana;

import dagger.Component;

/**
 * Created by john on 7/27/2017.
 */

@Component(modules = BananaModule.class)
public interface BananaComponent {
    void inject(MainActivity mainActivity);
}
