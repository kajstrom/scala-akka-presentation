package fi.kajstrom.scalapresentation

object MunLuokka {
  def apply(): MunLuokka = new MunLuokka()

  val jotain = "ASD"
}

class MunLuokka {
  import MunLuokka._
  
  val jotain2: String = jotain + "DAS"
}

object ObjektiApp extends App{
  val luokka = MunLuokka()
  println(luokka.jotain2)
}
