package com.techhue.activities

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyStateChangeActivity : Activity() {

    val TAG:String="MyStateChangeActivity"
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")
    }


    public override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")
    }


    public override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }


    public override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }


    public override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }


    public override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        Log.d(TAG, "onSaveInstanceState")
    }

    public override fun onPause() {

        super.onPause()
        Log.d(TAG, "onPause")
    }


    public override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }


    public override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}