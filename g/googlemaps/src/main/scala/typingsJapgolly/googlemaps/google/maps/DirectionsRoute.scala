package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single route containing a set of legs in a DirectionsResult.
  * Note that though this object is "JSON-like," it is not strictly JSON,
  * as it directly and indirectly includes LatLng objects.
  */
trait DirectionsRoute extends js.Object {
  /** The bounds for this route. */
  var bounds: LatLngBounds
  /** Copyrights text to be displayed for this route. */
  var copyrights: String
  /**
    * The total fare for the whole transit trip. Only applicable to transit
    * requests.
    */
  var fare: TransitFare
  /**
    * An array of DirectionsLegs, each of which contains information about the
    * steps of which it is composed. There will be one leg for each stopover
    * waypoint or destination specified. So a route with no stopover waypoints
    * will contain one DirectionsLeg and a route with one stopover waypoint
    * will contain two.
    */
  var legs: js.Array[DirectionsLeg]
  /**
    * An array of LatLngs representing the entire course of this route. The
    * path is simplified in order to make it suitable in contexts where a small
    * number of vertices is required (such as Static Maps API URLs).
    */
  var overview_path: js.Array[LatLng]
  /**
    * An encoded polyline representation of the route in overview_path.
    * This polyline is an approximate (smoothed) path of the resulting
    * directions.
    */
  var overview_polyline: String
  /** Warnings to be displayed when showing these directions. */
  var warnings: js.Array[String]
  /**
    * If optimizeWaypoints was set to true, this field will contain the
    * re-ordered permutation of the input waypoints. For example, if the input
    * was: Origin: Los Angeles Waypoints: Dallas, Bangor, Phoenix Destination:
    * New York and the optimized output was ordered as follows: Origin: Los
    * Angeles Waypoints: Phoenix, Dallas, Bangor Destination: New York then
    * this field will be an Array containing the values [2, 0, 1]. Note that
    * the numbering of waypoints is zero-based. If any of the input waypoints
    * has stopover set to false, this field will be empty, since route
    * optimization is not available for such queries.
    */
  var waypoint_order: js.Array[Double]
}

object DirectionsRoute {
  @scala.inline
  def apply(
    bounds: LatLngBounds,
    copyrights: String,
    fare: TransitFare,
    legs: js.Array[DirectionsLeg],
    overview_path: js.Array[LatLng],
    overview_polyline: String,
    warnings: js.Array[String],
    waypoint_order: js.Array[Double]
  ): DirectionsRoute = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], overview_path = overview_path.asInstanceOf[js.Any], overview_polyline = overview_polyline.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], waypoint_order = waypoint_order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectionsRoute]
  }
}

