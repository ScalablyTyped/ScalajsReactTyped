package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object TabStripOptions {
  @scala.inline
  def apply(
    name: String = null,
    select: /* e */ TabStripSelectEvent => Callback = null,
    selectedIndex: Int | Double = null
  ): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.TabStripSelectEvent) => select(t0).runNow()))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripOptions]
  }
}

