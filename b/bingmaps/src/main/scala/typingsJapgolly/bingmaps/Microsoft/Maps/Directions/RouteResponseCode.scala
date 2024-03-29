package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RouteResponseCode extends StObject
@JSGlobal("Microsoft.Maps.Directions.RouteResponseCode")
@js.native
object RouteResponseCode extends StObject {
  
  /** At least two waypoints are required to calculate a route. */
  @js.native
  sealed trait atleastTwoWaypointRequired
    extends StObject
       with RouteResponseCode
  
  /** A nearby road cannot be found for one or more of the route waypoints. */
  @js.native
  sealed trait cannotFindNearbyRoad
    extends StObject
       with RouteResponseCode
  
  /** There is no route data for the specified waypoints. */
  @js.native
  sealed trait dataSourceNotFound
    extends StObject
       with RouteResponseCode
  
  /** The maximum number of waypoints, which is 25, has been exceeded. */
  @js.native
  sealed trait exceedMaxWaypointLimit
    extends StObject
       with RouteResponseCode
  
  /** The first or last waypoint is a via point, which is not allowed. */
  @js.native
  sealed trait firstOrLastStoppointIsVia
    extends StObject
       with RouteResponseCode
  
  /** One or more waypoints do not have an address or location specified. */
  @js.native
  sealed trait hasEmptyWaypoint
    extends StObject
       with RouteResponseCode
  
  /** The credentials passed to the Directions module are invalid. */
  @js.native
  sealed trait invalidCredentials
    extends StObject
       with RouteResponseCode
  
  /** There are no transit options available for the specified time. */
  @js.native
  sealed trait noAvailableTransitTrip
    extends StObject
       with RouteResponseCode
  
  /**
    * A route cannot be calculated for the specified waypoints. For example, this code is returned when a route between
    * “Seattle, WA” and “Honolulu, HI” is requested.
    */
  @js.native
  sealed trait noSolution
    extends StObject
       with RouteResponseCode
  
  /**
    * There is no transit data available for the route or for one or more of the specified waypoints,
    * or the waypoints are in different transit areas that do not overlap.
    */
  @js.native
  sealed trait outOfTransitBounds
    extends StObject
       with RouteResponseCode
  
  /** The search service failed to return results. */
  @js.native
  sealed trait searchServiceFailed
    extends StObject
       with RouteResponseCode
  
  /** The route was successfully calculated. */
  @js.native
  sealed trait success
    extends StObject
       with RouteResponseCode
  
  /** The directions calculation request has timed out. */
  @js.native
  sealed trait timeOut
    extends StObject
       with RouteResponseCode
  
  /**
    * The distance between two route waypoints, or the total length of the route exceeds the limit of the route mode.
    * Modify the waypoint locations so that they are closer together.
    */
  @js.native
  sealed trait tooFar
    extends StObject
       with RouteResponseCode
  
  /** The transit stops are so close that walking is always a better option. */
  @js.native
  sealed trait transitStopsTooClose
    extends StObject
       with RouteResponseCode
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknownError
    extends StObject
       with RouteResponseCode
  
  /** The transit stops are so close that walking is a better option. */
  @js.native
  sealed trait walkingBestAlternative
    extends StObject
       with RouteResponseCode
  
  /**
    * One or more waypoints need to be disambiguated. This error does not occur if the
    * autoDisplayDisambiguation directions render option is set to true.
    */
  @js.native
  sealed trait waypointDisambiguation
    extends StObject
       with RouteResponseCode
}
