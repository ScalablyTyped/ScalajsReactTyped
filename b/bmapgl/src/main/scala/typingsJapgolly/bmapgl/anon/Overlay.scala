package typingsJapgolly.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var overlay: typingsJapgolly.bmapgl.BMapGL.Overlay
  
  var pixel: typingsJapgolly.bmapgl.BMapGL.Pixel
  
  var point: typingsJapgolly.bmapgl.BMapGL.Point
  
  var target: Any
  
  var `type`: String
}
object Overlay {
  
  inline def apply(
    overlay: typingsJapgolly.bmapgl.BMapGL.Overlay,
    pixel: typingsJapgolly.bmapgl.BMapGL.Pixel,
    point: typingsJapgolly.bmapgl.BMapGL.Point,
    target: Any,
    `type`: String
  ): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  extension [Self <: Overlay](x: Self) {
    
    inline def setOverlay(value: typingsJapgolly.bmapgl.BMapGL.Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setPixel(value: typingsJapgolly.bmapgl.BMapGL.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typingsJapgolly.bmapgl.BMapGL.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
