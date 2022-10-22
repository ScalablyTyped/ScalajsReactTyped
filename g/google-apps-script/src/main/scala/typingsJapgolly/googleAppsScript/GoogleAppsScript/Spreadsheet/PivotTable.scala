package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot tables.
  */
trait PivotTable extends StObject {
  
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
  
  inline def apply(
    addCalculatedPivotValue: (String, String) => PivotValue,
    addColumnGroup: Integer => PivotGroup,
    addFilter: (Integer, FilterCriteria) => PivotFilter,
    addPivotValue: (Integer, PivotTableSummarizeFunction) => PivotValue,
    addRowGroup: Integer => PivotGroup,
    getAnchorCell: CallbackTo[Range],
    getColumnGroups: CallbackTo[js.Array[PivotGroup]],
    getFilters: CallbackTo[js.Array[PivotFilter]],
    getPivotValues: CallbackTo[js.Array[PivotValue]],
    getRowGroups: CallbackTo[js.Array[PivotGroup]],
    getValuesDisplayOrientation: CallbackTo[Dimension],
    remove: Callback,
    setValuesDisplayOrientation: Dimension => PivotTable
  ): PivotTable = {
    val __obj = js.Dynamic.literal(addCalculatedPivotValue = js.Any.fromFunction2(addCalculatedPivotValue), addColumnGroup = js.Any.fromFunction1(addColumnGroup), addFilter = js.Any.fromFunction2(addFilter), addPivotValue = js.Any.fromFunction2(addPivotValue), addRowGroup = js.Any.fromFunction1(addRowGroup), getAnchorCell = getAnchorCell.toJsFn, getColumnGroups = getColumnGroups.toJsFn, getFilters = getFilters.toJsFn, getPivotValues = getPivotValues.toJsFn, getRowGroups = getRowGroups.toJsFn, getValuesDisplayOrientation = getValuesDisplayOrientation.toJsFn, remove = remove.toJsFn, setValuesDisplayOrientation = js.Any.fromFunction1(setValuesDisplayOrientation))
    __obj.asInstanceOf[PivotTable]
  }
  
  extension [Self <: PivotTable](x: Self) {
    
    inline def setAddCalculatedPivotValue(value: (String, String) => PivotValue): Self = StObject.set(x, "addCalculatedPivotValue", js.Any.fromFunction2(value))
    
    inline def setAddColumnGroup(value: Integer => PivotGroup): Self = StObject.set(x, "addColumnGroup", js.Any.fromFunction1(value))
    
    inline def setAddFilter(value: (Integer, FilterCriteria) => PivotFilter): Self = StObject.set(x, "addFilter", js.Any.fromFunction2(value))
    
    inline def setAddPivotValue(value: (Integer, PivotTableSummarizeFunction) => PivotValue): Self = StObject.set(x, "addPivotValue", js.Any.fromFunction2(value))
    
    inline def setAddRowGroup(value: Integer => PivotGroup): Self = StObject.set(x, "addRowGroup", js.Any.fromFunction1(value))
    
    inline def setGetAnchorCell(value: CallbackTo[Range]): Self = StObject.set(x, "getAnchorCell", value.toJsFn)
    
    inline def setGetColumnGroups(value: CallbackTo[js.Array[PivotGroup]]): Self = StObject.set(x, "getColumnGroups", value.toJsFn)
    
    inline def setGetFilters(value: CallbackTo[js.Array[PivotFilter]]): Self = StObject.set(x, "getFilters", value.toJsFn)
    
    inline def setGetPivotValues(value: CallbackTo[js.Array[PivotValue]]): Self = StObject.set(x, "getPivotValues", value.toJsFn)
    
    inline def setGetRowGroups(value: CallbackTo[js.Array[PivotGroup]]): Self = StObject.set(x, "getRowGroups", value.toJsFn)
    
    inline def setGetValuesDisplayOrientation(value: CallbackTo[Dimension]): Self = StObject.set(x, "getValuesDisplayOrientation", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetValuesDisplayOrientation(value: Dimension => PivotTable): Self = StObject.set(x, "setValuesDisplayOrientation", js.Any.fromFunction1(value))
  }
}
