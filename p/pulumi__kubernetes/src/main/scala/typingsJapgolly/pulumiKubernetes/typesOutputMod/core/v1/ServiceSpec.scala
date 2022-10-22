package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpec describes the attributes that a user creates on a service.
  */
trait ServiceSpec extends StObject {
  
  /**
    * allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.  Default is "true". It may be set to "false" if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.
    */
  var allocateLoadBalancerNodePorts: Boolean
  
  /**
    * clusterIP is the IP address of the service and is usually assigned randomly. If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are "None", empty string (""), or a valid IP address. Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var clusterIP: String
  
  /**
    * ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.  If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are "None", empty string (""), or a valid IP address.  Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.
    *
    * This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var clusterIPs: js.Array[String]
  
  /**
    * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
    */
  var externalIPs: js.Array[String]
  
  /**
    * externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires `type` to be "ExternalName".
    */
  var externalName: String
  
  /**
    * externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service's "externally-facing" addresses (NodePorts, ExternalIPs, and LoadBalancer IPs). If set to "Local", the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, "Cluster", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get "Cluster" semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.
    */
  var externalTrafficPolicy: String
  
  /**
    * healthCheckNodePort specifies the healthcheck nodePort for the service. This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type). This field cannot be updated once set.
    */
  var healthCheckNodePort: Double
  
  /**
    * InternalTrafficPolicy describes how nodes distribute service traffic they receive on the ClusterIP. If set to "Local", the proxy will assume that pods only want to talk to endpoints of the service on the same node as the pod, dropping the traffic if there are no local endpoints. The default value, "Cluster", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features).
    */
  var internalTrafficPolicy: String
  
  /**
    * IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are "IPv4" and "IPv6".  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to "headless" services. This field will be wiped when updating a Service to type ExternalName.
    *
    * This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.
    */
  var ipFamilies: js.Array[String]
  
  /**
    * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
    */
  var ipFamily: String
  
  /**
    * IPFamilyPolicy represents the dual-stack-ness requested or required by this Service. If there is no value provided, then this field will be set to SingleStack. Services can be "SingleStack" (a single IP family), "PreferDualStack" (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or "RequireDualStack" (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.
    */
  var ipFamilyPolicy: String
  
  /**
    * loadBalancerClass is the class of the load balancer implementation this Service belongs to. If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. "internal-vip" or "example.com/internal-vip". Unprefixed names are reserved for end-users. This field can only be set when the Service type is 'LoadBalancer'. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type 'LoadBalancer'. Once set, it can not be changed. This field will be wiped when a service is updated to a non 'LoadBalancer' type.
    */
  var loadBalancerClass: String
  
  /**
    * Only applies to Service Type: LoadBalancer. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature. Deprecated: This field was under-specified and its meaning varies across implementations, and it cannot support dual-stack. As of Kubernetes v1.24, users are encouraged to use implementation-specific annotations when available. This field may be removed in a future API version.
    */
  var loadBalancerIP: String
  
  /**
    * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/
    */
  var loadBalancerSourceRanges: js.Array[String]
  
  /**
    * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var ports: js.Array[ServicePort]
  
  /**
    * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet's Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered "ready" even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
    */
  var publishNotReadyAddresses: Boolean
  
  /**
    * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
    */
  var selector: StringDictionary[String]
  
  /**
    * Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var sessionAffinity: String
  
  /**
    * sessionAffinityConfig contains the configurations of session affinity.
    */
  var sessionAffinityConfig: SessionAffinityConfig
  
  /**
    * topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
    */
  var topologyKeys: js.Array[String]
  
