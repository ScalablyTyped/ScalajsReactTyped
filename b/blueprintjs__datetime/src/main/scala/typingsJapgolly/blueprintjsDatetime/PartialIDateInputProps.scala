package typingsJapgolly.blueprintjsDatetime

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateInput.IDateInputProps> */
trait PartialIDateInputProps extends js.Object {
  var canClearSelection: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearButtonText: js.UndefOr[String] = js.undefined
  var closeOnSelection: js.UndefOr[Boolean] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var defaultValue: js.UndefOr[js.Date] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var formatDate: js.UndefOr[js.Function2[/* date */ js.Date, /* locale */ js.UndefOr[String], String]] = js.undefined
  var initialMonth: js.UndefOr[js.Date] = js.undefined
  var inputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.undefined
  var invalidDateMessage: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errorDate */ js.Date, Unit]] = js.undefined
  var outOfRangeMessage: js.UndefOr[String] = js.undefined
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], js.Date | `false` | Null]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.undefined
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  var rightElement: js.UndefOr[Element] = js.undefined
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.undefined
  var showActionsBar: js.UndefOr[Boolean] = js.undefined
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
  var timePrecision: js.UndefOr[TimePrecision] = js.undefined
  var todayButtonText: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
}

object PartialIDateInputProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearButtonText: String = null,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    formatDate: (/* date */ js.Date, /* locale */ js.UndefOr[String]) => CallbackTo[String] = null,
    initialMonth: js.Date = null,
    inputProps: HTMLInputProps with IInputGroupProps = null,
    invalidDateMessage: String = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Callback = null,
    onError: /* errorDate */ js.Date => Callback = null,
    outOfRangeMessage: String = null,
    parseDate: (/* str */ String, /* locale */ js.UndefOr[String]) => CallbackTo[js.Date | `false` | Null] = null,
    placeholder: String = null,
    popoverProps: PartialIPopoverProps with js.Object = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    rightElement: VdomElement = null,
    shortcuts: Boolean | js.Array[IDatePickerShortcut] = null,
    showActionsBar: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    todayButtonText: String = null,
    value: js.Date = null
  ): PartialIDateInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* locale */ js.UndefOr[java.lang.String]) => formatDate(t0, t1).runNow()))
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedDate */ js.Date, t1: /* isUserChange */ scala.Boolean) => onChange(t0, t1).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* errorDate */ js.Date) => onError(t0).runNow()))
    if (outOfRangeMessage != null) __obj.updateDynamic("outOfRangeMessage")(outOfRangeMessage.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2((t0: /* str */ java.lang.String, t1: /* locale */ js.UndefOr[java.lang.String]) => parseDate(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.rawElement.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(showActionsBar)) __obj.updateDynamic("showActionsBar")(showActionsBar.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (todayButtonText != null) __obj.updateDynamic("todayButtonText")(todayButtonText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIDateInputProps]
  }
}

