package fi.kajstrom.scalapresentation

case class EmailAddress(name: String, address: String)

object CaseClassApp extends App{
  val munOsoite = EmailAddress("Kaj Ström", "kaj.strom@kapsi.fi")
}
