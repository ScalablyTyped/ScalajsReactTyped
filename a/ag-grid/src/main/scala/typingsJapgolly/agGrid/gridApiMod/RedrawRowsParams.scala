package typingsJapgolly.agGrid.gridApiMod

import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedrawRowsParams extends js.Object {
  var rowNodes: js.UndefOr[js.Array[RowNode]] = js.undefined
}

object RedrawRowsParams {
  @scala.inline
  def apply(rowNodes: js.Array[RowNode] = null): RedrawRowsParams = {
    val __obj = js.Dynamic.literal()
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrawRowsParams]
  }
}

