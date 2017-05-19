package me.michalzajac.incognito.models

data class Cocktail(
        val name: String,
        val ingredients: List<IngredientPair>,
        val steps: String,
        val description: String
)