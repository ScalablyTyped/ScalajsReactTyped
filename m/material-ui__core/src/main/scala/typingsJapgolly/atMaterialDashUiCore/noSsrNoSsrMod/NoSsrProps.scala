package typingsJapgolly.atMaterialDashUiCore.noSsrNoSsrMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSsrProps extends js.Object {
  var children: Node
  var fallback: js.UndefOr[Node] = js.undefined
}

object NoSsrProps {
  @scala.inline
  def apply(children: VdomNode, fallback: VdomNode = null): NoSsrProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

