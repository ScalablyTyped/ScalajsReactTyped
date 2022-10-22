package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
  */
trait NetworkPolicyPeerPatch extends StObject {
  
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
    */
  var ipBlock: js.UndefOr[Input[IPBlockPatch]] = js.undefined
  
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
  
  /**
    * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
    */
  var podSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
}
object NetworkPolicyPeerPatch {
  
  inline def apply(): NetworkPolicyPeerPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyPeerPatch]
  }
  
  extension [Self <: NetworkPolicyPeerPatch](x: Self) {
    
    inline def setIpBlock(value: Input[IPBlockPatch]): Self = StObject.set(x, "ipBlock", value.asInstanceOf[js.Any])
    
    inline def setIpBlockUndefined: Self = StObject.set(x, "ipBlock", js.undefined)
    
    inline def setNamespaceSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
    
    inline def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
    
    inline def setPodSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "podSelector", value.asInstanceOf[js.Any])
    
    inline def setPodSelectorUndefined: Self = StObject.set(x, "podSelector", js.undefined)
  }
}
