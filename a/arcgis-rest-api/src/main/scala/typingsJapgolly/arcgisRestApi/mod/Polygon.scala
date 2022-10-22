package typingsJapgolly.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polygon
  extends StObject
     with HasZM
     with Geometry {
  
  var rings: js.Array[js.Array[Position]]
}
object Polygon {
  
  inline def apply(rings: js.Array[js.Array[Position]]): Polygon = {
    val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  
  extension [Self <: Polygon](x: Self) {
    
    inline def setRings(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    inline def setRingsVarargs(value: js.Array[Position]*): Self = StObject.set(x, "rings", js.Array(value*))
  }
}
