package com.org.scala

class ExceptionHandling {
  // no checked exception in scala
  def exceptionHandlingInScala(): Unit = {

    // type 1
    try {
      val array = Array(1, 2, 3)
      println(array(3))
    } catch {
      case a: java.lang.ArrayIndexOutOfBoundsException => println("ArrayIndexOutOfBoundsException")
      case b: java.lang.Exception => println("Exception")
    } finally {
      println("Finally block executed")
    }

    // type 2
    val result = try {
      Integer.parseInt("Himansu")
    } catch {
      case _ => 0
    }
    println(result)
  }
}

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    val obj = new ExceptionHandling
    obj.exceptionHandlingInScala()
  }
}
