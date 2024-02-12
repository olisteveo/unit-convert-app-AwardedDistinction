package com.example.myapp;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

public class MyApp extends Application {
    private static final String LOG_NAME;
    static {
        LOG_NAME = "MyApp";
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(LOG_NAME, "Application created");
    }
    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        Log.v(LOG_NAME, "Config changed");
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.w(LOG_NAME, "Low Memory");
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.v(LOG_NAME, "Application terminating");
    }
}
