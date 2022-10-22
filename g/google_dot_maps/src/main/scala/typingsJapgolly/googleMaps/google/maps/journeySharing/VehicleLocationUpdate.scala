package typingsJapgolly.googleMaps.google.maps.journeySharing

import typingsJapgolly.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * VehicleLocationUpdate type
  */
trait VehicleLocationUpdate extends StObject {
  
  /**
    * The heading of the update. 0 corresponds to north, 180 to south.
    */
  var heading: Double | Null
  
  /**
    * The location of the update.
    */
  var location: LatLngLiteral | Null
  
  /**
    * The speed in kilometers per hour.
    */
  var speedKilometersPerHour: Double | Null
  
  /**
    * The time this update was received from the vehicle.
    */
  var time: js.Date | Null
}
object VehicleLocationUpdate {
  
  inline def apply(): VehicleLocationUpdate = {
    val __obj = js.Dynamic.literal(heading = null, location = null, speedKilometersPerHour = null, time = null)
    __obj.asInstanceOf[VehicleLocationUpdate]
  }
  
  extension [Self <: VehicleLocationUpdate](x: Self) {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setSpeedKilometersPerHour(value: Double): Self = StObject.set(x, "speedKilometersPerHour", value.asInstanceOf[js.Any])
    
    inline def setSpeedKilometersPerHourNull: Self = StObject.set(x, "speedKilometersPerHour", null)
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
  }
}
