package me.michalzajac.incognito.models

data class IngredientPair(
        val volume: Long,
        val unit: MeasurementUnit,
        val ingredient: Ingredient
)