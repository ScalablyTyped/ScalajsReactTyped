package typingsJapgolly.espruino

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def removeListener(event: String, listener: js.Any): js.Any
}

object Object {
  @scala.inline
  def apply(removeListener: (String, js.Any) => CallbackTo[js.Any]): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[Object]
  }
}

