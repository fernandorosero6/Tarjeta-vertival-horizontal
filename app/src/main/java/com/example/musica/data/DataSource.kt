package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        var  albumes:MutableList<Album> = mutableListOf()
        albumes.add(Album("CR7","2018","https://s.france24.com/media/display/140ab902-f258-11e8-883d-005056bff430/w:980/p:16x9/ronaldo_juventus_fichaje.jpg"))

        albumes.add(Album("luka modrich","2024","https://pbs.twimg.com/profile_images/1501988258078674950/_5xMT_RA_400x400.jpg"))
        albumes.add(Album("La caca","20015","https://assets-es.imgfoot.com/lukaku-chelsea-1920.jpg"))
        albumes.add(Album("Federico","2021","https://assets-es.imgfoot.com/media/cache/1200x1200/federico-valverde-2223-2.jpgg"))

        return albumes
    }
}