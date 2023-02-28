package com.example.broadcastrecieversample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast


class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context, "Intent Detected. WIFI STATE CHANGED", Toast.LENGTH_LONG).show()
    }
}