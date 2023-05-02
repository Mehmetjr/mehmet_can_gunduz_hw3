package com.example.mehmet_can_gunduz_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class webPage : BaseActivity() {

    lateinit var webViewPage : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_page)

        webViewPage = findViewById(R.id.webViewPage)

        val url = "https://github.com/Mehmetjr/"
        webViewPage.settings.javaScriptEnabled = true
        webViewPage.loadUrl(url)
    }
}