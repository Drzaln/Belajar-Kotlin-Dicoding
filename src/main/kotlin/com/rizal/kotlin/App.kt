package com.rizal.kotlin

fun main() {
    val name: String = "Doddy"

    print("Hello my name is ")
    println(name)
    println(if (true) "Always true" else "Always false")

    val namePrint = setUser("Doddy")
    println(namePrint)

    printName("Rizal")

    println(officeCondition(10))
}

fun setUser(name: String) : String  {
    // ini mengembalikan String
    return "You just input your name. Hello $name"
}

fun printName(name: String) = println("Hello $name")

fun officeCondition(nowClock: Int ) : String {
    val openHours = 9
    val office: String
    office = if (nowClock > openHours){
        "Office alredy open"
    } else if (nowClock == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    return office
}

fun nullPointer(){
    //tanda ? agar aman dari NPE
    val text: String? = null

    //cara akses variabel null
    //1. dengan if else
    if (text != null){
        println(text.length)
    } else {
        println("null")
    }

    //2. Safe calls operator
    val lengthText = text?.length
    println(lengthText)

    //3. Elvis operator
    val lengthTextElvis = text?.length ?: 8 //jika null maka akan mengembalikan 8
    println(lengthTextElvis)
}