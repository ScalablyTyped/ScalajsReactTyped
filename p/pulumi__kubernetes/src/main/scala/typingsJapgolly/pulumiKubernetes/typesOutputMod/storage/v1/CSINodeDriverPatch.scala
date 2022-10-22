package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSINodeDriver holds information about the specification of one CSI driver installed on a node
  */
trait CSINodeDriverPatch extends StObject {
  
  /**
    * allocatable represents the volume resources of a node that are available for scheduling. This field is beta.
    */
  var allocatable: VolumeNodeResourcesPatch
  
  /**
    * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
    */
  var name: String
  
  /**
    * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
    */
  var nodeID: String
  
  /**
    * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
    */
  var topologyKeys: js.Array[String]
}
object CSINodeDriverPatch {
  
  inline def apply(
    allocatable: VolumeNodeResourcesPatch,
    name: String,
    nodeID: String,
    topologyKeys: js.Array[String]
  ): CSINodeDriverPatch = {
    val __obj = js.Dynamic.literal(allocatable = allocatable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeID = nodeID.asInstanceOf[js.Any], topologyKeys = topologyKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSINodeDriverPatch]
  }
  
  extension [Self <: CSINodeDriverPatch](x: Self) {
    
    inline def setAllocatable(value: VolumeNodeResourcesPatch): Self = StObject.set(x, "allocatable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeID(value: String): Self = StObject.set(x, "nodeID", value.asInstanceOf[js.Any])
    
    inline def setTopologyKeys(value: js.Array[String]): Self = StObject.set(x, "topologyKeys", value.asInstanceOf[js.Any])
    
    inline def setTopologyKeysVarargs(value: String*): Self = StObject.set(x, "topologyKeys", js.Array(value*))
  }
}
