package fi.kajstrom.scalapresentation

/**
  * Created by Kaitsu on 23.9.2017.
  */
object CollectionPipelineApp extends App{
  val autoja = List("Volvo", "Saab", "bmw")

  autoja
    .map(auto => auto.toUpperCase)
    .foreach(auto => println(auto))


  autoja
    .map(_.toUpperCase)
    .foreach(println)
}
