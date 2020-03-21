package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerOptions extends js.Object {
  var autoupdate: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ FlatColorPickerChangeEvent, Unit]] = js.undefined
  var messages: js.UndefOr[FlatColorPickerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Boolean] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object FlatColorPickerOptions {
  @scala.inline
  def apply(
    autoupdate: js.UndefOr[Boolean] = js.undefined,
    buttons: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ FlatColorPickerChangeEvent => Callback = null,
    messages: FlatColorPickerMessages = null,
    name: String = null,
    opacity: js.UndefOr[Boolean] = js.undefined,
    preview: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): FlatColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoupdate)) __obj.updateDynamic("autoupdate")(autoupdate.asInstanceOf[js.Any])
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FlatColorPickerChangeEvent) => change(t0).runNow()))
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatColorPickerOptions]
  }
}

