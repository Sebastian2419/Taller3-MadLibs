package com.example.madlibs


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class Simple : AppCompatActivity() {
    var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        Texts.safeWords
        Texts.listWords
        showFile()

    }

    fun showFile() {

        val scan = Scanner(
            resources.openRawResource(
                resources.getIdentifier("simple","raw", packageName )
            )
        )
        var allText = ""
        while (scan.hasNextLine()) {
            val line = scan.nextLine()
            allText += line
        }

        scan.close()

        val textS = findViewById<TextView>(R.id.storyText)
        textS.text = allText


        val newContent: String  = allText.replace(Texts.listWords[0], Texts.safeWords[0])
        textS.text = newContent
        textS.text

    }

}



