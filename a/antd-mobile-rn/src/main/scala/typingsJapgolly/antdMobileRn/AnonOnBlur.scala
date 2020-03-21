package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnBlur extends js.Object {
  var disabled: Boolean
  var placeholder: String
  var prefixCls: String
  var showCancelButton: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def onBlur(): Unit
  def onChange(): Unit
  def onClear(): Unit
  def onFocus(): Unit
  def onSubmit(): Unit
}

object AnonOnBlur {
  @scala.inline
  def apply(
    disabled: Boolean,
    onBlur: Callback,
    onChange: Callback,
    onClear: Callback,
    onFocus: Callback,
    onSubmit: Callback,
    placeholder: String,
    prefixCls: String,
    showCancelButton: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): AnonOnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showCancelButton = showCancelButton.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onClear")(onClear.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.updateDynamic("onSubmit")(onSubmit.toJsFn)
    __obj.asInstanceOf[AnonOnBlur]
  }
}

