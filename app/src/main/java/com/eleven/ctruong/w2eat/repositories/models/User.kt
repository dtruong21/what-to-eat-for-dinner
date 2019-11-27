package com.eleven.ctruong.w2eat.repositories.models

data class User(
    var email: String,
    var password: String,
    var meal: MutableList<Meal>,
    var favoriteMeals: MutableList<Meal>,
    var reviews: MutableList<Review>
)

data class Review(
    var id: String,
    var author: User,
    var meal: Meal,
    var note: Int,
    var comment: String,
    var date: String
)