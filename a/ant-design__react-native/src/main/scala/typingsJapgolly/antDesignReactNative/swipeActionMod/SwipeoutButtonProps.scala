package typingsJapgolly.antDesignReactNative.swipeActionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.AnonBackgroundColor
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProps extends SwipeoutButtonProperties {
  var style: js.UndefOr[StyleProp[TextStyle] with AnonBackgroundColor] = js.undefined
}

object SwipeoutButtonProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    component: VdomElement = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[TextStyle] with AnonBackgroundColor = null,
    text: VdomNode = null,
    `type`: typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary = null,
    underlayColor: String = null
  ): SwipeoutButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeoutButtonProps]
  }
}

