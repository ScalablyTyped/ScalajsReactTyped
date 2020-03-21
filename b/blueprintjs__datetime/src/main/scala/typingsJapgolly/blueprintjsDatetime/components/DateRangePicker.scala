package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps
import typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangePicker {
  def apply(
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    boundaryToModify: Boundary = null,
    className: String = null,
    contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: DateRange = null,
    initialMonth: js.Date = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: /* selectedDates */ DateRange => Callback = null,
    onHoverChange: (/* hoveredDates */ DateRange, /* hoveredDay */ js.Date, /* hoveredBoundary */ Boundary) => Callback = null,
    onShortcutChange: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Callback = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectedShortcutIndex: Int | Double = null,
    shortcuts: Boolean | js.Array[IDateRangeShortcut] = null,
    singleMonthOnly: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    value: DateRange = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDateRangePickerProps, 
    typingsJapgolly.blueprintjsDatetime.mod.DateRangePicker, 
    Unit, 
    IDateRangePickerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange.asInstanceOf[js.Any])
    if (boundaryToModify != null) __obj.updateDynamic("boundaryToModify")(boundaryToModify.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(contiguousCalendarMonths)) __obj.updateDynamic("contiguousCalendarMonths")(contiguousCalendarMonths.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selectedDates */ typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange) => onChange(t0).runNow()))
    if (onHoverChange != null) __obj.updateDynamic("onHoverChange")(js.Any.fromFunction3((t0: /* hoveredDates */ typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange, t1: /* hoveredDay */ js.Date, t2: /* hoveredBoundary */ typingsJapgolly.blueprintjsCore.boundaryMod.Boundary) => onHoverChange(t0, t1, t2).runNow()))
    if (onShortcutChange != null) __obj.updateDynamic("onShortcutChange")(js.Any.fromFunction2((t0: /* shortcut */ typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut, t1: /* index */ scala.Double) => onShortcutChange(t0, t1).runNow()))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMonthOnly)) __obj.updateDynamic("singleMonthOnly")(singleMonthOnly.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.mod.DateRangePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime", "DateRangePicker")
  @js.native
  object componentImport extends js.Object
  
}

