package com.zhmh

/*
 * 被 final 修饰的类不能被继承；
 * 被 final 修饰的属性不能重写；
 * 被 final 修饰的方法不能被重写。
 */

// trait 类似 Java 中的接口
trait OO_Ancestor {
  // type 功能相当于 C的typedef
  type void = Unit

  def printMember(): void
}

// abstract 抽象类
abstract class OO_Grand extends OO_Ancestor {
  def printMember(): Unit
}

class OO_Parent(name: String, secret: String, outline: String) extends OO_Grand {
  protected var m_name: String = name
  private var m_secret: String = secret
  var m_outline: String = outline // 可以直接访问
  def printMember(): Unit = {
    println(f"[Parent] name: $m_name, secret: $m_secret, outline: $m_outline")
  }
}

class OO_Child(name: String, secret: String, outline: String) extends OO_Parent(name, secret, outline) {
  override def printMember(): Unit = {
    println(f"[Child] name: $m_name, outline: $m_outline")
    // 无法打印秘密
  }
}


/** 样例类
  * 作用是支持模式匹配
  * case class 类名（属性）
  * 类名定义必须是驼峰式,属性名称第一个字母小写
  */
case class Message(sender: String, massageContent: String)

/**
  * Object Oriented
  */
object OO {
  def main(args: Array[String]): Unit = {
    // 测试父类结构 访问限制
    val p = new OO_Parent("名字", "秘密", "轮廓")
    p.printMember()
    //println(p.m_name)
    //println(p.m_secret)
    println(p.m_outline)
    // 测试子类
    val c = new OO_Child("牛板筋", "垃圾食品", "看起来很好吃")
    c.printMember()
  }
}
