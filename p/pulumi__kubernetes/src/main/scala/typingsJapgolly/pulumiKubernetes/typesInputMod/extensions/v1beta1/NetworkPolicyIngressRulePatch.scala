package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.
  */
trait NetworkPolicyIngressRulePatch extends StObject {
  
  /**
    * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
    */
  var from: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeerPatch]]]] = js.undefined
  
  /**
    * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPortPatch]]]] = js.undefined
}
object NetworkPolicyIngressRulePatch {
  
  inline def apply(): NetworkPolicyIngressRulePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyIngressRulePatch]
  }
  
  extension [Self <: NetworkPolicyIngressRulePatch](x: Self) {
    
    inline def setFrom(value: Input[js.Array[Input[NetworkPolicyPeerPatch]]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: Input[NetworkPolicyPeerPatch]*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setPorts(value: Input[js.Array[Input[NetworkPolicyPortPatch]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Input[NetworkPolicyPortPatch]*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
