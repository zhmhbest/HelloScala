package org.example

import scala.util.matching.Regex

object RegExpression {

  def example1(): Unit = {
    val pattern = "Scala".r //r方法，构造并返回一个Regex对象
    val str = "Scala is Scalable and cool"
    println(pattern findFirstIn str) //等效于 pattern.findFirstIn(str)
  }

  def example2(): Unit = {
    val pattern = new Regex("(S|s)cala")
    val str = "Scala is scalable and cool"
    val ret = pattern findAllIn str
    println(ret.mkString(","))
  }

  def example3(): Unit = {
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    println(pattern replaceFirstIn(str, "Java"))
  }

  def main(args: Array[String]): Unit = {
    example1() // 查找第一个
    example2() // 查找所有
    example3() // 替换第一个
  }
}
