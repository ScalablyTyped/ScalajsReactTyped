package typingsJapgolly.antd.libInputClearableLabeledInputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdStrings.input
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This props only for input.
  */
trait ClearableInputProps extends BasicProps {
  var addonAfter: js.UndefOr[Node] = js.undefined
  var addonBefore: js.UndefOr[Node] = js.undefined
  var prefix: js.UndefOr[Node] = js.undefined
  var size: js.UndefOr[small | typingsJapgolly.antd.antdStrings.default | large] = js.undefined
  var suffix: js.UndefOr[Node] = js.undefined
}

object ClearableInputProps {
  @scala.inline
  def apply(
    element: VdomElement,
    handleReset: ReactMouseEventFrom[HTMLElement] => Callback,
    inputType: text | input,
    prefixCls: String,
    addonAfter: VdomNode = null,
    addonBefore: VdomNode = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    prefix: VdomNode = null,
    size: small | typingsJapgolly.antd.antdStrings.default | large = null,
    style: js.Object = null,
    suffix: VdomNode = null,
    value: js.Any = null
  ): ClearableInputProps = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("handleReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => handleReset(t0).runNow()))
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.rawNode.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.rawNode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearableInputProps]
  }
}

