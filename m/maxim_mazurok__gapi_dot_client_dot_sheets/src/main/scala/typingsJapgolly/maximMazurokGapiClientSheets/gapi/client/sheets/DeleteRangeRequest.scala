package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRangeRequest extends StObject {
  
  /** The range of cells to delete. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /**
    * The dimension from which deleted cells will be replaced with. If ROWS, existing cells will be shifted upward to replace the deleted cells. If COLUMNS, existing cells will be shifted
    * left to replace the deleted cells.
    */
  var shiftDimension: js.UndefOr[String] = js.undefined
}
object DeleteRangeRequest {
  
  inline def apply(): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRangeRequest]
  }
  
  extension [Self <: DeleteRangeRequest](x: Self) {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setShiftDimension(value: String): Self = StObject.set(x, "shiftDimension", value.asInstanceOf[js.Any])
    
    inline def setShiftDimensionUndefined: Self = StObject.set(x, "shiftDimension", js.undefined)
  }
}
