package typingsJapgolly.rcTimePicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.rcTimePicker.mod.TimePicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<rc-time-picker.rc-time-picker.TimePickerProps>> */
trait ReadonlyPartialTimePicker extends js.Object {
  val addon: js.UndefOr[js.Function1[/* timepicker */ TimePicker, Element]] = js.undefined
  val allowEmpty: js.UndefOr[Boolean] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val clearIcon: js.UndefOr[Node] = js.undefined
  val clearText: js.UndefOr[String] = js.undefined
  val defaultOpenValue: js.UndefOr[Moment] = js.undefined
  val defaultValue: js.UndefOr[Moment] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  val disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
  val disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
  val focusOnOpen: js.UndefOr[Boolean] = js.undefined
  val format: js.UndefOr[String] = js.undefined
  val hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  val hourStep: js.UndefOr[Double] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val inputIcon: js.UndefOr[Node] = js.undefined
  val inputReadOnly: js.UndefOr[Boolean] = js.undefined
  val minuteStep: js.UndefOr[Double] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
  val onClose: js.UndefOr[js.Function1[/* state */ AnonOpen, Unit]] = js.undefined
  val onOpen: js.UndefOr[js.Function1[/* state */ AnonOpen, Unit]] = js.undefined
  val open: js.UndefOr[Boolean] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val placement: js.UndefOr[String] = js.undefined
  val popupClassName: js.UndefOr[String] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val secondStep: js.UndefOr[Double] = js.undefined
  val showHour: js.UndefOr[Boolean] = js.undefined
  val showMinute: js.UndefOr[Boolean] = js.undefined
  val showSecond: js.UndefOr[Boolean] = js.undefined
  val transitionName: js.UndefOr[String] = js.undefined
  val use12Hours: js.UndefOr[Boolean] = js.undefined
  val value: js.UndefOr[Moment] = js.undefined
}

object ReadonlyPartialTimePicker {
  @scala.inline
  def apply(
    addon: /* timepicker */ TimePicker => CallbackTo[Element] = null,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearIcon: VdomNode = null,
    clearText: String = null,
    defaultOpenValue: Moment = null,
    defaultValue: Moment = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledHours: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined,
    disabledMinutes: /* hour */ Double => CallbackTo[js.Array[Double]] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => CallbackTo[js.Array[Double]] = null,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    id: String = null,
    inputIcon: VdomNode = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    minuteStep: Int | Double = null,
    onChange: /* value */ Moment => Callback = null,
    onClose: /* state */ AnonOpen => Callback = null,
    onOpen: /* state */ AnonOpen => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    placement: String = null,
    popupClassName: String = null,
    prefixCls: String = null,
    secondStep: Int | Double = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    transitionName: String = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Moment = null
  ): ReadonlyPartialTimePicker = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(js.Any.fromFunction1((t0: /* timepicker */ typingsJapgolly.rcTimePicker.mod.TimePicker) => addon(t0).runNow()))
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (clearText != null) __obj.updateDynamic("clearText")(clearText.asInstanceOf[js.Any])
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    disabledHours.foreach(p => __obj.updateDynamic("disabledHours")(p.toJsFn))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1((t0: /* hour */ scala.Double) => disabledMinutes(t0).runNow()))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2((t0: /* hour */ scala.Double, t1: /* minute */ scala.Double) => disabledSeconds(t0, t1).runNow()))
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputIcon != null) __obj.updateDynamic("inputIcon")(inputIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.moment.mod.Moment) => onChange(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.rcTimePicker.AnonOpen) => onClose(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.rcTimePicker.AnonOpen) => onOpen(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialTimePicker]
  }
}

