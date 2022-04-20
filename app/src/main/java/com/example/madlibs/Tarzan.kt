/*package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tarzan.*
import java.util.*

class Tarzan : AppCompatActivity() {

    val adjectiveToFilling = "<adjective>"
    val placeToFilling = "<place>"
    val nounToFilling = "<noun>"
    val pluralnounToFilling = "<plural-noun>"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarzan)

        buttonContinuew.setOnClickListener {

            val continueButton = Intent (this, MainActivity2::class.java)
            continueButton.putExtra("tale",FillingTale() )
            continueButton.putExtra("title_tale", "Tarzan Tale")
            startActivity(continueButton)
        }
    }

    fun readingTale(): String {
        val scannerTale= Scanner(resources.openRawResource(R.raw.tarzan))
        var tale = ""
        while (scannerTale.hasNextLine()){

            val lineTale =scannerTale.nextLine()
            tale += lineTale
        }
        scannerTale.close()
        return tale
    }

    fun FillingTale():String{

        var adjective=editTextAdjetive.text.toString()
        var place = editTextPlace.text.toString()
        var noun = editTextNoun.text.toString()
        var pluralNoun=editTextPluralNoun.text.toString()
        var tale= readingTale()

        var newAdjective = tale.replace(adjectiveToFilling,adjective,true)
        var newPlace = newAdjective.replace(placeToFilling,place, true)
        var newNoun = newPlace.replace(nounToFilling,noun,true)
        val newTale = newNoun.replace(pluralnounToFilling, pluralNoun ,true)

        return newTale

    }

}*/
