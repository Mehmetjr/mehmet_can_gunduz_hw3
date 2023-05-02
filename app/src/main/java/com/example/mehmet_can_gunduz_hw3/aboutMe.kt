package com.example.mehmet_can_gunduz_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class aboutMe : BaseActivity() {

    lateinit var img_me : ImageView
    lateinit var txt_name : TextView
    lateinit var txt_aciklama : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        img_me = findViewById(R.id.img_me)
        txt_name = findViewById(R.id.txt_name)
        txt_aciklama =findViewById(R.id.txt_aciklama)

        img_me.setImageResource(R.drawable.main_me)
        txt_name.text = "Selam Ben Mehmet"
        txt_aciklama.text = "Ben Mehmet Can Gündüz. Aslen Kilisliyim ama Gaziantep de yaşıyorum.Çukurova Üniversitesi bilgisayar mühendisliğinden mezun oldum." +
                "Kamp yapmayı,gezmeyi film ve dizi izlemeyi severim. "



    }
}