package com.org.scala

import scala.util.matching.Regex

class RegularExpression {

}

object RegularExpression{
  def main(args:Array[String]): Unit ={
    var pattern = "Scala".r
    val str = "Scala is scalable and cool"

    println(pattern findFirstIn str)

    // Type 2
    pattern = new Regex("(S|s)cala")
    println(pattern findAllIn str)
  }
}
