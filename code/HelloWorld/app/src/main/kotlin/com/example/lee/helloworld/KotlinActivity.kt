package com.example.lee.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class KotlinActivity : AppCompatActivity() {

    private lateinit var hello_view:android.widget.TextView
    //private lateinit var hello_anko:android.widget.TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        hello_view = findViewById(R.id.hello_view) as android.widget.TextView
        hello_view.text = "Hello, Kotlin! "

        //hello_anko = find<TextView>(R.id.hello_anko)
        hello_anko.text = "Hello, Anko!"
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }
        }
    }
}
