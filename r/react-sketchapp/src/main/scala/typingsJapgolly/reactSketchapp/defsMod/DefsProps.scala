package typingsJapgolly.reactSketchapp.defsMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsProps extends js.Object {
  var children: js.Array[Node] | Node
}

object DefsProps {
  @scala.inline
  def apply(children: js.Array[Node] | Node = null): DefsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsProps]
  }
}

