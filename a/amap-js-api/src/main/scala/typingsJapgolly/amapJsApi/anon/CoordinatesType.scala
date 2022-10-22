package typingsJapgolly.amapJsApi.anon

import typingsJapgolly.amapJsApi.amapJsApiStrings.LineString
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiPoint
import typingsJapgolly.amapJsApi.amapJsApiStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinatesType
  extends StObject
     with typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry {
  
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  
  var `type`: MultiPoint | LineString | Polygon
}
object CoordinatesType {
  
  inline def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): CoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesType]
  }
  
  extension [Self <: CoordinatesType](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: MultiPoint | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
