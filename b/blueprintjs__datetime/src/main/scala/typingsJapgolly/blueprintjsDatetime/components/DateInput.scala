package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsDatetime.PartialIPopoverProps
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsJapgolly.blueprintjsDatetime.dateInputMod.IDateInputProps
import typingsJapgolly.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateInput {
  def apply(
    formatDate: (js.Date, js.UndefOr[String]) => CallbackTo[String],
    parseDate: (String, js.UndefOr[String]) => CallbackTo[js.Date | Null | `false`],
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearButtonText: String = null,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
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
    placeholder: String = null,
    popoverProps: PartialIPopoverProps with js.Object = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    rightElement: VdomElement = null,
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
    IDateInputProps, 
    typingsJapgolly.blueprintjsDatetime.mod.DateInput, 
    Unit, 
    IDateInputProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("formatDate")(js.Any.fromFunction2((t0: js.Date, t1: js.UndefOr[java.lang.String]) => formatDate(t0, t1).runNow()))
    __obj.updateDynamic("parseDate")(js.Any.fromFunction2((t0: java.lang.String, t1: js.UndefOr[java.lang.String]) => parseDate(t0, t1).runNow()))
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.dateInputMod.IDateInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.mod.DateInput](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.dateInputMod.IDateInputProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime", "DateInput")
  @js.native
  object componentImport extends js.Object
  
}

