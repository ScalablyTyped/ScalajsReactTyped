package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanonicalCoordinate extends StObject {
  
  def equals(coord: CanonicalCoordinate): Boolean
  
  var key: Double
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object CanonicalCoordinate {
  
  inline def apply(equals_ : CanonicalCoordinate => Boolean, key: Double, x: Double, y: Double, z: Double): CanonicalCoordinate = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[CanonicalCoordinate]
  }
  
  extension [Self <: CanonicalCoordinate](x: Self) {
    
    inline def setEquals_(value: CanonicalCoordinate => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
