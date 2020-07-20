package com.example.myapplication

fun main() {
    //map
    var map1 = mapOf(Pair("name","senti"))//수정 안됨

    var map2 = mutableMapOf<String, String>()//수정 됨
    map2.put("name", "senti")
    map2.put("age", "20")

    for(map in map2) {
        println(map)
    }

    for(map in map2) {
        println(map.value)
    }

    for(map in map2) {
        println(map.key)
    }
}