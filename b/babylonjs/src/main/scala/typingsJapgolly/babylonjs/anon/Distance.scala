package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  var distance: Double
  
  var max: Vector3
  
  var min: Vector3
}
object Distance {
  
  inline def apply(distance: Double, max: Vector3, min: Vector3): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Vector3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Vector3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
