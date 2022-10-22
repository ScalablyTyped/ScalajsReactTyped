package typingsJapgolly.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureRegion extends StObject {
  
  var height: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var originalHeight: Double
  
  var originalWidth: Double
  
  var renderObject: Any
  
  var rotate: Boolean
  
  var u: Double
  
  var u2: Double
  
  var v: Double
  
  var v2: Double
  
  var width: Double
}
object TextureRegion {
  
  inline def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    renderObject: Any,
    rotate: Boolean,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], renderObject = renderObject.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureRegion]
  }
  
  extension [Self <: TextureRegion](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
    
    inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    inline def setRenderObject(value: Any): Self = StObject.set(x, "renderObject", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setU2(value: Double): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setV2(value: Double): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
