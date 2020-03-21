package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table filters.
  */
trait PivotFilter extends js.Object {
  def getFilterCriteria(): FilterCriteria
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): Integer
  def remove(): Unit
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter
}

object PivotFilter {
  @scala.inline
  def apply(
    getFilterCriteria: CallbackTo[FilterCriteria],
    getPivotTable: CallbackTo[PivotTable],
    getSourceDataColumn: CallbackTo[Integer],
    remove: Callback,
    setFilterCriteria: FilterCriteria => CallbackTo[PivotFilter]
  ): PivotFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFilterCriteria")(getFilterCriteria.toJsFn)
    __obj.updateDynamic("getPivotTable")(getPivotTable.toJsFn)
    __obj.updateDynamic("getSourceDataColumn")(getSourceDataColumn.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setFilterCriteria")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.FilterCriteria) => setFilterCriteria(t0).runNow()))
    __obj.asInstanceOf[PivotFilter]
  }
}

