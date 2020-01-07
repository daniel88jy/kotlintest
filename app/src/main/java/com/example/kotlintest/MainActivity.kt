package com.example.kotlintest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.asKotlinRandom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var random = Random()
        var mCombinationList = ArrayList<ICombination>()
        suffle(mCombinationList, random)
//        when (random.asKotlinRandom().nextInt(9) % 3) {
//            0 -> arr[i].setBackgroundColor(getColor(R.color.white))
//            1 -> arr[i].setBackgroundColor(getColor(R.color.gray))
//            2 -> arr[i].setBackgroundColor(getColor(R.color.black))
//        }
    }

    fun suffle(arr: ArrayList<ICombination>, random: Random): ArrayList<ICombination> {
        for (i in 0 until 9) {
            arr.add(
                Combination(
                    random.asKotlinRandom().nextInt(9) % 3,
                    random.asKotlinRandom().nextInt(9) % 3,
                    random.asKotlinRandom().nextInt(9) % 3,
                    false
                )
            )
        }
        return arr
    }

}
