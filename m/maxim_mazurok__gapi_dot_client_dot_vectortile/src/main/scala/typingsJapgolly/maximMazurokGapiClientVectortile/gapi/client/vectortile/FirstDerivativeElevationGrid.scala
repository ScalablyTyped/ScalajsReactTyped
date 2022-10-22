package typingsJapgolly.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstDerivativeElevationGrid extends StObject {
  
  /** A multiplier applied to the altitude fields below to extract the actual altitudes in meters from the elevation grid. */
  var altitudeMultiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * Rows of points containing altitude data making up the elevation grid. Each row is the same length. Rows are ordered from north to south. E.g: rows[0] is the north-most row, and
    * rows[n] is the south-most row.
    */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}
object FirstDerivativeElevationGrid {
  
  inline def apply(): FirstDerivativeElevationGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstDerivativeElevationGrid]
  }
  
  extension [Self <: FirstDerivativeElevationGrid](x: Self) {
    
    inline def setAltitudeMultiplier(value: Double): Self = StObject.set(x, "altitudeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setAltitudeMultiplierUndefined: Self = StObject.set(x, "altitudeMultiplier", js.undefined)
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
