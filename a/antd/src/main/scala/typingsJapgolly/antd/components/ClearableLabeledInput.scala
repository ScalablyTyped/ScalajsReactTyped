package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdStrings.input
import typingsJapgolly.antd.antdStrings.text
import typingsJapgolly.antd.clearableLabeledInputMod.ClearableInputProps
import typingsJapgolly.antd.clearableLabeledInputMod.default
import typingsJapgolly.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClearableLabeledInput {
  def apply(
    inputType: text | input,
    prefixCls: String,
    element: VdomElement,
    handleReset: ReactMouseEventFrom[HTMLElement] => Callback,
    triggerFocus: Callback,
    addonAfter: VdomNode = null,
    addonBefore: VdomNode = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    direction: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    prefix: VdomNode = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    size: SizeType = null,
    style: js.Object = null,
    suffix: VdomNode = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClearableInputProps, default, Unit, ClearableInputProps] = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
      if (element != null) __obj.updateDynamic("element")(element.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("handleReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => handleReset(t0).runNow()))
    __obj.updateDynamic("triggerFocus")(triggerFocus.toJsFn)
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.rawNode.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.clearableLabeledInputMod.ClearableInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.clearableLabeledInputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.clearableLabeledInputMod.ClearableInputProps])(children: _*)
  }
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

