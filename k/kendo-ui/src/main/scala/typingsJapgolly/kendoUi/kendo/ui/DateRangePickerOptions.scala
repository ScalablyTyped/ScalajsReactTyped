package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangePickerOptions extends js.Object {
  var ARIATemplate: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DateRangePickerChangeEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DateRangePickerCloseEvent, Unit]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[String | js.Function] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[js.Date] = js.undefined
  var messages: js.UndefOr[DateRangePickerMessages] = js.undefined
  var min: js.UndefOr[js.Date] = js.undefined
  var month: js.UndefOr[DateRangePickerMonth] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DateRangePickerOpenEvent, Unit]] = js.undefined
  var range: js.UndefOr[DateRangePickerRange] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var weekNumber: js.UndefOr[Boolean] = js.undefined
}

object DateRangePickerOptions {
  @scala.inline
  def apply(
    ARIATemplate: String = null,
    change: /* e */ DateRangePickerChangeEvent => Callback = null,
    close: /* e */ DateRangePickerCloseEvent => Callback = null,
    culture: String = null,
    dates: js.Any = null,
    depth: String = null,
    disableDates: js.Any | js.Function = null,
    footer: String | js.Function = null,
    format: String = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    max: js.Date = null,
    messages: DateRangePickerMessages = null,
    min: js.Date = null,
    month: DateRangePickerMonth = null,
    name: String = null,
    open: /* e */ DateRangePickerOpenEvent => Callback = null,
    range: DateRangePickerRange = null,
    start: String = null,
    weekNumber: js.UndefOr[Boolean] = js.undefined
  ): DateRangePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (ARIATemplate != null) __obj.updateDynamic("ARIATemplate")(ARIATemplate.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DateRangePickerChangeEvent) => change(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DateRangePickerCloseEvent) => close(t0).runNow()))
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (dates != null) __obj.updateDynamic("dates")(dates.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DateRangePickerOpenEvent) => open(t0).runNow()))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangePickerOptions]
  }
}

