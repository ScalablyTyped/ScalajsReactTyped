package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appmeshMod {
  type Arn = java.lang.String
  type AwsCloudMapInstanceAttributeKey = java.lang.String
  type AwsCloudMapInstanceAttributeValue = java.lang.String
  type AwsCloudMapInstanceAttributes = js.Array[typingsJapgolly.awsSdk.appmeshMod.AwsCloudMapInstanceAttribute]
  type AwsCloudMapName = java.lang.String
  type Backends = js.Array[typingsJapgolly.awsSdk.appmeshMod.Backend]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.appmeshMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ms_
    - typingsJapgolly.awsSdk.awsSdkStrings.s_
    - java.lang.String
  */
  type DurationUnit = typingsJapgolly.awsSdk.appmeshMod._DurationUnit | java.lang.String
  type DurationValue = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.DROP_ALL
    - java.lang.String
  */
  type EgressFilterType = typingsJapgolly.awsSdk.appmeshMod._EgressFilterType | java.lang.String
  type FilePath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.`deadline-exceeded`
    - typingsJapgolly.awsSdk.awsSdkStrings.internal
    - typingsJapgolly.awsSdk.awsSdkStrings.`resource-exhausted`
    - typingsJapgolly.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type GrpcRetryPolicyEvent = typingsJapgolly.awsSdk.appmeshMod._GrpcRetryPolicyEvent | java.lang.String
  type GrpcRetryPolicyEvents = js.Array[typingsJapgolly.awsSdk.appmeshMod.GrpcRetryPolicyEvent]
  type GrpcRouteMetadataList = js.Array[typingsJapgolly.awsSdk.appmeshMod.GrpcRouteMetadata]
  type HeaderMatch = java.lang.String
  type HeaderName = java.lang.String
  type HealthCheckIntervalMillis = scala.Double
  type HealthCheckThreshold = scala.Double
  type HealthCheckTimeoutMillis = scala.Double
  type Hostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECT
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - typingsJapgolly.awsSdk.awsSdkStrings.GET
    - typingsJapgolly.awsSdk.awsSdkStrings.HEAD
    - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONS
    - typingsJapgolly.awsSdk.awsSdkStrings.PATCH
    - typingsJapgolly.awsSdk.awsSdkStrings.POST
    - typingsJapgolly.awsSdk.awsSdkStrings.PUT
    - typingsJapgolly.awsSdk.awsSdkStrings.TRACE
    - java.lang.String
  */
  type HttpMethod = typingsJapgolly.awsSdk.appmeshMod._HttpMethod | java.lang.String
  type HttpRetryPolicyEvent = java.lang.String
  type HttpRetryPolicyEvents = js.Array[typingsJapgolly.awsSdk.appmeshMod.HttpRetryPolicyEvent]
  type HttpRouteHeaders = js.Array[typingsJapgolly.awsSdk.appmeshMod.HttpRouteHeader]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.http_
    - typingsJapgolly.awsSdk.awsSdkStrings.https_
    - java.lang.String
  */
  type HttpScheme = typingsJapgolly.awsSdk.appmeshMod._HttpScheme | java.lang.String
  type ListMeshesLimit = scala.Double
  type ListRoutesLimit = scala.Double
  type ListVirtualNodesLimit = scala.Double
  type ListVirtualRoutersLimit = scala.Double
  type ListVirtualServicesLimit = scala.Double
  type Listeners = js.Array[typingsJapgolly.awsSdk.appmeshMod.Listener]
  type Long = scala.Double
  type MaxRetries = scala.Double
  type MeshList = js.Array[typingsJapgolly.awsSdk.appmeshMod.MeshRef]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type MeshStatusCode = typingsJapgolly.awsSdk.appmeshMod._MeshStatusCode | java.lang.String
  type MethodName = java.lang.String
  type PercentInt = scala.Double
  type PortNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.grpc
    - typingsJapgolly.awsSdk.awsSdkStrings.http_
    - typingsJapgolly.awsSdk.awsSdkStrings.http2
    - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
    - java.lang.String
  */
  type PortProtocol = typingsJapgolly.awsSdk.appmeshMod._PortProtocol | java.lang.String
  type ResourceName = java.lang.String
  type RouteList = js.Array[typingsJapgolly.awsSdk.appmeshMod.RouteRef]
  type RoutePriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type RouteStatusCode = typingsJapgolly.awsSdk.appmeshMod._RouteStatusCode | java.lang.String
  type ServiceName = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.appmeshMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.appmeshMod.TagRef]
  type TagValue = java.lang.String
  type TagsLimit = scala.Double
  type TcpRetryPolicyEvent = typingsJapgolly.awsSdk.awsSdkStrings.`connection-error` | java.lang.String
  type TcpRetryPolicyEvents = js.Array[typingsJapgolly.awsSdk.appmeshMod.TcpRetryPolicyEvent]
  type Timestamp = js.Date
  type VirtualNodeList = js.Array[typingsJapgolly.awsSdk.appmeshMod.VirtualNodeRef]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualNodeStatusCode = typingsJapgolly.awsSdk.appmeshMod._VirtualNodeStatusCode | java.lang.String
  type VirtualRouterList = js.Array[typingsJapgolly.awsSdk.appmeshMod.VirtualRouterRef]
  type VirtualRouterListeners = js.Array[typingsJapgolly.awsSdk.appmeshMod.VirtualRouterListener]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualRouterStatusCode = typingsJapgolly.awsSdk.appmeshMod._VirtualRouterStatusCode | java.lang.String
  type VirtualServiceList = js.Array[typingsJapgolly.awsSdk.appmeshMod.VirtualServiceRef]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualServiceStatusCode = typingsJapgolly.awsSdk.appmeshMod._VirtualServiceStatusCode | java.lang.String
  type WeightedTargets = js.Array[typingsJapgolly.awsSdk.appmeshMod.WeightedTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-01-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.appmeshMod._apiVersion | java.lang.String
}
