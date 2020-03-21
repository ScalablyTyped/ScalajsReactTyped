package typingsJapgolly.grommet.skipLinkTargetMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkTargetProps extends js.Object {
  var id: String
  var label: js.UndefOr[Node] = js.undefined
}

object SkipLinkTargetProps {
  @scala.inline
  def apply(id: String, label: VdomNode = null): SkipLinkTargetProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkTargetProps]
  }
}

