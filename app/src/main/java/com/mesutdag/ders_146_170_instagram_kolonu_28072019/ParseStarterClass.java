package com.mesutdag.ders_146_170_instagram_kolonu_28072019;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("YwJZMZRTJyfbQjDIeSInlhPbKVZaZxXq7yW7LtY4")
        .clientKey("vk0UQ12d0HEMfKN2VKXDroq0yZ6A89CBSlLbcmSV")
        .server("https://parseapi.back4app.com/")
        .build()
        );

    }
}
