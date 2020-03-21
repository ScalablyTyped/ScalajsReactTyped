package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot tables.
  */
trait PivotTable extends js.Object {
  def addCalculatedPivotValue(name: String, formula: String): PivotValue
  def addColumnGroup(sourceDataColumn: Integer): PivotGroup
  def addFilter(sourceDataColumn: Integer, filterCriteria: FilterCriteria): PivotFilter
  def addPivotValue(sourceDataColumn: Integer, summarizeFunction: PivotTableSummarizeFunction): PivotValue
  def addRowGroup(sourceDataColumn: Integer): PivotGroup
  def getAnchorCell(): Range
  def getColumnGroups(): js.Array[PivotGroup]
  def getFilters(): js.Array[PivotFilter]
  def getPivotValues(): js.Array[PivotValue]
  def getRowGroups(): js.Array[PivotGroup]
  def getValuesDisplayOrientation(): Dimension
  def remove(): Unit
  def setValuesDisplayOrientation(dimension: Dimension): PivotTable
}

object PivotTable {
  @scala.inline
  def apply(
    addCalculatedPivotValue: (String, String) => CallbackTo[PivotValue],
    addColumnGroup: Integer => CallbackTo[PivotGroup],
    addFilter: (Integer, FilterCriteria) => CallbackTo[PivotFilter],
    addPivotValue: (Integer, PivotTableSummarizeFunction) => CallbackTo[PivotValue],
    addRowGroup: Integer => CallbackTo[PivotGroup],
    getAnchorCell: CallbackTo[Range],
    getColumnGroups: CallbackTo[js.Array[PivotGroup]],
    getFilters: CallbackTo[js.Array[PivotFilter]],
    getPivotValues: CallbackTo[js.Array[PivotValue]],
    getRowGroups: CallbackTo[js.Array[PivotGroup]],
    getValuesDisplayOrientation: CallbackTo[Dimension],
    remove: Callback,
    setValuesDisplayOrientation: Dimension => CallbackTo[PivotTable]
  ): PivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCalculatedPivotValue")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addCalculatedPivotValue(t0, t1).runNow()))
    __obj.updateDynamic("addColumnGroup")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => addColumnGroup(t0).runNow()))
    __obj.updateDynamic("addFilter")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.FilterCriteria) => addFilter(t0, t1).runNow()))
    __obj.updateDynamic("addPivotValue")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction) => addPivotValue(t0, t1).runNow()))
    __obj.updateDynamic("addRowGroup")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => addRowGroup(t0).runNow()))
    __obj.updateDynamic("getAnchorCell")(getAnchorCell.toJsFn)
    __obj.updateDynamic("getColumnGroups")(getColumnGroups.toJsFn)
    __obj.updateDynamic("getFilters")(getFilters.toJsFn)
    __obj.updateDynamic("getPivotValues")(getPivotValues.toJsFn)
    __obj.updateDynamic("getRowGroups")(getRowGroups.toJsFn)
    __obj.updateDynamic("getValuesDisplayOrientation")(getValuesDisplayOrientation.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setValuesDisplayOrientation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension) => setValuesDisplayOrientation(t0).runNow()))
    __obj.asInstanceOf[PivotTable]
  }
}

