package typingsJapgolly.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawOptionsConfig extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var lineJoin: js.UndefOr[String] = js.undefined
  
  var shadow: js.UndefOr[Any] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object DrawOptionsConfig {
  
  inline def apply(): DrawOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptionsConfig]
  }
  
  extension [Self <: DrawOptionsConfig](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setShadow(value: Any): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
