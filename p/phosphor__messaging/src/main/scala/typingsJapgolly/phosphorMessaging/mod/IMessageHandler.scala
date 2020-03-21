package typingsJapgolly.phosphorMessaging.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageHandler extends js.Object {
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  def processMessage(msg: Message): Unit
}

object IMessageHandler {
  @scala.inline
  def apply(processMessage: Message => Callback): IMessageHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("processMessage")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorMessaging.mod.Message) => processMessage(t0).runNow()))
    __obj.asInstanceOf[IMessageHandler]
  }
}

