package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateValuesByDataFilterResponse extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  var updatedCells: js.UndefOr[Double] = js.undefined
  var updatedColumns: js.UndefOr[Double] = js.undefined
  var updatedData: js.UndefOr[ValueRange] = js.undefined
  var updatedRange: js.UndefOr[String] = js.undefined
  var updatedRows: js.UndefOr[Double] = js.undefined
}

object UpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    dataFilter: DataFilter = null,
    updatedCells: Int | Double = null,
    updatedColumns: Int | Double = null,
    updatedData: ValueRange = null,
    updatedRange: String = null,
    updatedRows: Int | Double = null
  ): UpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter.asInstanceOf[js.Any])
    if (updatedCells != null) __obj.updateDynamic("updatedCells")(updatedCells.asInstanceOf[js.Any])
    if (updatedColumns != null) __obj.updateDynamic("updatedColumns")(updatedColumns.asInstanceOf[js.Any])
    if (updatedData != null) __obj.updateDynamic("updatedData")(updatedData.asInstanceOf[js.Any])
    if (updatedRange != null) __obj.updateDynamic("updatedRange")(updatedRange.asInstanceOf[js.Any])
    if (updatedRows != null) __obj.updateDynamic("updatedRows")(updatedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValuesByDataFilterResponse]
  }
}

