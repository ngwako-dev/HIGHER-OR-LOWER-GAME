package com.higherorlower3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRandom=randomNumber()


        fun  makeToast(message: String): String {
            return Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show().toString()
        }


          guessButton.setOnClickListener {


              when (editTextNumber.text.toString().toInt()) {
                  in 2 until myRandom -> {

                      makeToast("go higher $myRandom")

                  }
                  in (myRandom+1) until 20 -> {

                      makeToast("go lower $myRandom")


                  }
                  myRandom -> {


                      makeToast("thats right! play again")

                       myRandom=randomNumber()

                  }
                  else -> {

                      makeToast("your guess is out of bound")
                  }
              }
          }


    }

    private fun randomNumber(): Int {

        return Random.nextInt(20)+1
    }

}