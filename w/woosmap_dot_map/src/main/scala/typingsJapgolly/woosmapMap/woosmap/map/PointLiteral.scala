package typingsJapgolly.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointLiteral extends StObject {
  
  /**
    * x coordinate *
    */
  var x: Double
  
  /**
    * y coordinate *
    */
  var y: Double
}
object PointLiteral {
  
  inline def apply(x: Double, y: Double): PointLiteral = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLiteral]
  }
  
  extension [Self <: PointLiteral](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
