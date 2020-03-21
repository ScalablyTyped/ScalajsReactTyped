package typingsJapgolly.nivoTooltip.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.nivoTooltip.Pickanytooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTooltipProps extends js.Object {
  var renderContent: js.UndefOr[js.Function0[Node]] = js.undefined
  var rows: js.Array[js.Array[Node]]
  var theme: Pickanytooltip
  var title: js.UndefOr[Node] = js.undefined
}

object TableTooltipProps {
  @scala.inline
  def apply(
    rows: js.Array[js.Array[Node]],
    theme: Pickanytooltip,
    renderContent: js.UndefOr[CallbackTo[Node]] = js.undefined,
    title: VdomNode = null
  ): TableTooltipProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    renderContent.foreach(p => __obj.updateDynamic("renderContent")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTooltipProps]
  }
}

