package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceGeoLocation extends StObject {
  
  // Altitude, given in meters above sea level
  var altitude: js.UndefOr[Double] = js.undefined
  
  // Heading in degrees from true north
  var heading: js.UndefOr[Double] = js.undefined
  
  // Accuracy of longitude and latitude in meters
  var horizontalAccuracy: js.UndefOr[Double] = js.undefined
  
  // Time at which location was recorded, relative to UTC
  var lastCollectedDateTime: js.UndefOr[String] = js.undefined
  
  // Latitude coordinate of the device's location
  var latitude: js.UndefOr[Double] = js.undefined
  
  // Longitude coordinate of the device's location
  var longitude: js.UndefOr[Double] = js.undefined
  
  // Speed the device is traveling in meters per second
  var speed: js.UndefOr[Double] = js.undefined
  
  // Accuracy of altitude in meters
  var verticalAccuracy: js.UndefOr[Double] = js.undefined
}
object DeviceGeoLocation {
  
  inline def apply(): DeviceGeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceGeoLocation]
  }
  
  extension [Self <: DeviceGeoLocation](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAccuracyUndefined: Self = StObject.set(x, "horizontalAccuracy", js.undefined)
    
    inline def setLastCollectedDateTime(value: String): Self = StObject.set(x, "lastCollectedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastCollectedDateTimeUndefined: Self = StObject.set(x, "lastCollectedDateTime", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setVerticalAccuracyUndefined: Self = StObject.set(x, "verticalAccuracy", js.undefined)
  }
}
