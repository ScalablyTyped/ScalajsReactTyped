package typingsJapgolly.reactNativeShare.buttonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var buttonStyle: StyleProp[ViewProps]
  var children: Node
  var iconSrc: ImageSourcePropType
  var textStyle: StyleProp[TextProps]
  def onPress(): Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    iconSrc: ImageSourcePropType,
    onPress: Callback,
    buttonStyle: StyleProp[ViewProps] = null,
    children: VdomNode = null,
    textStyle: StyleProp[TextProps] = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

