package fi.kajstrom.scalapresentation

object PatternMatchingApp extends App{
  val arvo = "jotain"

  arvo match {
    case "eitäsmää" => println("EI")
    case _ => println("Täsmää kaikkeen")
  }
}
