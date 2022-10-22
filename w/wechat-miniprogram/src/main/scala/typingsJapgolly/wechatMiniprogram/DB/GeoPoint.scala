package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPoint
  extends StObject
     with GeoInstance {
  
  var latitude: Double
  
  var longitude: Double
  
  def toJSON(): Record[String, Any]
}
object GeoPoint {
  
  inline def apply(latitude: Double, longitude: Double, toJSON: CallbackTo[Record[String, Any]]): GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[GeoPoint]
  }
  
  extension [Self <: GeoPoint](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Record[String, Any]]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
