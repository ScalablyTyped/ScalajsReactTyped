package typingsJapgolly.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyEgressRule is deprecated by
  * networking/v1/NetworkPolicyEgressRule. NetworkPolicyEgressRule describes a particular set of
  * traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic
  * must match both ports and to. This type is beta-level in 1.8
  */
trait NetworkPolicyEgressRule extends js.Object {
  /**
    * List of destination ports for outgoing traffic. Each item in this list is combined using a
    * logical OR. If this field is empty or missing, this rule matches all ports (traffic not
    * restricted by port). If this field is present and contains at least one item, then this
    * rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.undefined
  /**
    * List of destinations for outgoing traffic of pods selected for this rule. Items in this
    * list are combined using a logical OR operation. If this field is empty or missing, this
    * rule matches all destinations (traffic not restricted by destination). If this field is
    * present and contains at least one item, this rule allows traffic only if the traffic
    * matches at least one item in the to list.
    */
  var to: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.undefined
}

object NetworkPolicyEgressRule {
  @scala.inline
  def apply(
    ports: Input[js.Array[Input[NetworkPolicyPort]]] = null,
    to: Input[js.Array[Input[NetworkPolicyPeer]]] = null
  ): NetworkPolicyEgressRule = {
    val __obj = js.Dynamic.literal()
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyEgressRule]
  }
}

