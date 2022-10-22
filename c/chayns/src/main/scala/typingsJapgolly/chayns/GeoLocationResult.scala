package typingsJapgolly.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getGeoLocation()
trait GeoLocationResult extends StObject {
  
  var latitude: Double
  
  var longitude: Double
}
object GeoLocationResult {
  
  inline def apply(latitude: Double, longitude: Double): GeoLocationResult = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocationResult]
  }
  
  extension [Self <: GeoLocationResult](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
