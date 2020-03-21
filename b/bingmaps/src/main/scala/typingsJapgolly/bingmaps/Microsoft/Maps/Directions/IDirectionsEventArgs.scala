package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsEventArgs extends js.Object {
  /** The calculated route (or routes, if the route mode is transit). */
  var route: js.Array[IRoute]
  /** The route summary (or summaries) of the route(s) defined in the route property. */
  var routeSummary: js.Array[IRouteSummary]
}

object IDirectionsEventArgs {
  @scala.inline
  def apply(route: js.Array[IRoute], routeSummary: js.Array[IRouteSummary]): IDirectionsEventArgs = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], routeSummary = routeSummary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDirectionsEventArgs]
  }
}

