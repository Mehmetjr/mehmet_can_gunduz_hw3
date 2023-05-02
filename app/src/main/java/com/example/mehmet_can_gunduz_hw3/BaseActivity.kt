package com.example.mehmet_can_gunduz_hw3

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)

            }
            R.id.about_me -> {
                var intent = Intent(this,aboutMe::class.java)
                startActivity(intent)

            }
            R.id.gallery -> {
                var intent = Intent(this,gallery::class.java)
                startActivity(intent)
            }
            R.id.contact -> {
                var intent = Intent(this,contact::class.java)
                startActivity(intent)
            }
            R.id.web -> {
                var intent = Intent(this,webPage::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}