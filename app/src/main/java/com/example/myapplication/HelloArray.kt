package com.example.myapplication

fun main() { //배열, 반복문, 캐스팅
    //1. 배열
    var arr1 = listOf("1","2") //수정이 안됨
    var arr2 = mutableListOf("1","2") //수정이 가능

    //2. 반복문 (향상된 반복문)
    for(item in arr1) {
        println(item)
    }

    for((index, item) in arr2.withIndex()) { //index 까지 출력
        println("$index, $item") //$로 변수라고 표시
    }

    //3. 캐스팅 객체 <String, int, long...> 처럼 모든 변수 객체를 담을 수 있는 객체 //Any
    var hello: Any = "hello"
    if(hello is String) { //(타입 확인용 변수 is 타입)
        var str: String = hello
        var len: Int = hello.length
        println("$str, $len")
    }


}