package typingsJapgolly.pulumiKubernetes.typesInputMod.discovery

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReferencePatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * Endpoint represents a single logical "backend" implementing a service.
    */
  trait Endpoint extends StObject {
    
    /**
      * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
      */
    var addresses: Input[js.Array[Input[String]]]
    
    /**
      * conditions contains information about the current status of the endpoint.
      */
    var conditions: js.UndefOr[Input[EndpointConditions]] = js.undefined
    
    /**
      * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
      */
    var hostname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
      */
    var nodeName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * targetRef is a reference to a Kubernetes object that represents this endpoint.
      */
    var targetRef: js.UndefOr[Input[ObjectReference]] = js.undefined
    
    /**
      * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
      *   where the endpoint is located. This should match the corresponding
      *   node label.
      * * topology.kubernetes.io/zone: the value indicates the zone where the
      *   endpoint is located. This should match the corresponding node label.
      * * topology.kubernetes.io/region: the value indicates the region where the
      *   endpoint is located. This should match the corresponding node label.
      */
    var topology: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object Endpoint {
    
    inline def apply(addresses: Input[js.Array[Input[String]]]): Endpoint = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setConditions(value: Input[EndpointConditions]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      inline def setTargetRef(value: Input[ObjectReference]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setTopology(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    }
  }
  
  /**
    * EndpointConditions represents the current condition of an endpoint.
    */
  trait EndpointConditions extends StObject {
    
    /**
      * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
      */
    var ready: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var serving: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var terminating: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object EndpointConditions {
    
    inline def apply(): EndpointConditions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointConditions]
    }
    
    extension [Self <: EndpointConditions](x: Self) {
      
      inline def setReady(value: Input[Boolean]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setServing(value: Input[Boolean]): Self = StObject.set(x, "serving", value.asInstanceOf[js.Any])
      
      inline def setServingUndefined: Self = StObject.set(x, "serving", js.undefined)
      
      inline def setTerminating(value: Input[Boolean]): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
      
      inline def setTerminatingUndefined: Self = StObject.set(x, "terminating", js.undefined)
    }
  }
  
  /**
    * EndpointConditions represents the current condition of an endpoint.
    */
  trait EndpointConditionsPatch extends StObject {
    
    /**
      * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
      */
    var ready: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var serving: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var terminating: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object EndpointConditionsPatch {
    
    inline def apply(): EndpointConditionsPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointConditionsPatch]
    }
    
    extension [Self <: EndpointConditionsPatch](x: Self) {
      
      inline def setReady(value: Input[Boolean]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setServing(value: Input[Boolean]): Self = StObject.set(x, "serving", value.asInstanceOf[js.Any])
      
      inline def setServingUndefined: Self = StObject.set(x, "serving", js.undefined)
      
      inline def setTerminating(value: Input[Boolean]): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
      
      inline def setTerminatingUndefined: Self = StObject.set(x, "terminating", js.undefined)
    }
  }
  
  /**
    * Endpoint represents a single logical "backend" implementing a service.
    */
  trait EndpointPatch extends StObject {
    
    /**
      * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
      */
    var addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * conditions contains information about the current status of the endpoint.
      */
    var conditions: js.UndefOr[Input[EndpointConditionsPatch]] = js.undefined
    
    /**
      * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
      */
    var hostname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
      */
    var nodeName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * targetRef is a reference to a Kubernetes object that represents this endpoint.
      */
    var targetRef: js.UndefOr[Input[ObjectReferencePatch]] = js.undefined
    
    /**
      * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
      *   where the endpoint is located. This should match the corresponding
      *   node label.
      * * topology.kubernetes.io/zone: the value indicates the zone where the
      *   endpoint is located. This should match the corresponding node label.
      * * topology.kubernetes.io/region: the value indicates the region where the
      *   endpoint is located. This should match the corresponding node label.
      */
    var topology: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object EndpointPatch {
    
    inline def apply(): EndpointPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointPatch]
    }
    
    extension [Self <: EndpointPatch](x: Self) {
      
      inline def setAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setConditions(value: Input[EndpointConditionsPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      inline def setTargetRef(value: Input[ObjectReferencePatch]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setTopology(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    }
  }
  
  /**
    * EndpointPort represents a Port used by an EndpointSlice
    */
  trait EndpointPort extends StObject {
    
    /**
      * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
      */
    var appProtocol: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
      */
    var protocol: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointPort {
    
    inline def apply(): EndpointPort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointPort]
    }
    
    extension [Self <: EndpointPort](x: Self) {
      
      inline def setAppProtocol(value: Input[String]): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
      
      inline def setAppProtocolUndefined: Self = StObject.set(x, "appProtocol", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  /**
    * EndpointPort represents a Port used by an EndpointSlice
    */
  trait EndpointPortPatch extends StObject {
    
    /**
      * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
      */
    var appProtocol: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
      */
    var protocol: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointPortPatch {
    
    inline def apply(): EndpointPortPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointPortPatch]
    }
    
    extension [Self <: EndpointPortPatch](x: Self) {
      
      inline def setAppProtocol(value: Input[String]): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
      
      inline def setAppProtocolUndefined: Self = StObject.set(x, "appProtocol", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  /**
    * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
    */
  trait EndpointSlice extends StObject {
    
    /**
      * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
      */
    var addressType: Input[String]
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[discoveryDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
      */
    var endpoints: Input[js.Array[Input[Endpoint]]]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
      */
    var ports: js.UndefOr[Input[js.Array[Input[EndpointPort]]]] = js.undefined
  }
  object EndpointSlice {
    
    inline def apply(addressType: Input[String], endpoints: Input[js.Array[Input[Endpoint]]]): EndpointSlice = {
      val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointSlice]
    }
    
    extension [Self <: EndpointSlice](x: Self) {
      
      inline def setAddressType(value: Input[String]): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      inline def setApiVersion(value: Input[discoveryDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setEndpoints(value: Input[js.Array[Input[Endpoint]]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: Input[Endpoint]*): Self = StObject.set(x, "endpoints", js.Array(value*))
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPorts(value: Input[js.Array[Input[EndpointPort]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      inline def setPortsVarargs(value: Input[EndpointPort]*): Self = StObject.set(x, "ports", js.Array(value*))
    }
  }
}
