package typingsJapgolly.reactVirtualized.esTableMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps extends js.Object {
  var columnData: js.UndefOr[js.Any] = js.undefined
  var dataKey: String
  var disableSort: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Node] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    dataKey: String,
    columnData: js.Any = null,
    disableSort: js.UndefOr[Boolean] = js.undefined,
    label: VdomNode = null,
    sortBy: String = null,
    sortDirection: SortDirectionType = null
  ): TableHeaderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSort)) __obj.updateDynamic("disableSort")(disableSort.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
}

