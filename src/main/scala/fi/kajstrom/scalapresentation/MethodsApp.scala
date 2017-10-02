package fi.kajstrom.scalapresentation

object MethodsApp extends  App{
  def +(add: String): String = "Tähän lisättiin: " + add
  println(this + "tämä teksti")
}
