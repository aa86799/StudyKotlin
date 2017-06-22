@file:JvmName("CalcUtil") //provide class Name with top level fun
package com.stone.javacallkt


/**
 * desc  :
 * author: stone
 * email : aa86799@163.com
 * time  : 15/06/2017 19 48
 */
class Util {

    val prop1 = "111"  //java call: getter
    var prop2 = "222"  //java call: getter、setter
    @JvmField var prop3 = "333" //java call:  prop3

    companion object {
        val prop4 = 444
        var prop5 = 555
        @JvmField var prop6 = 666
    }

    inner class Combo {
        fun cc() {
        }
    }
}

fun add(n1: Int, n2: Int) {
    println(n1 + n2)
}

fun main(args: Array<String>) {
    Test.callKot()
}