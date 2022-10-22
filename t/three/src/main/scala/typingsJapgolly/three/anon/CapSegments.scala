package typingsJapgolly.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapSegments extends StObject {
  
  var capSegments: Double
  
  var length: Double
  
  var radialSegments: Double
  
  var radius: Double
}
object CapSegments {
  
  inline def apply(capSegments: Double, length: Double, radialSegments: Double, radius: Double): CapSegments = {
    val __obj = js.Dynamic.literal(capSegments = capSegments.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapSegments]
  }
  
  extension [Self <: CapSegments](x: Self) {
    
    inline def setCapSegments(value: Double): Self = StObject.set(x, "capSegments", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
