package com.zaferayan.nativemodules.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.zaferayan.nativemodules.R

class NativeActivity : AppCompatActivity() {
    companion object {
        const val MESSAGE = "MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_native)
        val message = intent.extras?.getString(MESSAGE)
        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.text = message
    }
}