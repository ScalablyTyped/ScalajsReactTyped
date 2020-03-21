package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroHandle extends js.Object {
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var update: js.UndefOr[js.Function1[/* attributes */ ValueMap, Unit]] = js.undefined
}

object MacroHandle {
  @scala.inline
  def apply(
    invalidate: js.UndefOr[Callback] = js.undefined,
    render: js.UndefOr[Callback] = js.undefined,
    teardown: js.UndefOr[Callback] = js.undefined,
    update: /* attributes */ ValueMap => Callback = null
  ): MacroHandle = {
    val __obj = js.Dynamic.literal()
    invalidate.foreach(p => __obj.updateDynamic("invalidate")(p.toJsFn))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    teardown.foreach(p => __obj.updateDynamic("teardown")(p.toJsFn))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* attributes */ typingsJapgolly.ractive.mod.ValueMap) => update(t0).runNow()))
    __obj.asInstanceOf[MacroHandle]
  }
}

