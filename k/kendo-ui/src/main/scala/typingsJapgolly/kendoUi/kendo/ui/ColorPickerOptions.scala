package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerOptions extends js.Object {
  var buttons: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ColorPickerChangeEvent, Unit]] = js.undefined
  var clearButton: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, Unit]] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var messages: js.UndefOr[ColorPickerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, Unit]] = js.undefined
  var palette: js.UndefOr[String | js.Any] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ColorPickerSelectEvent, Unit]] = js.undefined
  var tileSize: js.UndefOr[ColorPickerTileSize] = js.undefined
  var toolIcon: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ColorPickerOptions {
  @scala.inline
  def apply(
    buttons: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ColorPickerChangeEvent => Callback = null,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    close: /* e */ ColorPickerEvent => Callback = null,
    columns: Int | Double = null,
    messages: ColorPickerMessages = null,
    name: String = null,
    opacity: js.UndefOr[Boolean] = js.undefined,
    open: /* e */ ColorPickerEvent => Callback = null,
    palette: String | js.Any = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ ColorPickerSelectEvent => Callback = null,
    tileSize: ColorPickerTileSize = null,
    toolIcon: String = null,
    value: String = null
  ): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ColorPickerChangeEvent) => change(t0).runNow()))
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ColorPickerEvent) => close(t0).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ColorPickerEvent) => open(t0).runNow()))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ColorPickerSelectEvent) => select(t0).runNow()))
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (toolIcon != null) __obj.updateDynamic("toolIcon")(toolIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPickerOptions]
  }
}

