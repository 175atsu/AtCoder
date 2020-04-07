package com.example.atcoder

import java.util.Scanner
fun main(args: Array<String>){
    val sc = Scanner(System.`in`) //Scannerのインスタンスを作成

    val s: String? = readLine() //入力を行で取得
    val i = sc.nextLine().toInt() //Int型に変換
    val j: Int = sc.nextInt()

    println(i + j)
}

class sample() {
    //標準入力
    val sc = Scanner(System.`in`)
    val a = sc.nextLine().toInt()

    //Kotlin
    val b = readLine()!!.toInt()

    //リスト
    //2 6 1 4 3
    val list = readLine()!!.split(" ").map(String::toInt)
    //5 2 6 1 4 3（最初が要素数）
    val list2 = readLine()!!.split(" ").drop(1).map(String::toInt)
    //各行にある数値をList
    val c = readLine()!!.toInt()
    val list3 = List(c) {
        readLine()!!.toInt()
    }


    //最小最大値
    //Math.min(sample1, sample2)
    //数字分割
    //fun sumOfDigits(n: Int): Int {
    //    val num = n.toString()
    //    val array = num.split("").filter{ it != ""}
    //    val arrOfInt = array.map{ Integer.parseInt(it) }
    //    val result = arrOfInt.sum()
    //    return result
    //}
    //
    //リスト重複削除
    //.distinct()
}

//https://qiita.com/yt8492/items/08dc35d9aaf22b3826d3