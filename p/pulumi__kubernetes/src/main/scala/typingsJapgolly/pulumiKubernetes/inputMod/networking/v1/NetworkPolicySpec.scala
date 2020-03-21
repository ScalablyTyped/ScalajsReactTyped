package typingsJapgolly.pulumiKubernetes.inputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicySpec provides the specification of a NetworkPolicy
  */
trait NetworkPolicySpec extends js.Object {
  /**
    * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if
    * there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the
    * traffic), OR if the traffic matches at least one egress rule across all of the
    * NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this
    * NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it
    * selects are isolated by default). This field is beta-level in 1.8
    */
  var egress: js.UndefOr[Input[js.Array[Input[NetworkPolicyEgressRule]]]] = js.undefined
  /**
    * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if
    * there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the
    * traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at
    * least one ingress rule across all of the NetworkPolicy objects whose podSelector matches
    * the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and
    * serves solely to ensure that the pods it selects are isolated by default)
    */
  var ingress: js.UndefOr[Input[js.Array[Input[NetworkPolicyIngressRule]]]] = js.undefined
  /**
    * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is
    * applied to any pods selected by this field. Multiple network policies can select the same
    * set of pods. In this case, the ingress rules for each are combined additively. This field
    * is NOT optional and follows standard label selector semantics. An empty podSelector matches
    * all pods in this namespace.
    */
  var podSelector: Input[LabelSelector]
  /**
    * List of rule types that the NetworkPolicy relates to. Valid options are "Ingress",
    * "Egress", or "Ingress,Egress". If this field is not specified, it will default based on the
    * existence of Ingress or Egress rules; policies that contain an Egress section are assumed
    * to affect Egress, and all policies (whether or not they contain an Ingress section) are
    * assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly
    * specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies
    * that no egress is allowed, you must specify a policyTypes value that include "Egress"
    * (since such a policy would not include an Egress section and would otherwise default to
    * just [ "Ingress" ]). This field is beta-level in 1.8
    */
  var policyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object NetworkPolicySpec {
  @scala.inline
  def apply(
    podSelector: Input[LabelSelector],
    egress: Input[js.Array[Input[NetworkPolicyEgressRule]]] = null,
    ingress: Input[js.Array[Input[NetworkPolicyIngressRule]]] = null,
    policyTypes: Input[js.Array[Input[String]]] = null
  ): NetworkPolicySpec = {
    val __obj = js.Dynamic.literal(podSelector = podSelector.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (policyTypes != null) __obj.updateDynamic("policyTypes")(policyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicySpec]
  }
}

