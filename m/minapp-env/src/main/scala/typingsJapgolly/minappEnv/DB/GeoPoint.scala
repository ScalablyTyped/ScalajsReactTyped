package typingsJapgolly.minappEnv.DB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPoint extends StObject {
  
  var latitude: Double
  
  var longitude: Double
  
  def toJSON(): js.Object
}
object GeoPoint {
  
  inline def apply(latitude: Double, longitude: Double, toJSON: CallbackTo[js.Object]): GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[GeoPoint]
  }
  
  extension [Self <: GeoPoint](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
