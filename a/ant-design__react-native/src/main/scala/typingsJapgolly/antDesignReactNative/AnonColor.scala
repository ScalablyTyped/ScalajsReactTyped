package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var backgroundColor: String
  var color: String
  var component: Element
  var disabled: Boolean
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: String
}

object AnonColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    component: VdomElement,
    disabled: Boolean,
    `type`: String,
    onPress: js.UndefOr[Callback] = js.undefined
  ): AnonColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    __obj.asInstanceOf[AnonColor]
  }
}

