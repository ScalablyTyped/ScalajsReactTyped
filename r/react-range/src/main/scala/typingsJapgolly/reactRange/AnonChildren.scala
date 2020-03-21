package typingsJapgolly.reactRange

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactRange.typesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Node
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object AnonChildren {
  @scala.inline
  def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps, children: VdomNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

