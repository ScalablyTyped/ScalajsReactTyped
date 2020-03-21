package typingsJapgolly.emberComponent.actionSupportMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSupport extends js.Object {
  def sendAction(action: String, params: js.Any*): Unit
}

object ActionSupport {
  @scala.inline
  def apply(sendAction: (String, /* repeated */ js.Any) => Callback): ActionSupport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendAction")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => sendAction(t0, t1).runNow()))
    __obj.asInstanceOf[ActionSupport]
  }
}

