package com.org.scala

object Fundamental {
  def main(args: Array[String]) {
    scalaVariable()
    dataTypeInScala()
    arrayInScala()
    listInScala()
    rangeInScala()
    tupleInScala()
  }

  def scalaVariable() {
    // immutable variable
    val name = "Himansu"

    // mutable variable
    var country = "India"
    country = "Ireland"
    println("Current Address : " + country)

    // lazy variable (only works for val)
    val length = 200
    val breath = 4000000
    lazy val area:Long = length * breath
    println("Area : " + area)
  }
  
  // no primitive datatype in scala.
  def dataTypeInScala() : Unit = {
    val byte:Byte = 1
    val short:Short = 2
    val integer:Int = 10
    val long:Long = 20000000
    val float:Float = 1.0F
    val double:Double = 2.0
    val boolean:Boolean = true
    val char:Char = 'a'
    val string:String = "Himansu" 
    // nothing, null and unit type
    // http://stackoverflow.com/questions/16173477/usages-of-null-nothing-unit-in-scala
    // http://stackoverflow.com/questions/9461880/should-i-use-unit-or-leave-out-the-return-type-for-my-scala-method
  }
  
  def arrayInScala(){
    
    var arrayType1 = Array("Array","In","Scala")
    
    var arrayType2 = new Array[String](3)
    arrayType2(0) = "Himansu"
    arrayType2(1) = "Nayak"
    arrayType2(2) = "Ericsson"
    
    for(array <- arrayType2){
      println(array)
    }
  }
  
  def listInScala(){
     // list
     var list = List("List","In","Scala")
     
      for(temp <- list){
       println(temp)
     }
     
     // empty list
     var emptyList = List()
     
     // list using ::
     var list2 = "Himansu"::("Nayak"::("Ericsson"::Nil))
     
     println(list2.head);
     println(list2.tail);
  }
  
  def rangeInScala(){
    println(1 to 10)
    println('a' to 'z')
    println(1 until 5)
    println(1 to 10 by 5)
    println('a' to 'z' by 2)
    
    println(1.0 to 2.0 by 0.1)
  }
  
  def tupleInScala(){
    var tuple = (1, "Himansu", 2.0, 'a', true)
    var keyValueTuple = "key" -> "value"
    
    println(tuple._4)
    println(keyValueTuple._1)
    
    println(tuple.toString())
    tuple.productIterator.foreach(i => println(i))
  }
  
  
}