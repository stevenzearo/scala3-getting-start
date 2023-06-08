import scala.io.StdIn

@main def hello(): Unit = {
  print("Please input your name hear:")
  val name = StdIn.readLine()
  println(s"Hello, $name!")
  val ints = for
    i <- 1 to 10
  yield i * 2

  ints.foreach(println)
}