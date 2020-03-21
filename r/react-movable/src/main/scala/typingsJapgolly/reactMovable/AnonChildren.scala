package typingsJapgolly.reactMovable

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Node
  var isDragged: Boolean
  var props: AnonRef
}

object AnonChildren {
  @scala.inline
  def apply(isDragged: Boolean, props: AnonRef, children: VdomNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

