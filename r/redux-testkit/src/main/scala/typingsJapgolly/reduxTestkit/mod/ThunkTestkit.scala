package typingsJapgolly.reduxTestkit.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThunkTestkit extends js.Object {
  def execute(args: js.Any*): js.Any
}

object ThunkTestkit {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => CallbackTo[js.Any]): ThunkTestkit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => execute(t0).runNow()))
    __obj.asInstanceOf[ThunkTestkit]
  }
}

