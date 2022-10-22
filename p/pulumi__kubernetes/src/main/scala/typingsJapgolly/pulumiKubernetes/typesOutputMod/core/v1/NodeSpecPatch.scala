package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeSpec describes the attributes that a node is created with.
  */
trait NodeSpecPatch extends StObject {
  
  /**
    * Deprecated: Previously used to specify the source of the node's configuration for the DynamicKubeletConfig feature. This feature is removed from Kubelets as of 1.24 and will be fully removed in 1.26.
    */
  var configSource: NodeConfigSourcePatch
  
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
    */
  var externalID: String
  
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: String
  
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.Array[String]
  
  /**
    * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: String
  
  /**
    * If specified, the node's taints.
    */
  var taints: js.Array[TaintPatch]
  
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  var unschedulable: Boolean
}
object NodeSpecPatch {
  
  inline def apply(
    configSource: NodeConfigSourcePatch,
    externalID: String,
    podCIDR: String,
    podCIDRs: js.Array[String],
    providerID: String,
    taints: js.Array[TaintPatch],
    unschedulable: Boolean
  ): NodeSpecPatch = {
    val __obj = js.Dynamic.literal(configSource = configSource.asInstanceOf[js.Any], externalID = externalID.asInstanceOf[js.Any], podCIDR = podCIDR.asInstanceOf[js.Any], podCIDRs = podCIDRs.asInstanceOf[js.Any], providerID = providerID.asInstanceOf[js.Any], taints = taints.asInstanceOf[js.Any], unschedulable = unschedulable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSpecPatch]
  }
  
  extension [Self <: NodeSpecPatch](x: Self) {
    
    inline def setConfigSource(value: NodeConfigSourcePatch): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setExternalID(value: String): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    inline def setPodCIDR(value: String): Self = StObject.set(x, "podCIDR", value.asInstanceOf[js.Any])
    
    inline def setPodCIDRs(value: js.Array[String]): Self = StObject.set(x, "podCIDRs", value.asInstanceOf[js.Any])
    
    inline def setPodCIDRsVarargs(value: String*): Self = StObject.set(x, "podCIDRs", js.Array(value*))
    
    inline def setProviderID(value: String): Self = StObject.set(x, "providerID", value.asInstanceOf[js.Any])
    
    inline def setTaints(value: js.Array[TaintPatch]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsVarargs(value: TaintPatch*): Self = StObject.set(x, "taints", js.Array(value*))
    
    inline def setUnschedulable(value: Boolean): Self = StObject.set(x, "unschedulable", value.asInstanceOf[js.Any])
  }
}
