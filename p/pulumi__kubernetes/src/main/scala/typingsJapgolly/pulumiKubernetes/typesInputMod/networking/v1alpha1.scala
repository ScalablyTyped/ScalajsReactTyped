package typingsJapgolly.pulumiKubernetes.typesInputMod.networking

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.NodeSelector
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.NodeSelectorPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
    var apiVersion: js.UndefOr[Input[networkingDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterCIDR]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: js.UndefOr[Input[ClusterCIDRSpec]] = js.undefined
  }
  object ClusterCIDR {
    
    inline def apply(): ClusterCIDR = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterCIDR]
    }
    
    extension [Self <: ClusterCIDR](x: Self) {
      
      inline def setApiVersion(value: Input[networkingDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterCIDR]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[ClusterCIDRSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
  
  /**
    * ClusterCIDRSpec defines the desired state of ClusterCIDR.
    */
  trait ClusterCIDRSpec extends StObject {
    
    /**
      * IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv4: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv6: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
      */
    var nodeSelector: js.UndefOr[Input[NodeSelector]] = js.undefined
    
    /**
      * PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
      */
    var perNodeHostBits: Input[Double]
  }
  object ClusterCIDRSpec {
    
    inline def apply(perNodeHostBits: Input[Double]): ClusterCIDRSpec = {
      val __obj = js.Dynamic.literal(perNodeHostBits = perNodeHostBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterCIDRSpec]
    }
    
    extension [Self <: ClusterCIDRSpec](x: Self) {
      
      inline def setIpv4(value: Input[String]): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
      
      inline def setIpv6(value: Input[String]): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      inline def setNodeSelector(value: Input[NodeSelector]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      inline def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
      
      inline def setPerNodeHostBits(value: Input[Double]): Self = StObject.set(x, "perNodeHostBits", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ClusterCIDRSpec defines the desired state of ClusterCIDR.
    */
  trait ClusterCIDRSpecPatch extends StObject {
    
    /**
      * IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv4: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
      */
    var ipv6: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
      */
    var nodeSelector: js.UndefOr[Input[NodeSelectorPatch]] = js.undefined
    
    /**
      * PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
      */
    var perNodeHostBits: js.UndefOr[Input[Double]] = js.undefined
  }
  object ClusterCIDRSpecPatch {
    
    inline def apply(): ClusterCIDRSpecPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterCIDRSpecPatch]
    }
    
    extension [Self <: ClusterCIDRSpecPatch](x: Self) {
      
      inline def setIpv4(value: Input[String]): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
      
      inline def setIpv6(value: Input[String]): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      inline def setNodeSelector(value: Input[NodeSelectorPatch]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      inline def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
      
      inline def setPerNodeHostBits(value: Input[Double]): Self = StObject.set(x, "perNodeHostBits", value.asInstanceOf[js.Any])
      
      inline def setPerNodeHostBitsUndefined: Self = StObject.set(x, "perNodeHostBits", js.undefined)
    }
  }
}
