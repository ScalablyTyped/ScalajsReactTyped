package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  var span: UnsignedUpTo12
}

object ColumnProps {
  @scala.inline
  def apply(
    span: UnsignedUpTo12,
    children: VdomNode = null,
    lgSpan: UnsignedUpTo12 = null,
    mdSpan: UnsignedUpTo12 = null,
    smSpan: UnsignedUpTo12 = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (lgSpan != null) __obj.updateDynamic("lgSpan")(lgSpan.asInstanceOf[js.Any])
    if (mdSpan != null) __obj.updateDynamic("mdSpan")(mdSpan.asInstanceOf[js.Any])
    if (smSpan != null) __obj.updateDynamic("smSpan")(smSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

