package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A directions query to be sent to the DirectionsService. */
trait DirectionsRequest extends js.Object {
  /**
    * If true, instructs the Directions service to avoid ferries where
    * possible. Optional.
    */
  var avoidFerries: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, instructs the Directions service to avoid highways where
    * possible. Optional.
    */
  var avoidHighways: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, instructs the Directions service to avoid toll roads where
    * possible. Optional.
    */
  var avoidTolls: js.UndefOr[Boolean] = js.undefined
  /**
    * Location of destination. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var destination: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.undefined
  /**
    * Settings that apply only to requests where travelMode is DRIVING. This
    * object will have no effect for other travel modes.
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  /** Deprecated. Use drivingOptions field instead */
  var durationInTraffic: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the DirectionService will attempt to re-order the
    * supplied intermediate waypoints to minimize overall cost of the route. If
    * waypoints are optimized, inspect DirectionsRoute.waypoint_order in the
    * response to determine the new ordering.
    */
  var optimizeWaypoints: js.UndefOr[Boolean] = js.undefined
  /**
    * Location of origin. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var origin: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.undefined
  /** Whether or not route alternatives should be provided. Optional. */
  var provideRouteAlternatives: js.UndefOr[Boolean] = js.undefined
  /** Region code used as a bias for geocoding requests. Optional. */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Settings that apply only to requests where travelMode is TRANSIT. This
    * object will have no effect for other travel modes.
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.undefined
  /** Type of routing requested. Required. */
  var travelMode: js.UndefOr[TravelMode] = js.undefined
  /**
    * Preferred unit system to use when displaying distance. Defaults to the
    * unit system used in the country of origin.
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
  /**
    * Array of intermediate waypoints. Directions will be calculated from the
    * origin to the destination by way of each waypoint in this array. The
    * maximum allowed waypoints is 8, plus the origin, and destination. Premium
    * Plan customers are allowed 23 waypoints, plus the origin, and
    * destination. Waypoints are not supported for transit directions.
    * Optional.
    */
  var waypoints: js.UndefOr[js.Array[DirectionsWaypoint]] = js.undefined
}

object DirectionsRequest {
  @scala.inline
  def apply(
    avoidFerries: js.UndefOr[Boolean] = js.undefined,
    avoidHighways: js.UndefOr[Boolean] = js.undefined,
    avoidTolls: js.UndefOr[Boolean] = js.undefined,
    destination: String | LatLng | LatLngLiteral | Place = null,
    drivingOptions: DrivingOptions = null,
    durationInTraffic: js.UndefOr[Boolean] = js.undefined,
    optimizeWaypoints: js.UndefOr[Boolean] = js.undefined,
    origin: String | LatLng | LatLngLiteral | Place = null,
    provideRouteAlternatives: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    transitOptions: TransitOptions = null,
    travelMode: TravelMode = null,
    unitSystem: UnitSystem = null,
    waypoints: js.Array[DirectionsWaypoint] = null
  ): DirectionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidFerries)) __obj.updateDynamic("avoidFerries")(avoidFerries.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidHighways)) __obj.updateDynamic("avoidHighways")(avoidHighways.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidTolls)) __obj.updateDynamic("avoidTolls")(avoidTolls.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (drivingOptions != null) __obj.updateDynamic("drivingOptions")(drivingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(durationInTraffic)) __obj.updateDynamic("durationInTraffic")(durationInTraffic.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeWaypoints)) __obj.updateDynamic("optimizeWaypoints")(optimizeWaypoints.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(provideRouteAlternatives)) __obj.updateDynamic("provideRouteAlternatives")(provideRouteAlternatives.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (transitOptions != null) __obj.updateDynamic("transitOptions")(transitOptions.asInstanceOf[js.Any])
    if (travelMode != null) __obj.updateDynamic("travelMode")(travelMode.asInstanceOf[js.Any])
    if (unitSystem != null) __obj.updateDynamic("unitSystem")(unitSystem.asInstanceOf[js.Any])
    if (waypoints != null) __obj.updateDynamic("waypoints")(waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
}

