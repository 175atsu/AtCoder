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
//fun main(args: Array<String>){
//    val a = readLine()!!.toInt()
//    fun sumOfDigits(n: Int): Int {
//        val num = n.toString()
//        val array = num.split("").filter{ it != ""}
//        val arrOfInt = array.map{ Integer.parseInt(it) }
//        val result = arrOfInt.sum()
//        return result
//    }
//
//    print(sumOfDigits(a))
//}


//ABC081B - Shift only
//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val a = readLine()!!.split(" ").map(String::toInt)
//    var count = 0
//    var c = 10000000
//    for (i in a) {
//        var m = i
//        while (m % 2 == 0) {
//            m /= 2
//            count++
//        }
//        c = Math.min(c, count)
//        count = 0
//    }
//    print(c)
//}

//ABC087B - Coins
//fun main(args: Array<String>) {
//
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    val x = readLine()!!.toInt()
//    var count = 0
//
//    for (i in 0..a) {
//        for (j in 0..b) {
//            for (k in 0..c) {
//                if (500 * i + 100 * j + 50 * k == x) {
//                    count ++
//                }
//            }
//        }
//    }
//    print(count)
//}


//ABC083B - Some Sums
//fun main(args: Array<String>){
//    var a = readLine()!!.split(" ").map(String::toInt)
//    val n = a[0]
//    var count = 0
//    a = a.drop(1)
//
//    for (i in 1..n) {
//        if (a[0] <= sumOfDigits(i) && sumOfDigits(i) <= a[1] ) {
//            count += i
//        }
//    }
//    print(count)
//}
//fun sumOfDigits(n: Int): Int {
//    val num = n.toString()
//    val array = num.split("").filter{ it != ""}
//    val arrOfInt = array.map{ Integer.parseInt(it) }
//    val result = arrOfInt.sum()
//    return result
//}

//ABC088B - Card Game for Two
//fun main(args: Array<String>) {
//    var n = readLine()!!.toInt()
//    var list = readLine()!!.split(" ").map(String::toInt)
//    var a = 0
//    var b = 0
//
//    while (n > 0) {
//        if( n != 1) {
//            a += list.max()!!.toInt()
//            list = list.minus(list.max()!!.toInt())
//            b += list.max()!!.toInt()
//            list = list.minus(list.max()!!.toInt())
//            n = n -2
//        } else {
//            a += list.max()!!.toInt()
//            n --
//        }
//    }
//    print(a - b)
//}

//ABC085B - Kagami Mochi
//fun main(args: Array<String>){
//    val n = readLine()!!.toInt()
//    val list = List(n) {
//        readLine()!!.toInt()
//    }
//    var count = list.distinct().size
//    print(count)
//}

//ABC085C - Otoshidama
//fun main(args: Array<String>){
//    val list = readLine()!!.split(" ").map(String::toInt)
//    val n = list[0]
//    val y = list[1]
//    var a = -1
//    var b = -1
//    var c = -1
//    for (i in 0..n) {
//        for (j in 0..n-i) {
//            var mony = i * 10000 + j * 5000 + (n - i -j) * 1000
//            if (mony == y) {
//                a = i
//                b = j
//                c = n - i- j
//            }
//        }
//    }
//    print(a)
//    print(b)
//    print(c)
//}

//TODO ABC049C - 白昼夢
//fun main(args: Array<String>) {
//
//    var s = readLine()!!
//    var result = true
//
//    while (s.length > 0 && result) {
//        when {
//            s.endsWith("dreamer") -> s = s.substring(0, s.lastIndexOf("dreamer"))
//            s.endsWith("eraser") -> s = s.substring(0, s.lastIndexOf("eraser"))
//            s.endsWith("dream") -> s = s.substring(0, s.lastIndexOf("dream"))
//            s.endsWith("erase") -> s = s.substring(0, s.lastIndexOf("erase"))
//            else -> result = false
//        }
//    }
//    println(if(result) "YES" else "NO")
//}


//TODO ABC086C - Traveling
fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    val ary = Array(n + 1) { IntArray(3) { 0 }}
    repeat(n) {
        val (t, x, y) = readLine()!!.split(" ").map(String::toInt)
        ary[it][0] = t
        ary[it][1] = x
        ary[it][2] = y
    }
    val result = ary.sortedBy { it[0] }
    for (i in 0 until n) {
        val time = result[i + 1][0] - result[i][0]
        val dist = Math.abs((result[i + 1][1] + result[i + 1][2]) - (result[i][1] + result[i][2]))
        if(dist > time || dist % 2 != time % 2){
            print("No")
            return
        }
    }

    println("Yes")
}