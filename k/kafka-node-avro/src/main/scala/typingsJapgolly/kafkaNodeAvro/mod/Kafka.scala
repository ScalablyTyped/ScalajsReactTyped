package typingsJapgolly.kafkaNodeAvro.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kafka extends js.Object {
  /** Publishes message to Kafka */
  def send(options: SendOptions): js.Promise[js.Object]
}

object Kafka {
  @scala.inline
  def apply(send: SendOptions => CallbackTo[js.Promise[js.Object]]): Kafka = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.kafkaNodeAvro.mod.SendOptions) => send(t0).runNow()))
    __obj.asInstanceOf[Kafka]
  }
}

