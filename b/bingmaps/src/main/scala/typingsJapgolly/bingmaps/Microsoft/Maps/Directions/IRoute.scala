package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import typingsJapgolly.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute extends js.Object {
  /** The legs of the route. Each route leg represents the route between two waypoints. */
  var routeLegs: js.Array[IRouteLeg]
  /** An array of locations that makes up the path of the route. */
  var routePath: js.Array[Location]
}

object IRoute {
  @scala.inline
  def apply(routeLegs: js.Array[IRouteLeg], routePath: js.Array[Location]): IRoute = {
    val __obj = js.Dynamic.literal(routeLegs = routeLegs.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRoute]
  }
}

