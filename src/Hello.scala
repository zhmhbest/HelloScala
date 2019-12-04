// 注释1
/* 注释2 */
// 引入单个类
import com.zhmh.Base
import com.zhmh.packages._ // 引入包内所有内容

object Hello {
  def main(args: Array[String]) {
    println("Hello World Start")
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 使用批量导入的包
    First.say()
    Second.say()
    // 基础
    Base.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 高级数据结构
    com.zhmh.Collection.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 匹配
    com.zhmh.Match.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 函数
    com.zhmh.Function.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 隐式
    com.zhmh.Implicit.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 异常
    com.zhmh.Except.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 静态方法
    com.zhmh.Static.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 构造方法
    com.zhmh.Constructor.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 操作符
    com.zhmh.Operator.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 类 接口 继承
    com.zhmh.OO.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    // 正则表达式
    com.zhmh.RegExpression.main(args)
    println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
    println("Hello World End")
  }
}
