import akka.actor.{Actor, ActorSystem, Props}

/**
  * @author Alexander Worton.
  */
object HelloWorld {
  val system = ActorSystem("new")
  val actor = system.actorOf(Props[Hello])

  actor ! Message("World")
}

case class Message(who: String)

class Hello extends Actor{
  def receive = {
    case Message(who) => println(s"Hello who")
  }
}
