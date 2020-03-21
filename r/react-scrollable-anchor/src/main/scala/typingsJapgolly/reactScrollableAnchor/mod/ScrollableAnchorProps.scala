package typingsJapgolly.reactScrollableAnchor.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableAnchorProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var id: String
}

object ScrollableAnchorProps {
  @scala.inline
  def apply(id: String, children: VdomNode = null): ScrollableAnchorProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableAnchorProps]
  }
}

