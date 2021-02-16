// 注释1
/* 注释2 */
// 引入单个类

import org.example.packages.{First, Second}
import org.example.{Base, Collection, Constructor, Except, Function, Implicit, Match, OO, Operator, RegExpression, Static} // 引入包内所有内容

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World Start")
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 使用批量导入的包
    First.say()
    Second.say()
    // 基础
    Base.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 高级数据结构
    Collection.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 匹配
    Match.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 函数
    Function.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 隐式
    Implicit.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 异常
    Except.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 静态方法
    Static.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 构造方法
    Constructor.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 操作符
    Operator.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 类 接口 继承
    OO.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 正则表达式
    RegExpression.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    println("Hello World End")
  }
}
