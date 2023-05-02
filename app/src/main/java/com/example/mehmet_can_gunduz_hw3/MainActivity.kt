package com.example.mehmet_can_gunduz_hw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class MainActivity : BaseActivity() {

    lateinit var img_main :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_main = findViewById(R.id.img_main)
        img_main.setImageResource(R.drawable.img_main_me)



    }


}