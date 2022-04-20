package com.example.madlibs


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    var count = 0;
    lateinit var typeWord : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttomStory = findViewById<Button>(R.id.btnOk)
        typeWord =  findViewById(R.id.textBox)
        typeWord.hint = Texts.listWords[count]
        buttomStory.setOnClickListener {



            if(typeWord.text.isNotEmpty()){

                Texts.safeWords.add(typeWord.text.toString())
                count ++
                typeWord.hint = Texts.listWords.getOrElse(count){""}
                typeWord.setText("")

            }

            if(count == Texts.listWords.size ){

                story()

            }

        }


    }

    fun story() {

        val intent = Intent(this, Simple::class.java)
        startActivity(intent)

    }


}