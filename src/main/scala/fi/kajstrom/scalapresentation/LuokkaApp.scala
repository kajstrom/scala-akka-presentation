package fi.kajstrom.scalapresentation

class Luokka(parametri: String) {
    //Tämä on myös konstruktori

    //Julkinen metodi
    def teeJotain: String = {
      "Viimeinen rivi on palautusarvo, erillistä returnia ei tarvita"
    }

    //Yksityinen metodi
    private def yksityinen: Unit = { //Unit = merkityksellistä palautusarvoa ei ole
      val jotain = parametri + "lisää tekstiä"
    }
}

object LuokkaApp  extends App {
  val luokka = new Luokka("Jotain")
  println(luokka.teeJotain) //Metodikutsut eivät tarvitse sulkuja jos parametrejä ei ole
}