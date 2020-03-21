package typingsJapgolly.sharepoint.CUI.Page

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandHandler extends js.Object {
  def canHandleCommand(commandId: String): Boolean
  def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean
}

object ICommandHandler {
  @scala.inline
  def apply(
    canHandleCommand: String => CallbackTo[Boolean],
    handleCommand: (String, js.Any, Double) => CallbackTo[Boolean]
  ): ICommandHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canHandleCommand")(js.Any.fromFunction1((t0: java.lang.String) => canHandleCommand(t0).runNow()))
    __obj.updateDynamic("handleCommand")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: scala.Double) => handleCommand(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ICommandHandler]
  }
}

