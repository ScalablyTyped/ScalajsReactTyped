package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
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
    value: js.Date = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDatePickerProps, 
    typingsJapgolly.blueprintjsDatetime.mod.DatePicker, 
    Unit, 
    IDatePickerProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.datePickerMod.IDatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.mod.DatePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.datePickerMod.IDatePickerProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime", "DatePicker")
  @js.native
  object componentImport extends js.Object
  
}

