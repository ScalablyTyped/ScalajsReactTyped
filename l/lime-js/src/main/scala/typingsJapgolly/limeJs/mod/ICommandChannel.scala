package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandChannel extends js.Object {
  def onCommand(command: Command): js.Any
  def sendCommand(command: Command): Unit
}

object ICommandChannel {
  @scala.inline
  def apply(onCommand: Command => CallbackTo[js.Any], sendCommand: Command => Callback): ICommandChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCommand")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Command) => onCommand(t0).runNow()))
    __obj.updateDynamic("sendCommand")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Command) => sendCommand(t0).runNow()))
    __obj.asInstanceOf[ICommandChannel]
  }
}

