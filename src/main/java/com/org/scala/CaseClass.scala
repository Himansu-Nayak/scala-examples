package com.org.scala

// http://stackoverflow.com/questions/2312881/what-is-the-difference-between-scalas-case-class-and-class
case class CaseClass(x:Int, y:Int) {
  var xx :Int = x
  var yy:Int = y

  def add ():Integer = xx + yy

}

object CaseClass {
  def main(args:Array[String]): Unit ={
    val obj = CaseClass(2,3)
    println("Value of xx and yy : ", obj.xx, obj.yy)
    print(obj.add())
  }
}
