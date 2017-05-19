package me.michalzajac.incognito.models

data class Client(
        val name: String,
        val description: String,
        var cocktails: List<Cocktail>
)