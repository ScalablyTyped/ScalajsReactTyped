package typingsJapgolly.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information for identifying a geographic location. */
trait Geocoordinate extends StObject {
  
  /** The accuracy of the location in meters. */
  var accuracy: Double
  
  /** The altitude of the location, in meters. */
  var altitude: Double
  
  /** The accuracy of the altitude, in meters. */
  var altitudeAccuracy: Double
  
  /** The current heading in degrees relative to true north. */
  var heading: Double
  
  /** The latitude in degrees. */
  var latitude: Double
  
  /** The longitude in degrees. */
  var longitude: Double
  
  /** The location of the Geocoordinate. */
  var point: Geopoint
  
  /** Gets the source used to obtain a Geocoordinate. */
  var positionSource: PositionSource
  
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  var positionSourceTimestamp: js.Date
  
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  var satelliteData: GeocoordinateSatelliteData
  
  /** The speed in meters per second. */
  var speed: Double
  
  /** The system time at which the location was determined. */
  var timestamp: js.Date
}
object Geocoordinate {
  
  inline def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    point: Geopoint,
    positionSource: PositionSource,
    positionSourceTimestamp: js.Date,
    satelliteData: GeocoordinateSatelliteData,
    speed: Double,
    timestamp: js.Date
  ): Geocoordinate = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], positionSource = positionSource.asInstanceOf[js.Any], positionSourceTimestamp = positionSourceTimestamp.asInstanceOf[js.Any], satelliteData = satelliteData.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocoordinate]
  }
  
  extension [Self <: Geocoordinate](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Geopoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPositionSource(value: PositionSource): Self = StObject.set(x, "positionSource", value.asInstanceOf[js.Any])
    
    inline def setPositionSourceTimestamp(value: js.Date): Self = StObject.set(x, "positionSourceTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSatelliteData(value: GeocoordinateSatelliteData): Self = StObject.set(x, "satelliteData", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
