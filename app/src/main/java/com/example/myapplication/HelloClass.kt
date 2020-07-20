package com.example.myapplication

fun main(){
    //클래스
    var cls = HelloClass()
    var cls2 = HelloClass(10 )
    println(cls2.age)

    //데이터 클래스
    var person = Person(5, "Senti")
    println(person.age)
    println(person.name)
}

//클래스
class HelloClass {
    var age: Int = 0

    //초기화
    /*
    init {

    }
    */

    //생성자
    constructor() //기본 생성자
    constructor(age: Int) { //보조 생성자 (값을 넘길 수 있음)
        this.age = age
    }
}

//데이터 클래스
data class Person(var age:Int, val name:String)