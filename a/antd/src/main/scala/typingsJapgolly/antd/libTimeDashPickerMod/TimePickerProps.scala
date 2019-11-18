package typingsJapgolly.antd.libTimeDashPickerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdStrings.AM
import typingsJapgolly.antd.antdStrings.PM
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.moment.momentMod.Moment
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var addon: js.UndefOr[js.Function] = js.undefined
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearIcon: js.UndefOr[Node] = js.undefined
  var clearText: js.UndefOr[String] = js.undefined
  var defaultOpenValue: js.UndefOr[Moment] = js.undefined
  var defaultValue: js.UndefOr[Moment | js.Array[Moment]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* selectedHour */ Double, js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[
    js.Function2[/* selectedHour */ Double, /* selectedMinute */ Double, js.Array[Double]]
  ] = js.undefined
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  var hourStep: js.UndefOr[Double] = js.undefined
  var inputReadOnly: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[TimePickerLocale] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var onAmPmChange: js.UndefOr[js.Function1[/* ampm */ AM | PM, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* time */ Moment, /* timeString */ String, Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[large | typingsJapgolly.antd.antdStrings.default | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[Node] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Moment] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: js.Function = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearIcon: VdomNode = null,
    clearText: String = null,
    defaultOpenValue: Moment = null,
    defaultValue: Moment | js.Array[Moment] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledHours: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined,
    disabledMinutes: /* selectedHour */ Double => CallbackTo[js.Array[Double]] = null,
    disabledSeconds: (/* selectedHour */ Double, /* selectedMinute */ Double) => CallbackTo[js.Array[Double]] = null,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    locale: TimePickerLocale = null,
    minuteStep: Int | Double = null,
    onAmPmChange: /* ampm */ AM | PM => Callback = null,
    onChange: (/* time */ Moment, /* timeString */ String) => Callback = null,
    onOpenChange: /* open */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupClassName: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    secondStep: Int | Double = null,
    size: large | typingsJapgolly.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    suffixIcon: VdomNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Moment = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (clearText != null) __obj.updateDynamic("clearText")(clearText.asInstanceOf[js.Any])
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    disabledHours.foreach(p => __obj.updateDynamic("disabledHours")(p.toJsFn))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1((t0: /* selectedHour */ scala.Double) => disabledMinutes(t0).runNow()))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2((t0: /* selectedHour */ scala.Double, t1: /* selectedMinute */ scala.Double) => disabledSeconds(t0, t1).runNow()))
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (onAmPmChange != null) __obj.updateDynamic("onAmPmChange")(js.Any.fromFunction1((t0: /* ampm */ typingsJapgolly.antd.antdStrings.AM | typingsJapgolly.antd.antdStrings.PM) => onAmPmChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* time */ typingsJapgolly.moment.momentMod.Moment, t1: /* timeString */ java.lang.String) => onChange(t0, t1).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* open */ scala.Boolean) => onOpenChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

