package typingsJapgolly.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationCallbackValue extends StObject {
  
  /**
    * Accuracy, in m.
    */
  var accuracy: String
  
  var latitude: String
  
  var longitude: String
}
object GetLocationCallbackValue {
  
  inline def apply(accuracy: String, latitude: String, longitude: String): GetLocationCallbackValue = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationCallbackValue]
  }
  
  extension [Self <: GetLocationCallbackValue](x: Self) {
    
    inline def setAccuracy(value: String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
