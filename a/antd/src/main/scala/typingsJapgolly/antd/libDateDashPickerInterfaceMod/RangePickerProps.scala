package typingsJapgolly.antd.libDateDashPickerInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.antd.Anon_DisabledHours
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.libTimeDashPickerMod.TimePickerProps
import typingsJapgolly.moment.momentMod.Moment
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePickerProps extends PickerProps {
  var defaultPickerValue: js.UndefOr[RangePickerValue] = js.undefined
  var defaultValue: js.UndefOr[RangePickerValue] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function2[/* current */ js.UndefOr[Moment], /* type */ String, Anon_DisabledHours]
  ] = js.undefined
  var mode: js.UndefOr[String | js.Array[String]] = js.undefined
  var onCalendarChange: js.UndefOr[
    js.Function2[/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String], Unit]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLSpanElement], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLSpanElement], Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* selectedTime */ RangePickerPresetRange, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[
      /* value */ js.UndefOr[RangePickerValue], 
      /* mode */ js.UndefOr[String | js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var ranges: js.UndefOr[StringDictionary[RangePickerPresetRange]] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function0[Node]] = js.undefined
  var separator: js.UndefOr[Node] = js.undefined
  var showTime: js.UndefOr[TimePickerProps | Boolean] = js.undefined
  var showToday: js.UndefOr[Boolean] = js.undefined
  var tagPrefixCls: js.UndefOr[String] = js.undefined
  var timePicker: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[RangePickerValue] = js.undefined
}

object RangePickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dateRender: (/* current */ Moment, /* today */ Moment) => CallbackTo[Node] = null,
    defaultPickerValue: RangePickerValue = null,
    defaultValue: RangePickerValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDate: /* current */ js.UndefOr[Moment] => CallbackTo[Boolean] = null,
    disabledTime: (/* current */ js.UndefOr[Moment], /* type */ String) => CallbackTo[Anon_DisabledHours] = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getCalendarContainer: /* triggerNode */ Element => CallbackTo[HTMLElement] = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    mode: String | js.Array[String] = null,
    name: String = null,
    onBlur: /* e */ ReactEventFrom[Element] => Callback = null,
    onCalendarChange: (/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String]) => Callback = null,
    onChange: (/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String]) => Callback = null,
    onFocus: ReactFocusEventFrom[Element] => Callback = null,
    onMouseEnter: /* e */ ReactMouseEventFrom[HTMLSpanElement] => Callback = null,
    onMouseLeave: /* e */ ReactMouseEventFrom[HTMLSpanElement] => Callback = null,
    onOk: /* selectedTime */ RangePickerPresetRange => Callback = null,
    onOpenChange: /* status */ Boolean => Callback = null,
    onPanelChange: (/* value */ js.UndefOr[RangePickerValue], /* mode */ js.UndefOr[String | js.Array[String]]) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    pickerClass: String = null,
    pickerInputClass: String = null,
    placeholder: js.Tuple2[String, String] = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    ranges: StringDictionary[RangePickerPresetRange] = null,
    renderExtraFooter: js.UndefOr[CallbackTo[Node]] = js.undefined,
    separator: VdomNode = null,
    showTime: TimePickerProps | Boolean = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    size: large | small | default = null,
    style: CSSProperties = null,
    suffixIcon: VdomNode = null,
    tagPrefixCls: String = null,
    timePicker: VdomNode = null,
    value: RangePickerValue = null
  ): RangePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.moment.momentMod.Moment, t1: /* today */ typingsJapgolly.moment.momentMod.Moment) => dateRender(t0, t1).runNow()))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* current */ js.UndefOr[typingsJapgolly.moment.momentMod.Moment]) => disabledDate(t0).runNow()))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction2((t0: /* current */ js.UndefOr[typingsJapgolly.moment.momentMod.Moment], t1: /* type */ java.lang.String) => disabledTime(t0, t1).runNow()))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.Element) => getCalendarContainer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCalendarChange != null) __obj.updateDynamic("onCalendarChange")(js.Any.fromFunction2((t0: /* dates */ typingsJapgolly.antd.libDateDashPickerInterfaceMod.RangePickerValue, t1: /* dateStrings */ js.Tuple2[java.lang.String, java.lang.String]) => onCalendarChange(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* dates */ typingsJapgolly.antd.libDateDashPickerInterfaceMod.RangePickerValue, t1: /* dateStrings */ js.Tuple2[java.lang.String, java.lang.String]) => onChange(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLSpanElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLSpanElement]) => onMouseLeave(t0).runNow()))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* selectedTime */ typingsJapgolly.antd.libDateDashPickerInterfaceMod.RangePickerPresetRange) => onOk(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* status */ scala.Boolean) => onOpenChange(t0).runNow()))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* value */ js.UndefOr[typingsJapgolly.antd.libDateDashPickerInterfaceMod.RangePickerValue], t1: /* mode */ js.UndefOr[java.lang.String | js.Array[java.lang.String]]) => onPanelChange(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (pickerClass != null) __obj.updateDynamic("pickerClass")(pickerClass.asInstanceOf[js.Any])
    if (pickerInputClass != null) __obj.updateDynamic("pickerInputClass")(pickerInputClass.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    renderExtraFooter.foreach(p => __obj.updateDynamic("renderExtraFooter")(p.toJsFn))
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    if (tagPrefixCls != null) __obj.updateDynamic("tagPrefixCls")(tagPrefixCls.asInstanceOf[js.Any])
    if (timePicker != null) __obj.updateDynamic("timePicker")(timePicker.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps]
  }
}

