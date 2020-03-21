package typingsJapgolly.reactNativeCheckBox.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCheckBox.mod.CheckBoxProps
import typingsJapgolly.reactNativeCheckBox.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCheckBox {
  def apply(
    isChecked: Boolean,
    onClick: Callback,
    checkBoxColor: String = null,
    checkedCheckBoxColor: String = null,
    checkedImage: VdomElement = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    leftText: String = null,
    leftTextStyle: StyleProp[TextStyle] = null,
    leftTextView: VdomNode = null,
    rightText: String = null,
    rightTextStyle: StyleProp[TextStyle] = null,
    rightTextView: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    unCheckedImage: VdomElement = null,
    uncheckedCheckBoxColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CheckBoxProps, default, Unit, CheckBoxProps] = {
    val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClick")(onClick.toJsFn)
    if (checkBoxColor != null) __obj.updateDynamic("checkBoxColor")(checkBoxColor.asInstanceOf[js.Any])
    if (checkedCheckBoxColor != null) __obj.updateDynamic("checkedCheckBoxColor")(checkedCheckBoxColor.asInstanceOf[js.Any])
    if (checkedImage != null) __obj.updateDynamic("checkedImage")(checkedImage.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (leftText != null) __obj.updateDynamic("leftText")(leftText.asInstanceOf[js.Any])
    if (leftTextStyle != null) __obj.updateDynamic("leftTextStyle")(leftTextStyle.asInstanceOf[js.Any])
    if (leftTextView != null) __obj.updateDynamic("leftTextView")(leftTextView.rawNode.asInstanceOf[js.Any])
    if (rightText != null) __obj.updateDynamic("rightText")(rightText.asInstanceOf[js.Any])
    if (rightTextStyle != null) __obj.updateDynamic("rightTextStyle")(rightTextStyle.asInstanceOf[js.Any])
    if (rightTextView != null) __obj.updateDynamic("rightTextView")(rightTextView.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unCheckedImage != null) __obj.updateDynamic("unCheckedImage")(unCheckedImage.rawElement.asInstanceOf[js.Any])
    if (uncheckedCheckBoxColor != null) __obj.updateDynamic("uncheckedCheckBoxColor")(uncheckedCheckBoxColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeCheckBox.mod.CheckBoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeCheckBox.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeCheckBox.mod.CheckBoxProps])(children: _*)
  }
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

