package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTable extends StObject {
  
  /** The type to select columns for the data source table. Defaults to SELECTED. */
  var columnSelectionType: js.UndefOr[String] = js.undefined
  
  /** Columns selected for the data source table. The column_selection_type must be SELECTED. */
  var columns: js.UndefOr[js.Array[DataSourceColumnReference]] = js.undefined
  
  /** Output only. The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.undefined
  
  /** The ID of the data source the data source table is associated with. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /** Filter specifications in the data source table. */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.undefined
  
  /** The limit of rows to return. If not set, a default limit is applied. Please refer to the Sheets editor for the default and max limit. */
  var rowLimit: js.UndefOr[Double] = js.undefined
  
  /** Sort specifications in the data source table. The result of the data source table is sorted based on the sort specifications in order. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}
object DataSourceTable {
  
  inline def apply(): DataSourceTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTable]
  }
  
  extension [Self <: DataSourceTable](x: Self) {
    
    inline def setColumnSelectionType(value: String): Self = StObject.set(x, "columnSelectionType", value.asInstanceOf[js.Any])
    
    inline def setColumnSelectionTypeUndefined: Self = StObject.set(x, "columnSelectionType", js.undefined)
    
    inline def setColumns(value: js.Array[DataSourceColumnReference]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: DataSourceColumnReference*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setFilterSpecs(value: js.Array[FilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    inline def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    inline def setFilterSpecsVarargs(value: FilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value*))
    
    inline def setRowLimit(value: Double): Self = StObject.set(x, "rowLimit", value.asInstanceOf[js.Any])
    
    inline def setRowLimitUndefined: Self = StObject.set(x, "rowLimit", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value*))
  }
}
