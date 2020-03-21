package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var horizontalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.undefined
  var verticalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    horizontalBorderRows: js.Array[TableBorderRow] = null,
    rows: Int | Double = null,
    tableColumns: js.Array[TableColumnProperties] = null,
    tableRows: js.Array[TableRow] = null,
    verticalBorderRows: js.Array[TableBorderRow] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (horizontalBorderRows != null) __obj.updateDynamic("horizontalBorderRows")(horizontalBorderRows.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (tableColumns != null) __obj.updateDynamic("tableColumns")(tableColumns.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    if (verticalBorderRows != null) __obj.updateDynamic("verticalBorderRows")(verticalBorderRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

