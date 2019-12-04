package com.zhmh

/**【默认构造函数】
  * 如果不指定主构造函数，所有类的主体的声明都被视为构造函数的一部分
  * @param name
  */
class Constructor_People(name: String) {
  println("People Constructor Default: " + name)
  def sayWhoAmI(): Unit = {
    println(name + "!")
  }
}

/**【辅助构造函数】
  * 如果不指定主构造函数，所有类的主体的声明都被视为构造函数的一部分
  * @param name
  */
class Constructor_Student(name: String, id: Int){
  // Constructor Main
  var age: Int = 0
  println("Student Constructor Main ")
  // Constructor Second
  def this(name:String, id:Int, age:Int){
    this(name, id)
    this.age = age
    println("Student Constructor Second")
  }
  def sayWhoAmI(): Unit = {
    println(name + "," + id + "," + age + "!")
  }
}

object Constructor {
  def main(args: Array[String]): Unit = {
    new Constructor_People("Alice").sayWhoAmI()
    // 构造函数重载
    new Constructor_Student("Mom", 201400321).sayWhoAmI()
    new Constructor_Student("Dad", 201400622, 18).sayWhoAmI()
  }
}
