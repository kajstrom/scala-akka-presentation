package fi.kajstrom.scalapresentation.pingpong

import akka.actor.{Actor, ActorLogging, ActorRef}

class PingActor extends Actor with ActorLogging{
  import PingActor._

  override def receive: Receive = {
    case start: Start => {
      log.info("Start vastaanotettu")
      start.pong ! Ping()
    }
    case pong: Pong => {
      log.info("Pong vastaanotettu")
      Thread.sleep(1000)
      sender() ! Ping()
    }
  }
}

object PingActor {
  case class Start(pong: ActorRef)
  case class Ping()
  case class Pong()
}