package com.example.test_question2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "LIFTCYCLE";

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "(5) onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "(3) onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "(4) onPause()");
    }

    @Override  //完全生命周期开始时被调用，初始化Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "(1) onCreate()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "(6) onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "(7) onDestory()");
    }
}
