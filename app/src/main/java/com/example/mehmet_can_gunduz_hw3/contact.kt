package com.example.mehmet_can_gunduz_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class contact : BaseActivity() {

    lateinit var webViewContact : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        webViewContact = findViewById(R.id.webViewContact)
        val data =
                "<br><br><br>\n" +
                "<table  class=\"table table-hover\" ><thead><tr><th>Telefon</th><th>Adres</th></tr></thead><tbody><tr><td>+905312552358</td><td>Şahinbey/Gaziantep</td></tr></tbody></table>"
      val html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "$data" +
        "</div>\n" +
                "</body>\n" +
                "</html>"

        webViewContact.settings.javaScriptEnabled = true
        webViewContact.loadData(html, "text/html", "utf-8")
    }
}