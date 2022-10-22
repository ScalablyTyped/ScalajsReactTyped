package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMultiPoint
  extends StObject
     with GeoInstance {
  
  var points: js.Array[GeoPoint]
  
  def toJSON(): IGeoJSONMultiPoint
}
object GeoMultiPoint {
  
  inline def apply(points: js.Array[GeoPoint], toJSON: CallbackTo[IGeoJSONMultiPoint]): GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[GeoMultiPoint]
  }
  
  extension [Self <: GeoMultiPoint](x: Self) {
    
    inline def setPoints(value: js.Array[GeoPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: GeoPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setToJSON(value: CallbackTo[IGeoJSONMultiPoint]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
