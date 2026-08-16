package com.trockipaint

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "TroçkiPaint V1\nÇalışıyor!"
        textView.textSize = 28f
        textView.setTextColor(Color.BLACK)
        textView.setBackgroundColor(Color.WHITE)
        textView.gravity = Gravity.CENTER

        setContentView(textView)
    }
}
