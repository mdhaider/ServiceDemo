package com.ennjapps.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by haider on 29-05-2016.
 */
public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"Service Created",Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service Started",Toast.LENGTH_LONG).show();
       String message;
        message=intent.getStringExtra("message");
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        stopSelf();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Service Stopped",Toast.LENGTH_LONG).show();
    }
}
