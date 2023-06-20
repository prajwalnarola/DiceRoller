package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { //Use the rollButton object and set a click listener on it by calling the setOnClickListener() method
            rollDice()
            //rollDice1()
        }
    }

    private fun rollDice() {
        val luckyNumber=4
        val d = Dice(6) // created instanse object of Dice class and pass values of sides
        val D = d.roll() // Roll the dice by calling the roll() method, and save the result in a variable called D
        val diceImage: ImageView = findViewById(R.id.imageView)

        when (D) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }//Convert instance 'D' to a string and use that to update the text of the resultTextView
/*
//Decision making
        if (D == luckyNumber){
            println("You win!")
        }else if (D == 1){
            println("So sorry! You rolled a 1. Try again!")
        }else if(D == 2){
            println("Sadly, you rolled a 2. Try again!")
        }else if (D == 3){
            println("Unfortunately, you rolled a 3. Try again!")
        }else if (D == 5){
            println("Don't cry! You rolled a 5. Try again!")
        }else{
                println("Apologies! You rolled a 6. Try again!")
        }
    }
*/
   /* private fun rollDice1() {
        val luckyNumber=4
        val d = Dice(6) // created instanse object of Dice class and pass values of sides
        val D = d.roll() // Roll the dice by calling the roll() method, and save the result in a variable called D //Convert instance 'D' to a string and use that to update the text of the resultTextView
        val resultTextView2 : TextView = findViewById(R.id.textView2) //Find the TextView by calling findViewById()
        resultTextView2.text = D.toString()
        //Decision making
        when(D){
        luckyNumber->println("You win!")
            1->println("So sorry! You rolled a 1. Try again!")
            2->println("Sadly, you rolled a 2. Try again!")
            3->println("Unfortunately, you rolled a 3. Try again!")
            5->println("Don't cry! You rolled a 5. Try again!")
            6->println("Apologies! You rolled a 6. Try again!")
        }
    }*/
}
class Dice(var sides:Int){
    fun roll(): Int{ //created roll function that returns random number based on given range
        return (1..sides).random()  //range and random function
    }
} //created dice class
