package demo


/**
 * @author Steve Zou
 */
object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    val a: Animal = Cat("Tom", 34)
    if (a.nonEmpty) {
      a.get.eatFish()
    }
  }
}