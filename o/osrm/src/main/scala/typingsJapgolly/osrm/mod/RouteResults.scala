package typingsJapgolly.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteResults extends StObject {
  
  var routes: js.Array[Route]
  
  var waypoints: js.Array[Waypoint]
}
object RouteResults {
  
  inline def apply(routes: js.Array[Route], waypoints: js.Array[Waypoint]): RouteResults = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResults]
  }
  
  extension [Self <: RouteResults](x: Self) {
    
    inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
