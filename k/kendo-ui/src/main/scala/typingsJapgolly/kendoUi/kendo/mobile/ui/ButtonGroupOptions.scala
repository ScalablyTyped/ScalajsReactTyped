package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOptions extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, Unit]] = js.undefined
  var selectOn: js.UndefOr[String] = js.undefined
}

object ButtonGroupOptions {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    name: String = null,
    select: /* e */ ButtonGroupSelectEvent => Callback = null,
    selectOn: String = null
  ): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ButtonGroupSelectEvent) => select(t0).runNow()))
    if (selectOn != null) __obj.updateDynamic("selectOn")(selectOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupOptions]
  }
}

