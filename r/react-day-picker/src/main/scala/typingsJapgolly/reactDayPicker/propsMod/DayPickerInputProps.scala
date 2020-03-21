package typingsJapgolly.reactDayPicker.propsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.reactDayPicker.commonMod.DayModifiers
import typingsJapgolly.reactDayPicker.commonMod.InputClassNames
import typingsJapgolly.reactDayPicker.dayPickerInputMod.DayPickerInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerInputProps extends js.Object {
  var classNames: js.UndefOr[InputClassNames] = js.undefined
  var clickUnselectsDay: js.UndefOr[Boolean] = js.undefined
  // Not sure React.ComponentClass<any> is the right type for _propTypes2.default.any
  var component: js.UndefOr[js.Any] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var format: js.UndefOr[String | js.Array[String]] = js.undefined
  var formatDate: js.UndefOr[
    js.Function3[/* date */ js.Date, /* format */ String, /* locale */ String, String]
  ] = js.undefined
  var hideOnDayClick: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Object] = js.undefined
  var keepFocus: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onDayChange: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* DayModifiers */ DayModifiers, 
      /* dayPickerInput */ DayPickerInput, 
      Unit
    ]
  ] = js.undefined
  var onDayPickerHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDayPickerShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.undefined
  var overlayComponent: js.UndefOr[js.Any] = js.undefined
  var parseDate: js.UndefOr[
    js.Function3[/* str */ String, /* format */ String, /* locale */ String, js.Date | Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var showOverlay: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | js.Date] = js.undefined
}

object DayPickerInputProps {
  @scala.inline
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
    onDayChange: (/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ DayPickerInput) => Callback = null,
    onDayPickerHide: js.UndefOr[Callback] = js.undefined,
    onDayPickerShow: js.UndefOr[Callback] = js.undefined,
    onFocus: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onKeyUp: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    overlayComponent: js.Any = null,
    parseDate: (/* str */ String, /* format */ String, /* locale */ String) => CallbackTo[js.Date | Unit] = null,
    placeholder: String = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    value: String | js.Date = null
  ): DayPickerInputProps = {
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
    __obj.asInstanceOf[DayPickerInputProps]
  }
}

