package typingsJapgolly.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAngle extends StObject {
  
  var endAngle: Any
  
  var innerRadius: Double
  
  var radius: Double
  
  var startAngle: Any
}
object EndAngle {
  
  inline def apply(endAngle: Any, innerRadius: Double, radius: Double, startAngle: Any): EndAngle = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAngle]
  }
  
  extension [Self <: EndAngle](x: Self) {
    
    inline def setEndAngle(value: Any): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Any): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
