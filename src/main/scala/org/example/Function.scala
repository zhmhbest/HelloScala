package org.example

object Function {
  def define_method(): Unit = {
    /* 【方法1】
     * 定义函数时一般使用的方法
     * def|val 方法名(参数名: 参数类型, ...) [: 返回类型] = { ... }
     */
    def sum(x: Double, y: Double): Double = {
      x + y
    }

    println("sum:", sum(1, 2))

    /* 【方法2】
     * 该方法方便匿名使用函数
     * def|val 方法名: (参数类型, ...) => 返回类型 = (参数名, ...) => { ... }
     */
    def mul: (Double, Double) => Double = (x, y) => {
      x * y
    }

    println("mul:", mul(3, 4))

    /* 【方法3】
     * 最简单的写法，自动判断返回值
     * def|val = (参数名: 参数类型, ...) => { ... }
     */
    def pow = (x: Double, y: Double) => {
      Math.pow(x, y)
    }

    println("pow:", pow(2, 4))


    // 可变参数
    def printNums(params: Int*): Unit = {
      print("printNums:")
      for (i <- params) print(i)
      print('\n')
    }

    printNums(0, 1, 2)
    printNums(3, 4, 5, 6)


    // 默认参数
    def printItem(item: Any, end: Char = '\n'): Unit = {
      print(item);
      print(end)
    }

    printItem(0.618, end = '|')
    printItem(3.715)


    // 函数参数
    def printNumber(x: Double, y: Double, f: (Double, Double) => Double): Unit = {
      val t = f(x, y)
      println(f"Result: $t%f")
    }

    printNumber(2, 3, sum)
    printNumber(2, 3, mul)

  }

  def closer(): Unit = {
    def pre_sub = () => {
      var i = 0
      () => {
        i += 1
        i
      } // 返回的时另一个sub
    }

    val sub = pre_sub()
    println("Sub:", sub())
    println("Sub:", sub())

    // 闭包 必须用val定义
    val closer = (() => {
      var i = 0 // 被隐藏的字段
      /* return */ () => {
        i += 1
        /* return */ i
      }
    }) ()

    println("Closer:", closer())
    println("Closer:", closer())
    println("Closer:", closer())
  }

  def currying(): Unit = {
    // 柯里化（Currying）暂略
    // 将原来接受两个参数的函数变成新的接受一个参数的函数的过程。

    //定义了一个求和函数
    def add1(x: Int, y: Int): Int = x + y
    println("Curring1:", add1(1, 2))

    def add2(x: Int)(y: Int): Int = x + y
    println("Curring2:", add2(1)(2))

    def add3(x: Int): Int => Int = {
      y: Int => x + y
    }
    println("Curring3:", add3(1)(2))

    // add3方法的返回值为一个匿名函数
    // 从add1 到 add3 的过程 叫做柯里化
    val result_method = add3(2)
    val result_num = result_method(3)
    println("Curring4:", result_num)
  }

  def partial(): Unit = {
    // 偏函数
    // PartialFunction[A,B] 常用作输入模式匹配
    // A 代表参数类型
    // B 代表返回类型
    def getStrEqualInt: PartialFunction[String, Int]={
      case "zero" => 0
      case "one" => 1
      case "two" => 2
      case _ => -1
    }
    println(getStrEqualInt("zero"))
    println(getStrEqualInt("one"))
    println(getStrEqualInt("two"))
    println(getStrEqualInt("3rd"))
  }

  def main(args: Array[String]): Unit = {
    define_method() // 函数
    closer() // 闭包
    currying()
    partial()
  }
}
