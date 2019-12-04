package typingsJapgolly.antd.libInputClearableLabeledInputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdStrings.input
import typingsJapgolly.antd.antdStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This basic props required for input and textarea.
  */
trait BasicProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var element: Element
  var inputType: text | input
  var prefixCls: String
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  def handleReset(event: ReactMouseEventFrom[HTMLElement]): Unit
}

object BasicProps {
  @scala.inline
  def apply(
    element: VdomElement,
    handleReset: ReactMouseEventFrom[HTMLElement] => Callback,
    inputType: text | input,
    prefixCls: String,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    value: js.Any = null
  ): BasicProps = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("handleReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => handleReset(t0).runNow()))
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicProps]
  }
}

