package com.org.oop

// http://stackoverflow.com/questions/5450251/what-is-the-scala-equivalent-of-the-this-operator-in-java
// http://alvinalexander.com/scala/how-to-call-method-superclass-scala-cookbook
// http://stackoverflow.com/questions/9919021/can-a-scala-class-extend-multiple-classes

class Square(length: Int, breath: Int) {
  def area(): Integer = length * breath
}

class Cube(length: Int, breath: Int, height: Int) extends Square(length: Int, breath: Int) {
  override def area() = {
    super.area() * height
  }
}

object Square {
  def main(args: Array[String]): Unit = {
    val obj = new Cube(2, 3, 4)
    val area = obj.area()
    println("Area of Cube : " + area)
  }
}
