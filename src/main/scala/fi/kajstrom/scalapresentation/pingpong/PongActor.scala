package fi.kajstrom.scalapresentation.pingpong

import akka.actor.{Actor, ActorLogging}
import fi.kajstrom.scalapresentation.pingpong.PingActor.{Ping, Pong}

class PongActor extends Actor with ActorLogging{
  var pingCount: Int = 0

  override def receive: Receive = {
    case ping: Ping => {
      pingCount += 1

      log.info(s"Ping vastaanotettu, nro: $pingCount")
      Thread.sleep(1000)
      sender() ! Pong()
    }
  }
}
