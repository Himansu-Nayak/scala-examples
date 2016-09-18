package com.org.scala

object Function {
    def main(args: Array[String]): Unit ={
      println(greeting)
      println(greetingsWithParenthesis)
      println(greetingsWithReturnType)
      println(greetingsWithReturnType2)
      println(square(2))
      println(sum(2,3))
    }

  // in scala function are reusable expression
  def greeting = "hello world"

  def greetingsWithParenthesis() = "How are you!"

  def greetingsWithReturnType():Integer = 420

  def greetingsWithReturnType2:Integer = 123

  def square(i : Int)={
       i * i
  };

  def sum(i : Int, j: Int)={
    i + j
  };

}
