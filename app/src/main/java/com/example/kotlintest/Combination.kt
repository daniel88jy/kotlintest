package com.example.kotlintest

class Combination(var shape: Int, var backgroundColor: Int, var shapeColor: Int, var selectValue: Boolean) : ICombination {

    override fun getShapeValue(): Int {
        return shape;
    }

    override fun getBackgroundColorValue(): Int {
        return backgroundColor;
    }

    override fun getShapeColorValue(): Int {
        return shapeColor;
    }

    override fun getSelcteValue(): Boolean {
        return selectValue;
    }

    override fun setSelcteValue(select: Boolean){
        selectValue = select
    }

}