package typingsJapgolly.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotOptions extends js.Object {
  /** Pass the column object to create pivot table
    */
  var columns: js.UndefOr[js.Any] = js.undefined
  /** Pass the filter object to create pivot table
    */
  var filter: js.UndefOr[js.Any] = js.undefined
  /** Pass the rows object to create pivot table
    */
  var rows: js.UndefOr[js.Any] = js.undefined
  /** Pass the values to create pivot table
    */
  var values: js.UndefOr[js.Any] = js.undefined
}

object PivotOptions {
  @scala.inline
  def apply(columns: js.Any = null, filter: js.Any = null, rows: js.Any = null, values: js.Any = null): PivotOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotOptions]
  }
}

