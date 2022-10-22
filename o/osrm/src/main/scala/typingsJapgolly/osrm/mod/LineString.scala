package typingsJapgolly.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineString extends StObject {
  
  var coordinates: js.Array[Coordinate]
  
  var `type`: typingsJapgolly.osrm.osrmStrings.LineString
}
object LineString {
  
  inline def apply(coordinates: js.Array[Coordinate]): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LineString")
    __obj.asInstanceOf[LineString]
  }
  
  extension [Self <: LineString](x: Self) {
    
    inline def setCoordinates(value: js.Array[Coordinate]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Coordinate*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.osrm.osrmStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
