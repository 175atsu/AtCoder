package com.example.atcoder

//A - Circle
//fun main(args: Array<String>){
//    val r = readLine()!!.toInt()
//    print(r*r)
//}

//B - Echo
//fun main(args: Array<String>){
//    val r = readLine()!!.toInt()
//    val s = readLine()!!.split("").filter { it != ""}
//    if (r % 2 == 0) {
//        val a = s.subList(0, r/2)
//        val b = s.subList(r/2, r)
//        print(a)
//        print(b)
//        if (a == b) {
//            print("YES")
//        } else {
//            print("NO")
//        }
//    } else {
//        print("NO")
//    }
//}

//fun main(args: Array<String>){
//    var count = 0
//    val r = readLine()!!.toInt()
//    val s = readLine()!!.split("").filter { it != ""}
//    var result = "No"
//    if (r % 2 == 0) {
//        if (s.size == r) {
//            var a = 0
//            for (i in a..r / 2 - 1) {
//                if (s[i] != s[r / 2 + i]) {
//                    count++
//                }
//            }
//            if (count == 0) {
//                println("Yes")
//                return
//            }
//        }
//    }
//    println(result)
//}


//C - Average Length
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    //階乗
    fun factorial(n: Int): Int {
        var m = 1
        for (i in 1..n) {
            m = m * 1
        }
        return m
    }

    //nCm
    fun combination(n: Int): Int {
        return factorial(n) / factorial(2)
    }
    var c = combination(n)

    val ary = Array(n) { IntArray(2) }
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        ary[it][0] = x
        ary[it][1] = y
    }

    var distance = 0.0
    distance = Math.pow(
        (ary[1][0] - ary[0][0]).toDouble(),
        2.0
    ) + Math.pow((ary[0][1] - ary[1][1]).toDouble(), 2.0)
    print(distance)

}
