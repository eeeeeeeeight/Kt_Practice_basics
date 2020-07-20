package com.example.myapplication

fun main() {
    val hello1: String = "hello world val" //final
    var hello2: String = "world2" //변수
    var hello3: String? ="world3" //?있으면 null 사용가능

    println(hello1)
    println(hello1)

    println(hello())
}

fun hello(): String {
    return "hello fun!"
}