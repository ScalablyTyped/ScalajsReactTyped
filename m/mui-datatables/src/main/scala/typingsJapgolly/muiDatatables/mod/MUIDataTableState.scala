package typingsJapgolly.muiDatatables.mod

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.muiDatatables.anon.Data
import typingsJapgolly.muiDatatables.anon.Index
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableState extends StObject {
  
  var activeColumn: String | Null
  
  var announceText: String | Null
  
  var columnOrder: js.Array[Double]
  
  var columns: js.Array[MUIDataTableColumnState]
  
  var count: Double
  
  var data: js.Array[Any]
  
  var displayData: DisplayData
  
  var expandedRows: MUIDataTableStateRows
  
  var filterData: js.Array[js.Array[String]]
  
  var filterList: js.Array[js.Array[String]]
  
  var page: Double
  
  var previousSelectedRow: Null | Index
  
  var rowsPerPage: Double
  
  var rowsPerPageOptions: js.Array[Double]
  
  var searchProps: HTMLAttributes[HTMLInputElement] | Null
  
  var searchText: String | Null
  
  var selectedRows: MUIDataTableStateRows
  
  var showResponsive: Boolean
  
  var sortOrder: MUISortOptions
}
object MUIDataTableState {
  
  inline def apply(
    columnOrder: js.Array[Double],
    columns: js.Array[MUIDataTableColumnState],
    count: Double,
    data: js.Array[Any],
    displayData: DisplayData,
    expandedRows: MUIDataTableStateRows,
    filterData: js.Array[js.Array[String]],
    filterList: js.Array[js.Array[String]],
    page: Double,
    rowsPerPage: Double,
    rowsPerPageOptions: js.Array[Double],
    selectedRows: MUIDataTableStateRows,
    showResponsive: Boolean,
    sortOrder: MUISortOptions
  ): MUIDataTableState = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], displayData = displayData.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], filterData = filterData.asInstanceOf[js.Any], filterList = filterList.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any], rowsPerPageOptions = rowsPerPageOptions.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], showResponsive = showResponsive.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any], activeColumn = null, announceText = null, previousSelectedRow = null, searchProps = null, searchText = null)
    __obj.asInstanceOf[MUIDataTableState]
  }
  
  extension [Self <: MUIDataTableState](x: Self) {
    
    inline def setActiveColumn(value: String): Self = StObject.set(x, "activeColumn", value.asInstanceOf[js.Any])
    
    inline def setActiveColumnNull: Self = StObject.set(x, "activeColumn", null)
    
    inline def setAnnounceText(value: String): Self = StObject.set(x, "announceText", value.asInstanceOf[js.Any])
    
    inline def setAnnounceTextNull: Self = StObject.set(x, "announceText", null)
    
    inline def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    inline def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value*))
    
    inline def setColumns(value: js.Array[MUIDataTableColumnState]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: MUIDataTableColumnState*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDisplayData(value: DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value*))
    
    inline def setExpandedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    inline def setFilterData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
    
    inline def setFilterDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterData", js.Array(value*))
    
    inline def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value*))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelectedRow(value: Index): Self = StObject.set(x, "previousSelectedRow", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelectedRowNull: Self = StObject.set(x, "previousSelectedRow", null)
    
    inline def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value*))
    
    inline def setSearchProps(value: HTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "searchProps", value.asInstanceOf[js.Any])
    
    inline def setSearchPropsNull: Self = StObject.set(x, "searchProps", null)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextNull: Self = StObject.set(x, "searchText", null)
    
    inline def setSelectedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setShowResponsive(value: Boolean): Self = StObject.set(x, "showResponsive", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: MUISortOptions): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
