package typingsJapgolly.leafletGpx

import typingsJapgolly.leafletGpx.leafletGpxStrings.route
import typingsJapgolly.leafletGpx.leafletGpxStrings.track
import typingsJapgolly.leafletGpx.leafletGpxStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParseElements extends js.Object {
  var parseElements: js.Tuple3[track, route, waypoint]
}

object AnonParseElements {
  @scala.inline
  def apply(parseElements: js.Tuple3[track, route, waypoint]): AnonParseElements = {
    val __obj = js.Dynamic.literal(parseElements = parseElements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParseElements]
  }
}

