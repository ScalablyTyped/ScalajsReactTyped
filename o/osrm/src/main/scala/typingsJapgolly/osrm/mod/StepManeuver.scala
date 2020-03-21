package typingsJapgolly.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#stepmaneuver-object
  */
trait StepManeuver extends js.Object {
  /**
    * The clockwise angle from true north to the direction of travel immediately after the maneuver. Range 0-359.
    */
  var bearing_after: Double
  /**
    * The clockwise angle from true north to the direction of travel immediately before the maneuver. Range 0-359.
    */
  var bearing_before: Double
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: Coordinate
  /**
    * An optional string indicating the direction change of the maneuver.
    */
  var modifier: Indication
  /**
    * A string indicating the type of maneuver.
    * new identifiers might be introduced without API change Types unknown to the client should be handled like the turn type,
    * the existence of correct modifier values is guranteed.
    */
  var `type`: StepManeuverTypes
}

object StepManeuver {
  @scala.inline
  def apply(
    bearing_after: Double,
    bearing_before: Double,
    location: Coordinate,
    modifier: Indication,
    `type`: StepManeuverTypes
  ): StepManeuver = {
    val __obj = js.Dynamic.literal(bearing_after = bearing_after.asInstanceOf[js.Any], bearing_before = bearing_before.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepManeuver]
  }
}

