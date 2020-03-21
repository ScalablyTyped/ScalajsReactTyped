package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverOptions extends js.Object {
  var close: js.UndefOr[js.Function1[/* e */ PopOverCloseEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PopOverOpenEvent, Unit]] = js.undefined
  var pane: js.UndefOr[PopOverPane] = js.undefined
  var popup: js.UndefOr[PopOverPopup] = js.undefined
}

object PopOverOptions {
  @scala.inline
  def apply(
    close: /* e */ PopOverCloseEvent => Callback = null,
    name: String = null,
    open: /* e */ PopOverOpenEvent => Callback = null,
    pane: PopOverPane = null,
    popup: PopOverPopup = null
  ): PopOverOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.PopOverCloseEvent) => close(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.PopOverOpenEvent) => open(t0).runNow()))
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopOverOptions]
  }
}

