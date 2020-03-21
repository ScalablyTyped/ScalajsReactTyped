package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsDatetime.PartialIPopoverProps
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps
import typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangeInput {
  def apply(
    formatDate: (js.Date, js.UndefOr[String]) => CallbackTo[String],
    parseDate: (String, js.UndefOr[String]) => CallbackTo[js.Date | Null | `false`],
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: DateRange = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endInputProps: HTMLInputProps with IInputGroupProps = null,
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
    placeholder: String = null,
    popoverProps: PartialIPopoverProps = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    shortcuts: Boolean | js.Array[IDateRangeShortcut] = null,
    singleMonthOnly: js.UndefOr[Boolean] = js.undefined,
    startInputProps: HTMLInputProps with IInputGroupProps = null,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    value: DateRange = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDateRangeInputProps, 
    typingsJapgolly.blueprintjsDatetime.mod.DateRangeInput, 
    Unit, 
    IDateRangeInputProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("formatDate")(js.Any.fromFunction2((t0: js.Date, t1: js.UndefOr[java.lang.String]) => formatDate(t0, t1).runNow()))
    __obj.updateDynamic("parseDate")(js.Any.fromFunction2((t0: java.lang.String, t1: js.UndefOr[java.lang.String]) => parseDate(t0, t1).runNow()))
    if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(contiguousCalendarMonths)) __obj.updateDynamic("contiguousCalendarMonths")(contiguousCalendarMonths.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (endInputProps != null) __obj.updateDynamic("endInputProps")(endInputProps.asInstanceOf[js.Any])
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.mod.DateRangeInput](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime", "DateRangeInput")
  @js.native
  object componentImport extends js.Object
  
}

