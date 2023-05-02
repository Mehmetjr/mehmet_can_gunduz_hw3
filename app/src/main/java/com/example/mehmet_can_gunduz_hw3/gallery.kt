package com.example.mehmet_can_gunduz_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.mehmet_can_gunduz_hw3.adapter.GalleryAdapter
import com.example.mehmet_can_gunduz_hw3.services.GaleryService

class gallery : BaseActivity() {
    lateinit var listView_gallery : ListView
    val galleryService = GaleryService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        listView_gallery = findViewById(R.id.listView_gallery)
        val customAdapter = GalleryAdapter(this,galleryService.galeryResult())
        listView_gallery.adapter = customAdapter
    }
}