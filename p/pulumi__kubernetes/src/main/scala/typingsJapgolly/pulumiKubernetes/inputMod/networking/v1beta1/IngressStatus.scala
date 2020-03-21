package typingsJapgolly.pulumiKubernetes.inputMod.networking.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.core.v1.LoadBalancerStatus
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressStatus describe the current state of the Ingress.
  */
trait IngressStatus extends js.Object {
  /**
    * LoadBalancer contains the current status of the load-balancer.
    */
  var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.undefined
}

object IngressStatus {
  @scala.inline
  def apply(loadBalancer: Input[LoadBalancerStatus] = null): IngressStatus = {
    val __obj = js.Dynamic.literal()
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressStatus]
  }
}

