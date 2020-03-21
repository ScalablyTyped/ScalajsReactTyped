package typingsJapgolly.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: js.Array[RouteSpecHttpRouteActionWeightedTarget] = js.native
}

object RouteSpecHttpRouteAction {
  @scala.inline
  def apply(weightedTargets: js.Array[RouteSpecHttpRouteActionWeightedTarget]): RouteSpecHttpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecHttpRouteAction]
  }
}

