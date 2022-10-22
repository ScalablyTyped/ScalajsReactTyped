package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeOpacity extends StObject {
  
  var stroke: String
  
  var strokeOpacity: Double
}
object StrokeOpacity {
  
  inline def apply(stroke: String, strokeOpacity: Double): StrokeOpacity = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeOpacity]
  }
  
  extension [Self <: StrokeOpacity](x: Self) {
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
  }
}
