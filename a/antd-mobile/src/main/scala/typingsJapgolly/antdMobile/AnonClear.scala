package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  var clear: Boolean
  var disabled: Boolean
  var disabledKeys: Null
  var editable: Boolean
  var error: Boolean
  var extra: String
  var labelNumber: Double
  var moneyKeyboardAlign: String
  var moneyKeyboardHeader: Null
  var onBlur: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onErrorClick: js.Function0[Unit]
  var onExtraClick: js.Function0[Unit]
  var onFocus: js.Function0[Unit]
  var onVirtualKeyboardConfirm: js.Function0[Unit]
  var placeholder: String
  var prefixCls: String
  var prefixListCls: String
  var `type`: String
  var updatePlaceholder: Boolean
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Boolean,
    disabled: Boolean,
    disabledKeys: Null,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    moneyKeyboardAlign: String,
    moneyKeyboardHeader: Null,
    onBlur: Callback,
    onChange: Callback,
    onErrorClick: Callback,
    onExtraClick: Callback,
    onFocus: Callback,
    onVirtualKeyboardConfirm: Callback,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    `type`: String,
    updatePlaceholder: Boolean
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledKeys = disabledKeys.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], moneyKeyboardAlign = moneyKeyboardAlign.asInstanceOf[js.Any], moneyKeyboardHeader = moneyKeyboardHeader.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], updatePlaceholder = updatePlaceholder.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onErrorClick")(onErrorClick.toJsFn)
    __obj.updateDynamic("onExtraClick")(onExtraClick.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.updateDynamic("onVirtualKeyboardConfirm")(onVirtualKeyboardConfirm.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClear]
  }
}

