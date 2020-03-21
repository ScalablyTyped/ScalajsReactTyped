package typingsJapgolly.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a route between two waypoints.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#routeleg-object
  */
trait RouteLeg extends js.Object {
  /**
    * Additional details about each coordinate along the route geometry:
    * - true: An Annotation object containing node ids, durations distances and
    * - false: weights undefined
    */
  var annotation: Annotation
  /**
    * The distance traveled by this route leg, in float meters.
    */
  var distance: Double
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double
  /**
    * Depends on the steps parameter.
    * - true: array of RouteStep objects describing the turn-by-turn instructions
    * - false: empty array
    */
  var steps: js.Array[RouteStep]
  /**
    * Summary of the route taken as string. Depends on the summary parameter:
    * - true: Names of the two major roads used. Can be empty if route is too short.
    * - false: empty string
    */
  var summary: String
  /**
    * The calculated weight of the route leg.
    */
  var weight: Double
}

object RouteLeg {
  @scala.inline
  def apply(
    annotation: Annotation,
    distance: Double,
    duration: Double,
    steps: js.Array[RouteStep],
    summary: String,
    weight: Double
  ): RouteLeg = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteLeg]
  }
}

