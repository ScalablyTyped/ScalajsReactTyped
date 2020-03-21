package typingsJapgolly.rcTable.panelMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleProps extends js.Object {
  var children: Node
  var className: String
}

object TitleProps {
  @scala.inline
  def apply(className: String, children: VdomNode = null): TitleProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleProps]
  }
}

