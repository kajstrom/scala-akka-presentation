package fi.kajstrom.scalapresentation

object ListApp extends App {
  var autoja = List("Volvo", "Saab", "BMW")
  val autoja2 = autoja :+ "Audi"

  println(autoja2)
}
