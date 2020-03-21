package typingsJapgolly.reactNativeSwipeout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProperties extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[Element] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[Node] = js.undefined
  var `type`: js.UndefOr[
    typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
  ] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object SwipeoutButtonProperties {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    component: VdomElement = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    text: VdomNode = null,
    `type`: typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary = null,
    underlayColor: String = null
  ): SwipeoutButtonProperties = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeoutButtonProperties]
  }
}

