package typingsJapgolly.rmcDatePicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var locale: AnonAm
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
  def onDateChange(): Unit
}

object AnonDisabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    locale: AnonAm,
    minuteStep: Double,
    mode: String,
    onDateChange: Callback,
    pickerPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
    __obj.updateDynamic("onDateChange")(onDateChange.toJsFn)
    __obj.asInstanceOf[AnonDisabled]
  }
}

