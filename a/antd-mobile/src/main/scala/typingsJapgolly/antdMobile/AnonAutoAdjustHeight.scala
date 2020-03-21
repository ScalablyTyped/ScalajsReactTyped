package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoAdjustHeight extends js.Object {
  var autoAdjustHeight: Boolean
  var disabled: Boolean
  var editable: Boolean
  var keyboardPrefixCls: String
  var placeholder: String
  var prefixCls: String
  def onBlur(): Unit
  def onChange(): Unit
  def onFocus(): Unit
  def onVirtualKeyboardConfirm(): Unit
}

object AnonAutoAdjustHeight {
  @scala.inline
  def apply(
    autoAdjustHeight: Boolean,
    disabled: Boolean,
    editable: Boolean,
    keyboardPrefixCls: String,
    onBlur: Callback,
    onChange: Callback,
    onFocus: Callback,
    onVirtualKeyboardConfirm: Callback,
    placeholder: String,
    prefixCls: String
  ): AnonAutoAdjustHeight = {
    val __obj = js.Dynamic.literal(autoAdjustHeight = autoAdjustHeight.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], keyboardPrefixCls = keyboardPrefixCls.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.updateDynamic("onVirtualKeyboardConfirm")(onVirtualKeyboardConfirm.toJsFn)
    __obj.asInstanceOf[AnonAutoAdjustHeight]
  }
}

