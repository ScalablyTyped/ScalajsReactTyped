package typingsJapgolly.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecTcpRouteActionWeightedTarget extends js.Object {
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: String = js.native
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Double = js.native
}

object RouteSpecTcpRouteActionWeightedTarget {
  @scala.inline
  def apply(virtualNode: String, weight: Double): RouteSpecTcpRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecTcpRouteActionWeightedTarget]
  }
}

