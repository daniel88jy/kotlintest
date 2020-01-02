package com.example.kotlintest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class ShapeVeiw(context: Context?) : View(context) {
    val shapePaint = Paint().apply {
        isAntiAlias = true
        color = Color.RED
        style = Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (canvas != null) {
            canvas.drawRect(100F, 100F, 200F, 200F, shapePaint)
        }
    }
}