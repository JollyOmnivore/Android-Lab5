package com.example.lab5

class Fruit(var name: String?){
    companion object{
        val fruit= mutableListOf(
            Fruit("apple"),
            Fruit("banana"),
            Fruit("cherry"),
            Fruit("Date"),
            Fruit("Elderberry")


        )

    }

    override fun toString(): String {
        return name?:""
    }




}