package com.example.myapp;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

public class MyApp extends Application {

    // Tag for logging
    private static final String LOG_NAME;

    // Static initializer block to set LOG_NAME
    static {
        LOG_NAME = "MyApp";
    }

    // Method called when the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(LOG_NAME, "Application created"); // Log application creation
    }

    // Method called when the configuration changes
    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        Log.v(LOG_NAME, "Config changed"); // Log configuration change
    }

    // Method called when the system is running low on memory
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.w(LOG_NAME, "Low Memory"); // Log low memory warning
    }

    // Method called when the application is terminating
    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.v(LOG_NAME, "Application terminating"); // Log application termination
    }
}
