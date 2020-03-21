package typingsJapgolly.grommet.skipLinkMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkProps extends js.Object {
  var id: String
  var label: js.UndefOr[Node] = js.undefined
}

object SkipLinkProps {
  @scala.inline
  def apply(id: String, label: VdomNode = null): SkipLinkProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkProps]
  }
}

