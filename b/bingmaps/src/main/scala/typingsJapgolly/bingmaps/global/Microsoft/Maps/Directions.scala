package typingsJapgolly.bingmaps.global.Microsoft.Maps

import typingsJapgolly.bingmaps.Microsoft.Maps.Directions.IWaypointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Directions {
  
  @JSGlobal("Microsoft.Maps.Directions.DirectionsManager")
  @js.native
  open class DirectionsManager protected ()
    extends StObject
       with typingsJapgolly.bingmaps.Microsoft.Maps.Directions.DirectionsManager {
    /**
      * @constructor
      * @param map A map to calculate directions for.
      * @param waypoints An array of waypoints to be added to the route.
      */
    def this(map: typingsJapgolly.bingmaps.Microsoft.Maps.Map) = this()
    def this(
      map: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
      waypoints: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.Waypoint]
    ) = this()
  }
  
  @JSGlobal("Microsoft.Maps.Directions.DistanceUnit")
  @js.native
  object DistanceUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.DistanceUnit & Double] = js.native
    
    /* 0 */ val km: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.DistanceUnit.km & Double = js.native
    
    /* 1 */ val miles: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.DistanceUnit.miles & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteAvoidance")
  @js.native
  object RouteAvoidance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance & Double] = js.native
    
    /* 32 */ val avoidAirline: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidAirline & Double = js.native
    
    /* 64 */ val avoidBulletTrain: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidBulletTrain & Double = js.native
    
    /* 16 */ val avoidExpressTrain: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidExpressTrain & Double = js.native
    
    /* 4 */ val avoidHighways: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidHighways & Double = js.native
    
    /* 8 */ val avoidToll: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidToll & Double = js.native
    
    /* 1 */ val minimizeHighways: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.minimizeHighways & Double = js.native
    
    /* 2 */ val minimizeToll: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.minimizeToll & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.none & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteMode")
  @js.native
  object RouteMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteMode & Double] = js.native
    
    /* 0 */ val driving: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteMode.driving & Double = js.native
    
    /* 1 */ val transit: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteMode.transit & Double = js.native
    
    /* 2 */ val truck: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteMode.truck & Double = js.native
    
    /* 3 */ val walking: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteMode.walking & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteOptimization")
  @js.native
  object RouteOptimization extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization & Double] = js.native
    
    /* 4 */ val minimizeMoney: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeMoney & Double = js.native
    
    /* 5 */ val minimizeTransfers: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeTransfers & Double = js.native
    
    /* 6 */ val minimizeWalking: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeWalking & Double = js.native
    
    /* 1 */ val shortestDistance: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.shortestDistance & Double = js.native
    
    /* 0 */ val shortestTime: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.shortestTime & Double = js.native
    
    /* 3 */ val timeAvoidClosure: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.timeAvoidClosure & Double = js.native
    
    /* 2 */ val timeWithTraffic: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteOptimization.timeWithTraffic & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteResponseCode")
  @js.native
  object RouteResponseCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode & Double] = js.native
    
    /* 15 */ val atleastTwoWaypointRequired: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.atleastTwoWaypointRequired & Double = js.native
    
    /* 2 */ val cannotFindNearbyRoad: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.cannotFindNearbyRoad & Double = js.native
    
    /* 5 */ val dataSourceNotFound: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.dataSourceNotFound & Double = js.native
    
    /* 14 */ val exceedMaxWaypointLimit: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.exceedMaxWaypointLimit & Double = js.native
    
    /* 16 */ val firstOrLastStoppointIsVia: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.firstOrLastStoppointIsVia & Double = js.native
    
    /* 13 */ val hasEmptyWaypoint: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.hasEmptyWaypoint & Double = js.native
    
    /* 18 */ val invalidCredentials: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.invalidCredentials & Double = js.native
    
    /* 7 */ val noAvailableTransitTrip: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noAvailableTransitTrip & Double = js.native
    
    /* 4 */ val noSolution: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noSolution & Double = js.native
    
    /* 10 */ val outOfTransitBounds: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.outOfTransitBounds & Double = js.native
    
    /* 17 */ val searchServiceFailed: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.searchServiceFailed & Double = js.native
    
    /* 0 */ val success: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.success & Double = js.native
    
    /* 11 */ val timeOut: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.timeOut & Double = js.native
    
    /* 3 */ val tooFar: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.tooFar & Double = js.native
    
    /* 8 */ val transitStopsTooClose: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.transitStopsTooClose & Double = js.native
    
    /* 1 */ val unknownError: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.unknownError & Double = js.native
    
    /* 9 */ val walkingBestAlternative: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.walkingBestAlternative & Double = js.native
    
    /* 12 */ val waypointDisambiguation: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.waypointDisambiguation & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.TimeType")
  @js.native
  object TimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Directions.TimeType & Double] = js.native
    
    /* 0 */ val arrival: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.TimeType.arrival & Double = js.native
    
    /* 1 */ val departure: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.TimeType.departure & Double = js.native
    
    /* 2 */ val firstAvailable: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.TimeType.firstAvailable & Double = js.native
    
    /* 3 */ val lastAvailable: typingsJapgolly.bingmaps.Microsoft.Maps.Directions.TimeType.lastAvailable & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.Waypoint")
  @js.native
  open class Waypoint protected ()
    extends StObject
       with typingsJapgolly.bingmaps.Microsoft.Maps.Directions.Waypoint {
    /**
      * @constructor
      * @param options: Options used to define the Waypoint.
      */
    def this(options: IWaypointOptions) = this()
    
    /** Releases any resources associated with the waypoint. */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets the address associated with the waypoint.
      * @returns The address associated with the waypoint.
      */
    /* CompleteClass */
    override def getAddress(): String = js.native
    
    /**
      * Gets the location of the waypoint.
      * @returns The location of the waypoint.
      */
    /* CompleteClass */
    override def getLocation(): typingsJapgolly.bingmaps.Microsoft.Maps.Location = js.native
    
    /**
      * Gets a boolean value indicating whether the waypoint is a via point.
      * @returns A boolean value indicating whether the waypoint is a via point.
      */
    /* CompleteClass */
    override def isViapoint(): Boolean = js.native
    
    /**
      * Sets options for the waypoint. For these options to take effect, you must recalculate the route.
      * @param options Options used to define the Waypoint.
      */
    /* CompleteClass */
    override def setOptions(options: IWaypointOptions): Unit = js.native
  }
}
