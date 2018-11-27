package com.example.xiangha.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Activity : AppCompatActivity(),TestInterface {
    override fun click() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initData()
        val data = TestData()
        val int2 = data.int2
        val dataData = DataData("", 9)
        dataData.name
    }

    private fun initData() {
//        var str1: String = null
        //编译错误,不加问号"?"表示不允许为null；

        var str2: String? = null
        //编译通过，加了问号，并赋值为null；

        var str3 = "test"
        //编译通过，隐式赋值为"test"，Kotlin会自动推断出str3类型为String;

        var str5: String
        str5 = "testNull"  //assigned String value
        //前者指定类型，后者赋值;

//        var str6
        //编译错误，既没有指定类型，也没有隐式地进行初始化;
    }


    /**
     * 控件调用
     */
    private fun initView() {
        //控件赋值
        tv_view.text = "sss"
        tv_view.setText("lllll")
        bt_click.setOnClickListener {

        }

        vars(1, 2, 3, 4, 5,9,3,6)
    }


    /**
     * 方法调用
     */
    //方法定义使用关键字 fun，参数格式为：参数 : 类型
    fun fun1(a: Int, b: Int): Int {
        return a + b;
        val data1 = TestData()
        val data2 = TestData()
        val fun5 = fun5(data1, data2)
    }

    //返回类型自动推断：
    fun fun2(a: Int, b: Int) = a + b;

    fun fun3(a: Int, b: Int) = a > b;
    fun fun4(a: String, b: String) = a + b;

    fun fun5(testData1: TestData,testData2: TestData) = testData1

    //public 方法则必须明确写出返回类型
    public fun fun5(a: Int, b: Int): Int = a + b

    //无返回值的函数(类似Java中的void)：
    fun fun6(a: Int, b: Int): Unit {
        (a + b).toString().LogStr();
    }

    //如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
    public fun fun7(a: Int, b: Int) {
        (a + b).toString().LogStr();
    }


    //函数的变长参数可以用 vararg 关键字进行标识：
    fun vars(vararg v:Any) {
        var x = 0        // 系统自动推断变量类型为Int
        for (vt in v) {
//            x += vt
            vt.toString().LogStr()
        }
        x.toString().LogStr()
//        getStringLength(null)
    }


    /**
     * 类型检测及转换
     */
    // 我们可以使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)。
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }
        return null
    }


    /**
     * 条件控制
     */

    fun condition() {
        // 使用 if
        val m: Int
        val a = 5
        val b = 8

        if (a > b) {
            m = a
        } else {
            m = b
        }

        // 表达式
        val max = if (a > b) a else b

        val x = 0
        when (x) {
            0, 1 -> x.toString().LogStr()
            else -> x.toString().LogStr()
        }

        when (x) {
            1 -> x.toString().LogStr()
            2 -> x.toString().LogStr()
            else -> {
                "x 不是 1 ，也不是 2".LogStr()
            }
        }

        when (x) {
            in 0..10 -> "x 在该区间范围内".LogStr()
            else -> "x 不在该区间范围内".LogStr()
        }

    }

}