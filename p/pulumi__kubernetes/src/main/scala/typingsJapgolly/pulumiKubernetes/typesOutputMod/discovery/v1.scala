package typingsJapgolly.pulumiKubernetes.typesOutputMod.discovery

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReferencePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * Endpoint represents a single logical "backend" implementing a service.
    */
  trait Endpoint extends StObject {
    
    /**
      * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
      */
    var addresses: js.Array[String]
    
    /**
      * conditions contains information about the current status of the endpoint.
      */
    var conditions: EndpointConditions
    
    /**
      * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
      */
    var deprecatedTopology: StringDictionary[String]
    
    /**
      * hints contains information associated with how an endpoint should be consumed.
      */
    var hints: EndpointHints
    
    /**
      * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
      */
    var hostname: String
    
    /**
      * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
      */
    var nodeName: String
    
    /**
      * targetRef is a reference to a Kubernetes object that represents this endpoint.
      */
    var targetRef: ObjectReference
    
    /**
      * zone is the name of the Zone this endpoint exists in.
      */
    var zone: String
  }
  object Endpoint {
    
    inline def apply(
      addresses: js.Array[String],
      conditions: EndpointConditions,
      deprecatedTopology: StringDictionary[String],
      hints: EndpointHints,
      hostname: String,
      nodeName: String,
      targetRef: ObjectReference,
      zone: String
    ): Endpoint = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], deprecatedTopology = deprecatedTopology.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setConditions(value: EndpointConditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedTopology(value: StringDictionary[String]): Self = StObject.set(x, "deprecatedTopology", value.asInstanceOf[js.Any])
      
      inline def setHints(value: EndpointHints): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: ObjectReference): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointConditions represents the current condition of an endpoint.
    */
  trait EndpointConditions extends StObject {
    
    /**
      * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
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
      * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
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
    * EndpointHints provides hints describing how an endpoint should be consumed.
    */
  trait EndpointHints extends StObject {
    
    /**
      * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
      */
    var forZones: js.Array[ForZone]
  }
  object EndpointHints {
    
    inline def apply(forZones: js.Array[ForZone]): EndpointHints = {
      val __obj = js.Dynamic.literal(forZones = forZones.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointHints]
    }
    
    extension [Self <: EndpointHints](x: Self) {
      
      inline def setForZones(value: js.Array[ForZone]): Self = StObject.set(x, "forZones", value.asInstanceOf[js.Any])
      
      inline def setForZonesVarargs(value: ForZone*): Self = StObject.set(x, "forZones", js.Array(value*))
    }
  }
  
  /**
    * EndpointHints provides hints describing how an endpoint should be consumed.
    */
  trait EndpointHintsPatch extends StObject {
    
    /**
      * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
      */
    var forZones: js.Array[ForZonePatch]
  }
  object EndpointHintsPatch {
    
    inline def apply(forZones: js.Array[ForZonePatch]): EndpointHintsPatch = {
      val __obj = js.Dynamic.literal(forZones = forZones.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointHintsPatch]
    }
    
    extension [Self <: EndpointHintsPatch](x: Self) {
      
      inline def setForZones(value: js.Array[ForZonePatch]): Self = StObject.set(x, "forZones", value.asInstanceOf[js.Any])
      
      inline def setForZonesVarargs(value: ForZonePatch*): Self = StObject.set(x, "forZones", js.Array(value*))
    }
  }
  
  /**
    * Endpoint represents a single logical "backend" implementing a service.
    */
  trait EndpointPatch extends StObject {
    
    /**
      * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
      */
    var addresses: js.Array[String]
    
    /**
      * conditions contains information about the current status of the endpoint.
      */
    var conditions: EndpointConditionsPatch
    
    /**
      * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
      */
    var deprecatedTopology: StringDictionary[String]
    
    /**
      * hints contains information associated with how an endpoint should be consumed.
      */
    var hints: EndpointHintsPatch
    
    /**
      * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
      */
    var hostname: String
    
    /**
      * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
      */
    var nodeName: String
    
    /**
      * targetRef is a reference to a Kubernetes object that represents this endpoint.
      */
    var targetRef: ObjectReferencePatch
    
    /**
      * zone is the name of the Zone this endpoint exists in.
      */
    var zone: String
  }
  object EndpointPatch {
    
    inline def apply(
      addresses: js.Array[String],
      conditions: EndpointConditionsPatch,
      deprecatedTopology: StringDictionary[String],
      hints: EndpointHintsPatch,
      hostname: String,
      nodeName: String,
      targetRef: ObjectReferencePatch,
      zone: String
    ): EndpointPatch = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], deprecatedTopology = deprecatedTopology.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointPatch]
    }
    
    extension [Self <: EndpointPatch](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setConditions(value: EndpointConditionsPatch): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedTopology(value: StringDictionary[String]): Self = StObject.set(x, "deprecatedTopology", value.asInstanceOf[js.Any])
      
      inline def setHints(value: EndpointHintsPatch): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: ObjectReferencePatch): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EndpointPort represents a Port used by an EndpointSlice
    */
  trait EndpointPort extends StObject {
    
    /**
      * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
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
      * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
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
    var apiVersion: discoveryDotk8sDotioSlashv1
    
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
      val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any], apiVersion = "discovery.k8s.io/v1", endpoints = endpoints.asInstanceOf[js.Any], kind = "EndpointSlice", metadata = metadata.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointSlice]
    }
    
    extension [Self <: EndpointSlice](x: Self) {
      
      inline def setAddressType(value: String): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      inline def setApiVersion(value: discoveryDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setPorts(value: js.Array[EndpointPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsVarargs(value: EndpointPort*): Self = StObject.set(x, "ports", js.Array(value*))
    }
  }
  
  /**
    * ForZone provides information about which zones should consume this endpoint.
    */
  trait ForZone extends StObject {
    
    /**
      * name represents the name of the zone.
      */
    var name: String
  }
  object ForZone {
    
    inline def apply(name: String): ForZone = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForZone]
    }
    
    extension [Self <: ForZone](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ForZone provides information about which zones should consume this endpoint.
    */
  trait ForZonePatch extends StObject {
    
    /**
      * name represents the name of the zone.
      */
    var name: String
  }
  object ForZonePatch {
    
    inline def apply(name: String): ForZonePatch = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForZonePatch]
    }
    
    extension [Self <: ForZonePatch](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
