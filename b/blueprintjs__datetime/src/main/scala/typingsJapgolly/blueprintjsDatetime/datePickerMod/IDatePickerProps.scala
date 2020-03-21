package typingsJapgolly.blueprintjsDatetime.datePickerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerProps
  extends IDatePickerBaseProps
     with IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Text for the reset button in the action bar.
    * @default "Clear"
    */
  var clearButtonText: js.UndefOr[String] = js.undefined
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `fromMonth` (use `minDate`), `month` (use
    * `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  /**
    * Initial day the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[js.Date] = js.undefined
  /**
    * Whether the current day should be highlighted in the calendar.
    * @default false
    */
  var highlightCurrentDay: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when the user selects a day.
    * If being used in an uncontrolled manner, `selectedDate` will be `null` if the user clicks the currently selected
    * day. If being used in a controlled manner, `selectedDate` will contain the day clicked no matter what.
    * `isUserChange` is true if the user selected a day, and false if the date was automatically changed
    * by the user navigating to a new month or year rather than explicitly clicking on a date in the calendar.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.undefined
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDatePickerShortcut, /* index */ Double, Unit]] = js.undefined
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  /**
    * Whether shortcuts to quickly select a date are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.undefined
  /**
    * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown.
    * @default false
    */
  var showActionsBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Text for the today button in the action bar.
    * @default "Today"
    */
  var todayButtonText: js.UndefOr[String] = js.undefined
  /**
    * The currently selected day. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[js.Date] = js.undefined
}

object IDatePickerProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearButtonText: String = null,
    dayPickerProps: DayPickerProps = null,
    defaultValue: js.Date = null,
    highlightCurrentDay: js.UndefOr[Boolean] = js.undefined,
    initialMonth: js.Date = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Callback = null,
    onShortcutChange: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Callback = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectedShortcutIndex: Int | Double = null,
    shortcuts: Boolean | js.Array[IDatePickerShortcut] = null,
    showActionsBar: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    todayButtonText: String = null,
    value: js.Date = null
  ): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCurrentDay)) __obj.updateDynamic("highlightCurrentDay")(highlightCurrentDay.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedDate */ js.Date, t1: /* isUserChange */ scala.Boolean) => onChange(t0, t1).runNow()))
    if (onShortcutChange != null) __obj.updateDynamic("onShortcutChange")(js.Any.fromFunction2((t0: /* shortcut */ typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut, t1: /* index */ scala.Double) => onShortcutChange(t0, t1).runNow()))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(showActionsBar)) __obj.updateDynamic("showActionsBar")(showActionsBar.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (todayButtonText != null) __obj.updateDynamic("todayButtonText")(todayButtonText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerProps]
  }
}

