package typingsJapgolly.rcPicker.rangePickerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.rcPicker.interfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.interfaceMod.EventValue
import typingsJapgolly.rcPicker.interfaceMod.PanelMode
import typingsJapgolly.rcPicker.interfaceMod.RangeValue
import typingsJapgolly.rcPicker.rcPickerStrings.end
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.rcPicker.rcPickerStrings.start
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePickerSharedProps[DateType] extends js.Object {
  var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
  var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function2[/* date */ EventValue[DateType], /* type */ start | end, DisabledTimes]
  ] = js.undefined
  var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onCalendarChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var ranges: js.UndefOr[
    Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ]
  ] = js.undefined
  var separator: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[RangeValue[DateType]] = js.undefined
}

object RangePickerSharedProps {
  @scala.inline
  def apply[DateType](
    allowEmpty: js.Tuple2[Boolean, Boolean] = null,
    defaultPickerValue: js.Tuple2[DateType, DateType] = null,
    defaultValue: RangeValue[DateType] = null,
    direction: ltr | rtl = null,
    disabled: Boolean | (js.Tuple2[Boolean, Boolean]) = null,
    disabledTime: (/* date */ EventValue[DateType], /* type */ start | end) => CallbackTo[DisabledTimes] = null,
    mode: js.Tuple2[PanelMode, PanelMode] = null,
    onBlur: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onCalendarChange: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback = null,
    onChange: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onOk: /* dates */ RangeValue[DateType] => Callback = null,
    onPanelChange: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback = null,
    placeholder: js.Tuple2[String, String] = null,
    ranges: Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ] = null,
    separator: VdomNode = null,
    value: RangeValue[DateType] = null
  ): RangePickerSharedProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (allowEmpty != null) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction2((t0: /* date */ typingsJapgolly.rcPicker.interfaceMod.EventValue[DateType], t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.start | typingsJapgolly.rcPicker.rcPickerStrings.end) => disabledTime(t0, t1).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onBlur(t0).runNow()))
    if (onCalendarChange != null) __obj.updateDynamic("onCalendarChange")(js.Any.fromFunction2((t0: /* values */ typingsJapgolly.rcPicker.interfaceMod.RangeValue[DateType], t1: /* formatString */ js.Tuple2[java.lang.String, java.lang.String]) => onCalendarChange(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* values */ typingsJapgolly.rcPicker.interfaceMod.RangeValue[DateType], t1: /* formatString */ js.Tuple2[java.lang.String, java.lang.String]) => onChange(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onFocus(t0).runNow()))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* dates */ typingsJapgolly.rcPicker.interfaceMod.RangeValue[DateType]) => onOk(t0).runNow()))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* values */ typingsJapgolly.rcPicker.interfaceMod.RangeValue[DateType], t1: /* modes */ js.Tuple2[
  typingsJapgolly.rcPicker.interfaceMod.PanelMode, 
  typingsJapgolly.rcPicker.interfaceMod.PanelMode]) => onPanelChange(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerSharedProps[DateType]]
  }
}

