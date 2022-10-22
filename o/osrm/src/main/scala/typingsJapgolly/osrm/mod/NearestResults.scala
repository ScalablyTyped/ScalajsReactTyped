package typingsJapgolly.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearestResults extends StObject {
  
  var waypoints: js.Array[Waypoint]
}
object NearestResults {
  
  inline def apply(waypoints: js.Array[Waypoint]): NearestResults = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestResults]
  }
  
  extension [Self <: NearestResults](x: Self) {
    
    inline def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
