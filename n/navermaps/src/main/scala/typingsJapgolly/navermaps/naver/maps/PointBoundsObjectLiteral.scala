package typingsJapgolly.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointBoundsObjectLiteral extends StObject {
  
  var maxX: Double
  
  var maxY: Double
  
  var minX: Double
  
  var minY: Double
}
object PointBoundsObjectLiteral {
  
  inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): PointBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointBoundsObjectLiteral]
  }
  
  extension [Self <: PointBoundsObjectLiteral](x: Self) {
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
  }
}
