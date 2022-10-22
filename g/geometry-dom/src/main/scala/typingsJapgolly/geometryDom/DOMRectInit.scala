package typingsJapgolly.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMRectInit extends StObject {
  
  /**
    * height value
    */
  var height: Double
  
  /**
    * width value
    */
  var width: Double
  
  /**
    * x coordinate
    */
  var x: Double
  
  /**
    * y coordinate
    */
  var y: Double
}
object DOMRectInit {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): DOMRectInit = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRectInit]
  }
  
  extension [Self <: DOMRectInit](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
