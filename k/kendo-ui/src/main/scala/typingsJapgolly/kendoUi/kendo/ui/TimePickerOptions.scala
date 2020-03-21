package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  var animation: js.UndefOr[Boolean | TimePickerAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TimePickerChangeEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ TimePickerCloseEvent, Unit]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dateInput: js.UndefOr[Boolean] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[js.Date] = js.undefined
  var min: js.UndefOr[js.Date] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ TimePickerOpenEvent, Unit]] = js.undefined
  var parseFormats: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
}

object TimePickerOptions {
  @scala.inline
  def apply(
    animation: Boolean | TimePickerAnimation = null,
    change: /* e */ TimePickerChangeEvent => Callback = null,
    close: /* e */ TimePickerCloseEvent => Callback = null,
    culture: String = null,
    dateInput: js.UndefOr[Boolean] = js.undefined,
    dates: js.Any = null,
    format: String = null,
    interval: Int | Double = null,
    max: js.Date = null,
    min: js.Date = null,
    name: String = null,
    open: /* e */ TimePickerOpenEvent => Callback = null,
    parseFormats: js.Any = null,
    value: js.Date = null
  ): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimePickerChangeEvent) => change(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimePickerCloseEvent) => close(t0).runNow()))
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (!js.isUndefined(dateInput)) __obj.updateDynamic("dateInput")(dateInput.asInstanceOf[js.Any])
    if (dates != null) __obj.updateDynamic("dates")(dates.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimePickerOpenEvent) => open(t0).runNow()))
    if (parseFormats != null) __obj.updateDynamic("parseFormats")(parseFormats.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerOptions]
  }
}

