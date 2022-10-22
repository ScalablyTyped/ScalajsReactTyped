package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.NodeSelector
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.NodeSelectorPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1alpha1 {
  
  /**
    * ClusterCIDR represents a single configuration for per-Node Pod CIDR allocations when the MultiCIDRRangeAllocator is enabled (see the config for kube-controller-manager).  A cluster may have any number of ClusterCIDR resources, all of which will be considered when allocating a CIDR for a Node.  A ClusterCIDR is eligible to be used for a given Node when the node selector matches the node in question and has free CIDRs to allocate.  In case of multiple matching ClusterCIDR resources, the allocator will attempt to break ties using internal heuristics, but any ClusterCIDR whose node selector matches the Node may be used.
    */
  trait ClusterCIDR extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: networkingDotk8sDotioSlashv1alpha1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterCIDR
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: ClusterCIDRSpec
  }
  object ClusterCIDR {
    
    inline def apply(metadata: ObjectMeta, spec: ClusterCIDRSpec): ClusterCIDR = {
      val __obj = js.Dynamic.literal(apiVersion = "networking.k8s.io/v1alpha1", kind = "ClusterCIDR", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterCIDR]
    }
    
    extension [Self <: ClusterCIDR](x: Self) {
      
      inline def setApiVersion(value: networkingDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterCIDR): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: ClusterCIDRSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ClusterCIDRSpec defines the desired state of ClusterCIDR.
    */
  trait ClusterCIDRSpec extends StObject {
    
    /**
      * IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv4: String
    
    /**
      * IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv6: String
    
    /**
      * NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
      */
    var nodeSelector: NodeSelector
    
    /**
      * PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
      */
    var perNodeHostBits: Double
  }
  object ClusterCIDRSpec {
    
    inline def apply(ipv4: String, ipv6: String, nodeSelector: NodeSelector, perNodeHostBits: Double): ClusterCIDRSpec = {
      val __obj = js.Dynamic.literal(ipv4 = ipv4.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], nodeSelector = nodeSelector.asInstanceOf[js.Any], perNodeHostBits = perNodeHostBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterCIDRSpec]
    }
    
    extension [Self <: ClusterCIDRSpec](x: Self) {
      
      inline def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv6(value: String): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setNodeSelector(value: NodeSelector): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      inline def setPerNodeHostBits(value: Double): Self = StObject.set(x, "perNodeHostBits", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ClusterCIDRSpec defines the desired state of ClusterCIDR.
    */
  trait ClusterCIDRSpecPatch extends StObject {
    
    /**
      * IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv4: String
    
    /**
      * IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv6: String
    
    /**
      * NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
      */
    var nodeSelector: NodeSelectorPatch
    
    /**
      * PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
      */
    var perNodeHostBits: Double
  }
  object ClusterCIDRSpecPatch {
    
    inline def apply(ipv4: String, ipv6: String, nodeSelector: NodeSelectorPatch, perNodeHostBits: Double): ClusterCIDRSpecPatch = {
      val __obj = js.Dynamic.literal(ipv4 = ipv4.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], nodeSelector = nodeSelector.asInstanceOf[js.Any], perNodeHostBits = perNodeHostBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterCIDRSpecPatch]
    }
    
    extension [Self <: ClusterCIDRSpecPatch](x: Self) {
      
      inline def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv6(value: String): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setNodeSelector(value: NodeSelectorPatch): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      inline def setPerNodeHostBits(value: Double): Self = StObject.set(x, "perNodeHostBits", value.asInstanceOf[js.Any])
    }
  }
}
