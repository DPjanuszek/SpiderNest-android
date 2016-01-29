package com.example.janco.spidernest.utils;

import com.example.janco.spidernest.utils.ActivityConfig;

/**
 * Created by janco on 29.01.2016.
 */
public class ActivityConfigBuilder {
    protected ActivityConfig activityConfig = createConfig();

    public ActivityConfigBuilder(int contentId) {
        activityConfig.layoutId = contentId;
    }

    public ActivityConfig build() {
        return activityConfig;
    }

    protected ActivityConfig createConfig() {
        return new ActivityConfig();
    }

    public ActivityConfigBuilder setContentId(int contentId) {
        activityConfig.layoutId = contentId;
        return this;
    }
}
