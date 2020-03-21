package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMod {
  type ARN = java.lang.String
  type AdditionalLimitList = js.Array[typingsJapgolly.awsSdk.esMod.AdditionalLimit]
  type AdvancedOptions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.esMod.String]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.esMod.ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
  type CompatibleElasticsearchVersionsList = js.Array[typingsJapgolly.awsSdk.esMod.CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_UPDATE
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_ELIGIBLE
    - typingsJapgolly.awsSdk.awsSdkStrings.ELIGIBLE
    - java.lang.String
  */
  type DeploymentStatus = typingsJapgolly.awsSdk.esMod._DeploymentStatus | java.lang.String
  type DomainId = java.lang.String
  type DomainInfoList = js.Array[typingsJapgolly.awsSdk.esMod.DomainInfo]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[typingsJapgolly.awsSdk.esMod.DomainName]
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.m3DotmediumDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m3DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m3DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m4DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m4DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot10xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m5DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m5DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot12xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r5DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r5DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot12xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c5DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c5DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot9xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot18xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.t2DotmicroDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.t2DotsmallDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.t2DotmediumDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r3DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r3DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot8xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i2DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i2Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.d2DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot8xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c4DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c4DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot8xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r4DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r4DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot8xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot16xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i3DotlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i3DotxlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot2xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot4xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot8xlargeDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot16xlargeDotelasticsearch
    - java.lang.String
  */
  type ESPartitionInstanceType = typingsJapgolly.awsSdk.esMod._ESPartitionInstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
    - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
    - java.lang.String
  */
  type ESWarmPartitionInstanceType = typingsJapgolly.awsSdk.esMod._ESWarmPartitionInstanceType | java.lang.String
  type ElasticsearchDomainStatusList = js.Array[typingsJapgolly.awsSdk.esMod.ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList = js.Array[typingsJapgolly.awsSdk.esMod.ESPartitionInstanceType]
  type ElasticsearchVersionList = js.Array[typingsJapgolly.awsSdk.esMod.ElasticsearchVersionString]
  type ElasticsearchVersionString = java.lang.String
  type EndpointsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.esMod.ServiceUrl]
  type GUID = java.lang.String
  type IdentityPoolId = java.lang.String
  type InstanceCount = scala.Double
  type InstanceRole = java.lang.String
  type Integer = scala.Double
  type IntegerClass = scala.Double
  type Issue = java.lang.String
  type Issues = js.Array[typingsJapgolly.awsSdk.esMod.Issue]
  type KmsKeyId = java.lang.String
  type LimitName = java.lang.String
  type LimitValue = java.lang.String
  type LimitValueList = js.Array[typingsJapgolly.awsSdk.esMod.LimitValue]
  type LimitsByRole = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.esMod.Limits]
  type LogPublishingOptions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.esMod.LogPublishingOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INDEX_SLOW_LOGS
    - typingsJapgolly.awsSdk.awsSdkStrings.SEARCH_SLOW_LOGS
    - typingsJapgolly.awsSdk.awsSdkStrings.ES_APPLICATION_LOGS
    - java.lang.String
  */
  type LogType = typingsJapgolly.awsSdk.esMod._LogType | java.lang.String
  type MaxResults = scala.Double
  type MaximumInstanceCount = scala.Double
  type MinimumInstanceCount = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RequiresIndexDocuments
    - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - java.lang.String
  */
  type OptionState = typingsJapgolly.awsSdk.esMod._OptionState | java.lang.String
  type Password = java.lang.String
  type PolicyDocument = java.lang.String
  type RecurringChargeList = js.Array[typingsJapgolly.awsSdk.esMod.RecurringCharge]
  type ReservationToken = java.lang.String
  type ReservedElasticsearchInstanceList = js.Array[typingsJapgolly.awsSdk.esMod.ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[typingsJapgolly.awsSdk.esMod.ReservedElasticsearchInstanceOffering]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_UPFRONT
    - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_UPFRONT
    - java.lang.String
  */
  type ReservedElasticsearchInstancePaymentOption = typingsJapgolly.awsSdk.esMod._ReservedElasticsearchInstancePaymentOption | java.lang.String
  type RoleArn = java.lang.String
  type ServiceUrl = java.lang.String
  type StartTimestamp = js.Date
  type StorageSubTypeName = java.lang.String
  type StorageTypeLimitList = js.Array[typingsJapgolly.awsSdk.esMod.StorageTypeLimit]
  type StorageTypeList = js.Array[typingsJapgolly.awsSdk.esMod.StorageType]
  type StorageTypeName = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.esMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = typingsJapgolly.awsSdk.esMod._TLSSecurityPolicy | java.lang.String
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.esMod.Tag]
  type TagValue = java.lang.String
  type UIntValue = scala.Double
  type UpdateTimestamp = js.Date
  type UpgradeHistoryList = js.Array[typingsJapgolly.awsSdk.esMod.UpgradeHistory]
  type UpgradeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED_WITH_ISSUES
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UpgradeStatus = typingsJapgolly.awsSdk.esMod._UpgradeStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK
    - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT
    - typingsJapgolly.awsSdk.awsSdkStrings.UPGRADE
    - java.lang.String
  */
  type UpgradeStep = typingsJapgolly.awsSdk.esMod._UpgradeStep | java.lang.String
  type UpgradeStepsList = js.Array[typingsJapgolly.awsSdk.esMod.UpgradeStepItem]
  type UserPoolId = java.lang.String
  type Username = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - typingsJapgolly.awsSdk.awsSdkStrings.gp2
    - typingsJapgolly.awsSdk.awsSdkStrings.io1
    - java.lang.String
  */
  type VolumeType = typingsJapgolly.awsSdk.esMod._VolumeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-01-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.esMod._apiVersion | java.lang.String
}
