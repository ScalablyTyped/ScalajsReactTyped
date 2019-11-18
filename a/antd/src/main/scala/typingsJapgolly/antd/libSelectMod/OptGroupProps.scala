package typingsJapgolly.antd.libSelectMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupProps extends js.Object {
  var label: js.UndefOr[Node] = js.undefined
}

object OptGroupProps {
  @scala.inline
  def apply(label: VdomNode = null): OptGroupProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupProps]
  }
}

