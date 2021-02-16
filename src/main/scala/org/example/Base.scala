package org.example

import scala.util.control._

object Base {
  def data_type(): Unit = {
    // 基础数据类型
    println("DataType:", Byte, "8b signed")
    println("DataType:", Char, "16b unsigned")
    println("DataType:", Short, "16b signed")
    println("DataType:", Int, "32b signed")
    println("DataType:", Long, "64b signed")
    println("DataType:", Float)
    println("DataType:", Double)
    println("DataType:", Boolean, true, false)
    // println("DataType:", Unit,    "the same as void.")
    // println("DataType:", Null, "no reference")
    // println("DataType:", Nothing, "the child    of any object.")
    // println("DataType:", Any,     "the parent   of any object.")
    // println("DataType:", AnyRef,  "the ancestor of any reference.")

    // 变量声明
    // 常量
    val PI: Double = 3.1415926
    val Golden = 0.618
    println(f"Constant: $PI%f, $Golden%f")
    // 变量
    var num: Int = 123
    println(f"Variable: $num%d")
    num = 456
    println(f"Variable: $num%d")

    // 多行字符串
    val multiple_string1 =
      """STRING_LINE_1
STRING_LINE_2
    STRING_LINE_3"""
    val multiple_string2 =
      """
        | line1
        | line2
      """.stripMargin
    println(f"[$multiple_string1%s]")
    println(f"[$multiple_string2%s]")
  }

  def expression_condition(): Unit = {
    var ret: Int = 0
    ret = if (true) 1 else 0
    println(f"Result=$ret%d")
    ret = if (false) 1 else 0
    println(f"Result=$ret%d")

    if (false) {
      println(1)
    } else if (false) {
      println(2)
    } else {
      println(3)
    }
    // 更多详见 object Match
  }

  def expression_loop(): Unit = {
    //Break
    val loop = new Breaks
    loop.breakable {
      while (true) {
        println("while[break]")
        loop.break //循环中断
      }
    }
    //Continue
    var i: Int = 5
    do {
      i -= 1
      loop.breakable {
        if (3 == i) loop.break()
        println(f"while[skip 3]: $i")
      }
    } while (0 != i)

    // [1, 3]
    for (i <- 1 to 3) {
      println(f"Loop[to]: $i")
    }

    // 步长
    for (i <- Range(1, 4, 2)) {
      println(f"Loop[step]: $i")
    }

    // [1, 3)
    for (i <- 1 until 3) {
      println(f"Loop[until]: $i")
    }

    // [1, 3] [1, 3]
    for (i <- 1 to 3; j <- 1 to 3) {
      println(f"Loop[i,j]: ($i, $j)")
    }

    // In List
    val list1 = List('a', 'b', 'c')
    for (i <- list1) {
      println(f"Loop[List]: $i")
    }

    // 排除特例
    for (i <- 1 to 3 if 2 != i) {
      println(f"Loop[if]: $i")
    }

    // 引入变量
    for (i <- 1 to 3; j = 2 * i) {
      println(f"Loop[var]: $j")
    }

    // Vector生成器
    val ret = for (i <- 1 to 10) yield i
    println(f"Loop[yield]: $ret")
  }





  def main(args: Array[String]): Unit = {
    data_type() // 数据类型
    expression_condition() // 条件表达式
    expression_loop() // 循环表达式

  }
}
