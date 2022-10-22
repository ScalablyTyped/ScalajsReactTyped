package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var configSource: js.UndefOr[Input[NodeConfigSourcePatch]] = js.undefined
  
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
    */
  var externalID: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If specified, the node's taints.
    */
  var taints: js.UndefOr[Input[js.Array[Input[TaintPatch]]]] = js.undefined
  
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  var unschedulable: js.UndefOr[Input[Boolean]] = js.undefined
}
object NodeSpecPatch {
  
  inline def apply(): NodeSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSpecPatch]
  }
  
  extension [Self <: NodeSpecPatch](x: Self) {
    
    inline def setConfigSource(value: Input[NodeConfigSourcePatch]): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    inline def setExternalID(value: Input[String]): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    inline def setExternalIDUndefined: Self = StObject.set(x, "externalID", js.undefined)
    
    inline def setPodCIDR(value: Input[String]): Self = StObject.set(x, "podCIDR", value.asInstanceOf[js.Any])
    
    inline def setPodCIDRUndefined: Self = StObject.set(x, "podCIDR", js.undefined)
    
    inline def setPodCIDRs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "podCIDRs", value.asInstanceOf[js.Any])
    
    inline def setPodCIDRsUndefined: Self = StObject.set(x, "podCIDRs", js.undefined)
    
    inline def setPodCIDRsVarargs(value: Input[String]*): Self = StObject.set(x, "podCIDRs", js.Array(value*))
    
    inline def setProviderID(value: Input[String]): Self = StObject.set(x, "providerID", value.asInstanceOf[js.Any])
    
    inline def setProviderIDUndefined: Self = StObject.set(x, "providerID", js.undefined)
    
    inline def setTaints(value: Input[js.Array[Input[TaintPatch]]]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setTaintsVarargs(value: Input[TaintPatch]*): Self = StObject.set(x, "taints", js.Array(value*))
    
    inline def setUnschedulable(value: Input[Boolean]): Self = StObject.set(x, "unschedulable", value.asInstanceOf[js.Any])
    
    inline def setUnschedulableUndefined: Self = StObject.set(x, "unschedulable", js.undefined)
  }
}
