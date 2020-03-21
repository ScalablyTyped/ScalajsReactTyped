package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table breakout groups.
  */
trait PivotGroup extends js.Object {
  def addManualGroupingRule(groupName: String, groupMembers: js.Array[_]): PivotGroup
  def areLabelsRepeated(): Boolean
  def clearGroupingRule(): PivotGroup
  def clearSort(): PivotGroup
  def getDimension(): Dimension
  def getIndex(): Integer
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): Integer
  def hideRepeatedLabels(): PivotGroup
  def isSortAscending(): Boolean
  def moveToIndex(index: Integer): PivotGroup
  def remove(): Unit
  def removeManualGroupingRule(groupName: String): PivotGroup
  def resetDisplayName(): PivotGroup
  def setDisplayName(name: String): PivotGroup
  def setHistogramGroupingRule(minValue: Integer, maxValue: Integer, intervalSize: Integer): PivotGroup
  def showRepeatedLabels(): PivotGroup
  def showTotals(showTotals: Boolean): PivotGroup
  def sortAscending(): PivotGroup
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[_]): PivotGroup
  def sortDescending(): PivotGroup
  def totalsAreShown(): Boolean
}

object PivotGroup {
  @scala.inline
  def apply(
    addManualGroupingRule: (String, js.Array[js.Any]) => CallbackTo[PivotGroup],
    areLabelsRepeated: CallbackTo[Boolean],
    clearGroupingRule: CallbackTo[PivotGroup],
    clearSort: CallbackTo[PivotGroup],
    getDimension: CallbackTo[Dimension],
    getIndex: CallbackTo[Integer],
    getPivotTable: CallbackTo[PivotTable],
    getSourceDataColumn: CallbackTo[Integer],
    hideRepeatedLabels: CallbackTo[PivotGroup],
    isSortAscending: CallbackTo[Boolean],
    moveToIndex: Integer => CallbackTo[PivotGroup],
    remove: Callback,
    removeManualGroupingRule: String => CallbackTo[PivotGroup],
    resetDisplayName: CallbackTo[PivotGroup],
    setDisplayName: String => CallbackTo[PivotGroup],
    setHistogramGroupingRule: (Integer, Integer, Integer) => CallbackTo[PivotGroup],
    showRepeatedLabels: CallbackTo[PivotGroup],
    showTotals: Boolean => CallbackTo[PivotGroup],
    sortAscending: CallbackTo[PivotGroup],
    sortBy: (PivotValue, js.Array[js.Any]) => CallbackTo[PivotGroup],
    sortDescending: CallbackTo[PivotGroup],
    totalsAreShown: CallbackTo[Boolean]
  ): PivotGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addManualGroupingRule")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => addManualGroupingRule(t0, t1).runNow()))
    __obj.updateDynamic("areLabelsRepeated")(areLabelsRepeated.toJsFn)
    __obj.updateDynamic("clearGroupingRule")(clearGroupingRule.toJsFn)
    __obj.updateDynamic("clearSort")(clearSort.toJsFn)
    __obj.updateDynamic("getDimension")(getDimension.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getPivotTable")(getPivotTable.toJsFn)
    __obj.updateDynamic("getSourceDataColumn")(getSourceDataColumn.toJsFn)
    __obj.updateDynamic("hideRepeatedLabels")(hideRepeatedLabels.toJsFn)
    __obj.updateDynamic("isSortAscending")(isSortAscending.toJsFn)
    __obj.updateDynamic("moveToIndex")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => moveToIndex(t0).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("removeManualGroupingRule")(js.Any.fromFunction1((t0: java.lang.String) => removeManualGroupingRule(t0).runNow()))
    __obj.updateDynamic("resetDisplayName")(resetDisplayName.toJsFn)
    __obj.updateDynamic("setDisplayName")(js.Any.fromFunction1((t0: java.lang.String) => setDisplayName(t0).runNow()))
    __obj.updateDynamic("setHistogramGroupingRule")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setHistogramGroupingRule(t0, t1, t2).runNow()))
    __obj.updateDynamic("showRepeatedLabels")(showRepeatedLabels.toJsFn)
    __obj.updateDynamic("showTotals")(js.Any.fromFunction1((t0: scala.Boolean) => showTotals(t0).runNow()))
    __obj.updateDynamic("sortAscending")(sortAscending.toJsFn)
    __obj.updateDynamic("sortBy")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValue, t1: js.Array[js.Any]) => sortBy(t0, t1).runNow()))
    __obj.updateDynamic("sortDescending")(sortDescending.toJsFn)
    __obj.updateDynamic("totalsAreShown")(totalsAreShown.toJsFn)
    __obj.asInstanceOf[PivotGroup]
  }
}

