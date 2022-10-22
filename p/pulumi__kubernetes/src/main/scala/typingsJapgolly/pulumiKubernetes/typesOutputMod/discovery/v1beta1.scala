package typingsJapgolly.pulumiKubernetes.typesOutputMod.discovery

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReferencePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
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
    var addresses: js.Array[String]
    
    /**
      * conditions contains information about the current status of the endpoint.
      */
    var conditions: EndpointConditions
    
    /**
      * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
      */
    var hostname: String
    
    /**
      * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
      */
    var nodeName: String
    
    /**
      * targetRef is a reference to a Kubernetes object that represents this endpoint.
      */
    var targetRef: ObjectReference
    
    /**
      * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
      *   where the endpoint is located. This should match the corresponding
      *   node label.
      * * topology.kubernetes.io/zone: the value indicates the zone where the
      *   endpoint is located. This should match the corresponding node label.
      * * topology.kubernetes.io/region: the value indicates the region where the
      *   endpoint is located. This should match the corresponding node label.
      */
    var topology: StringDictionary[String]
  }
  object Endpoint {
    
    inline def apply(
      addresses: js.Array[String],
      conditions: EndpointConditions,
      hostname: String,
      nodeName: String,
      targetRef: ObjectReference,
      topology: StringDictionary[String]
    ): Endpoint = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setConditions(value: EndpointConditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: ObjectReference): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTopology(value: StringDictionary[String]): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointConditions represents the current condition of an endpoint.
    */
  trait EndpointConditions extends StObject {
    
    /**
      * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
      */
    var ready: Boolean
    
    /**
      * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var serving: Boolean
    
    /**
      * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var terminating: Boolean
  }
  object EndpointConditions {
    
    inline def apply(ready: Boolean, serving: Boolean, terminating: Boolean): EndpointConditions = {
      val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], serving = serving.asInstanceOf[js.Any], terminating = terminating.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConditions]
    }
    
    extension [Self <: EndpointConditions](x: Self) {
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setServing(value: Boolean): Self = StObject.set(x, "serving", value.asInstanceOf[js.Any])
      
      inline def setTerminating(value: Boolean): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointConditions represents the current condition of an endpoint.
    */
  trait EndpointConditionsPatch extends StObject {
    
    /**
      * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
      */
    var ready: Boolean
    
    /**
      * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var serving: Boolean
    
    /**
      * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
      */
    var terminating: Boolean
  }
  object EndpointConditionsPatch {
    
    inline def apply(ready: Boolean, serving: Boolean, terminating: Boolean): EndpointConditionsPatch = {
      val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], serving = serving.asInstanceOf[js.Any], terminating = terminating.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConditionsPatch]
    }
    
    extension [Self <: EndpointConditionsPatch](x: Self) {
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setServing(value: Boolean): Self = StObject.set(x, "serving", value.asInstanceOf[js.Any])
      
      inline def setTerminating(value: Boolean): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Endpoint represents a single logical "backend" implementing a service.
    */
  trait EndpointPatch extends StObject {
    
    /**
      * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
      */
    var addresses: js.Array[String]
    
    /**
      * conditions contains information about the current status of the endpoint.
      */
    var conditions: EndpointConditionsPatch
    
    /**
      * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
      */
    var hostname: String
    
    /**
      * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
      */
    var nodeName: String
    
    /**
      * targetRef is a reference to a Kubernetes object that represents this endpoint.
      */
    var targetRef: ObjectReferencePatch
    
    /**
      * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
      *   where the endpoint is located. This should match the corresponding
      *   node label.
      * * topology.kubernetes.io/zone: the value indicates the zone where the
      *   endpoint is located. This should match the corresponding node label.
      * * topology.kubernetes.io/region: the value indicates the region where the
      *   endpoint is located. This should match the corresponding node label.
      */
    var topology: StringDictionary[String]
  }
  object EndpointPatch {
    
    inline def apply(
      addresses: js.Array[String],
      conditions: EndpointConditionsPatch,
      hostname: String,
      nodeName: String,
      targetRef: ObjectReferencePatch,
      topology: StringDictionary[String]
    ): EndpointPatch = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointPatch]
    }
    
    extension [Self <: EndpointPatch](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setConditions(value: EndpointConditionsPatch): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: ObjectReferencePatch): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTopology(value: StringDictionary[String]): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointPort represents a Port used by an EndpointSlice
    */
  trait EndpointPort extends StObject {
    
    /**
      * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
      */
    var appProtocol: String
    
    /**
      * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
      */
    var name: String
    
    /**
      * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
      */
    var port: Double
    
    /**
      * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
      */
    var protocol: String
  }
  object EndpointPort {
    
    inline def apply(appProtocol: String, name: String, port: Double, protocol: String): EndpointPort = {
      val __obj = js.Dynamic.literal(appProtocol = appProtocol.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointPort]
    }
    
    extension [Self <: EndpointPort](x: Self) {
      
      inline def setAppProtocol(value: String): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointPort represents a Port used by an EndpointSlice
    */
  trait EndpointPortPatch extends StObject {
    
    /**
      * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
      */
    var appProtocol: String
    
    /**
      * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
      */
    var name: String
    
    /**
      * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
      */
    var port: Double
    
    /**
      * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
      */
    var protocol: String
  }
  object EndpointPortPatch {
    
    inline def apply(appProtocol: String, name: String, port: Double, protocol: String): EndpointPortPatch = {
      val __obj = js.Dynamic.literal(appProtocol = appProtocol.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointPortPatch]
    }
    
    extension [Self <: EndpointPortPatch](x: Self) {
      
      inline def setAppProtocol(value: String): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
    */
  trait EndpointSlice extends StObject {
    
    /**
      * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
      */
    var addressType: String
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: discoveryDotk8sDotioSlashv1beta1
    
    /**
      * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
      */
    var endpoints: js.Array[Endpoint]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice
    
    /**
      * Standard object's metadata.
      */
    var metadata: ObjectMeta
    
    /**
      * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
      */
    var ports: js.Array[EndpointPort]
  }
  object EndpointSlice {
    
    inline def apply(
      addressType: String,
      endpoints: js.Array[Endpoint],
      metadata: ObjectMeta,
      ports: js.Array[EndpointPort]
    ): EndpointSlice = {
      val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any], apiVersion = "discovery.k8s.io/v1beta1", endpoints = endpoints.asInstanceOf[js.Any], kind = "EndpointSlice", metadata = metadata.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointSlice]
    }
    
    extension [Self <: EndpointSlice](x: Self) {
      
      inline def setAddressType(value: String): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      inline def setApiVersion(value: discoveryDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setPorts(value: js.Array[EndpointPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsVarargs(value: EndpointPort*): Self = StObject.set(x, "ports", js.Array(value*))
    }
  }
}
