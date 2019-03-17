package com.mariav.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    private val tag = "Life Cycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        printLog("On Create")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        printLog("On start")
        super.onStart()
    }

    override fun onResume() {
        printLog("On resume")
        super.onResume()
    }

    override fun onPause() {
        printLog("On pause")
        super.onPause()
    }

    override fun onRestart() {
        printLog("On restart")
        super.onRestart()
    }

    override fun onStop() {
        printLog("On stop")
        super.onStop()
    }

    override fun onDestroy() {
        printLog("On destroy")
        super.onDestroy()
    }

    private fun printLog(method_name: String?){
        Log.d(tag,"{${javaClass.simpleName}}: $method_name")
    }
}
