package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var gradient: js.UndefOr[PathFillGradient] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object PathFill {
  
  inline def apply(): PathFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFill]
  }
  
  extension [Self <: PathFill](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setGradient(value: PathFillGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
