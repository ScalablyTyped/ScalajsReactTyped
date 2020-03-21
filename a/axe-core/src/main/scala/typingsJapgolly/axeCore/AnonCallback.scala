package typingsJapgolly.axeCore

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var id: String
  def callback(args: js.Any*): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Callback, id: String): AnonCallback = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => callback(t0).runNow()))
    __obj.asInstanceOf[AnonCallback]
  }
}

