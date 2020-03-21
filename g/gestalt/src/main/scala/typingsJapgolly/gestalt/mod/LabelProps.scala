package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var htmlFor: String
}

object LabelProps {
  @scala.inline
  def apply(htmlFor: String, children: VdomNode = null): LabelProps = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

