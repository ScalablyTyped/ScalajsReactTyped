package typingsJapgolly.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEvent extends StObject {
  
  var latLng: LatLng
  
  var point: Point
}
object MouseEvent {
  
  inline def apply(latLng: LatLng, point: Point): MouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  
  extension [Self <: MouseEvent](x: Self) {
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
