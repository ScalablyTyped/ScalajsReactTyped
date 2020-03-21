package typingsJapgolly.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object Callback {
  @scala.inline
  def apply(callback: /* params */ js.UndefOr[js.Any] => japgolly.scalajs.react.Callback = null): Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => callback(t0).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

