package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ ToolBarClickEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ToolBarCloseEvent, Unit]] = js.undefined
  var items: js.UndefOr[js.Array[ToolBarItem]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ToolBarOpenEvent, Unit]] = js.undefined
  var overflowClose: js.UndefOr[js.Function1[/* e */ ToolBarOverflowCloseEvent, Unit]] = js.undefined
  var overflowOpen: js.UndefOr[js.Function1[/* e */ ToolBarOverflowOpenEvent, Unit]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function1[/* e */ ToolBarToggleEvent, Unit]] = js.undefined
}

object ToolBarOptions {
  @scala.inline
  def apply(
    click: /* e */ ToolBarClickEvent => Callback = null,
    close: /* e */ ToolBarCloseEvent => Callback = null,
    items: js.Array[ToolBarItem] = null,
    name: String = null,
    open: /* e */ ToolBarOpenEvent => Callback = null,
    overflowClose: /* e */ ToolBarOverflowCloseEvent => Callback = null,
    overflowOpen: /* e */ ToolBarOverflowOpenEvent => Callback = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    toggle: /* e */ ToolBarToggleEvent => Callback = null
  ): ToolBarOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ToolBarClickEvent) => click(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ToolBarCloseEvent) => close(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ToolBarOpenEvent) => open(t0).runNow()))
    if (overflowClose != null) __obj.updateDynamic("overflowClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ToolBarOverflowCloseEvent) => overflowClose(t0).runNow()))
    if (overflowOpen != null) __obj.updateDynamic("overflowOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ToolBarOverflowOpenEvent) => overflowOpen(t0).runNow()))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ToolBarToggleEvent) => toggle(t0).runNow()))
    __obj.asInstanceOf[ToolBarOptions]
  }
}

