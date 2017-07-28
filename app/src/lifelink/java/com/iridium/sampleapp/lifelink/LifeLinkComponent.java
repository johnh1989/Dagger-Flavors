package com.iridium.sampleapp.lifelink;

import dagger.Component;

/**
 * Created by john on 7/27/2017.
 */

@Component(modules = LifeLinkModule.class)
public interface LifeLinkComponent {
    void inject(MainActivity mainActivity);
}
