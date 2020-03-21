package typingsJapgolly.phosphorMessaging.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageHook extends js.Object {
  /**
    * Intercept a message sent to a message handler.
    *
    * @param handler - The target handler of the message.
    *
    * @param msg - The message to be sent to the handler.
    *
    * @returns `true` if the message should continue to be processed
    *   as normal, or `false` if processing should cease immediately.
    */
  def messageHook(handler: IMessageHandler, msg: Message): Boolean
}

object IMessageHook {
  @scala.inline
  def apply(messageHook: (IMessageHandler, Message) => CallbackTo[Boolean]): IMessageHook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageHook")(js.Any.fromFunction2((t0: typingsJapgolly.phosphorMessaging.mod.IMessageHandler, t1: typingsJapgolly.phosphorMessaging.mod.Message) => messageHook(t0, t1).runNow()))
    __obj.asInstanceOf[IMessageHook]
  }
}

