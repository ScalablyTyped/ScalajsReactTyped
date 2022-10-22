package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
  */
trait PodAffinityTermPatch extends StObject {
  
  /**
    * A label query over a set of resources, in this case pods.
    */
  var labelSelector: LabelSelectorPatch
  
  /**
    * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces.
    */
  var namespaceSelector: LabelSelectorPatch
  
  /**
    * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
    */
  var namespaces: js.Array[String]
  
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  var topologyKey: String
}
object PodAffinityTermPatch {
  
  inline def apply(
    labelSelector: LabelSelectorPatch,
    namespaceSelector: LabelSelectorPatch,
    namespaces: js.Array[String],
    topologyKey: String
  ): PodAffinityTermPatch = {
    val __obj = js.Dynamic.literal(labelSelector = labelSelector.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any], topologyKey = topologyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTermPatch]
  }
  
  extension [Self <: PodAffinityTermPatch](x: Self) {
    
    inline def setLabelSelector(value: LabelSelectorPatch): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    inline def setNamespaceSelector(value: LabelSelectorPatch): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
    
    inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value*))
    
    inline def setTopologyKey(value: String): Self = StObject.set(x, "topologyKey", value.asInstanceOf[js.Any])
  }
}
