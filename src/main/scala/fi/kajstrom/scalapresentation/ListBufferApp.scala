package fi.kajstrom.scalapresentation

import scala.collection.mutable.ListBuffer

object ListBufferApp extends App{
  val autoja = ListBuffer("Volvo", "Saab", "BMW")
  autoja append "Audi"
  println(autoja)
}
