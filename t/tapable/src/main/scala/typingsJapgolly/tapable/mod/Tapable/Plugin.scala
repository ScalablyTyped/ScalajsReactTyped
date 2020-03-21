package typingsJapgolly.tapable.mod.Tapable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): Unit
}

object Plugin {
  @scala.inline
  def apply(apply: /* repeated */ js.Any => Callback): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => apply(t0).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

