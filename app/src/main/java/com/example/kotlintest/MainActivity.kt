package com.example.kotlintest

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.asKotlinRandom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var random = Random()
        
        //suffle(array, random)

    }

//    fun suffle(arr: Array<ImageView>, random: Random): Combination {
//        for (i in 0 until 9) {
//            when (random.asKotlinRandom().nextInt(9) % 3) {
//                0 -> arr[i].setBackgroundColor(getColor(R.color.white))
//                1 -> arr[i].setBackgroundColor(getColor(R.color.gray))
//                2 -> arr[i].setBackgroundColor(getColor(R.color.black))
//            }
//        }
//        return a
//    }

}
