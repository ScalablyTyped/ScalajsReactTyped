package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendService extends StObject {
  
  /**
    * Lifetime of cookies in seconds. Only applicable if the loadBalancingScheme is EXTERNAL, INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, the protocol is HTTP or HTTPS, and the
    * sessionAffinity is GENERATED_COOKIE, or HTTP_COOKIE. If set to 0, the cookie is non-persistent and lasts only until the end of the browser session (or equivalent). The maximum
    * allowed value is one day ( 86,400). Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to
    * true.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.undefined
  
  /** The list of backends that serve this BackendService. */
  var backends: js.UndefOr[js.Array[Backend]] = js.undefined
  
  /** Cloud CDN configuration for this BackendService. Only available for external HTTP(S) Load Balancing. */
  var cdnPolicy: js.UndefOr[BackendServiceCdnPolicy] = js.undefined
  
  var circuitBreakers: js.UndefOr[CircuitBreakers] = js.undefined
  
  var connectionDraining: js.UndefOr[ConnectionDraining] = js.undefined
  
  /**
    * Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP headers, cookies or other properties. This load balancing policy is applicable only
    * for HTTP connections. The affinity to a particular destination host will be lost when one or more hosts are added/removed from the destination service. This field specifies
    * parameters that control consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or RING_HASH. This field is applicable to either: - A regional
    * backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme
    * set to INTERNAL_SELF_MANAGED. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var consistentHash: js.UndefOr[ConsistentHashLoadBalancerSettings] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** Headers that the HTTP/S load balancer should add to proxied requests. */
  var customRequestHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Headers that the HTTP/S load balancer should add to proxied responses. */
  var customResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** If true, enables Cloud CDN for the backend service. Only applicable if the loadBalancingScheme is EXTERNAL and the protocol is HTTP or HTTPS. */
  var enableCDN: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. Requires at least one backend instance group to be defined as a backup (failover)
    * backend.
    */
  var failoverPolicy: js.UndefOr[BackendServiceFailoverPolicy] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a BackendService. An
    * up-to-date fingerprint must be provided in order to update the BackendService, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a
    * get() request to retrieve a BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The list of URLs to the healthChecks, httpHealthChecks (legacy), or httpsHealthChecks (legacy) resource for health checking this backend service. Not all backend services support
    * legacy health checks. See Load balancer guide. Currently, at most one health check can be specified for each backend service. Backend services with instance group or zonal NEG
    * backends must have a health check. Backend services with internet or serverless NEG backends must not have a health check.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The configurations for Identity-Aware Proxy on this resource. Not available for Internal TCP/UDP Load Balancing and Network Load Balancing. */
  var iap: js.UndefOr[BackendServiceIAP] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of resource. Always compute#backendService for backend services. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the load balancer type. Choose EXTERNAL for external HTTP(S), SSL Proxy, TCP Proxy and Network Load Balancing. Choose INTERNAL for Internal TCP/UDP Load Balancing. Choose
    * INTERNAL_MANAGED for Internal HTTP(S) Load Balancing. INTERNAL_SELF_MANAGED for Traffic Director. A backend service created for one type of load balancer cannot be used with
    * another. For more information, refer to Choosing a load balancer.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.undefined
  
  /**
    * The load balancing algorithm used within the scope of the locality. The possible values are: - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in
    * round robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests. - RING_HASH:
    * The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects
    * 1/N of the requests. - RANDOM: The load balancer selects a random healthy host. - ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e.,
    * connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer. - MAGLEV: used as a drop
    * in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about
    * Maglev, see https://ai.google/research/pubs/pub44824 This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and
    * load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. If sessionAffinity is not NONE, and this field
    * is not set to MAGLEV or RING_HASH, session affinity settings will not take effect. Only the default ROUND_ROBIN policy is supported when the backend service is referenced by a URL
    * map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var localityLbPolicy: js.UndefOr[String] = js.undefined
  
  /** This field denotes the logging options for the load balancer traffic served by this backend service. If logging is enabled, logs will be exported to Stackdriver. */
  var logConfig: js.UndefOr[BackendServiceLogConfig] = js.undefined
  
  /**
    * Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the beginning of the stream until the response has been completely processed,
    * including all retries. A stream that does not complete in this duration is closed. If not specified, there will be no timeout limit, i.e. the maximum duration is infinite. This
    * value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service. This field is only allowed when the loadBalancingScheme of the backend
    * service is INTERNAL_SELF_MANAGED.
    */
  var maxStreamDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The URL of the network to which this backend service belongs. This field can only be specified when the load balancing scheme is set to INTERNAL. */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service. If not set, this feature is considered disabled. This field is applicable
    * to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with
    * the load_balancing_scheme set to INTERNAL_SELF_MANAGED. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has
    * validateForProxyless field set to true.
    */
  var outlierDetection: js.UndefOr[OutlierDetection] = js.undefined
  
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is 80. Backend services for Internal TCP/UDP Load Balancing and Network Load Balancing
    * require you omit port.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * A named port on a backend instance group representing the port for communication to the backend VMs in that group. Required when the loadBalancingScheme is EXTERNAL (except Network
    * Load Balancing), INTERNAL_MANAGED, or INTERNAL_SELF_MANAGED and the backends are instance groups. The named port must be defined on each backend instance group. This parameter has
    * no meaning if the backends are NEGs. Backend services for Internal TCP/UDP Load Balancing and Network Load Balancing require you omit port_name.
    */
  var portName: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol this BackendService uses to communicate with backends. Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic
    * Director configuration. Refer to the documentation for the load balancer or for Traffic Director for more information. Must be set to GRPC when the backend service is referenced by
    * a URL map that is bound to target gRPC proxy.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional backend service resides. This field is not applicable to global backend services. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The resource URL for the security policy associated with this backend service. */
  var securityPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * This field specifies the security policy that applies to this backend service. This field is applicable to either: - A regional backend service with the service_protocol set to
    * HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    */
  var securitySettings: js.UndefOr[SecuritySettings] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Type of session affinity to use. The default is NONE. When the loadBalancingScheme is EXTERNAL: * For Network Load Balancing, the possible values are NONE, CLIENT_IP,
    * CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO. * For all other load balancers that use loadBalancingScheme=EXTERNAL, the possible values are NONE, CLIENT_IP, or GENERATED_COOKIE. * You
    * can use GENERATED_COOKIE if the protocol is HTTP, HTTP2, or HTTPS. When the loadBalancingScheme is INTERNAL, possible values are NONE, CLIENT_IP, CLIENT_IP_PROTO, or
    * CLIENT_IP_PORT_PROTO. When the loadBalancingScheme is INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, possible values are NONE, CLIENT_IP, GENERATED_COOKIE, HEADER_FIELD, or
    * HTTP_COOKIE. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var sessionAffinity: js.UndefOr[String] = js.undefined
  
  /** Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. Instead, use maxStreamDuration. */
  var timeoutSec: js.UndefOr[Double] = js.undefined
}
object BackendService {
  
