package typingsJapgolly.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typingsJapgolly.awsSdk.elbv2Mod.LoadBalancerArn = js.native
}

object DeleteLoadBalancerInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn): DeleteLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLoadBalancerInput]
  }
}

