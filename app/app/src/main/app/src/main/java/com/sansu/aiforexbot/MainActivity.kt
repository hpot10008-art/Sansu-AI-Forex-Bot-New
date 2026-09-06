package com.sansu.aiforexbot

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Sansu AI Forex Bot\n\nDemo Mode\nXAUUSD\n\nNO TRADE"
        text.textSize = 24f

        setContentView(text)
    }
}
