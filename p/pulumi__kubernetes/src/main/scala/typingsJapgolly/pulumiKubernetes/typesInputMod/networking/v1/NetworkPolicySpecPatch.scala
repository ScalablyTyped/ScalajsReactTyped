package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicySpec provides the specification of a NetworkPolicy
  */
trait NetworkPolicySpecPatch extends StObject {
  
  /**
    * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
    */
  var egress: js.UndefOr[Input[js.Array[Input[NetworkPolicyEgressRulePatch]]]] = js.undefined
  
  /**
    * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
    */
  var ingress: js.UndefOr[Input[js.Array[Input[NetworkPolicyIngressRulePatch]]]] = js.undefined
  
  /**
    * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
    */
  var podSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
  
  /**
    * List of rule types that the NetworkPolicy relates to. Valid options are ["Ingress"], ["Egress"], or ["Ingress", "Egress"]. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
    */
  var policyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object NetworkPolicySpecPatch {
  
  inline def apply(): NetworkPolicySpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicySpecPatch]
  }
  
  extension [Self <: NetworkPolicySpecPatch](x: Self) {
    
    inline def setEgress(value: Input[js.Array[Input[NetworkPolicyEgressRulePatch]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
    
    inline def setEgressVarargs(value: Input[NetworkPolicyEgressRulePatch]*): Self = StObject.set(x, "egress", js.Array(value*))
    
    inline def setIngress(value: Input[js.Array[Input[NetworkPolicyIngressRulePatch]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
    
    inline def setIngressVarargs(value: Input[NetworkPolicyIngressRulePatch]*): Self = StObject.set(x, "ingress", js.Array(value*))
    
    inline def setPodSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "podSelector", value.asInstanceOf[js.Any])
    
    inline def setPodSelectorUndefined: Self = StObject.set(x, "podSelector", js.undefined)
    
    inline def setPolicyTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypesUndefined: Self = StObject.set(x, "policyTypes", js.undefined)
    
    inline def setPolicyTypesVarargs(value: Input[String]*): Self = StObject.set(x, "policyTypes", js.Array(value*))
  }
}
