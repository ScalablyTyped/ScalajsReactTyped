package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object servicediscoveryMod {
  type Arn = java.lang.String
  type AttrKey = java.lang.String
  type AttrValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicediscoveryMod.AttrValue]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.servicediscoveryMod.ClientApiVersions
  type Code = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type CustomHealthStatus = typingsJapgolly.awsSdk.servicediscoveryMod._CustomHealthStatus | java.lang.String
  type DnsRecordList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.DnsRecord]
  type FailureThreshold = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQ
    - typingsJapgolly.awsSdk.awsSdkStrings.IN
    - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type FilterCondition = typingsJapgolly.awsSdk.servicediscoveryMod._FilterCondition | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.FilterValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
    - typingsJapgolly.awsSdk.awsSdkStrings.TCP
    - java.lang.String
  */
  type HealthCheckType = typingsJapgolly.awsSdk.servicediscoveryMod._HealthCheckType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = typingsJapgolly.awsSdk.servicediscoveryMod._HealthStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type HealthStatusFilter = typingsJapgolly.awsSdk.servicediscoveryMod._HealthStatusFilter | java.lang.String
  type HttpInstanceSummaryList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.HttpInstanceSummary]
  type InstanceHealthStatusMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicediscoveryMod.HealthStatus]
  type InstanceIdList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.ResourceId]
  type InstanceSummaryList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.InstanceSummary]
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NamespaceFilterName = typingsJapgolly.awsSdk.awsSdkStrings.TYPE | java.lang.String
  type NamespaceFilters = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.NamespaceFilter]
  type NamespaceName = java.lang.String
  type NamespaceSummariesList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.NamespaceSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DNS_PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.DNS_PRIVATE
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type NamespaceType = typingsJapgolly.awsSdk.servicediscoveryMod._NamespaceType | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAMESPACE_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_DATE
    - java.lang.String
  */
  type OperationFilterName = typingsJapgolly.awsSdk.servicediscoveryMod._OperationFilterName | java.lang.String
  type OperationFilters = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.OperationFilter]
  type OperationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAIL
    - java.lang.String
  */
  type OperationStatus = typingsJapgolly.awsSdk.servicediscoveryMod._OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAMESPACE
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
    - java.lang.String
  */
  type OperationTargetType = typingsJapgolly.awsSdk.servicediscoveryMod._OperationTargetType | java.lang.String
  type OperationTargetsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicediscoveryMod.ResourceId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_NAMESPACE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_NAMESPACE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SERVICE
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTER_INSTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE
    - java.lang.String
  */
  type OperationType = typingsJapgolly.awsSdk.servicediscoveryMod._OperationType | java.lang.String
  type RecordTTL = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SRV
    - typingsJapgolly.awsSdk.awsSdkStrings.A
    - typingsJapgolly.awsSdk.awsSdkStrings.AAAA
    - typingsJapgolly.awsSdk.awsSdkStrings.CNAME
    - java.lang.String
  */
  type RecordType = typingsJapgolly.awsSdk.servicediscoveryMod._RecordType | java.lang.String
  type ResourceCount = scala.Double
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MULTIVALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.WEIGHTED
    - java.lang.String
  */
  type RoutingPolicy = typingsJapgolly.awsSdk.servicediscoveryMod._RoutingPolicy | java.lang.String
  type ServiceFilterName = typingsJapgolly.awsSdk.awsSdkStrings.NAMESPACE_ID | java.lang.String
  type ServiceFilters = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.ServiceFilter]
  type ServiceName = java.lang.String
  type ServiceSummariesList = js.Array[typingsJapgolly.awsSdk.servicediscoveryMod.ServiceSummary]
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-03-14`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.servicediscoveryMod._apiVersion | java.lang.String
}
