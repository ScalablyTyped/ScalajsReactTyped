package typingsJapgolly.blueprintjsDatetime

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/shortcuts.IShortcutsProps> */
trait PartialIShortcutsProps extends js.Object {
  var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var onShortcutClick: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.undefined
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var shortcuts: js.UndefOr[js.Array[IDateRangeShortcut] | `true`] = js.undefined
  var timePrecision: js.UndefOr[TimePrecision] = js.undefined
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
}

object PartialIShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onShortcutClick: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Callback = null,
    selectedShortcutIndex: Int | Double = null,
    shortcuts: js.Array[IDateRangeShortcut] | `true` = null,
    timePrecision: TimePrecision = null,
    useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  ): PartialIShortcutsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onShortcutClick != null) __obj.updateDynamic("onShortcutClick")(js.Any.fromFunction2((t0: /* shortcut */ typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut, t1: /* index */ scala.Double) => onShortcutClick(t0, t1).runNow()))
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleDateShortcuts)) __obj.updateDynamic("useSingleDateShortcuts")(useSingleDateShortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIShortcutsProps]
  }
}

