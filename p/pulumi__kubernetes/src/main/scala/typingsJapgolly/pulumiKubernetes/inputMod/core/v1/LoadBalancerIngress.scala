package typingsJapgolly.pulumiKubernetes.inputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended
  * for the service should be sent to an ingress point.
  */
trait LoadBalancerIngress extends js.Object {
  /**
    * Hostname is set for load-balancer ingress points that are DNS based (typically AWS
    * load-balancers)
    */
  var hostname: js.UndefOr[Input[String]] = js.undefined
  /**
    * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack
    * load-balancers)
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}

object LoadBalancerIngress {
  @scala.inline
  def apply(hostname: Input[String] = null, ip: Input[String] = null): LoadBalancerIngress = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerIngress]
  }
}

