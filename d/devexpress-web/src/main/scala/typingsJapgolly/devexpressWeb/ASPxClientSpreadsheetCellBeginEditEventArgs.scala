package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CellBeginEdit event.
  */
trait ASPxClientSpreadsheetCellBeginEditEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the active cell's column index.
    */
  var columnIndex: Double
  
  /**
    * Specifies the text displayed in the processed cell.
    */
  var displayText: String
  
  /**
    * Gets the active cell's formula.
    */
  var formula: String
  
  /**
    * Gets the active cell's row index.
    */
  var rowIndex: Double
  
  /**
    * Gets the current worksheet's name.
    */
  var sheetName: String
  
  /**
    * Gets the active cell's current value.
    */
  var value: String
}
object ASPxClientSpreadsheetCellBeginEditEventArgs {
  
  inline def apply(
    cancel: Boolean,
    columnIndex: Double,
    displayText: String,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellBeginEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellBeginEditEventArgs]
  }
  
  extension [Self <: ASPxClientSpreadsheetCellBeginEditEventArgs](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
