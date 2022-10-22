package typingsJapgolly.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullHeight extends StObject {
  
  var fullHeight: Double
  
  var fullWidth: Double
  
  var height: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var width: Double
}
object FullHeight {
  
  inline def apply(
    fullHeight: Double,
    fullWidth: Double,
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double
  ): FullHeight = {
    val __obj = js.Dynamic.literal(fullHeight = fullHeight.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullHeight]
  }
  
  extension [Self <: FullHeight](x: Self) {
    
    inline def setFullHeight(value: Double): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
    
    inline def setFullWidth(value: Double): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
