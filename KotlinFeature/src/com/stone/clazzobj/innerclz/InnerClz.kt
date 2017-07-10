package com.stone.clazzobj.innerclz

/**
 * desc  : 内部类
 * author: stone
 * email : aa86799@163.com
 * time  : 07/07/2017 11 13
 */

class Outer {//类似java的静态内部类与初始化，内问类不直接持有外部类引用，在内部类中如果要调用外部类fun，需要先new出一个外部类
    private var bar: Int = 1
    class Nested {
        fun foo() {
//            bar = 2 //error
            Outer().bar = 2
        }
    }
}
val demo = Outer.Nested().foo()

class Outer2 {//类似java的普通内部类与初始化，内问类直接持有外部类引用
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}
val demo2 = Outer2().Inner().foo()