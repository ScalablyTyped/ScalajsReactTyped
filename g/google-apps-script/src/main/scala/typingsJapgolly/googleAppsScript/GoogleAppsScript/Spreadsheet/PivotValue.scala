package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify value groups in pivot tables.
  */
trait PivotValue extends StObject {
  
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
  
  inline def apply(
    getDisplayType: CallbackTo[PivotValueDisplayType],
    getFormula: CallbackTo[String | Null],
    getPivotTable: CallbackTo[PivotTable],
    getSummarizedBy: CallbackTo[PivotTableSummarizeFunction],
    setDisplayName: String => PivotValue,
    setFormula: String => PivotValue,
    showAs: PivotValueDisplayType => PivotValue,
    summarizeBy: PivotTableSummarizeFunction => PivotValue
  ): PivotValue = {
    val __obj = js.Dynamic.literal(getDisplayType = getDisplayType.toJsFn, getFormula = getFormula.toJsFn, getPivotTable = getPivotTable.toJsFn, getSummarizedBy = getSummarizedBy.toJsFn, setDisplayName = js.Any.fromFunction1(setDisplayName), setFormula = js.Any.fromFunction1(setFormula), showAs = js.Any.fromFunction1(showAs), summarizeBy = js.Any.fromFunction1(summarizeBy))
    __obj.asInstanceOf[PivotValue]
  }
  
  extension [Self <: PivotValue](x: Self) {
    
    inline def setGetDisplayType(value: CallbackTo[PivotValueDisplayType]): Self = StObject.set(x, "getDisplayType", value.toJsFn)
    
    inline def setGetFormula(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFormula", value.toJsFn)
    
    inline def setGetPivotTable(value: CallbackTo[PivotTable]): Self = StObject.set(x, "getPivotTable", value.toJsFn)
    
    inline def setGetSummarizedBy(value: CallbackTo[PivotTableSummarizeFunction]): Self = StObject.set(x, "getSummarizedBy", value.toJsFn)
    
    inline def setSetDisplayName(value: String => PivotValue): Self = StObject.set(x, "setDisplayName", js.Any.fromFunction1(value))
    
    inline def setSetFormula(value: String => PivotValue): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    inline def setShowAs(value: PivotValueDisplayType => PivotValue): Self = StObject.set(x, "showAs", js.Any.fromFunction1(value))
    
    inline def setSummarizeBy(value: PivotTableSummarizeFunction => PivotValue): Self = StObject.set(x, "summarizeBy", js.Any.fromFunction1(value))
  }
}
