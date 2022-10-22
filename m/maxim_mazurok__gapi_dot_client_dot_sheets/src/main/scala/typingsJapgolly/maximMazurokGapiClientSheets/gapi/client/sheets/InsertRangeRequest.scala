package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertRangeRequest extends StObject {
  
  /** The range to insert new cells into. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The dimension which will be shifted when inserting cells. If ROWS, existing cells will be shifted down. If COLUMNS, existing cells will be shifted right. */
  var shiftDimension: js.UndefOr[String] = js.undefined
}
object InsertRangeRequest {
  
  inline def apply(): InsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertRangeRequest]
  }
  
  extension [Self <: InsertRangeRequest](x: Self) {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setShiftDimension(value: String): Self = StObject.set(x, "shiftDimension", value.asInstanceOf[js.Any])
    
    inline def setShiftDimensionUndefined: Self = StObject.set(x, "shiftDimension", js.undefined)
  }
}
