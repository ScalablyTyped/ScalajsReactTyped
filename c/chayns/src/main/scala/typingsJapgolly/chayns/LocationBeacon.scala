package typingsJapgolly.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getLocationBeacons()
trait LocationBeacon extends StObject {
  
  var id: Double
  
  var latitude: Double
  
  var longitude: Double
  
  var pushMessage: String
}
object LocationBeacon {
  
  inline def apply(id: Double, latitude: Double, longitude: Double, pushMessage: String): LocationBeacon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pushMessage = pushMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBeacon]
  }
  
  extension [Self <: LocationBeacon](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setPushMessage(value: String): Self = StObject.set(x, "pushMessage", value.asInstanceOf[js.Any])
  }
}
