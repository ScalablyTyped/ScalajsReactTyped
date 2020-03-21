package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ DetailButtonClickEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object DetailButtonOptions {
  @scala.inline
  def apply(click: /* e */ DetailButtonClickEvent => Callback = null, name: String = null): DetailButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.DetailButtonClickEvent) => click(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailButtonOptions]
  }
}

