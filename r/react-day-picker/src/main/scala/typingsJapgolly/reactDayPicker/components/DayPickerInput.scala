package typingsJapgolly.reactDayPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.reactDayPicker.commonMod.DayModifiers
import typingsJapgolly.reactDayPicker.commonMod.InputClassNames
import typingsJapgolly.reactDayPicker.propsMod.DayPickerInputProps
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DayPickerInput {
  def apply(
    classNames: InputClassNames = null,
    clickUnselectsDay: js.UndefOr[Boolean] = js.undefined,
    component: js.Any = null,
    dayPickerProps: DayPickerProps = null,
    format: String | js.Array[String] = null,
    formatDate: (/* date */ js.Date, /* format */ String, /* locale */ String) => CallbackTo[String] = null,
    hideOnDayClick: js.UndefOr[Boolean] = js.undefined,
    inputProps: js.Object = null,
    keepFocus: js.UndefOr[Boolean] = js.undefined,
    onBlur: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onChange: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onClick: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onDayChange: (/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ typingsJapgolly.reactDayPicker.dayPickerInputMod.DayPickerInput) => Callback = null,
    onDayPickerHide: js.UndefOr[Callback] = js.undefined,
    onDayPickerShow: js.UndefOr[Callback] = js.undefined,
    onFocus: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onKeyUp: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    overlayComponent: js.Any = null,
    parseDate: (/* str */ String, /* format */ String, /* locale */ String) => CallbackTo[js.Date | Unit] = null,
    placeholder: String = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    value: String | js.Date = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DayPickerInputProps, 
    typingsJapgolly.reactDayPicker.dayPickerInputMod.DayPickerInput, 
    Unit, 
    DayPickerInputProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clickUnselectsDay)) __obj.updateDynamic("clickUnselectsDay")(clickUnselectsDay.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3((t0: /* date */ js.Date, t1: /* format */ java.lang.String, t2: /* locale */ java.lang.String) => formatDate(t0, t1, t2).runNow()))
    if (!js.isUndefined(hideOnDayClick)) __obj.updateDynamic("hideOnDayClick")(hideOnDayClick.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocus)) __obj.updateDynamic("keepFocus")(keepFocus.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (onDayChange != null) __obj.updateDynamic("onDayChange")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* DayModifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* dayPickerInput */ typingsJapgolly.reactDayPicker.dayPickerInputMod.DayPickerInput) => onDayChange(t0, t1, t2).runNow()))
    onDayPickerHide.foreach(p => __obj.updateDynamic("onDayPickerHide")(p.toJsFn))
    onDayPickerShow.foreach(p => __obj.updateDynamic("onDayPickerShow")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onFocus(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyUp(t0).runNow()))
    if (overlayComponent != null) __obj.updateDynamic("overlayComponent")(overlayComponent.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction3((t0: /* str */ java.lang.String, t1: /* format */ java.lang.String, t2: /* locale */ java.lang.String) => parseDate(t0, t1, t2).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDayPicker.propsMod.DayPickerInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDayPicker.dayPickerInputMod.DayPickerInput](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDayPicker.propsMod.DayPickerInputProps])(children: _*)
  }
  @JSImport("react-day-picker/types/DayPickerInput", "DayPickerInput")
  @js.native
  object componentImport extends js.Object
  
}

