package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageChannel extends js.Object {
  def onMessage(message: Message): js.Any
  def sendMessage(message: Message): Unit
}

object IMessageChannel {
  @scala.inline
  def apply(onMessage: Message => CallbackTo[js.Any], sendMessage: Message => Callback): IMessageChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Message) => onMessage(t0).runNow()))
    __obj.updateDynamic("sendMessage")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Message) => sendMessage(t0).runNow()))
    __obj.asInstanceOf[IMessageChannel]
  }
}

