package com.example.kotlintest

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.asKotlinRandom

class MainActivity : AppCompatActivity() {
    var shape: Int? = 0;
    var backgroundColor = 0;
    var shapeColor = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var random = Random().asKotlinRandom()

        //val array: Array<ImageView>
        val array = arrayOf(
            imageView00,
            imageView01,
            imageView02,
            imageView10,
            imageView11,
            imageView12,
            imageView20,
            imageView21,
            imageView22
        )
        for (i in 0 until 9) {
            when (random.nextInt(9) % 3) {
                0 ->array[i].setBackgroundColor(getColor(R.color.white))
                1 ->array[i].setBackgroundColor(getColor(R.color.gray))
                2 ->array[i].setBackgroundColor(getColor(R.color.black))
            }
        }
    }

}
