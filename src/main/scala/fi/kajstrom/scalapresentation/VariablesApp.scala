package fi.kajstrom.scalapresentation

object VariablesApp extends App{
  //Muuttumattomat arvot
  val jotain: String = "tekstiä"
  val jotain2 = "lisää " + jotain

  //Tavalliset muuttujat
  var muuta: String = "tekstiä"
  muuta = "lisää " + muuta

  println(jotain2)
  println(muuta)
}
