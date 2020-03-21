package typingsJapgolly.fluxxor.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreSpec extends js.Object {
  var actions: js.UndefOr[js.Any] = js.undefined
  var initialize: js.UndefOr[
    js.Function2[/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object], Unit]
  ] = js.undefined
}

object StoreSpec {
  @scala.inline
  def apply(
    actions: js.Any = null,
    initialize: (/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => Callback = null
  ): StoreSpec = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction2((t0: /* instance */ js.UndefOr[js.Any], t1: /* options */ js.UndefOr[js.Object]) => initialize(t0, t1).runNow()))
    __obj.asInstanceOf[StoreSpec]
  }
}

