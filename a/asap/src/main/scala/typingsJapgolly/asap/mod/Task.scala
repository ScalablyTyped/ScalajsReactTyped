package typingsJapgolly.asap.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  def call(args: js.Any*): js.Any
}

object Task {
  @scala.inline
  def apply(call: /* repeated */ js.Any => CallbackTo[js.Any]): Task = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => call(t0).runNow()))
    __obj.asInstanceOf[Task]
  }
}

