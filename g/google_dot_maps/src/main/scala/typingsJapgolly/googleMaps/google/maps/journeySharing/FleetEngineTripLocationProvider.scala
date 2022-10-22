package typingsJapgolly.googleMaps.google.maps.journeySharing

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Trip location provider.
  */
trait FleetEngineTripLocationProvider
  extends StObject
     with LocationProvider {
  
  /**
    * Explicitly refreshes the tracked location.
    */
  def refresh(): Unit
  
  /**
    * The ID for the trip that this location provider observes. Set this field
    * to begin tracking.
    */
  var tripId: String
}
object FleetEngineTripLocationProvider {
  
  inline def apply(addListener: (String, js.Function) => MapsEventListener, refresh: Callback, tripId: String): FleetEngineTripLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), refresh = refresh.toJsFn, tripId = tripId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetEngineTripLocationProvider]
  }
  
  extension [Self <: FleetEngineTripLocationProvider](x: Self) {
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
  }
}
