package typingsJapgolly.reactBootstrapDatePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactBootstrapDatePicker.mod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBootstrapDatePicker {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    calendarContainer: js.Any = null,
    calendarPlacement: String = null,
    cellPadding: String = null,
    className: String = null,
    clearButtonElement: VdomNode = null,
    customControl: StatelessComponent[_] | ComponentClassP[js.Object] = null,
    dateFormat: String = null,
    dayLabels: js.Array[String] = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxDate: String = null,
    minDate: String = null,
    monthLabels: js.Array[String] = null,
    nextButtonElement: VdomNode = null,
    onBlur: ReactFocusEventFrom[Element] => Callback = null,
    onChange: (/* value */ String, /* formattedValue */ String) => Callback = null,
    onClear: js.UndefOr[Callback] = js.undefined,
    onFocus: ReactFocusEventFrom[Element] => Callback = null,
    previousButtonElement: VdomNode = null,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    todayButtonLabel: String = null,
    value: String = null,
    weekStartsOnMonday: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DatePickerProps, 
    MountedWithRawType[DatePickerProps, js.Object, RawMounted[DatePickerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (calendarContainer != null) __obj.updateDynamic("calendarContainer")(calendarContainer.asInstanceOf[js.Any])
    if (calendarPlacement != null) __obj.updateDynamic("calendarPlacement")(calendarPlacement.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonElement != null) __obj.updateDynamic("clearButtonElement")(clearButtonElement.rawNode.asInstanceOf[js.Any])
    if (customControl != null) __obj.updateDynamic("customControl")(customControl.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayLabels != null) __obj.updateDynamic("dayLabels")(dayLabels.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels.asInstanceOf[js.Any])
    if (nextButtonElement != null) __obj.updateDynamic("nextButtonElement")(nextButtonElement.rawNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* formattedValue */ java.lang.String) => onChange(t0, t1).runNow()))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (previousButtonElement != null) __obj.updateDynamic("previousButtonElement")(previousButtonElement.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (todayButtonLabel != null) __obj.updateDynamic("todayButtonLabel")(todayButtonLabel.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStartsOnMonday)) __obj.updateDynamic("weekStartsOnMonday")(weekStartsOnMonday.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactBootstrapDatePicker.mod.DatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapDatePicker.mod.DatePickerProps])(children: _*)
  }
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

