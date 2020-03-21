package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactWidgets.dateTimePickerMod.DateTimePickerMessages
import typingsJapgolly.reactWidgets.dateTimePickerMod.DateTimePickerProps
import typingsJapgolly.reactWidgets.dateTimePickerMod.Open
import typingsJapgolly.reactWidgets.mod.DateTimePicker.^
import typingsJapgolly.reactWidgets.reactWidgetsStrings.century
import typingsJapgolly.reactWidgets.reactWidgetsStrings.decade
import typingsJapgolly.reactWidgets.reactWidgetsStrings.month
import typingsJapgolly.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateTimePicker {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    calendar: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    culture: String = null,
    currentDate: js.Date = null,
    date: js.UndefOr[Boolean] = js.undefined,
    dateIcon: VdomElement = null,
    defaultCurrentDate: js.Date = null,
    defaultOpen: Open = null,
    defaultValue: js.Date = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    editFormat: String = null,
    finalView: month | year | decade | century = null,
    format: String = null,
    id: String = null,
    initialView: month | year | decade | century = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    max: js.Date = null,
    messages: DateTimePickerMessages = null,
    min: js.Date = null,
    name: String = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onChange: (/* date */ js.UndefOr[js.Date], /* dateStr */ js.UndefOr[String]) => Callback = null,
    onCurrentDateChange: /* date */ js.UndefOr[js.Date] => Callback = null,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onKeyDown: /* event */ ReactKeyboardEventFrom[Element] => Callback = null,
    onKeyPress: /* event */ ReactKeyboardEventFrom[Element] => Callback = null,
    onSelect: /* date */ js.UndefOr[js.Date] => Callback = null,
    onToggle: /* isOpen */ Open => Callback = null,
    open: Open = null,
    parse: (js.Function1[/* str */ String, js.Date]) | js.Array[String] | String = null,
    placeholder: String = null,
    popupTransition: ReactType[_] | String = null,
    readOnly: Boolean | js.Array[_] = null,
    step: Double | Boolean = null,
    time: js.UndefOr[Boolean] = js.undefined,
    timeComponent: ReactType[_] | String = null,
    timeFormat: String = null,
    timeIcon: VdomElement = null,
    value: js.Date = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DateTimePickerProps, ^, Unit, DateTimePickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(calendar)) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateIcon != null) __obj.updateDynamic("dateIcon")(dateIcon.rawElement.asInstanceOf[js.Any])
    if (defaultCurrentDate != null) __obj.updateDynamic("defaultCurrentDate")(defaultCurrentDate.asInstanceOf[js.Any])
    if (defaultOpen != null) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (editFormat != null) __obj.updateDynamic("editFormat")(editFormat.asInstanceOf[js.Any])
    if (finalView != null) __obj.updateDynamic("finalView")(finalView.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* date */ js.UndefOr[js.Date], t1: /* dateStr */ js.UndefOr[java.lang.String]) => onChange(t0, t1).runNow()))
    if (onCurrentDateChange != null) __obj.updateDynamic("onCurrentDateChange")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[js.Date]) => onCurrentDateChange(t0).runNow()))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[js.Date]) => onSelect(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* isOpen */ typingsJapgolly.reactWidgets.dateTimePickerMod.Open) => onToggle(t0).runNow()))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeComponent != null) __obj.updateDynamic("timeComponent")(timeComponent.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeIcon != null) __obj.updateDynamic("timeIcon")(timeIcon.rawElement.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWidgets.dateTimePickerMod.DateTimePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactWidgets.mod.DateTimePicker.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWidgets.dateTimePickerMod.DateTimePickerProps])(children: _*)
  }
  @JSImport("react-widgets", "DateTimePicker")
  @js.native
  object componentImport extends js.Object
  
}

