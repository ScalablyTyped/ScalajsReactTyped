package typingsJapgolly.antd.libDateDashPickerInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.moment.momentMod.Moment
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekPickerProps
  extends PickerProps
     with SinglePickerProps

object WeekPickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dateRender: (/* current */ Moment, /* today */ Moment) => CallbackTo[Node] = null,
    defaultPickerValue: Moment = null,
    defaultValue: Moment = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDate: /* current */ js.UndefOr[Moment] => CallbackTo[Boolean] = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getCalendarContainer: /* triggerNode */ Element => CallbackTo[HTMLElement] = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    name: String = null,
    onBlur: /* e */ ReactEventFrom[Element] => Callback = null,
    onChange: (/* date */ Moment | Null, /* dateString */ String) => Callback = null,
    onFocus: ReactFocusEventFrom[Element] => Callback = null,
    onOpenChange: /* status */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    pickerClass: String = null,
    pickerInputClass: String = null,
    placeholder: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ DatePickerMode => CallbackTo[Node] = null,
    size: large | small | default = null,
    style: CSSProperties = null,
    suffixIcon: VdomNode = null,
    value: Moment = null
  ): WeekPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.moment.momentMod.Moment, t1: /* today */ typingsJapgolly.moment.momentMod.Moment) => dateRender(t0, t1).runNow()))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* current */ js.UndefOr[typingsJapgolly.moment.momentMod.Moment]) => disabledDate(t0).runNow()))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.Element) => getCalendarContainer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* date */ typingsJapgolly.moment.momentMod.Moment | scala.Null, t1: /* dateString */ java.lang.String) => onChange(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* status */ scala.Boolean) => onOpenChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (pickerClass != null) __obj.updateDynamic("pickerClass")(pickerClass.asInstanceOf[js.Any])
    if (pickerInputClass != null) __obj.updateDynamic("pickerInputClass")(pickerInputClass.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1((t0: /* mode */ typingsJapgolly.antd.libDateDashPickerInterfaceMod.DatePickerMode) => renderExtraFooter(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekPickerProps]
  }
}

