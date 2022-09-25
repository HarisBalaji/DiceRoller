package com.example.diceroller

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener { rollDice() }

        roll()

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("blue")))
    }

    private  fun roll(){
        val randomInt = (1..6).random()
        val dice_image : ImageView = findViewById(R.id.imageView)
        when (randomInt) {
            1 -> dice_image.setImageResource(R.drawable.dice_1)
            2 -> dice_image.setImageResource(R.drawable.dice_2)
            3 -> dice_image.setImageResource(R.drawable.dice_3)
            4 -> dice_image.setImageResource(R.drawable.dice_4)
            5 -> dice_image.setImageResource(R.drawable.dice_5)
            6 -> dice_image.setImageResource(R.drawable.dice_6)
        }
    }

    private fun rollDice() {
        val randomInt = (System.currentTimeMillis()%7).toInt()
        val luckyNum=4
        val try_again : TextView = findViewById(R.id.textView)
        val diceImage : ImageView = findViewById(R.id.imageView)
        val win : ImageView = findViewById(R.id.won)

        when (randomInt) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        when(randomInt){
            luckyNum->{
                win.setImageResource(R.drawable.you_win)
                try_again.text=""
            }
            else->{
                win.setImageResource(0)
                try_again.text="Try Again !"
            }
        }
    }
}