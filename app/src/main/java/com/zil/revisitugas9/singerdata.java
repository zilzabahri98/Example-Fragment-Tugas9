package com.zil.revisitugas9;

import java.util.ArrayList;

public class singerdata {
    private static String[] singerName = {
            "Zayn Malik",
            "Taylor Swift",
            "Niall Horan",
            "Ariana Grande",
            "Louis Tomlinson",
            "Avril lavigne",
            "Justin Bieber",
            "Katy Perry",
            "Harry Styles",
            "Liam Payne",
    };

    private static String[] singerDetails = {
            "Zayn Malik (lahir 12 Januari 1993; umur 26 tahun) Seorang penyanyi dan penulis lagu berkebangsaan Inggris. Pada tahun 2010, Malik mengikuti audisi sebagai artis solo untuk serial televisi Inggris The X Factor.",
            "Taylor Swift (lahir 13 Desember 1989) adalah Seorang penyanyi dan penulis lagu berkebangsaan Amerika Serikat. Dibesarkan di Pennsylvania, dia pindah ke Nashville, Tennessee pada usia 14 tahun untuk mengejar karier di musik country. Dia menandatangani kontrak dengan label independen Big Machine Records.",
            "Niall James Horan (lahir 13 September 1993; umur 26 tahun) adalah Seorang penyanyi dan penulis lagu berkebangsaan Irlandia. Dia mulai terkenal sejak menjadi anggota grup One Direction.",
            "Ariana Grande (lahir 26 Juni 1993; umur 26 tahun) adalah Seorang penyanyi, penulis lagu, dan aktris asal Amerika Serikat. Dia memulai kariernya pada tahun 2008 di drama musikal Broadway berjudul 13, sebelum memerankan Cat Valentine di serial televisi Nickelodeon Victorious (2010–2013) dan di spinoff Sam & Cat (2013–2014).",
            "Louis William Tomlinson (lahir di Austin; 24 Desember 1991) adalah Seorang penyanyi, penulis lagu dan tokoh televisi berkebangsaan Inggris. Dia dikenal sebagai anggota dari boy band One Direction. Tomlinson memulai kariernya sebagai aktor, tampil di film drama di kanal ITV, If I Had You dan drama di kanal BBC, Waterloo Road.",
            "Avril Lavigne (lahir 27 September 1984), adalah Seorang penyanyi, penulis lagu, dan aktris berkebangsaan Kanada. Pada usia 15 tahun, dia tampil di panggung bersama Shania Twain dan diusia 16 tahun.",
            "Justin Drew Bieber (lahir 1 Maret 1994; umur 26 tahun) adalah Seorang penyanyi dan penulis lagu berkebangsaan Kanada. Setelah manajer pencarian bakat Scooter Braun menemukannya melalui video-video YouTubenya sedang mengcover lagu pada tahun 2008 dan dia dikontrak oleh RBMG, Bieber merilis EP debutnya, My World, pada akhir tahun 2009.",
            "Katheryn Elizabeth Hudson (lahir 25 Oktober 1984), dikenal secara profesional sebagai Katy Perry, adalah Seorang penyanyi, penulis lagu dan juri televisi berkebangsaan Amerika Serikat.",
            "Harry Edward Styles (lahir 1 Februari 1994; umur 26 tahun) adalah Seorang penyanyi, penulis lagu dan aktor berkebangsaan Inggris. Dia dikenal sebagai anggota dari boy band One Direction.",
            "Liam James Payne (lahir 29 Agustus 1993) adalah Seorang penyanyi dan penulis lagu berkebangsaan Inggris. Payne membuat debutnya sebagai seorang penyanyi ketika mengikuti audisi dari serial televisi Inggris The X Factor pada tahun 2008."
    };

    private static int[] singerImages = {
            R.drawable.zaynmalik,
            R.drawable.taylorswift,
            R.drawable.niallhoran,
            R.drawable.arianagrande,
            R.drawable.loiustamblinson,
            R.drawable.avrillavigne,
            R.drawable.justinbieber,
            R.drawable.kattyperry,
            R.drawable.harrystyles,
            R.drawable.liampayne
    };

    static ArrayList<singer> getListData() {
        ArrayList<singer> list = new ArrayList<>();
        for (int position = 0; position < singerName.length; position++) {
            singer singer = new singer();
            singer.setName(singerName[position]);
            singer.setDetail(singerDetails[position]);
            singer.setPhoto(singerImages[position]);
            list.add(singer);
        }
        return list;
    }
}

