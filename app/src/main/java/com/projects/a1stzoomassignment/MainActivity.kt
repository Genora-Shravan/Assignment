package com.projects.a1stzoomassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_create = findViewById<Button>(R.id.Add_repo1)

        val add_nav = findViewById<ImageView>(R.id.add1)

        btn_create.setOnClickListener {
            val i = Intent(this, Add_repo::class.java)
            startActivity(i)
        }

        add_nav.setOnClickListener {
            val i = Intent(this, Add_repo::class.java)
            startActivity(i)
        }




    }
}