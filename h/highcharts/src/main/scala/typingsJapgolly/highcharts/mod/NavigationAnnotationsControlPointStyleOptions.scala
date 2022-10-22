package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsControlPointStyleOptions extends StObject {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var `stroke-width`: js.UndefOr[Double] = js.undefined
}
object NavigationAnnotationsControlPointStyleOptions {
  
  inline def apply(): NavigationAnnotationsControlPointStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsControlPointStyleOptions]
  }
  
  extension [Self <: NavigationAnnotationsControlPointStyleOptions](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
