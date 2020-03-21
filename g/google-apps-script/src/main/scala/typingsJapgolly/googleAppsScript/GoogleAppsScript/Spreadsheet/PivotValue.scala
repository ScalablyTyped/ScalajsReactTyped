package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify value groups in pivot tables.
  */
trait PivotValue extends js.Object {
  def getDisplayType(): PivotValueDisplayType
  def getFormula(): String | Null
  def getPivotTable(): PivotTable
  def getSummarizedBy(): PivotTableSummarizeFunction
  def setDisplayName(name: String): PivotValue
  def setFormula(formula: String): PivotValue
  def showAs(displayType: PivotValueDisplayType): PivotValue
  def summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue
}

object PivotValue {
  @scala.inline
  def apply(
    getDisplayType: CallbackTo[PivotValueDisplayType],
    getFormula: CallbackTo[String | Null],
    getPivotTable: CallbackTo[PivotTable],
    getSummarizedBy: CallbackTo[PivotTableSummarizeFunction],
    setDisplayName: String => CallbackTo[PivotValue],
    setFormula: String => CallbackTo[PivotValue],
    showAs: PivotValueDisplayType => CallbackTo[PivotValue],
    summarizeBy: PivotTableSummarizeFunction => CallbackTo[PivotValue]
  ): PivotValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisplayType")(getDisplayType.toJsFn)
    __obj.updateDynamic("getFormula")(getFormula.toJsFn)
    __obj.updateDynamic("getPivotTable")(getPivotTable.toJsFn)
    __obj.updateDynamic("getSummarizedBy")(getSummarizedBy.toJsFn)
    __obj.updateDynamic("setDisplayName")(js.Any.fromFunction1((t0: java.lang.String) => setDisplayName(t0).runNow()))
    __obj.updateDynamic("setFormula")(js.Any.fromFunction1((t0: java.lang.String) => setFormula(t0).runNow()))
    __obj.updateDynamic("showAs")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType) => showAs(t0).runNow()))
    __obj.updateDynamic("summarizeBy")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction) => summarizeBy(t0).runNow()))
    __obj.asInstanceOf[PivotValue]
  }
}

