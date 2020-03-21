package typingsJapgolly.materialUiCore.noSsrNoSsrMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSsrProps extends js.Object {
  var children: Node = js.native
  var fallback: js.UndefOr[Node] = js.native
}

object NoSsrProps {
  @scala.inline
  def apply(children: VdomNode = null, fallback: VdomNode = null): NoSsrProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

