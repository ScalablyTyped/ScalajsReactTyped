package typingsJapgolly.freedom

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveEventListener extends js.Object {
  def removeEventListener(s: String, f: js.Function, b: Boolean): Unit
}

object AnonRemoveEventListener {
  @scala.inline
  def apply(removeEventListener: (String, js.Function, Boolean) => Callback): AnonRemoveEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function, t2: scala.Boolean) => removeEventListener(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonRemoveEventListener]
  }
}

