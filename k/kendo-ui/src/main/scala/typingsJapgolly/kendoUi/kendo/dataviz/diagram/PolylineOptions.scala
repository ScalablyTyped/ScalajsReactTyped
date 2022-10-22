package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineOptions extends StObject {
  
  var endCap: js.UndefOr[String | PolylineEndCap] = js.undefined
  
  var fill: js.UndefOr[String | PolylineFill] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var startCap: js.UndefOr[String | PolylineStartCap] = js.undefined
  
  var stroke: js.UndefOr[PolylineStroke] = js.undefined
}
object PolylineOptions {
  
  inline def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setEndCap(value: String | PolylineEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    inline def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    inline def setFill(value: String | PolylineFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartCap(value: String | PolylineStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    inline def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    inline def setStroke(value: PolylineStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
