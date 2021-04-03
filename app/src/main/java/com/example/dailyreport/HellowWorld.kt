package com.example.dailyreport

fun main(){
    val hello1: String = "Hii world"  //final
    var hello2: String = "Hellow2@@@ world"  //normal var
    var hello3: String? = null  // ? attach = null able?!

    println(hello())
    println(hello1)
    println(hello2)
    println(hello3)

}

fun hello(): String{  //void 함수
    return "안녕 세계"
}

