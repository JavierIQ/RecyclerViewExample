package com.example.recyclerviewexample

class SuperHeroProvider {
    companion object{
        var superHeroList = listOf<SuperHero>(
            SuperHero(
                "Jamie XX",
                "Young Turks",
                "Jamie Smith",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Jamie_xx_-_2016_%28cropped%29.jpg/1200px-Jamie_xx_-_2016_%28cropped%29.jpg"
            ) ,
            SuperHero(
                "Brandon Flowers",
                "The Killers",
                "Brandon Richard Flowers",
                "https://upload.wikimedia.org/wikipedia/commons/6/6d/Brandon_Flowers.jpeg"
            ),
            SuperHero(
                "Thom Yorke",
                "Radiohead",
                "Thomas Edward Yorke ",
                "https://es.rollingstone.com/wp-content/uploads/2022/03/El-cantautor-britanico-lider-de-Radiohead-lanzo-uno-de-los-dos-sencillos-que-apareceran-en-la-banda-sonora-de-la-serie..jpg"
            )
        )
    }
}