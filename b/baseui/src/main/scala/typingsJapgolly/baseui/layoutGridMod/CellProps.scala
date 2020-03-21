package typingsJapgolly.baseui.layoutGridMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends js.Object {
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var order: js.UndefOr[Responsive[Double]] = js.undefined
  var skip: js.UndefOr[Responsive[Double]] = js.undefined
  var span: js.UndefOr[Responsive[Double]] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    align: Responsive[ALIGNMENT] = null,
    children: VdomNode = null,
    order: Responsive[Double] = null,
    skip: Responsive[Double] = null,
    span: Responsive[Double] = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

