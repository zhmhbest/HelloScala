package com.zhmh
import java.io.IOException

object Except {
  def main(args: Array[String]): Unit = {
    try {
      throw new IOException()
    } catch {
      case e: IOException => {
        println(e)
      }
        println("catch: end")
    } finally {
      println("finally")
    }
  }
}

