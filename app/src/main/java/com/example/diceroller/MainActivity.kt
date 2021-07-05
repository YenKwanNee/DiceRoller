package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.roll_button)


        btnRoll.setOnClickListener {
            rollDice()

            //Toast.makeText(this, "Button is click", Toast.LENGTH_LONG).show()
        }
    }

    private fun rollDice(){

        val randomInt = (1..6).random()

        val txtResult: TextView = findViewById(R.id.result_txt)
        txtResult.text = randomInt.toString()

    }

}