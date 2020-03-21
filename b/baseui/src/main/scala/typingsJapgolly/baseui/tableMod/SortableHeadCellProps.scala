package typingsJapgolly.baseui.tableMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonHeadCell
import typingsJapgolly.baseui.baseuiStrings.ASC
import typingsJapgolly.baseui.baseuiStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableHeadCellProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var direction: ASC | DESC | Null
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fillClickTarget: js.UndefOr[Boolean] = js.undefined
  var onSort: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[AnonHeadCell] = js.undefined
  var title: String
}

object SortableHeadCellProps {
  @scala.inline
  def apply(
    title: String,
    children: VdomNode = null,
    direction: ASC | DESC = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fillClickTarget: js.UndefOr[Boolean] = js.undefined,
    onSort: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overrides: AnonHeadCell = null
  ): SortableHeadCellProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fillClickTarget)) __obj.updateDynamic("fillClickTarget")(fillClickTarget.asInstanceOf[js.Any])
    onSort.foreach(p => __obj.updateDynamic("onSort")(p.toJsFn))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableHeadCellProps]
  }
}

