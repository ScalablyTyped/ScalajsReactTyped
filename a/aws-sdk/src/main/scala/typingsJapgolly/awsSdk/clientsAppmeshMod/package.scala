package typingsJapgolly.awsSdk.clientsAppmeshMod

import typingsJapgolly.awsSdk.awsSdkStrings.`connection-error`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type Arn = java.lang.String

type AwsCloudMapInstanceAttributeKey = java.lang.String

type AwsCloudMapInstanceAttributeValue = java.lang.String

type AwsCloudMapInstanceAttributes = js.Array[AwsCloudMapInstanceAttribute]

type AwsCloudMapName = java.lang.String

type Backends = js.Array[Backend]

type Boolean = scala.Boolean

type CertificateAuthorityArns = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DefaultGatewayRouteRewrite = _DefaultGatewayRouteRewrite | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOADBALANCER
  - typingsJapgolly.awsSdk.awsSdkStrings.ENDPOINTS
  - java.lang.String
*/
type DnsResponseType = _DnsResponseType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.s_
  - typingsJapgolly.awsSdk.awsSdkStrings.ms_
  - java.lang.String
*/
type DurationUnit = _DurationUnit | java.lang.String

type DurationValue = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.DROP_ALL
  - java.lang.String
*/
type EgressFilterType = _EgressFilterType | java.lang.String

type ExactHostName = java.lang.String

type FilePath = java.lang.String

type GatewayRouteList = js.Array[GatewayRouteRef]

type GatewayRoutePriority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type GatewayRouteStatusCode = _GatewayRouteStatusCode | java.lang.String

