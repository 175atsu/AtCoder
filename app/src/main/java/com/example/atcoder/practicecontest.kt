package com.example.atcoder


//https://practice.contest.atcoder.jp/assignments

//A - Welcome to AtCoder
fun main(args: Array<String>){

    val a = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map(String::toInt).sum()
    val s = readLine()!!.toString()

    val n = a+b
    println("$n $s")
}

//TODO B - Interactive Sorting
//fun main(args: Array<String>){
//
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.split(" ").map(String::toInt).sum()
//    val s = readLine()!!.toString()
//
//    val n = a+b
//    println("$n $s")
//}