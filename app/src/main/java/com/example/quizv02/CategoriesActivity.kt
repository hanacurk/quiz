package com.example.quizv02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CategoriesActivity : AppCompatActivity() {
    private var clicked = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val btn_otroci = findViewById<Button>(R.id.btn_otroci)
        val btn_zgodovina = findViewById<Button>(R.id.btn_zgodovina)
        val btn_slovenija = findViewById<Button>(R.id.btn_slovenija)
        val btn_znanost = findViewById<Button>(R.id.btn_znanost)

        btn_otroci.setOnClickListener {
            clicked = "otroci"
            val intent = Intent (this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.CLICKED, clicked)
            startActivity(intent)
        }
        btn_slovenija.setOnClickListener {
            clicked = "slovenija"
            val intent = Intent (this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.CLICKED, clicked)
            startActivity(intent)
        }
        btn_zgodovina.setOnClickListener {
            clicked = "zgodovina"
            val intent = Intent (this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.CLICKED, clicked)
            startActivity(intent)

        }
        btn_znanost.setOnClickListener {
            clicked = "znanost"
            val intent = Intent (this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.CLICKED, clicked)
            startActivity(intent)
        }
    }
}


