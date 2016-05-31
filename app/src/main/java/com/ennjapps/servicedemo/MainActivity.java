package com.ennjapps.servicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startMethod(View v){
        Intent intent= new Intent(this,SecondService.class);
        intent.putExtra("message","This is my message");
        startService(intent);


    }
    public void stopMethod(View v){
        Intent intent= new Intent(this,SecondService.class);
        stopService(intent);

    }
}
