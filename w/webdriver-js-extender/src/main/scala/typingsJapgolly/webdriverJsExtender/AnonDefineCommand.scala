package typingsJapgolly.webdriverJsExtender

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefineCommand extends js.Object {
  def defineCommand(name: String, method: String, path: String): Unit
}

object AnonDefineCommand {
  @scala.inline
  def apply(defineCommand: (String, String, String) => Callback): AnonDefineCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defineCommand")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => defineCommand(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonDefineCommand]
  }
}

