package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
  */
trait PodAffinityTerm extends StObject {
  
  /**
    * A label query over a set of resources, in this case pods.
    */
  var labelSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
    */
  var namespaces: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  var topologyKey: Input[String]
}
object PodAffinityTerm {
  
  inline def apply(topologyKey: Input[String]): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(topologyKey = topologyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTerm]
  }
  
  extension [Self <: PodAffinityTerm](x: Self) {
    
    inline def setLabelSelector(value: Input[LabelSelector]): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    inline def setLabelSelectorUndefined: Self = StObject.set(x, "labelSelector", js.undefined)
    
    inline def setNamespaceSelector(value: Input[LabelSelector]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
    
    inline def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
    
    inline def setNamespaces(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: Input[String]*): Self = StObject.set(x, "namespaces", js.Array(value*))
    
    inline def setTopologyKey(value: Input[String]): Self = StObject.set(x, "topologyKey", value.asInstanceOf[js.Any])
  }
}
