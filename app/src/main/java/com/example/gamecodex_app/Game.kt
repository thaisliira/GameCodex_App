package com.example.gamecodex_app

class Game(
    var name: String,
    var category: String,
    var price: Double,
    var launch: Int,
    var age: Int,
    var weight: Double
) {
    override fun toString(): String {
        return "$name | $category | $price € | $launch | $age | $weight"
    }
}