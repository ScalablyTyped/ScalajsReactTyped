package typingsJapgolly.atStorybookRouter.distRouterMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLinkProps extends js.Object {
  var children: Node
  var to: String
}

object QueryLinkProps {
  @scala.inline
  def apply(to: String, children: VdomNode = null): QueryLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLinkProps]
  }
}

