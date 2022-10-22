package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEndCap extends StObject {
  
  var fill: js.UndefOr[String | PathEndCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | PathEndCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PathEndCap {
  
  inline def apply(): PathEndCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathEndCap]
  }
  
  extension [Self <: PathEndCap](x: Self) {
    
    inline def setFill(value: String | PathEndCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | PathEndCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
