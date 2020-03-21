package typingsJapgolly.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterEndPointsInput extends js.Object {
  /**
    * The IDs of the instances.
    */
  var Instances: typingsJapgolly.awsSdk.elbMod.Instances = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object DeregisterEndPointsInput {
  @scala.inline
  def apply(Instances: Instances, LoadBalancerName: AccessPointName): DeregisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterEndPointsInput]
  }
}

