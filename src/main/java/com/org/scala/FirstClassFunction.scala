package com.org.scala

object FirstClassFunction {
    def main(args: Array[String]): Unit ={
      val doubler = (i:Int) => {i*2}
      println(doubler(3))

    }
}
