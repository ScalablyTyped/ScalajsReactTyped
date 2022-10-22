package typingsJapgolly.bmapgl.anon

import typingsJapgolly.bmapgl.bmapglStrings.LineString
import typingsJapgolly.bmapgl.bmapglStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinates extends StObject {
  
  var coordinates: js.Array[Any]
  
  var `type`: typingsJapgolly.bmapgl.bmapglStrings.Point | LineString | Polygon
}
object Coordinates {
  
  inline def apply(
    coordinates: js.Array[Any],
    `type`: typingsJapgolly.bmapgl.bmapglStrings.Point | LineString | Polygon
  ): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  extension [Self <: Coordinates](x: Self) {
    
    inline def setCoordinates(value: js.Array[Any]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Any*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.bmapgl.bmapglStrings.Point | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
