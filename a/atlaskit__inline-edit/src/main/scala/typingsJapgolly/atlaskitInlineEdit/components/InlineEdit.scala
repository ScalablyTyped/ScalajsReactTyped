package typingsJapgolly.atlaskitInlineEdit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitInlineEdit.mod.BaseProps
import typingsJapgolly.atlaskitInlineEdit.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InlineEdit {
  def apply(
    onCancel: Callback,
    onConfirm: Callback,
    readView: VdomElement,
    areActionButtonsHidden: js.UndefOr[Boolean] = js.undefined,
    disableEditViewFieldBase: js.UndefOr[Boolean] = js.undefined,
    editView: VdomElement = null,
    invalidMessage: VdomElement = null,
    isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.undefined,
    isFitContainerWidthReadView: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isLabelHidden: js.UndefOr[Boolean] = js.undefined,
    isWaiting: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelHtmlFor: String = null,
    shouldConfirmOnEnter: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BaseProps, default, Unit, BaseProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onConfirm")(onConfirm.toJsFn)
    if (readView != null) __obj.updateDynamic("readView")(readView.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(areActionButtonsHidden)) __obj.updateDynamic("areActionButtonsHidden")(areActionButtonsHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditViewFieldBase)) __obj.updateDynamic("disableEditViewFieldBase")(disableEditViewFieldBase.asInstanceOf[js.Any])
    if (editView != null) __obj.updateDynamic("editView")(editView.rawElement.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(isConfirmOnBlurDisabled)) __obj.updateDynamic("isConfirmOnBlurDisabled")(isConfirmOnBlurDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFitContainerWidthReadView)) __obj.updateDynamic("isFitContainerWidthReadView")(isFitContainerWidthReadView.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isLabelHidden)) __obj.updateDynamic("isLabelHidden")(isLabelHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isWaiting)) __obj.updateDynamic("isWaiting")(isWaiting.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelHtmlFor != null) __obj.updateDynamic("labelHtmlFor")(labelHtmlFor.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldConfirmOnEnter)) __obj.updateDynamic("shouldConfirmOnEnter")(shouldConfirmOnEnter.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitInlineEdit.mod.BaseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitInlineEdit.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitInlineEdit.mod.BaseProps])(children: _*)
  }
  @JSImport("@atlaskit/inline-edit", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

