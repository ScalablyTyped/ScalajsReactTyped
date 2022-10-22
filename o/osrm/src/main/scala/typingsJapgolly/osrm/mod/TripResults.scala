package typingsJapgolly.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripResults extends StObject {
  
  var trips: js.Array[Route]
  
  var waypoints: js.Array[TripWaypoint]
}
object TripResults {
  
  inline def apply(trips: js.Array[Route], waypoints: js.Array[TripWaypoint]): TripResults = {
    val __obj = js.Dynamic.literal(trips = trips.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripResults]
  }
  
  extension [Self <: TripResults](x: Self) {
    
    inline def setTrips(value: js.Array[Route]): Self = StObject.set(x, "trips", value.asInstanceOf[js.Any])
    
    inline def setTripsVarargs(value: Route*): Self = StObject.set(x, "trips", js.Array(value*))
    
    inline def setWaypoints(value: js.Array[TripWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: TripWaypoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
