package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAction
  extends ActionObject[js.Any, js.Any] {
  var sendId: String | Double
}

object CancelAction {
  @scala.inline
  def apply(
    sendId: String | Double,
    `type`: String,
    exec: (js.Any, js.Any, /* meta */ ActionMeta[js.Any, js.Any]) => CallbackTo[js.Any | Unit] = null
  ): CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[js.Any, js.Any]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CancelAction]
  }
}

