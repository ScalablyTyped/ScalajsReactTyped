package typingsJapgolly.amapJsApiDriving

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.end
import typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.start
import typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-driving.AMap.Driving.Poi & {  isWaypoint  :boolean} */
trait PoiisWaypointboolean extends js.Object {
  var isWaypoint: Boolean
  var location: LngLat
  var name: String
  var `type`: start | end | waypoint
}

object PoiisWaypointboolean {
  @scala.inline
  def apply(isWaypoint: Boolean, location: LngLat, name: String, `type`: start | end | waypoint): PoiisWaypointboolean = {
    val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiisWaypointboolean]
  }
}

