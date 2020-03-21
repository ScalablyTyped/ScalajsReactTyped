package typingsJapgolly.reactNativeCheckBox.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  var checkBoxColor: js.UndefOr[String] = js.undefined
  var checkedCheckBoxColor: js.UndefOr[String] = js.undefined
  var checkedImage: js.UndefOr[Element] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isChecked: Boolean
  var leftText: js.UndefOr[String] = js.undefined
  var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var leftTextView: js.UndefOr[Node] = js.undefined
  var rightText: js.UndefOr[String] = js.undefined
  var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var rightTextView: js.UndefOr[Node] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var unCheckedImage: js.UndefOr[Element] = js.undefined
  var uncheckedCheckBoxColor: js.UndefOr[String] = js.undefined
  def onClick(): Unit
}

object CheckBoxProps {
  @scala.inline
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
    uncheckedCheckBoxColor: String = null
  ): CheckBoxProps = {
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
    __obj.asInstanceOf[CheckBoxProps]
  }
}

