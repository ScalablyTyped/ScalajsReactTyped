package typingsJapgolly.blueprintjsDatetime.dateRangePickerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangePickerProps
  extends IDatePickerBaseProps
     with IProps {
  /**
    * Whether the start and end dates of the range can be the same day.
    * If `true`, clicking a selected date will create a one-day range.
    * If `false`, clicking a selected date will clear the selection.
    * @default false
    */
  var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
  /**
    * The date-range boundary that the next click should modify.
    * This will be honored unless the next click would overlap the other boundary date.
    * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
    * If `undefined`, the picker will revert to its default selection behavior.
    */
  var boundaryToModify: js.UndefOr[Boundary] = js.undefined
  /**
    * Whether displayed months in the calendar are contiguous.
    * If false, each side of the calendar can move independently to non-contiguous months.
    * @default true
    */
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `numberOfMonths`, `fromMonth` (use
    * `minDate`), `month` (use `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  /**
    * Initial `DateRange` the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[DateRange] = js.undefined
  /**
    * Called when the user selects a day.
    * If no days are selected, it will pass `[null, null]`.
    * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
    * If both a start and end date are selected, it will pass `[startDate, endDate]`.
    */
  var onChange: js.UndefOr[js.Function1[/* selectedDates */ DateRange, Unit]] = js.undefined
  /**
    * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
    * When triggered from mouseenter, it will pass the date range that would result from next click.
    * When triggered from mouseleave, it will pass `undefined`.
    */
  var onHoverChange: js.UndefOr[
    js.Function3[
      /* hoveredDates */ DateRange, 
      /* hoveredDay */ js.Date, 
      /* hoveredBoundary */ Boundary, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.undefined
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  /**
    * Whether shortcuts to quickly select a range of dates are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default true
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.undefined
  /**
    * Whether to show only a single month calendar.
    * @default false
    */
  var singleMonthOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently selected `DateRange`.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[DateRange] = js.undefined
}

object IDateRangePickerProps {
  @scala.inline
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
    value: DateRange = null
  ): IDateRangePickerProps = {
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
    __obj.asInstanceOf[IDateRangePickerProps]
  }
}

