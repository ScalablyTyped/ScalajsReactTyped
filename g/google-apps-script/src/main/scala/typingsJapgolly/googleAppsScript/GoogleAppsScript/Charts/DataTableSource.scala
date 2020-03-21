package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for objects that can represent their data as a DataTable.
  * Implementing classes
  *
  * NameBrief description
  *
  * DataTableA Data Table to be used in charts.
  *
  * RangeAccess and modify spreadsheet ranges.
  */
trait DataTableSource extends js.Object {
  def getDataTable(): DataTable
}

object DataTableSource {
  @scala.inline
  def apply(getDataTable: CallbackTo[DataTable]): DataTableSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDataTable")(getDataTable.toJsFn)
    __obj.asInstanceOf[DataTableSource]
  }
}

