package typingsJapgolly.rcSwipeout.swipeoutNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.rcSwipeout.rcSwipeoutStrings.delete
import typingsJapgolly.rcSwipeout.rcSwipeoutStrings.primary
import typingsJapgolly.rcSwipeout.rcSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeButttonType extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[Element] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[
    typingsJapgolly.rcSwipeout.rcSwipeoutStrings.default | delete | primary | secondary
  ] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object SwipeButttonType {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    component: VdomElement = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    text: String = null,
    `type`: typingsJapgolly.rcSwipeout.rcSwipeoutStrings.default | delete | primary | secondary = null,
    underlayColor: String = null
  ): SwipeButttonType = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeButttonType]
  }
}

