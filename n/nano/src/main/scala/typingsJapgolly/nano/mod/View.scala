package typingsJapgolly.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// View
// -------------------------------------
trait View[D] extends js.Object {
  var map: js.UndefOr[js.Function1[/* doc */ D with Document, Unit]] = js.undefined
  var reduce: js.UndefOr[js.Function1[/* doc */ D with Document, Unit]] = js.undefined
}

object View {
  @scala.inline
  def apply[D](
    map: /* doc */ D with Document => japgolly.scalajs.react.Callback = null,
    reduce: /* doc */ D with Document => japgolly.scalajs.react.Callback = null
  ): View[D] = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* doc */ D with typingsJapgolly.nano.mod.Document) => map(t0).runNow()))
    if (reduce != null) __obj.updateDynamic("reduce")(js.Any.fromFunction1((t0: /* doc */ D with typingsJapgolly.nano.mod.Document) => reduce(t0).runNow()))
    __obj.asInstanceOf[View[D]]
  }
}

