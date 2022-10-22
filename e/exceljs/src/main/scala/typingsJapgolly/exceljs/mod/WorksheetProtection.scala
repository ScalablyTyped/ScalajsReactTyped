package typingsJapgolly.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetProtection extends StObject {
  
  var autoFilter: Boolean
  
  var deleteColumns: Boolean
  
  var deleteRows: Boolean
  
  var formatCells: Boolean
  
  var formatColumns: Boolean
  
  var formatRows: Boolean
  
  var insertColumns: Boolean
  
  var insertHyperlinks: Boolean
  
  var insertRows: Boolean
  
  var objects: Boolean
  
  var pivotTables: Boolean
  
  var scenarios: Boolean
  
  var selectLockedCells: Boolean
  
  var selectUnlockedCells: Boolean
  
  var sort: Boolean
}
object WorksheetProtection {
  
  inline def apply(
    autoFilter: Boolean,
    deleteColumns: Boolean,
    deleteRows: Boolean,
    formatCells: Boolean,
    formatColumns: Boolean,
    formatRows: Boolean,
    insertColumns: Boolean,
    insertHyperlinks: Boolean,
    insertRows: Boolean,
    objects: Boolean,
    pivotTables: Boolean,
    scenarios: Boolean,
    selectLockedCells: Boolean,
    selectUnlockedCells: Boolean,
    sort: Boolean
  ): WorksheetProtection = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], deleteColumns = deleteColumns.asInstanceOf[js.Any], deleteRows = deleteRows.asInstanceOf[js.Any], formatCells = formatCells.asInstanceOf[js.Any], formatColumns = formatColumns.asInstanceOf[js.Any], formatRows = formatRows.asInstanceOf[js.Any], insertColumns = insertColumns.asInstanceOf[js.Any], insertHyperlinks = insertHyperlinks.asInstanceOf[js.Any], insertRows = insertRows.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], pivotTables = pivotTables.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], selectLockedCells = selectLockedCells.asInstanceOf[js.Any], selectUnlockedCells = selectUnlockedCells.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProtection]
  }
  
  extension [Self <: WorksheetProtection](x: Self) {
    
    inline def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    inline def setDeleteColumns(value: Boolean): Self = StObject.set(x, "deleteColumns", value.asInstanceOf[js.Any])
    
    inline def setDeleteRows(value: Boolean): Self = StObject.set(x, "deleteRows", value.asInstanceOf[js.Any])
    
    inline def setFormatCells(value: Boolean): Self = StObject.set(x, "formatCells", value.asInstanceOf[js.Any])
    
    inline def setFormatColumns(value: Boolean): Self = StObject.set(x, "formatColumns", value.asInstanceOf[js.Any])
    
    inline def setFormatRows(value: Boolean): Self = StObject.set(x, "formatRows", value.asInstanceOf[js.Any])
    
    inline def setInsertColumns(value: Boolean): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
    
    inline def setInsertHyperlinks(value: Boolean): Self = StObject.set(x, "insertHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setInsertRows(value: Boolean): Self = StObject.set(x, "insertRows", value.asInstanceOf[js.Any])
    
    inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setPivotTables(value: Boolean): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    inline def setScenarios(value: Boolean): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setSelectLockedCells(value: Boolean): Self = StObject.set(x, "selectLockedCells", value.asInstanceOf[js.Any])
    
    inline def setSelectUnlockedCells(value: Boolean): Self = StObject.set(x, "selectUnlockedCells", value.asInstanceOf[js.Any])
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
  }
}
