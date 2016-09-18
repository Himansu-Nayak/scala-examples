package com.org.scala

trait ScalaEqual {
  def isEqual(x: Any): Boolean
}

trait ScalaInEqual extends ScalaEqual{
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Compare(xc: Int, yc: Int) extends ScalaInEqual {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any) = obj.isInstanceOf[Compare] && obj.asInstanceOf[Compare].x == y
}

object CompareObject {
  def main(args: Array[String]): Unit = {
    val eq = new Compare(2, 2).isEqual()
    println("Equals : " + eq)
  }

}