  /**
    * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. "ExternalName" aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
    */
  var `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify enums.core.v1.ServiceSpecType */ Any)
}
object ServiceSpec {
  
  inline def apply(
    allocateLoadBalancerNodePorts: Boolean,
    clusterIP: String,
    clusterIPs: js.Array[String],
    externalIPs: js.Array[String],
    externalName: String,
    externalTrafficPolicy: String,
    healthCheckNodePort: Double,
    internalTrafficPolicy: String,
    ipFamilies: js.Array[String],
    ipFamily: String,
    ipFamilyPolicy: String,
    loadBalancerClass: String,
    loadBalancerIP: String,
    loadBalancerSourceRanges: js.Array[String],
    ports: js.Array[ServicePort],
    publishNotReadyAddresses: Boolean,
    selector: StringDictionary[String],
    sessionAffinity: String,
    sessionAffinityConfig: SessionAffinityConfig,
    topologyKeys: js.Array[String],
    `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify enums.core.v1.ServiceSpecType */ Any)
  ): ServiceSpec = {
    val __obj = js.Dynamic.literal(allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts.asInstanceOf[js.Any], clusterIP = clusterIP.asInstanceOf[js.Any], clusterIPs = clusterIPs.asInstanceOf[js.Any], externalIPs = externalIPs.asInstanceOf[js.Any], externalName = externalName.asInstanceOf[js.Any], externalTrafficPolicy = externalTrafficPolicy.asInstanceOf[js.Any], healthCheckNodePort = healthCheckNodePort.asInstanceOf[js.Any], internalTrafficPolicy = internalTrafficPolicy.asInstanceOf[js.Any], ipFamilies = ipFamilies.asInstanceOf[js.Any], ipFamily = ipFamily.asInstanceOf[js.Any], ipFamilyPolicy = ipFamilyPolicy.asInstanceOf[js.Any], loadBalancerClass = loadBalancerClass.asInstanceOf[js.Any], loadBalancerIP = loadBalancerIP.asInstanceOf[js.Any], loadBalancerSourceRanges = loadBalancerSourceRanges.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], publishNotReadyAddresses = publishNotReadyAddresses.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], sessionAffinity = sessionAffinity.asInstanceOf[js.Any], sessionAffinityConfig = sessionAffinityConfig.asInstanceOf[js.Any], topologyKeys = topologyKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpec]
  }
  
  extension [Self <: ServiceSpec](x: Self) {
    
    inline def setAllocateLoadBalancerNodePorts(value: Boolean): Self = StObject.set(x, "allocateLoadBalancerNodePorts", value.asInstanceOf[js.Any])
    
    inline def setClusterIP(value: String): Self = StObject.set(x, "clusterIP", value.asInstanceOf[js.Any])
    
    inline def setClusterIPs(value: js.Array[String]): Self = StObject.set(x, "clusterIPs", value.asInstanceOf[js.Any])
    
    inline def setClusterIPsVarargs(value: String*): Self = StObject.set(x, "clusterIPs", js.Array(value*))
    
    inline def setExternalIPs(value: js.Array[String]): Self = StObject.set(x, "externalIPs", value.asInstanceOf[js.Any])
    
    inline def setExternalIPsVarargs(value: String*): Self = StObject.set(x, "externalIPs", js.Array(value*))
    
    inline def setExternalName(value: String): Self = StObject.set(x, "externalName", value.asInstanceOf[js.Any])
    
    inline def setExternalTrafficPolicy(value: String): Self = StObject.set(x, "externalTrafficPolicy", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckNodePort(value: Double): Self = StObject.set(x, "healthCheckNodePort", value.asInstanceOf[js.Any])
    
    inline def setInternalTrafficPolicy(value: String): Self = StObject.set(x, "internalTrafficPolicy", value.asInstanceOf[js.Any])
    
    inline def setIpFamilies(value: js.Array[String]): Self = StObject.set(x, "ipFamilies", value.asInstanceOf[js.Any])
    
    inline def setIpFamiliesVarargs(value: String*): Self = StObject.set(x, "ipFamilies", js.Array(value*))
    
    inline def setIpFamily(value: String): Self = StObject.set(x, "ipFamily", value.asInstanceOf[js.Any])
    
    inline def setIpFamilyPolicy(value: String): Self = StObject.set(x, "ipFamilyPolicy", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerClass(value: String): Self = StObject.set(x, "loadBalancerClass", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerIP(value: String): Self = StObject.set(x, "loadBalancerIP", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerSourceRanges(value: js.Array[String]): Self = StObject.set(x, "loadBalancerSourceRanges", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerSourceRangesVarargs(value: String*): Self = StObject.set(x, "loadBalancerSourceRanges", js.Array(value*))
    
    inline def setPorts(value: js.Array[ServicePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: ServicePort*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setPublishNotReadyAddresses(value: Boolean): Self = StObject.set(x, "publishNotReadyAddresses", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: StringDictionary[String]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSessionAffinity(value: String): Self = StObject.set(x, "sessionAffinity", value.asInstanceOf[js.Any])
    
    inline def setSessionAffinityConfig(value: SessionAffinityConfig): Self = StObject.set(x, "sessionAffinityConfig", value.asInstanceOf[js.Any])
    
    inline def setTopologyKeys(value: js.Array[String]): Self = StObject.set(x, "topologyKeys", value.asInstanceOf[js.Any])
    
    inline def setTopologyKeysVarargs(value: String*): Self = StObject.set(x, "topologyKeys", js.Array(value*))
    
    inline def setType(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify enums.core.v1.ServiceSpecType */ Any)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
