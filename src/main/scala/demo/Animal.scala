package demo

import demo.Category.*

import scala.language.implicitConversions


trait AnimalSkill {
  var a = 1
  val category: Category

  def run(): Unit

  def hunting(): Unit = {
    category match
      case PET => println("Pet no need hunting")
      case WILDLIFE => println("Wildlife need hunting for live")
  }
}

abstract class Animal extends AnimalSkill

implicit def toCat(a: Animal): Option[Cat] = {
  a match {
    case c: Cat => c
    case _ => Option.empty
  }
}
