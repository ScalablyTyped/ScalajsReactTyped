package typingsJapgolly.rcTimePicker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.rcTimePicker.AnonOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var allowEmpty: Boolean
  var className: String
  var clearIcon: Node
  var clearText: String
  var defaultOpenValue: Moment
  var defaultValue: Moment
  var disabled: Boolean
  var focusOnOpen: Boolean
  var format: String
  var hideDisabledOptions: Boolean
  var hourStep: Double
  var id: String
  var inputIcon: Node
  var inputReadOnly: Boolean
  var minuteStep: Double
  var open: Boolean
  var placeholder: String
  var placement: String
  var popupClassName: String
  var prefixCls: String
  var secondStep: Double
  var showHour: Boolean
  var showMinute: Boolean
  var showSecond: Boolean
  var transitionName: String
  var use12Hours: Boolean
  var value: Moment
  def addon(timepicker: TimePicker): Element
  def disabledHours(): js.Array[Double]
  def disabledMinutes(hour: Double): js.Array[Double]
  def disabledSeconds(hour: Double, minute: Double): js.Array[Double]
  def onChange(value: Moment): Unit
  def onClose(state: AnonOpen): Unit
  def onOpen(state: AnonOpen): Unit
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: TimePicker => CallbackTo[Element],
    allowEmpty: Boolean,
    className: String,
    clearText: String,
    defaultOpenValue: Moment,
    defaultValue: Moment,
    disabled: Boolean,
    disabledHours: CallbackTo[js.Array[Double]],
    disabledMinutes: Double => CallbackTo[js.Array[Double]],
    disabledSeconds: (Double, Double) => CallbackTo[js.Array[Double]],
    focusOnOpen: Boolean,
    format: String,
    hideDisabledOptions: Boolean,
    hourStep: Double,
    id: String,
    inputReadOnly: Boolean,
    minuteStep: Double,
    onChange: Moment => Callback,
    onClose: AnonOpen => Callback,
    onOpen: AnonOpen => Callback,
    open: Boolean,
    placeholder: String,
    placement: String,
    popupClassName: String,
    prefixCls: String,
    secondStep: Double,
    showHour: Boolean,
    showMinute: Boolean,
    showSecond: Boolean,
    transitionName: String,
    use12Hours: Boolean,
    value: Moment,
    clearIcon: VdomNode = null,
    inputIcon: VdomNode = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clearText = clearText.asInstanceOf[js.Any], defaultOpenValue = defaultOpenValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusOnOpen = focusOnOpen.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hideDisabledOptions = hideDisabledOptions.asInstanceOf[js.Any], hourStep = hourStep.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputReadOnly = inputReadOnly.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], secondStep = secondStep.asInstanceOf[js.Any], showHour = showHour.asInstanceOf[js.Any], showMinute = showMinute.asInstanceOf[js.Any], showSecond = showSecond.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("addon")(js.Any.fromFunction1((t0: typingsJapgolly.rcTimePicker.mod.TimePicker) => addon(t0).runNow()))
    __obj.updateDynamic("disabledHours")(disabledHours.toJsFn)
    __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1((t0: scala.Double) => disabledMinutes(t0).runNow()))
    __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => disabledSeconds(t0, t1).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => onChange(t0).runNow()))
    __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: typingsJapgolly.rcTimePicker.AnonOpen) => onClose(t0).runNow()))
    __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: typingsJapgolly.rcTimePicker.AnonOpen) => onOpen(t0).runNow()))
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (inputIcon != null) __obj.updateDynamic("inputIcon")(inputIcon.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

