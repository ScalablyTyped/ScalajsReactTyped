package typingsJapgolly.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestHeight extends StObject {
  
  var canvasId: String
  
  var destHeight: Double
  
  var destWidth: Double
  
  var height: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object DestHeight {
  
  inline def apply(
    canvasId: String,
    destHeight: Double,
    destWidth: Double,
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): DestHeight = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestHeight]
  }
  
  extension [Self <: DestHeight](x: Self) {
    
    inline def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    inline def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    inline def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
