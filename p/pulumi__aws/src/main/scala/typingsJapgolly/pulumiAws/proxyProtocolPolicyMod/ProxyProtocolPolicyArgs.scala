package typingsJapgolly.pulumiAws.proxyProtocolPolicyMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyProtocolPolicyArgs extends js.Object {
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: Input[js.Array[Input[String]]] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String] = js.native
}

object ProxyProtocolPolicyArgs {
  @scala.inline
  def apply(instancePorts: Input[js.Array[Input[String]]], loadBalancer: Input[String]): ProxyProtocolPolicyArgs = {
    val __obj = js.Dynamic.literal(instancePorts = instancePorts.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyProtocolPolicyArgs]
  }
}

