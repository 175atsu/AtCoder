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

fun main(args: Array<String>){
    var count = 0
    val r = readLine()!!.toInt()
    val s = readLine()!!.split("").filter { it != ""}
    if (r % 2 == 0) {
        var i = 0
        for ( i in i..r/2-1) {
            if (s[i] != s[r/2+i]) {
                count ++
            }
        }
        if (count == 0) {
            print("YES")
        } else {
            print("NO")
        }
    } else {
        print("NO")
    }
}