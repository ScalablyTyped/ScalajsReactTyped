package typingsJapgolly.amapJsApi.anon

import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiLineString
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinatesArray
  extends StObject
     with typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry {
  
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  
  var `type`: MultiLineString | MultiPolygon
}
object CoordinatesArray {
  
  inline def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): CoordinatesArray = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesArray]
  }
  
  extension [Self <: CoordinatesArray](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: MultiLineString | MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
