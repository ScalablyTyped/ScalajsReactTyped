package typingsJapgolly.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpandAll extends js.Object {
  var columns: js.UndefOr[js.Array[AnonMeasure]] = js.undefined
  var expandAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[AnonMeasure]] = js.undefined
}

object AnonExpandAll {
  @scala.inline
  def apply(
    columns: js.Array[AnonMeasure] = null,
    expandAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[AnonMeasure] = null
  ): AnonExpandAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAll)) __obj.updateDynamic("expandAll")(expandAll.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandAll]
  }
}

