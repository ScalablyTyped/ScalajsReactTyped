package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, Unit]] = js.undefined
  var hashBang: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
  var pushState: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, Unit]] = js.undefined
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    change: /* e */ RouterChangeEvent => Callback = null,
    hashBang: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    init: /* e */ RouterEvent => Callback = null,
    pushState: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    routeMissing: /* e */ RouterRouteMissingEvent => Callback = null,
    same: /* e */ RouterEvent => Callback = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.RouterChangeEvent) => change(t0).runNow()))
    if (!js.isUndefined(hashBang)) __obj.updateDynamic("hashBang")(hashBang.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.RouterEvent) => init(t0).runNow()))
    if (!js.isUndefined(pushState)) __obj.updateDynamic("pushState")(pushState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (routeMissing != null) __obj.updateDynamic("routeMissing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.RouterRouteMissingEvent) => routeMissing(t0).runNow()))
    if (same != null) __obj.updateDynamic("same")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.RouterEvent) => same(t0).runNow()))
    __obj.asInstanceOf[RouterOptions]
  }
}

