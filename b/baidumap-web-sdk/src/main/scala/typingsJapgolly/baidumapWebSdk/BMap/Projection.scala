package typingsJapgolly.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  def lngLatToPoint(lngLat: Point): Pixel
  
  def pointToLngLat(point: Pixel): Point
}
object Projection {
  
  inline def apply(lngLatToPoint: Point => Pixel, pointToLngLat: Pixel => Point): Projection = {
    val __obj = js.Dynamic.literal(lngLatToPoint = js.Any.fromFunction1(lngLatToPoint), pointToLngLat = js.Any.fromFunction1(pointToLngLat))
    __obj.asInstanceOf[Projection]
  }
  
  extension [Self <: Projection](x: Self) {
    
    inline def setLngLatToPoint(value: Point => Pixel): Self = StObject.set(x, "lngLatToPoint", js.Any.fromFunction1(value))
    
    inline def setPointToLngLat(value: Pixel => Point): Self = StObject.set(x, "pointToLngLat", js.Any.fromFunction1(value))
  }
}
