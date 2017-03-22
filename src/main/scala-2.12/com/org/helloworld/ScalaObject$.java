// http://stackoverflow.com/questions/1755345/difference-between-object-and-class-in-scala
object ScalaObject {
  def main(args: Array[String]) {
    val stringArray = new Array[String](3)
    HelloWorld.main(stringArray)
    Fundamental.main(stringArray)
    Function.main(stringArray)
    FirstClassFunction.main(stringArray)
    NestedFunction.main(stringArray)
  }
}
