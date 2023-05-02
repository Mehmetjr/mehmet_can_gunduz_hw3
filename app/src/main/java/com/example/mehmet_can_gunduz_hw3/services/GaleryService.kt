package com.example.mehmet_can_gunduz_hw3.services

import com.example.mehmet_can_gunduz_hw3.models.GalleryInfo

class GaleryService {

    fun galeryResult() : List<GalleryInfo>{

        var list = mutableListOf<GalleryInfo>()


        val g1 = GalleryInfo("La Sagrada Familia", "https://i.ibb.co/G2yYyXw/sagra-me.jpg")
        val g2 = GalleryInfo("Parkta ufak bir gezinti", "https://i.ibb.co/ZYS0RwH/peaky-blinders.jpg")
        val g3 = GalleryInfo("Road to Krakow", "https://i.ibb.co/FsWSMPD/road-to-krakow.jpg")
        val g4 = GalleryInfo("Ufak bir mola Özgür ile", "https://i.ibb.co/bNz1WJ9/ozgur-me.jpg")
        val g5 = GalleryInfo("Lviv'de soğuk bir gün", "https://i.ibb.co/47MMPNn/lviv-square.jpg")
        val g6 = GalleryInfo("Karlı bir güne merhaba", "https://i.ibb.co/wQzPG1J/lodz-snow.jpg")
        val g7 = GalleryInfo( "Macera dolu Ukrayna", "https://i.ibb.co/SXsxwH8/kviv-view.jpg")
        val g8 = GalleryInfo("Dolandırılmadan 5 dk önce", "https://i.ibb.co/1b8s733/kviv-square.jpg")
        val g9 = GalleryInfo( "Database dersinde Hünkar ile", "https://i.ibb.co/wpQnzD4/hunkar-me.jpg")
        val g10 = GalleryInfo("Floransa da gün batımı", "https://i.ibb.co/Y8kXyct/florence-view.jpg")
        val g11 = GalleryInfo("3. köprünün sırtlarında", "https://i.ibb.co/pRyxYW7/bridge3th.jpg")
        val g12 = GalleryInfo("Urfa hatırası", "https://i.ibb.co/dKm1zKS/balikli-lake.jpg")
        val g13 = GalleryInfo("Birkenau Kampı", "https://i.ibb.co/3S9yk4C/birkenau-me.jpg")
        list.add(g1)
        list.add(g2)
        list.add(g3)
        list.add(g4)
        list.add(g5)
        list.add(g6)
        list.add(g7)
        list.add(g8)
        list.add(g9)
        list.add(g10)
        list.add(g11)
        list.add(g12)
        list.add(g13)

        return list
    }
}