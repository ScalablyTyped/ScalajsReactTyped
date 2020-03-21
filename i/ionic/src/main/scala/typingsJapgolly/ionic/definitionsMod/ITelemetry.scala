package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITelemetry extends js.Object {
  def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit]
}

object ITelemetry {
  @scala.inline
  def apply(sendCommand: (String, js.Array[String]) => CallbackTo[js.Promise[Unit]]): ITelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendCommand")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[java.lang.String]) => sendCommand(t0, t1).runNow()))
    __obj.asInstanceOf[ITelemetry]
  }
}

