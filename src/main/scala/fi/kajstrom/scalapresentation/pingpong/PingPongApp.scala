package fi.kajstrom.scalapresentation.pingpong

import akka.actor.{ActorSystem, Props}
import fi.kajstrom.scalapresentation.pingpong.PingActor.Start

object PingPongApp extends App{
  val system = ActorSystem("pingpong")

  val ping = system.actorOf(Props[PingActor], "ping")
  val pong = system.actorOf(Props[PongActor], "pong")

  ping ! Start(pong)
}
