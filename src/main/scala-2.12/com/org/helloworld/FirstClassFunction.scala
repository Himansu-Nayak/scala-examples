package com.org.scala

object FirstClassFunction {
  def main(args: Array[String]): Unit = {

    //assign function as a variable
    val doubler = (i: Int) => {
      println(i * 2)
    }
    doubler(3)

    //pass function as parameter
    val sum = (x: Int, y: Int) => x + y
    operation(sum)

    val diff = (x: Int, y: Int) => x - y
    operation(diff)

    //return a function
    val variableForFunction = returnAnonymousFunction()
    println("Product : " + variableForFunction(99, 123))
  }

  def returnAnonymousFunction() = (x: Int, y: Int) => x * y

  def operation(functionParam: (Int, Int) => Int) {
    println(functionParam(10, 5))
  }

}

object ClosureFunction {
    val factor = 123
    val muliplier = (i:Int) => i * factor
    
    def main(args: Array[String]){
    println("Closure method returns : " + muliplier(2))
  }
}
