package com.example.broadcastsenderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class BroadcastReceiverApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver_app);
        IntentFilter intentFilter = new IntentFilter("com.codingpursuits.myBroadcastMessage");
        MyReceiver myReceiver = new MyReceiver();
        registerReceiver(myReceiver, intentFilter);
    }
}