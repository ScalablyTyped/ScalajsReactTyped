package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object servicequotasMod {
  type AwsRegion = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.servicequotasMod.ClientApiVersions
  type CustomerServiceEngagementId = java.lang.String
  type DateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.servicequotasMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type GlobalQuota = scala.Boolean
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensionsMapDefinition = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicequotasMod.MetricDimensionValue]
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MICROSECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.MILLISECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.MINUTE
    - typingsJapgolly.awsSdk.awsSdkStrings.HOUR
    - typingsJapgolly.awsSdk.awsSdkStrings.DAY
    - typingsJapgolly.awsSdk.awsSdkStrings.WEEK
    - java.lang.String
  */
  type PeriodUnit = typingsJapgolly.awsSdk.servicequotasMod._PeriodUnit | java.lang.String
  type PeriodValue = scala.Double
  type QuotaAdjustable = scala.Boolean
  type QuotaArn = java.lang.String
  type QuotaCode = java.lang.String
  type QuotaMetricName = java.lang.String
  type QuotaMetricNamespace = java.lang.String
  type QuotaName = java.lang.String
  type QuotaUnit = java.lang.String
  type QuotaValue = scala.Double
  type RequestId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.CASE_OPENED
    - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
    - typingsJapgolly.awsSdk.awsSdkStrings.DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.CASE_CLOSED
    - java.lang.String
  */
  type RequestStatus = typingsJapgolly.awsSdk.servicequotasMod._RequestStatus | java.lang.String
  type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[typingsJapgolly.awsSdk.servicequotasMod.RequestedServiceQuotaChange]
  type Requester = java.lang.String
  type ServiceCode = java.lang.String
  type ServiceInfoListDefinition = js.Array[typingsJapgolly.awsSdk.servicequotasMod.ServiceInfo]
  type ServiceName = java.lang.String
  type ServiceQuotaIncreaseRequestInTemplateList = js.Array[typingsJapgolly.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplate]
  type ServiceQuotaListDefinition = js.Array[typingsJapgolly.awsSdk.servicequotasMod.ServiceQuota]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ServiceQuotaTemplateAssociationStatus = typingsJapgolly.awsSdk.servicequotasMod._ServiceQuotaTemplateAssociationStatus | java.lang.String
  type Statistic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-06-24`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.servicequotasMod._apiVersion | java.lang.String
}
