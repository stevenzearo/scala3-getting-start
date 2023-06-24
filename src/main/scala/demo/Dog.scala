package demo

import demo.Category.*


case class Dog(name: String, age: Int) extends Animal {
  override def run(): Unit = {
    println(s"Dog $name, has $age years old, but still running very fast!")
  }

  override val category: Category = PET
}