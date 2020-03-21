package typingsJapgolly.reactToastNotifications.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends js.Object {
  var children: Node
  var hasToasts: Boolean
  var placement: Placement
}

object ToastContainerProps {
  @scala.inline
  def apply(hasToasts: Boolean, placement: Placement, children: VdomNode = null): ToastContainerProps = {
    val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastContainerProps]
  }
}

