package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMultiPolygon
  extends StObject
     with GeoInstance {
  
  var polygons: js.Array[GeoPolygon]
  
  def toJSON(): IGeoJSONMultiPolygon
}
object GeoMultiPolygon {
  
  inline def apply(polygons: js.Array[GeoPolygon], toJSON: CallbackTo[IGeoJSONMultiPolygon]): GeoMultiPolygon = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[GeoMultiPolygon]
  }
  
  extension [Self <: GeoMultiPolygon](x: Self) {
    
    inline def setPolygons(value: js.Array[GeoPolygon]): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsVarargs(value: GeoPolygon*): Self = StObject.set(x, "polygons", js.Array(value*))
    
    inline def setToJSON(value: CallbackTo[IGeoJSONMultiPolygon]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
