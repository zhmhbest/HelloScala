package com.zhmh

object Implicit {
  // 隐式参数
  def implicit_param(): Unit = {
    def printLine(implicit content: String): Unit = println(content)

    printLine("Good morning!")
    implicit val content = "Have Fun!"
    printLine
  }

  // 隐式的转换类型
  def implicit_cast(): Unit = {
    // val i: Int = 3.14
    implicit def double2Int(d: Double) = d.toInt

    val i: Int = 3.14
    println(i)

  }

  // 隐式类
  def implicit_class(): Unit = {
    implicit class Calculator(x: Int) {
      def add(y: Int) = {
        x + y
      }
    }
    var z: Int = 5
    println(5.add(3))
  }

  def main(args: Array[String]): Unit = {
    implicit_param()
    implicit_cast()
    implicit_class()
  }
}
