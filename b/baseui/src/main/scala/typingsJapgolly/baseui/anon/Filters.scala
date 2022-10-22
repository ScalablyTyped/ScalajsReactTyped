package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.dataTableTypesMod.Row
import typingsJapgolly.baseui.dataTableTypesMod.SortDirections
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: Map[String, Description]
  
  def onFilterAdd(title: String, filterParams: Description): Unit
  
  def onFilterRemove(title: String): Unit
  
  def onIncludedRowsChange(rows: js.Array[Row]): Unit
  
  def onRowHighlightChange(rowIndex: Double, row: Row): Unit
  
  def onSelectMany(rows: js.Array[Row]): Unit
  
  def onSelectNone(): Unit
  
  def onSelectOne(row: Row): Unit
  
  def onSort(columnIndex: Double): Unit
  
  def onTextQueryChange(query: String): Unit
  
  var resizableColumnWidths: Boolean
  
  var rowHighlightIndex: js.UndefOr[Double] = js.undefined
  
  var selectedRowIds: Set[String | Double]
  
  var sortDirection: SortDirections
  
  var sortIndex: Double
  
  var textQuery: String
}
object Filters {
  
  inline def apply(
    filters: Map[String, Description],
    onFilterAdd: (String, Description) => Callback,
    onFilterRemove: String => Callback,
    onIncludedRowsChange: js.Array[Row] => Callback,
    onRowHighlightChange: (Double, Row) => Callback,
    onSelectMany: js.Array[Row] => Callback,
    onSelectNone: Callback,
    onSelectOne: Row => Callback,
    onSort: Double => Callback,
    onTextQueryChange: String => Callback,
    resizableColumnWidths: Boolean,
    selectedRowIds: Set[String | Double],
    sortDirection: SortDirections,
    sortIndex: Double,
    textQuery: String
  ): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], onFilterAdd = js.Any.fromFunction2((t0: String, t1: Description) => (onFilterAdd(t0, t1)).runNow()), onFilterRemove = js.Any.fromFunction1((t0: String) => onFilterRemove(t0).runNow()), onIncludedRowsChange = js.Any.fromFunction1((t0: js.Array[Row]) => onIncludedRowsChange(t0).runNow()), onRowHighlightChange = js.Any.fromFunction2((t0: Double, t1: Row) => (onRowHighlightChange(t0, t1)).runNow()), onSelectMany = js.Any.fromFunction1((t0: js.Array[Row]) => onSelectMany(t0).runNow()), onSelectNone = onSelectNone.toJsFn, onSelectOne = js.Any.fromFunction1((t0: Row) => onSelectOne(t0).runNow()), onSort = js.Any.fromFunction1((t0: Double) => onSort(t0).runNow()), onTextQueryChange = js.Any.fromFunction1((t0: String) => onTextQueryChange(t0).runNow()), resizableColumnWidths = resizableColumnWidths.asInstanceOf[js.Any], selectedRowIds = selectedRowIds.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], sortIndex = sortIndex.asInstanceOf[js.Any], textQuery = textQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setFilters(value: Map[String, Description]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setOnFilterAdd(value: (String, Description) => Callback): Self = StObject.set(x, "onFilterAdd", js.Any.fromFunction2((t0: String, t1: Description) => (value(t0, t1)).runNow()))
    
    inline def setOnFilterRemove(value: String => Callback): Self = StObject.set(x, "onFilterRemove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOnIncludedRowsChange(value: js.Array[Row] => Callback): Self = StObject.set(x, "onIncludedRowsChange", js.Any.fromFunction1((t0: js.Array[Row]) => value(t0).runNow()))
    
    inline def setOnRowHighlightChange(value: (Double, Row) => Callback): Self = StObject.set(x, "onRowHighlightChange", js.Any.fromFunction2((t0: Double, t1: Row) => (value(t0, t1)).runNow()))
    
    inline def setOnSelectMany(value: js.Array[Row] => Callback): Self = StObject.set(x, "onSelectMany", js.Any.fromFunction1((t0: js.Array[Row]) => value(t0).runNow()))
    
    inline def setOnSelectNone(value: Callback): Self = StObject.set(x, "onSelectNone", value.toJsFn)
    
    inline def setOnSelectOne(value: Row => Callback): Self = StObject.set(x, "onSelectOne", js.Any.fromFunction1((t0: Row) => value(t0).runNow()))
    
    inline def setOnSort(value: Double => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOnTextQueryChange(value: String => Callback): Self = StObject.set(x, "onTextQueryChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setResizableColumnWidths(value: Boolean): Self = StObject.set(x, "resizableColumnWidths", value.asInstanceOf[js.Any])
    
    inline def setRowHighlightIndex(value: Double): Self = StObject.set(x, "rowHighlightIndex", value.asInstanceOf[js.Any])
    
    inline def setRowHighlightIndexUndefined: Self = StObject.set(x, "rowHighlightIndex", js.undefined)
    
    inline def setSelectedRowIds(value: Set[String | Double]): Self = StObject.set(x, "selectedRowIds", value.asInstanceOf[js.Any])
    
    inline def setSortDirection(value: SortDirections): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    inline def setTextQuery(value: String): Self = StObject.set(x, "textQuery", value.asInstanceOf[js.Any])
  }
}
