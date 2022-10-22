package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSINodeDriver holds information about the specification of one CSI driver installed on a node
  */
trait CSINodeDriver extends StObject {
  
  /**
    * allocatable represents the volume resources of a node that are available for scheduling. This field is beta.
    */
  var allocatable: js.UndefOr[Input[VolumeNodeResources]] = js.undefined
  
  /**
    * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
    */
  var name: Input[String]
  
  /**
    * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
    */
  var nodeID: Input[String]
  
  /**
    * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
    */
  var topologyKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object CSINodeDriver {
  
  inline def apply(name: Input[String], nodeID: Input[String]): CSINodeDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeID = nodeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSINodeDriver]
  }
  
  extension [Self <: CSINodeDriver](x: Self) {
    
    inline def setAllocatable(value: Input[VolumeNodeResources]): Self = StObject.set(x, "allocatable", value.asInstanceOf[js.Any])
    
    inline def setAllocatableUndefined: Self = StObject.set(x, "allocatable", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeID(value: Input[String]): Self = StObject.set(x, "nodeID", value.asInstanceOf[js.Any])
    
    inline def setTopologyKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "topologyKeys", value.asInstanceOf[js.Any])
    
    inline def setTopologyKeysUndefined: Self = StObject.set(x, "topologyKeys", js.undefined)
    
    inline def setTopologyKeysVarargs(value: Input[String]*): Self = StObject.set(x, "topologyKeys", js.Array(value*))
  }
}
