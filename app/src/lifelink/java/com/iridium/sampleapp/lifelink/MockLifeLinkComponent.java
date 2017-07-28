package com.iridium.sampleapp.lifelink;

import dagger.Component;

/**
 * Created by john on 7/27/2017.
 */

@Component(modules = MockLifeLinkModule.class)
public interface MockLifeLinkComponent extends LifeLinkComponent {
}
