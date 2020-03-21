package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableProps extends js.Object {
  var columns: js.Array[MUIDataTableColumnDef]
  var data: js.Array[js.Object | (js.Array[Double | String])]
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  var title: String | Node
}

object MUIDataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions = null,
    title: String | Node = null
  ): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableProps]
  }
}

