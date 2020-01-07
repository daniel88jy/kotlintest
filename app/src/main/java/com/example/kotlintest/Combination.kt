package com.example.kotlintest

class Combination(var shape: Int, var backgroundColor: Int, var shapeColor: Int) : ICombination {

    override fun getShapeValue(): Int {
        return shape;
    }

    override fun getBackgroundColorValue(): Int {
        return backgroundColor;
    }

    override fun getShapeColorValue(): Int {
        return shapeColor;
    }

}