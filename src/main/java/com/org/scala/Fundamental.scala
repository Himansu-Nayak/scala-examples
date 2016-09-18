package com.org.scala

object Fundamental {
  def main(args: Array[String]) {
    scalaVariable()
    dataTypeInScala()
    arrayInScala()
    listInScala()
    rangeInScala()
    tupleInScala()
    switchCaseInScala()
    SomeNoneInScala()
    loopInScala()
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
    lazy val area: Long = length * breath
    println("Area : " + area)
  }

  // no primitive datatype in scala.
  def dataTypeInScala(): Unit = {
    val byte: Byte = 1
    val short: Short = 2
    val integer: Int = 10
    val long: Long = 20000000
    val float: Float = 1.0F
    val double: Double = 2.0
    val boolean: Boolean = true
    val char: Char = 'a'
    val string: String = "Himansu"
    // nothing, null and unit type
    // http://stackoverflow.com/questions/16173477/usages-of-null-nothing-unit-in-scala
    // http://stackoverflow.com/questions/9461880/should-i-use-unit-or-leave-out-the-return-type-for-my-scala-method
  }

  def arrayInScala() {

    var arrayType1 = Array("Array", "In", "Scala")

    val arrayType2 = new Array[String](3)
    arrayType2(0) = "Himansu"
    arrayType2(1) = "Nayak"
    arrayType2(2) = "Ericsson"

    for (array <- arrayType2) {
      println(array)
    }
  }

  def listInScala() {
    // list
    val list = List("List", "In", "Scala")

    for (temp <- list) {
      println(temp)
    }

    // empty list
    var emptyList = List()

    // list using ::
    val list2 = "Himansu" :: ("Nayak" :: ("Ericsson" :: Nil))

    println(list2.head);
    println(list2.tail);
  }

  def rangeInScala() {
    println(1 to 10)
    println('a' to 'z')
    println(1 until 5)
    println(1 to 10 by 5)
    println('a' to 'z' by 2)

    println(1.0 to 2.0 by 0.1)
  }

  def tupleInScala() {
    val tuple = (1, "Himansu", 2.0, 'a', true)
    val keyValueTuple = "key" -> "value"

    println(tuple._4)
    println(keyValueTuple._1)

    println(tuple.toString())
    tuple.productIterator.foreach(i => println(i))
  }

  def switchCaseInScala(): Unit = {
    // Type 1
    1 match {
      case 1 => println("One")
      case 2 => println("Two")
    }

    // Type 2
    val result = (3 % 2 == 0) match {
      case true => "Even"
      case false => "Odd"
    }
    println(result)
  }

  def SomeNoneInScala(): Unit = {
    // Type 1
    val result = if (2 < 3) {
      None
    } else {
      Option(2 - 3)
    }
    println(result)

    // Type 2
    val monumentAndPlace = Map("France" -> "Eiffel Tower", "India" -> "Taj Mahal", "China" -> "Great Wall Of China")
    println("France : " + monumentAndPlace.get("France"));
    println(monumentAndPlace.get("Italy").getOrElse("Not Present"))

    val nameAgeMap = Map("Alice" -> 20, "Bob" -> 25, "Chris" -> 30);

    println("Age of Alice : " + nameAgeMap.get("Alice").getOrElse("Not present"));
    println("Age of John : " + nameAgeMap.get("John").getOrElse("Not present"));
  }

  def loopInScala(): Unit = {
    val fruits = List("Apple", "Orange", "Grapes")

    // Type 1
    for (fruit <- fruits) {
      println(fruit)
    }

    // Type 2
    for (i <- 1 to 5) {
      println(i)
    }

    // Type 3
    for (fruit <- fruits if (fruit.startsWith("G"))) {
      print(fruit)
    }

    // Type 4
    for {
      i <- 1 to 2
      j <- 1 to 3
    } println(s"($i,$j)");

    // Type 5
    for {
      fruit <- fruits
      fruitUpper = fruit.toUpperCase()
    } println(fruitUpper);

    // Type 6
    val filteredFruits = for {
      fruit <- fruits if (fruit.startsWith("P"))
    } yield (fruit);

    for (x <- filteredFruits)
      println(x);
  }





}