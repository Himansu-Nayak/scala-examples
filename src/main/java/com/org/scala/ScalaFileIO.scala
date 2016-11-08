package com.org.scala

import java.io._
import scala.io.Source
import scala.io.StdIn._


object ScalaFileIO {
  def main(args:Array[String]){
    val fileName = "scala.txt"
    readFromConsole()
    writeFile(fileName)
    readFile(fileName)
  }
  
  def writeFile(file:String){
    val writer = new PrintWriter(new File(file))
    writer.write("Scala is higly scalable languague")
    writer.close()
  }
  
  def readFile(file:String){
    Source.fromFile(file).foreach { print }  
  }
  
  def readFromConsole(){
      val line = readLine()
    }
}