package com.example.mehmet_can_gunduz_hw3.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.mehmet_can_gunduz_hw3.R
import com.example.mehmet_can_gunduz_hw3.gallery
import com.example.mehmet_can_gunduz_hw3.models.GalleryInfo

class GalleryAdapter(private val context: Activity, private val list:List<GalleryInfo>) : ArrayAdapter<GalleryInfo>(context,R.layout.custom_list_item,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item,null,true)
        val img_gallery = rootView.findViewById<ImageView>(R.id.img_gallery)
        val txt_info = rootView.findViewById<TextView>(R.id.txt_info)


        val value = list.get(position)

        txt_info.text = value.text

        Glide
            .with(rootView)
            .load(value.image)
            .into(img_gallery)

        return rootView
    }



}