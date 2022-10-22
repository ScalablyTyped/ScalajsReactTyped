package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoLineString
  extends StObject
     with GeoInstance {
  
  var points: js.Array[GeoPoint]
  
  def toJSON(): IGeoJSONLineString
}
object GeoLineString {
  
  inline def apply(points: js.Array[GeoPoint], toJSON: CallbackTo[IGeoJSONLineString]): GeoLineString = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[GeoLineString]
  }
  
  extension [Self <: GeoLineString](x: Self) {
    
    inline def setPoints(value: js.Array[GeoPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: GeoPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setToJSON(value: CallbackTo[IGeoJSONLineString]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
