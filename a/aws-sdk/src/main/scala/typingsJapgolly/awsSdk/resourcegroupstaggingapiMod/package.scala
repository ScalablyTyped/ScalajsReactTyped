package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcegroupstaggingapiMod {
  type AmazonResourceType = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.ClientApiVersions
  type ComplianceStatus = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceException
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidParameterException
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.resourcegroupstaggingapiMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type ExcludeCompliantResources = scala.Boolean
  type FailedResourcesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.FailureInfo]
  type GroupBy = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.GroupByAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.REGION
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - java.lang.String
  */
  type GroupByAttribute = typingsJapgolly.awsSdk.resourcegroupstaggingapiMod._GroupByAttribute | java.lang.String
  type IncludeComplianceDetails = scala.Boolean
  type LastUpdated = java.lang.String
  type MaxResultsGetComplianceSummary = scala.Double
  type NonCompliantResources = scala.Double
  type PaginationToken = java.lang.String
  type Region = java.lang.String
  type RegionFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.Region]
  type ResourceARN = java.lang.String
  type ResourceARNList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.ResourceARN]
  type ResourceTagMappingList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.AmazonResourceType]
  type ResourcesPerPage = scala.Double
  type S3Bucket = java.lang.String
  type S3Location = java.lang.String
  type Status = java.lang.String
  type StatusCode = scala.Double
  type SummaryList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.Summary]
  type TagFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagFilter]
  type TagKey = java.lang.String
  type TagKeyFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagKey]
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagKey]
  type TagKeyListForUntag = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagValue]
  type TagValue = java.lang.String
  type TagValueList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagValue]
  type TagValuesOutputList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TagValue]
  type TagsPerPage = scala.Double
  type TargetId = java.lang.String
  type TargetIdFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.TargetId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.OU
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
    - java.lang.String
  */
  type TargetIdType = typingsJapgolly.awsSdk.resourcegroupstaggingapiMod._TargetIdType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-01-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.resourcegroupstaggingapiMod._apiVersion | java.lang.String
}
