package com.zhmh

class OpTest {
  var m_str: String = ""
  def +=(str: String): Unit = {
    m_str += "[" + str + "]"
  }
  override def toString: String = {
    m_str
  }
}

object Operator {
  def main(args: Array[String]): Unit = {
    var test = new OpTest()
    test += "123"
    test += "456"
    println(test)
  }
}
