package typingsJapgolly.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Depth extends StObject {
  
  var depth: Double
  
  var depthSegments: Double
  
  var height: Double
  
  var heightSegments: Double
  
  var width: Double
  
  var widthSegments: Double
}
object Depth {
  
  inline def apply(
    depth: Double,
    depthSegments: Double,
    height: Double,
    heightSegments: Double,
    width: Double,
    widthSegments: Double
  ): Depth = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], depthSegments = depthSegments.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
  
  extension [Self <: Depth](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthSegments(value: Double): Self = StObject.set(x, "depthSegments", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
  }
}
