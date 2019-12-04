package com.zhmh

object Match {
  def main(args: Array[String]): Unit = {
    // 模式匹配
    def sub_match = (sth: Any) => {
      val ret: String = sth match {
        case 0 => f"等值匹配: $sth"
        case `sth` if 1 until 5 contains sth => f"范围匹配[1, 5): $sth"
        case t: String => f"类型匹配: $t"
        case _ => f"匹配失败: $sth"
      }
      println(f"Match: $ret%s")
    }

    sub_match(0)
    sub_match(1)
    sub_match("StringContent")
    sub_match(5)

    // 数组匹配
    def array_match = (arr: Any) => {
      val ret: String = arr match {
        case Array(0) => "只有一个0元素的数组"
        case Array(0, _) => "以0开头，仅拥有两个元素的数组"
        case Array(1, _, 3) => "以1开头，3结尾的任意三个元素的数组"
        case Array(_*) => "其它数组"
        case _ => "匹配失败"
      }
      println(f"ArrayMatch: $ret")
    }

    array_match(Array(0))
    array_match(Array(0, 1))
    array_match(Array(1, 2, 3))
    array_match(Array(1))
    array_match(0)

    // 列表匹配
    def list_match = (list: Any) => {
      val ret: String = list match {
        case 0 :: Nil => "只有0元素的列表"
        case 7 :: 9 :: Nil => "只有7和9两个元素的列表"
        case x :: y :: z :: Nil => f"只有三个元素的列表[$x, $y, $z]"
        case m :: n => f"拥有head和tail的列表head:$m, tail:$n"
        case _ => "匹配失败"
      }
      println(f"ListMatch: $ret")
    }

    list_match(List(0))
    list_match(List(7, 9))
    list_match(List(1, 2, 3))
    list_match(List(8, 7, 6, 5, 4))
    list_match(0)

    // 元组匹配
    def tuple_match = (tuple: Any) => {
      val ret: String = tuple match {
        case (3, x, y) => "第一个元素为3的元组"
        case (_, 2) => "第二个元素为2，拥有两个元素的数组"
        case (x, y, z) => "拥有三个元素的任意元组"
        case _ => "匹配失败"
      }
      println(f"TupleMatch: $ret")
    }
    tuple_match((3,2,1))
    tuple_match((3,2))
    tuple_match((4,2,1))
    tuple_match(0)
  }
}
