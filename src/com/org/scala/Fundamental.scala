package com.org.scala

object Fundamental {
  def main(args: Array[String]) {
    scalaVariable();
    dataType();
    arrayInScala();
  }

  def scalaVariable() {
    // immutable variable
    val name = "Himansu";

    // mutable variable
    var country = "India";
    country = "Ireland";
    println("Current Address : " + country);

    // lazy variable (only works for val)
    val length = 200;
    val breath = 4000000;
    lazy val area:Long = length * breath;
    println("Area : " + area);
  }
  
  // no primitive datatype in scala.
  def dataType() : Unit = {
    val byte:Byte = 1;
    val short:Short = 2;
    val integer:Int = 10;
    val long:Long = 20000000;
    val float:Float = 1.0F;
    val double:Double = 2.0;
    val boolean:Boolean = true;
    val char:Char = 'a';
    val string:String = "Himansu"; 
    // nothing, null and unit type
    // http://stackoverflow.com/questions/16173477/usages-of-null-nothing-unit-in-scala
    // http://stackoverflow.com/questions/9461880/should-i-use-unit-or-leave-out-the-return-type-for-my-scala-method
  }
  
  def arrayInScala(){
    
    var arrayType1 = Array("Himansu","Nayak","Ericsson");
    
    var arrayType2 = new Array[String](3);
    arrayType2(0) = "Himansu";
    arrayType2(1) = "Nayak";
    arrayType2(2) = "Ericsson";
    
    for(array <- arrayType2){
      println(array);
    }
  }
  
  
  
}