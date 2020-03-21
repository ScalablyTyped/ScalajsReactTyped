package typingsJapgolly.pulumiAws.elbSslNegotiationPolicyMod

import typingsJapgolly.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyState extends js.Object {
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: js.UndefOr[Input[js.Array[Input[SslNegotiationPolicyAttribute]]]] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: js.UndefOr[Input[Double]] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the attribute
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object SslNegotiationPolicyState {
  @scala.inline
  def apply(
    attributes: Input[js.Array[Input[SslNegotiationPolicyAttribute]]] = null,
    lbPort: Input[Double] = null,
    loadBalancer: Input[String] = null,
    name: Input[String] = null
  ): SslNegotiationPolicyState = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (lbPort != null) __obj.updateDynamic("lbPort")(lbPort.asInstanceOf[js.Any])
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslNegotiationPolicyState]
  }
}

