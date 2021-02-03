package com.zhmh

import scala.collection.mutable

object Collection {
  def use_start(): Unit = {
    // Array
    val array = Array(0, 1, 2)
    println("Collection: ", array.toBuffer)

    // List
    val list = List(1, 2, 3, 4)
    println(f"Collection: $list")

    // Set
    val set = Set(1, 1, 2, 2)
    println(f"Collection: $set")

    // Map
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)
    println(f"Collection: $map")

    // Tuple
    val tuple = (10, "String")
    println(f"Collection: $tuple")

  }

  def use_array(): Unit = {
    val arr_int = new Array[Int](4)
    // 将数组转换成数组缓冲，就可以看到数组中内容
    println(arr_int.toBuffer)

    val arr_str = Array("tom", "jack", "oliver")
    println(arr_str(0), arr_str(1), arr_str(2))

    var arr_buf = mutable.ArrayBuffer[String]()
    arr_buf += "|" // 末尾追加
    arr_buf += ("aa", "bb", "cc")
    arr_buf ++= arr_str
    arr_buf ++= mutable.ArrayBuffer("ee", "ff")
    arr_buf.foreach(print) // 打印
    print("\n")

    arr_buf.insert(0, "#")
    arr_buf.foreach(print) // 打印
    print("\n")

    arr_buf.remove(0, 5) // [0, 5)
    arr_buf.foreach(print) // 打印
    print("\n")
  }

  def use_list(): Unit = {
    // 创建一个不可变集合
    val list_constant = List(7,8,9)
    println(list_constant)

    // 创建一个可变集合
    val list_buf = mutable.ListBuffer[Int]()
    // list_buf.addOne(2)
    list_buf.insert(0, 1)
    list_buf += 3
    list_buf ++= list_constant
    println(list_buf.toList)

    // 右添加
    val list1 = list_buf :+ 99
    println(list1)

    // 左添加
    val list2 =  77 +: list_buf
    println(list2)
  }

  def use_set(): Unit = {
    // 创建一个可变set
    val set= new mutable.HashSet[Int]()
    set += 1
    set.add(2)
    set ++= Set(7,8,9)
    println(set)

    // 移除值
    set -= 2
    set.remove(9)
    println(set)

    set.foreach(print)
    println()
  }

  def use_map(): Unit = {
    val map = new mutable.HashMap[String, Int]()
    map.put("one", 1)
    map.put("two", 2)
    println(map)
  }

  def main(args: Array[String]): Unit = {
    use_start()
    use_array()
    use_list()
    use_set()
    use_map()
  }
}