type GrpcGatewayRouteMetadataList = js.Array[GrpcGatewayRouteMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
  - typingsJapgolly.awsSdk.awsSdkStrings.`deadline-exceeded`
  - typingsJapgolly.awsSdk.awsSdkStrings.internal_
  - typingsJapgolly.awsSdk.awsSdkStrings.`resource-exhausted`
  - typingsJapgolly.awsSdk.awsSdkStrings.unavailable__
  - java.lang.String
*/
type GrpcRetryPolicyEvent = _GrpcRetryPolicyEvent | java.lang.String

type GrpcRetryPolicyEvents = js.Array[GrpcRetryPolicyEvent]

type GrpcRouteMetadataList = js.Array[GrpcRouteMetadata]

type HeaderMatch = java.lang.String

type HeaderName = java.lang.String

type HealthCheckIntervalMillis = Double

type HealthCheckThreshold = Double

type HealthCheckTimeoutMillis = Double

type Hostname = java.lang.String

type HttpGatewayRouteHeaders = js.Array[HttpGatewayRouteHeader]

type HttpGatewayRoutePrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GET
  - typingsJapgolly.awsSdk.awsSdkStrings.HEAD
  - typingsJapgolly.awsSdk.awsSdkStrings.POST
  - typingsJapgolly.awsSdk.awsSdkStrings.PUT
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECT
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.TRACE
  - typingsJapgolly.awsSdk.awsSdkStrings.PATCH
  - java.lang.String
*/
type HttpMethod = _HttpMethod | java.lang.String

type HttpPathExact = java.lang.String

type HttpPathRegex = java.lang.String

type HttpQueryParameters = js.Array[HttpQueryParameter]

type HttpRetryPolicyEvent = java.lang.String

type HttpRetryPolicyEvents = js.Array[HttpRetryPolicyEvent]

type HttpRouteHeaders = js.Array[HttpRouteHeader]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.http_
  - typingsJapgolly.awsSdk.awsSdkStrings.https_
  - java.lang.String
*/
type HttpScheme = _HttpScheme | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IPv6_PREFERRED
  - typingsJapgolly.awsSdk.awsSdkStrings.IPv4_PREFERRED
  - typingsJapgolly.awsSdk.awsSdkStrings.IPv4_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.IPv6_ONLY
  - java.lang.String
*/
type IpPreference = _IpPreference | java.lang.String

type JsonFormat = js.Array[JsonFormatRef]

type JsonKey = java.lang.String

type JsonValue = java.lang.String

type ListGatewayRoutesLimit = Double

type ListMeshesLimit = Double

type ListRoutesLimit = Double

type ListVirtualGatewaysLimit = Double

type ListVirtualNodesLimit = Double

type ListVirtualRoutersLimit = Double

type ListVirtualServicesLimit = Double

type ListenerPort = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRICT
  - typingsJapgolly.awsSdk.awsSdkStrings.PERMISSIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ListenerTlsMode = _ListenerTlsMode | java.lang.String

type Listeners = js.Array[Listener]

type Long = Double

type MaxConnections = Double

type MaxPendingRequests = Double

type MaxRequests = Double

type MaxRetries = Double

type MeshList = js.Array[MeshRef]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type MeshStatusCode = _MeshStatusCode | java.lang.String

type MethodName = java.lang.String

type OutlierDetectionMaxEjectionPercent = Double

type OutlierDetectionMaxServerErrors = Double

type PercentInt = Double

type PortNumber = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.http_
  - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
  - typingsJapgolly.awsSdk.awsSdkStrings.http2
  - typingsJapgolly.awsSdk.awsSdkStrings.grpc
  - java.lang.String
*/
type PortProtocol = _PortProtocol | java.lang.String

type PortSet = js.Array[PortNumber]

type QueryParameterName = java.lang.String

type ResourceName = java.lang.String

type RouteList = js.Array[RouteRef]

type RoutePriority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type RouteStatusCode = _RouteStatusCode | java.lang.String

type SdsSecretName = java.lang.String

type ServiceName = java.lang.String

type String = java.lang.String

type SubjectAlternativeName = java.lang.String

type SubjectAlternativeNameList = js.Array[SubjectAlternativeName]

type SuffixHostname = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[TagRef]

type TagValue = java.lang.String

type TagsLimit = Double

type TcpRetryPolicyEvent = `connection-error` | java.lang.String

type TcpRetryPolicyEvents = js.Array[TcpRetryPolicyEvent]

type TextFormat = java.lang.String

type Timestamp = js.Date

type VirtualGatewayCertificateAuthorityArns = js.Array[Arn]

type VirtualGatewayHealthCheckIntervalMillis = Double

type VirtualGatewayHealthCheckThreshold = Double

type VirtualGatewayHealthCheckTimeoutMillis = Double

type VirtualGatewayList = js.Array[VirtualGatewayRef]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRICT
  - typingsJapgolly.awsSdk.awsSdkStrings.PERMISSIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type VirtualGatewayListenerTlsMode = _VirtualGatewayListenerTlsMode | java.lang.String

type VirtualGatewayListeners = js.Array[VirtualGatewayListener]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.http_
  - typingsJapgolly.awsSdk.awsSdkStrings.http2
  - typingsJapgolly.awsSdk.awsSdkStrings.grpc
  - java.lang.String
*/
type VirtualGatewayPortProtocol = _VirtualGatewayPortProtocol | java.lang.String

type VirtualGatewaySdsSecretName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VirtualGatewayStatusCode = _VirtualGatewayStatusCode | java.lang.String

type VirtualNodeList = js.Array[VirtualNodeRef]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VirtualNodeStatusCode = _VirtualNodeStatusCode | java.lang.String

type VirtualRouterList = js.Array[VirtualRouterRef]

type VirtualRouterListeners = js.Array[VirtualRouterListener]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VirtualRouterStatusCode = _VirtualRouterStatusCode | java.lang.String

type VirtualServiceList = js.Array[VirtualServiceRef]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VirtualServiceStatusCode = _VirtualServiceStatusCode | java.lang.String

type WeightedTargets = js.Array[WeightedTarget]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-01-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
