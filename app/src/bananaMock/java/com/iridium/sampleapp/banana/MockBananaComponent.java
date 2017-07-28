package com.iridium.sampleapp.banana;

import dagger.Component;

/**
 * Created by john on 7/27/2017.
 */

@Component(modules = MockBananaModule.class)
public interface MockBananaComponent extends com.iridium.sampleapp.banana.BananaComponent {
}
