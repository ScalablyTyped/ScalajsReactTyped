package typingsJapgolly.blueprintjsDatetime

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateRangeInput.IDateRangeInputProps> */
trait PartialIDateRangeInputPro extends js.Object {
  var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeOnSelection: js.UndefOr[Boolean] = js.undefined
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var defaultValue: js.UndefOr[DateRange] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var endInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.undefined
  var formatDate: js.UndefOr[js.Function2[/* date */ js.Date, /* locale */ js.UndefOr[String], String]] = js.undefined
  var initialMonth: js.UndefOr[js.Date] = js.undefined
  var invalidDateMessage: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* selectedRange */ DateRange, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errorRange */ DateRange, Unit]] = js.undefined
  var outOfRangeMessage: js.UndefOr[String] = js.undefined
  var overlappingDatesMessage: js.UndefOr[String] = js.undefined
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], js.Date | `false` | Null]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.undefined
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.undefined
  var singleMonthOnly: js.UndefOr[Boolean] = js.undefined
  var startInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.undefined
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
  var timePrecision: js.UndefOr[TimePrecision] = js.undefined
  var value: js.UndefOr[DateRange] = js.undefined
}

object PartialIDateRangeInputPro {
  @scala.inline
  def apply(
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: DateRange = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endInputProps: HTMLInputProps with IInputGroupProps = null,
    formatDate: (/* date */ js.Date, /* locale */ js.UndefOr[String]) => CallbackTo[String] = null,
    initialMonth: js.Date = null,
    invalidDateMessage: String = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: /* selectedRange */ DateRange => Callback = null,
    onError: /* errorRange */ DateRange => Callback = null,
    outOfRangeMessage: String = null,
    overlappingDatesMessage: String = null,
    parseDate: (/* str */ String, /* locale */ js.UndefOr[String]) => CallbackTo[js.Date | `false` | Null] = null,
    placeholder: String = null,
    popoverProps: PartialIPopoverProps = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    shortcuts: Boolean | js.Array[IDateRangeShortcut] = null,
    singleMonthOnly: js.UndefOr[Boolean] = js.undefined,
    startInputProps: HTMLInputProps with IInputGroupProps = null,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    value: DateRange = null
  ): PartialIDateRangeInputPro = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(contiguousCalendarMonths)) __obj.updateDynamic("contiguousCalendarMonths")(contiguousCalendarMonths.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (endInputProps != null) __obj.updateDynamic("endInputProps")(endInputProps.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* locale */ js.UndefOr[java.lang.String]) => formatDate(t0, t1).runNow()))
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selectedRange */ typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange) => onChange(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* errorRange */ typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange) => onError(t0).runNow()))
    if (outOfRangeMessage != null) __obj.updateDynamic("outOfRangeMessage")(outOfRangeMessage.asInstanceOf[js.Any])
    if (overlappingDatesMessage != null) __obj.updateDynamic("overlappingDatesMessage")(overlappingDatesMessage.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2((t0: /* str */ java.lang.String, t1: /* locale */ js.UndefOr[java.lang.String]) => parseDate(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMonthOnly)) __obj.updateDynamic("singleMonthOnly")(singleMonthOnly.asInstanceOf[js.Any])
    if (startInputProps != null) __obj.updateDynamic("startInputProps")(startInputProps.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIDateRangeInputPro]
  }
}

