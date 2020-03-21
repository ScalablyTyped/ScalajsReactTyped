package typingsJapgolly.reResizable.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleComponent extends js.Object {
  var bottom: js.UndefOr[Element] = js.undefined
  var bottomLeft: js.UndefOr[Element] = js.undefined
  var bottomRight: js.UndefOr[Element] = js.undefined
  var left: js.UndefOr[Element] = js.undefined
  var right: js.UndefOr[Element] = js.undefined
  var top: js.UndefOr[Element] = js.undefined
  var topLeft: js.UndefOr[Element] = js.undefined
  var topRight: js.UndefOr[Element] = js.undefined
}

object HandleComponent {
  @scala.inline
  def apply(
    bottom: VdomElement = null,
    bottomLeft: VdomElement = null,
    bottomRight: VdomElement = null,
    left: VdomElement = null,
    right: VdomElement = null,
    top: VdomElement = null,
    topLeft: VdomElement = null,
    topRight: VdomElement = null
  ): HandleComponent = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.rawElement.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.rawElement.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.rawElement.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.rawElement.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.rawElement.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.rawElement.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.rawElement.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleComponent]
  }
}

