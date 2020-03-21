package typingsJapgolly.pulumiAws.inputMod.appmesh

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecTcpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: Input[js.Array[Input[RouteSpecTcpRouteActionWeightedTarget]]] = js.native
}

object RouteSpecTcpRouteAction {
  @scala.inline
  def apply(weightedTargets: Input[js.Array[Input[RouteSpecTcpRouteActionWeightedTarget]]]): RouteSpecTcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecTcpRouteAction]
  }
}

