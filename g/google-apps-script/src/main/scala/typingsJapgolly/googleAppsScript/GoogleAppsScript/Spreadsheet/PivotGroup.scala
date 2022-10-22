package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot table breakout groups.
  */
trait PivotGroup extends StObject {
  
  def addManualGroupingRule(groupName: String, groupMembers: js.Array[Any]): PivotGroup
  
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
  
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[Any]): PivotGroup
  
  def sortDescending(): PivotGroup
  
  def totalsAreShown(): Boolean
}
object PivotGroup {
  
  inline def apply(
    addManualGroupingRule: (String, js.Array[Any]) => PivotGroup,
    areLabelsRepeated: CallbackTo[Boolean],
    clearGroupingRule: CallbackTo[PivotGroup],
    clearSort: CallbackTo[PivotGroup],
    getDimension: CallbackTo[Dimension],
    getIndex: CallbackTo[Integer],
    getPivotTable: CallbackTo[PivotTable],
    getSourceDataColumn: CallbackTo[Integer],
    hideRepeatedLabels: CallbackTo[PivotGroup],
    isSortAscending: CallbackTo[Boolean],
    moveToIndex: Integer => PivotGroup,
    remove: Callback,
    removeManualGroupingRule: String => PivotGroup,
    resetDisplayName: CallbackTo[PivotGroup],
    setDisplayName: String => PivotGroup,
    setHistogramGroupingRule: (Integer, Integer, Integer) => PivotGroup,
    showRepeatedLabels: CallbackTo[PivotGroup],
    showTotals: Boolean => PivotGroup,
    sortAscending: CallbackTo[PivotGroup],
    sortBy: (PivotValue, js.Array[Any]) => PivotGroup,
    sortDescending: CallbackTo[PivotGroup],
    totalsAreShown: CallbackTo[Boolean]
  ): PivotGroup = {
    val __obj = js.Dynamic.literal(addManualGroupingRule = js.Any.fromFunction2(addManualGroupingRule), areLabelsRepeated = areLabelsRepeated.toJsFn, clearGroupingRule = clearGroupingRule.toJsFn, clearSort = clearSort.toJsFn, getDimension = getDimension.toJsFn, getIndex = getIndex.toJsFn, getPivotTable = getPivotTable.toJsFn, getSourceDataColumn = getSourceDataColumn.toJsFn, hideRepeatedLabels = hideRepeatedLabels.toJsFn, isSortAscending = isSortAscending.toJsFn, moveToIndex = js.Any.fromFunction1(moveToIndex), remove = remove.toJsFn, removeManualGroupingRule = js.Any.fromFunction1(removeManualGroupingRule), resetDisplayName = resetDisplayName.toJsFn, setDisplayName = js.Any.fromFunction1(setDisplayName), setHistogramGroupingRule = js.Any.fromFunction3(setHistogramGroupingRule), showRepeatedLabels = showRepeatedLabels.toJsFn, showTotals = js.Any.fromFunction1(showTotals), sortAscending = sortAscending.toJsFn, sortBy = js.Any.fromFunction2(sortBy), sortDescending = sortDescending.toJsFn, totalsAreShown = totalsAreShown.toJsFn)
    __obj.asInstanceOf[PivotGroup]
  }
  
  extension [Self <: PivotGroup](x: Self) {
    
    inline def setAddManualGroupingRule(value: (String, js.Array[Any]) => PivotGroup): Self = StObject.set(x, "addManualGroupingRule", js.Any.fromFunction2(value))
    
    inline def setAreLabelsRepeated(value: CallbackTo[Boolean]): Self = StObject.set(x, "areLabelsRepeated", value.toJsFn)
    
    inline def setClearGroupingRule(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "clearGroupingRule", value.toJsFn)
    
    inline def setClearSort(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "clearSort", value.toJsFn)
    
    inline def setGetDimension(value: CallbackTo[Dimension]): Self = StObject.set(x, "getDimension", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetPivotTable(value: CallbackTo[PivotTable]): Self = StObject.set(x, "getPivotTable", value.toJsFn)
    
    inline def setGetSourceDataColumn(value: CallbackTo[Integer]): Self = StObject.set(x, "getSourceDataColumn", value.toJsFn)
    
    inline def setHideRepeatedLabels(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "hideRepeatedLabels", value.toJsFn)
    
    inline def setIsSortAscending(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSortAscending", value.toJsFn)
    
    inline def setMoveToIndex(value: Integer => PivotGroup): Self = StObject.set(x, "moveToIndex", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setRemoveManualGroupingRule(value: String => PivotGroup): Self = StObject.set(x, "removeManualGroupingRule", js.Any.fromFunction1(value))
    
    inline def setResetDisplayName(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "resetDisplayName", value.toJsFn)
    
    inline def setSetDisplayName(value: String => PivotGroup): Self = StObject.set(x, "setDisplayName", js.Any.fromFunction1(value))
    
    inline def setSetHistogramGroupingRule(value: (Integer, Integer, Integer) => PivotGroup): Self = StObject.set(x, "setHistogramGroupingRule", js.Any.fromFunction3(value))
    
    inline def setShowRepeatedLabels(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "showRepeatedLabels", value.toJsFn)
    
    inline def setShowTotals(value: Boolean => PivotGroup): Self = StObject.set(x, "showTotals", js.Any.fromFunction1(value))
    
    inline def setSortAscending(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "sortAscending", value.toJsFn)
    
    inline def setSortBy(value: (PivotValue, js.Array[Any]) => PivotGroup): Self = StObject.set(x, "sortBy", js.Any.fromFunction2(value))
    
    inline def setSortDescending(value: CallbackTo[PivotGroup]): Self = StObject.set(x, "sortDescending", value.toJsFn)
    
    inline def setTotalsAreShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "totalsAreShown", value.toJsFn)
  }
}
