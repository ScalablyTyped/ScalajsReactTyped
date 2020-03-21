package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemIcon extends js.Object {
  var clearIcon: Node
  var itemIcon: js.Object | Null
  var removeIcon: js.Object | Null
  var suffixIcon: js.Object | Null
}

object AnonItemIcon {
  @scala.inline
  def apply(
    clearIcon: VdomNode = null,
    itemIcon: js.Object = null,
    removeIcon: js.Object = null,
    suffixIcon: js.Object = null
  ): AnonItemIcon = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemIcon]
  }
}