  inline def apply(): BackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendService]
  }
  
  extension [Self <: BackendService](x: Self) {
    
    inline def setAffinityCookieTtlSec(value: Double): Self = StObject.set(x, "affinityCookieTtlSec", value.asInstanceOf[js.Any])
    
    inline def setAffinityCookieTtlSecUndefined: Self = StObject.set(x, "affinityCookieTtlSec", js.undefined)
    
    inline def setBackends(value: js.Array[Backend]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setBackendsVarargs(value: Backend*): Self = StObject.set(x, "backends", js.Array(value*))
    
    inline def setCdnPolicy(value: BackendServiceCdnPolicy): Self = StObject.set(x, "cdnPolicy", value.asInstanceOf[js.Any])
    
    inline def setCdnPolicyUndefined: Self = StObject.set(x, "cdnPolicy", js.undefined)
    
    inline def setCircuitBreakers(value: CircuitBreakers): Self = StObject.set(x, "circuitBreakers", value.asInstanceOf[js.Any])
    
    inline def setCircuitBreakersUndefined: Self = StObject.set(x, "circuitBreakers", js.undefined)
    
    inline def setConnectionDraining(value: ConnectionDraining): Self = StObject.set(x, "connectionDraining", value.asInstanceOf[js.Any])
    
    inline def setConnectionDrainingUndefined: Self = StObject.set(x, "connectionDraining", js.undefined)
    
    inline def setConsistentHash(value: ConsistentHashLoadBalancerSettings): Self = StObject.set(x, "consistentHash", value.asInstanceOf[js.Any])
    
    inline def setConsistentHashUndefined: Self = StObject.set(x, "consistentHash", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
    
    inline def setCustomRequestHeadersVarargs(value: String*): Self = StObject.set(x, "customRequestHeaders", js.Array(value*))
    
    inline def setCustomResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "customResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseHeadersUndefined: Self = StObject.set(x, "customResponseHeaders", js.undefined)
    
    inline def setCustomResponseHeadersVarargs(value: String*): Self = StObject.set(x, "customResponseHeaders", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableCDN(value: Boolean): Self = StObject.set(x, "enableCDN", value.asInstanceOf[js.Any])
    
    inline def setEnableCDNUndefined: Self = StObject.set(x, "enableCDN", js.undefined)
    
    inline def setFailoverPolicy(value: BackendServiceFailoverPolicy): Self = StObject.set(x, "failoverPolicy", value.asInstanceOf[js.Any])
    
    inline def setFailoverPolicyUndefined: Self = StObject.set(x, "failoverPolicy", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setHealthChecks(value: js.Array[String]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    inline def setHealthChecksVarargs(value: String*): Self = StObject.set(x, "healthChecks", js.Array(value*))
    
    inline def setIap(value: BackendServiceIAP): Self = StObject.set(x, "iap", value.asInstanceOf[js.Any])
    
    inline def setIapUndefined: Self = StObject.set(x, "iap", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoadBalancingScheme(value: String): Self = StObject.set(x, "loadBalancingScheme", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingSchemeUndefined: Self = StObject.set(x, "loadBalancingScheme", js.undefined)
    
    inline def setLocalityLbPolicy(value: String): Self = StObject.set(x, "localityLbPolicy", value.asInstanceOf[js.Any])
    
    inline def setLocalityLbPolicyUndefined: Self = StObject.set(x, "localityLbPolicy", js.undefined)
    
    inline def setLogConfig(value: BackendServiceLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setMaxStreamDuration(value: Duration): Self = StObject.set(x, "maxStreamDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxStreamDurationUndefined: Self = StObject.set(x, "maxStreamDuration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOutlierDetection(value: OutlierDetection): Self = StObject.set(x, "outlierDetection", value.asInstanceOf[js.Any])
    
    inline def setOutlierDetectionUndefined: Self = StObject.set(x, "outlierDetection", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    inline def setSecuritySettings(value: SecuritySettings): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    inline def setSecuritySettingsUndefined: Self = StObject.set(x, "securitySettings", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSessionAffinity(value: String): Self = StObject.set(x, "sessionAffinity", value.asInstanceOf[js.Any])
    
    inline def setSessionAffinityUndefined: Self = StObject.set(x, "sessionAffinity", js.undefined)
    
    inline def setTimeoutSec(value: Double): Self = StObject.set(x, "timeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecUndefined: Self = StObject.set(x, "timeoutSec", js.undefined)
  }
}
