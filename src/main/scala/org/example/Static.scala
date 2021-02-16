package org.example

class Static(name: String) {
  def sayWhoAmI(): Unit = {
    println(name + "!")
  }
}

/* 在scala中没有静态方法和静态字段
 * 但可以用object来实现这些功能
 * 使用object定义的同名对象称为伴生对象
 * 类和它的伴生对象可以互相访问其私有成员
 * */
object Static {
  def sayHello(): Unit = {
    println("Hello!")
  }

  def main(args: Array[String]): Unit = {
    Static.sayHello()
    new Static("Peter").sayWhoAmI()
  }
}