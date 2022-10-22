package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot table filters.
  */
trait PivotFilter extends StObject {
  
  def getFilterCriteria(): FilterCriteria
  
  def getPivotTable(): PivotTable
  
  def getSourceDataColumn(): Integer
  
  def remove(): Unit
  
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter
}
object PivotFilter {
  
  inline def apply(
    getFilterCriteria: CallbackTo[FilterCriteria],
    getPivotTable: CallbackTo[PivotTable],
    getSourceDataColumn: CallbackTo[Integer],
    remove: Callback,
    setFilterCriteria: FilterCriteria => PivotFilter
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(getFilterCriteria = getFilterCriteria.toJsFn, getPivotTable = getPivotTable.toJsFn, getSourceDataColumn = getSourceDataColumn.toJsFn, remove = remove.toJsFn, setFilterCriteria = js.Any.fromFunction1(setFilterCriteria))
    __obj.asInstanceOf[PivotFilter]
  }
  
  extension [Self <: PivotFilter](x: Self) {
    
    inline def setGetFilterCriteria(value: CallbackTo[FilterCriteria]): Self = StObject.set(x, "getFilterCriteria", value.toJsFn)
    
    inline def setGetPivotTable(value: CallbackTo[PivotTable]): Self = StObject.set(x, "getPivotTable", value.toJsFn)
    
    inline def setGetSourceDataColumn(value: CallbackTo[Integer]): Self = StObject.set(x, "getSourceDataColumn", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetFilterCriteria(value: FilterCriteria => PivotFilter): Self = StObject.set(x, "setFilterCriteria", js.Any.fromFunction1(value))
  }
}
