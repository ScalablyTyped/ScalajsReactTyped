package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the selection in the Spreadsheet.
  */
trait ASPxClientSpreadsheetSelection extends StObject {
  
  /**
    * Gets the column index of the active cell.
    */
  var activeCellColumnIndex: Double
  
  /**
    * Gets the row index of the active cell.
    */
  var activeCellRowIndex: Double
  
  /**
    * Gets the index of the selection's bottom row.
    */
  var bottomRowIndex: Double
  
  /**
    * Gets the index of the selection's left column.
    */
  var leftColumnIndex: Double
  
  /**
    * Gets the index of the selection's right column.
    */
  var rightColumnIndex: Double
  
  /**
    * Gets the index of the selection's top row.
    */
  var topRowIndex: Double
}
object ASPxClientSpreadsheetSelection {
  
  inline def apply(
    activeCellColumnIndex: Double,
    activeCellRowIndex: Double,
    bottomRowIndex: Double,
    leftColumnIndex: Double,
    rightColumnIndex: Double,
    topRowIndex: Double
  ): ASPxClientSpreadsheetSelection = {
    val __obj = js.Dynamic.literal(activeCellColumnIndex = activeCellColumnIndex.asInstanceOf[js.Any], activeCellRowIndex = activeCellRowIndex.asInstanceOf[js.Any], bottomRowIndex = bottomRowIndex.asInstanceOf[js.Any], leftColumnIndex = leftColumnIndex.asInstanceOf[js.Any], rightColumnIndex = rightColumnIndex.asInstanceOf[js.Any], topRowIndex = topRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetSelection]
  }
  
  extension [Self <: ASPxClientSpreadsheetSelection](x: Self) {
    
    inline def setActiveCellColumnIndex(value: Double): Self = StObject.set(x, "activeCellColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveCellRowIndex(value: Double): Self = StObject.set(x, "activeCellRowIndex", value.asInstanceOf[js.Any])
    
    inline def setBottomRowIndex(value: Double): Self = StObject.set(x, "bottomRowIndex", value.asInstanceOf[js.Any])
    
    inline def setLeftColumnIndex(value: Double): Self = StObject.set(x, "leftColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setRightColumnIndex(value: Double): Self = StObject.set(x, "rightColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setTopRowIndex(value: Double): Self = StObject.set(x, "topRowIndex", value.asInstanceOf[js.Any])
  }
}
