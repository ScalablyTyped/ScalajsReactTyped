package typingsJapgolly.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pixel extends StObject {
  
  var pixel: typingsJapgolly.bmapgl.BMapGL.Pixel
  
  var point: typingsJapgolly.bmapgl.BMapGL.Point
  
  var target: Any
  
  var `type`: String
}
object Pixel {
  
  inline def apply(
    pixel: typingsJapgolly.bmapgl.BMapGL.Pixel,
    point: typingsJapgolly.bmapgl.BMapGL.Point,
    target: Any,
    `type`: String
  ): Pixel = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixel]
  }
  
  extension [Self <: Pixel](x: Self) {
    
    inline def setPixel(value: typingsJapgolly.bmapgl.BMapGL.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typingsJapgolly.bmapgl.BMapGL.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
