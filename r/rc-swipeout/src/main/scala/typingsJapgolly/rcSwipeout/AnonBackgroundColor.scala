package typingsJapgolly.rcSwipeout

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var backgroundColor: String
  var color: String
  var component: Element
  var disabled: Boolean
  var onPress: js.Any
  var text: js.Any
  var `type`: String
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    component: VdomElement,
    disabled: Boolean,
    onPress: js.Any,
    text: js.Any,
    `type`: String
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

