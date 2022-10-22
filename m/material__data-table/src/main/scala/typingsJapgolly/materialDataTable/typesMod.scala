package typingsJapgolly.materialDataTable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialDataTable.constantsMod.SortValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCDataTableRowSelectionChangedEventDetail extends StObject {
    
    var rowId: String | Null
    
    var rowIndex: Double
    
    var selected: Boolean
  }
  object MDCDataTableRowSelectionChangedEventDetail {
    
    inline def apply(rowIndex: Double, selected: Boolean): MDCDataTableRowSelectionChangedEventDetail = {
      val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], rowId = null)
      __obj.asInstanceOf[MDCDataTableRowSelectionChangedEventDetail]
    }
    
    extension [Self <: MDCDataTableRowSelectionChangedEventDetail](x: Self) {
      
      inline def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      inline def setRowIdNull: Self = StObject.set(x, "rowId", null)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressIndicatorStyles extends StObject {
    
    var height: String
    
    var top: String
  }
  object ProgressIndicatorStyles {
    
    inline def apply(height: String, top: String): ProgressIndicatorStyles = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressIndicatorStyles]
    }
    
    extension [Self <: ProgressIndicatorStyles](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowClickEventData extends StObject {
    
    var row: HTMLElement
    
    var rowId: String | Null
  }
  object RowClickEventData {
    
    inline def apply(row: HTMLElement): RowClickEventData = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowId = null)
      __obj.asInstanceOf[RowClickEventData]
    }
    
    extension [Self <: RowClickEventData](x: Self) {
      
      inline def setRow(value: HTMLElement): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      inline def setRowIdNull: Self = StObject.set(x, "rowId", null)
    }
  }
  
  type RowClickEventDetail = RowClickEventData
  
  trait SortActionEventData extends StObject {
    
    var columnId: String | Null
    
    var columnIndex: Double
    
    var headerCell: HTMLElement
  }
  object SortActionEventData {
    
    inline def apply(columnIndex: Double, headerCell: HTMLElement): SortActionEventData = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], columnId = null)
      __obj.asInstanceOf[SortActionEventData]
    }
    
    extension [Self <: SortActionEventData](x: Self) {
      
      inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      inline def setColumnIdNull: Self = StObject.set(x, "columnId", null)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setHeaderCell(value: HTMLElement): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortActionEventDetail extends StObject {
    
    var columnId: String | Null
    
    var columnIndex: Double
    
    var headerCell: HTMLElement
    
    var sortValue: SortValue
  }
  object SortActionEventDetail {
    
    inline def apply(columnIndex: Double, headerCell: HTMLElement, sortValue: SortValue): SortActionEventDetail = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], sortValue = sortValue.asInstanceOf[js.Any], columnId = null)
      __obj.asInstanceOf[SortActionEventDetail]
    }
    
    extension [Self <: SortActionEventDetail](x: Self) {
      
      inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      inline def setColumnIdNull: Self = StObject.set(x, "columnId", null)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setHeaderCell(value: HTMLElement): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      inline def setSortValue(value: SortValue): Self = StObject.set(x, "sortValue", value.asInstanceOf[js.Any])
    }
  }
}
