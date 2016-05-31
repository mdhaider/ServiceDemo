package com.ennjapps.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by haider on 29-05-2016.
 */
public class SecondService extends IntentService {
    public SecondService() {
        super("mythread");

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("message","from onHandleIntent");

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getBaseContext(), "Service Created",Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getBaseContext(), "Service Started",Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(), "Service Stopped",Toast.LENGTH_LONG).show();

    }
}
