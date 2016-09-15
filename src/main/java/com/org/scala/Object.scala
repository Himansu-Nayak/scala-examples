package com.org.scala

object Object {
  def main(args: Array[String]) {
    val stringArray = new Array[String](3)
    HelloWorld.main(stringArray)
    Fundamental.main(stringArray)
    Function.main(stringArray)
    FirstClassFunction.main(stringArray)
    NestedFunction.main(stringArray)
  }
}
