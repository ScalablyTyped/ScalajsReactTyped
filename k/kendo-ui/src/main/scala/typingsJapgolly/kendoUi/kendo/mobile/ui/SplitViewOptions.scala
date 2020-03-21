package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewOptions extends js.Object {
  var init: js.UndefOr[js.Function1[/* e */ SplitViewInitEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ SplitViewShowEvent, Unit]] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object SplitViewOptions {
  @scala.inline
  def apply(
    init: /* e */ SplitViewInitEvent => Callback = null,
    name: String = null,
    show: /* e */ SplitViewShowEvent => Callback = null,
    style: String = null
  ): SplitViewOptions = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.SplitViewInitEvent) => init(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.SplitViewShowEvent) => show(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewOptions]
  }
}

