package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsivePanelOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var breakpoint: js.UndefOr[Double] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var toggleButton: js.UndefOr[String] = js.undefined
}

object ResponsivePanelOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    breakpoint: Int | Double = null,
    close: /* e */ ResponsivePanelEvent => Callback = null,
    name: String = null,
    open: /* e */ ResponsivePanelEvent => Callback = null,
    orientation: String = null,
    toggleButton: String = null
  ): ResponsivePanelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ResponsivePanelEvent) => close(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ResponsivePanelEvent) => open(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsivePanelOptions]
  }
}

