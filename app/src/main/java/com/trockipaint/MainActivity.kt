package com.trockipaint

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(245, 245, 245))
        }

        val title = TextView(this).apply {
            text = "🎨 TROCKIPAINT V1"
            textSize = 30f
            gravity = Gravity.CENTER
            setTextColor(Color.BLACK)
            setPadding(0, 20, 0, 20)
        }

        mainLayout.addView(title)

        val drawingArea = TextView(this).apply {
            text = "🖼️\nBOYAMA ALANI\n\nBir sonraki adımda\nboyama resmi buraya gelecek."
            textSize = 24f
            gravity = Gravity.CENTER
            setTextColor(Color.DKGRAY)
            setBackgroundColor(Color.WHITE)
        }

        mainLayout.addView(
            drawingArea,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                1f
            )
        )

        val palette = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER
            setPadding(0, 20, 0, 10)
        }

        fun colorButton(symbol: String, color: Int): Button {
            return Button(this).apply {
                text = symbol
                textSize = 22f
                setTextColor(color)
                setOnClickListener {
                    drawingArea.setTextColor(color)
                }
            }
        }

        palette.addView(colorButton("●", Color.BLACK))
        palette.addView(colorButton("●", Color.RED))
        palette.addView(colorButton("●", Color.BLUE))
        palette.addView(colorButton("●", Color.GREEN))
        palette.addView(colorButton("●", Color.MAGENTA))

        mainLayout.addView(palette)

        val tools = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER
        }

        val eraser = Button(this).apply {
            text = "🧽 Silgi"
        }

        val clear = Button(this).apply {
            text = "🗑 Temizle"
            setOnClickListener {
                drawingArea.setBackgroundColor(Color.WHITE)
            }
        }

        val save = Button(this).apply {
            text = "💾 Kaydet"
        }

        tools.addView(eraser)
        tools.addView(clear)
        tools.addView(save)

        mainLayout.addView(tools)

        setContentView(mainLayout)
    }
}
