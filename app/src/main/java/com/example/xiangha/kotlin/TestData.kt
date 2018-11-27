package com.example.xiangha.kotlin

//class TestData(name: String, age: Int, sex: Boolean) {
class TestData {
    var int1: Int = 1
        set(value) {
            //条件设置
            if (value > 0) {
                field = value
            } else {
                field = -1
            }
        }

    //延迟初始化
    lateinit var int2: String

    //静态常量声明
    companion object {
        const val str: String = ""
        var int3: Int = 0
    }


    var name: String = ""
    var age: Int = 0
    var sex = false

//    初始化
//    init {
//        this.name = name
//        this.age = age
//        this.sex = sex
//    }


    /**
     * 1. 多重构造函数需要有一个主函数，和N个次函数
     * 2. 次函数将委托给主函数
     * 3. 委托关系用this关键词表示
     */
    //主函数
    constructor()

    //次函数
    constructor(name: String) : this() {
        this.name = name
    }

    //次函数
    constructor(name: String, age: Int, sex: Boolean) : this(name) {
        this.name = name
        this.age = age
        this.sex = sex
    }

    inner class Inner {
        fun foo() = name  // 访问外部类成员
        fun innerTest() {
            name.LogStr()
            var o = this@TestData //获取外部类的成员变量
        }
    }

}

