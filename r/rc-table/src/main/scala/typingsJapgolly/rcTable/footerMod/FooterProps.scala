package typingsJapgolly.rcTable.footerMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps extends js.Object {
  var children: Node
}

object FooterProps {
  @scala.inline
  def apply(children: VdomNode = null): FooterProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterProps]
  }
}

