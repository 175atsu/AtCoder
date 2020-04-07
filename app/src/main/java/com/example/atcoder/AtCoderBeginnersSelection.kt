package com.example.atcoder

//https://atcoder.jp/contests/abs/tasks

//Welcome to AtCoder
//fun main(args: Array<String>){
//
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.split(" ").map(String::toInt).sum()
//    val s = readLine()!!.toString()
//
//    val n = a+b
//    println("$n $s")
//}


//ABC086A - Product
//fun main(args: Array<String>){
//
//    val a = readLine()!!.split(" ").map(String::toInt)
//    val b = a[0]*a[1]
//    if (b%2 == 0) {
//        print("Even")
//    } else {
//        print("Odd")
//    }
//}


//ABC081A - Placing Marbles
fun main(args: Array<String>){
    val a = readLine()!!.toInt()
    fun sumOfDigits(n: Int): Int {
        val num = n.toString()
        val array = num.split("").filter{ it != ""}
        val arrOfInt = array.map{ Integer.parseInt(it) }
        val result = arrOfInt.sum()
        return result
    }

    print(sumOfDigits(a))
}