package typingsJapgolly.awsSdk.clientsComputeoptimizerMod

import typingsJapgolly.awsSdk.awsSdkStrings.Csv_
import typingsJapgolly.awsSdk.awsSdkStrings.Duration_
import typingsJapgolly.awsSdk.awsSdkStrings.Finding_
import typingsJapgolly.awsSdk.awsSdkStrings.Status_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountEnrollmentStatuses = js.Array[AccountEnrollmentStatus]

type AccountId = String

type AccountIds = js.Array[AccountId]

type AutoScalingGroupArn = String

type AutoScalingGroupArns = js.Array[AutoScalingGroupArn]

type AutoScalingGroupName = String

type AutoScalingGroupRecommendationOptions = js.Array[AutoScalingGroupRecommendationOption]

type AutoScalingGroupRecommendations = js.Array[AutoScalingGroupRecommendation]

type Code = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ARM64
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
  - java.lang.String
*/
type CpuVendorArchitecture = _CpuVendorArchitecture | String

type CpuVendorArchitectures = js.Array[CpuVendorArchitecture]

type CreationTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USD
  - typingsJapgolly.awsSdk.awsSdkStrings.CNY
  - java.lang.String
*/
type Currency = _Currency | String

type CurrentInstanceType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VeryLow
  - typingsJapgolly.awsSdk.awsSdkStrings.Low_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type CurrentPerformanceRisk = _CurrentPerformanceRisk | String

type DesiredCapacity = Double

type DestinationBucket = String

type DestinationKey = String

type DestinationKeyPrefix = String

type EBSFilterName = Finding_ | String

type EBSFilters = js.Array[EBSFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Optimized
  - typingsJapgolly.awsSdk.awsSdkStrings.NotOptimized
  - java.lang.String
*/
type EBSFinding = _EBSFinding | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VolumeReadOpsPerSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.VolumeWriteOpsPerSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.VolumeReadBytesPerSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.VolumeWriteBytesPerSecond
  - java.lang.String
*/
type EBSMetricName = _EBSMetricName | String

type EBSUtilizationMetrics = js.Array[EBSUtilizationMetric]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type EnhancedInfrastructureMetrics = _EnhancedInfrastructureMetrics | String

type EnrollmentFilterName = Status_ | String

type EnrollmentFilters = js.Array[EnrollmentFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroupArn
  - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroupName
  - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsCpuMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkInBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkOutBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsInPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsOutPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationInstanceType
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationDesiredCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationMinSize
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationMaxSize
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentOnDemandPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentStandardOneYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentStandardThreeYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentVCpus
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentMemory
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentStorage
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentNetwork
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationInstanceType
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationDesiredCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMinSize
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMaxSize
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsCpuMaximum
  - / * RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum * / java.lang.String
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsOnDemandPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsStandardOneYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsVcpus
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsMemory
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsStorage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsNetwork
  - typingsJapgolly.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
  - typingsJapgolly.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesCpuVendorArchitectures
  - typingsJapgolly.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesInferredWorkloadTypes
  - typingsJapgolly.awsSdk.awsSdkStrings.InferredWorkloadTypes
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsMigrationEffort
*/
type ExportableAutoScalingGroupField = _ExportableAutoScalingGroupField | (/* RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum */ String)

type ExportableAutoScalingGroupFields = js.Array[ExportableAutoScalingGroupField]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceArn
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceName
  - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
  - typingsJapgolly.awsSdk.awsSdkStrings.FindingReasonCodes
  - typingsJapgolly.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentInstanceType
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsCpuMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkInBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkOutBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsInPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsOutPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentOnDemandPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentStandardOneYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentStandardThreeYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentVCpus
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentMemory
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentStorage
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentNetwork
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsInstanceType
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsCpuMaximum
  - / * RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum * / java.lang.String
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsPlatformDifferences
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsVcpus
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsMemory
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsStorage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsNetwork
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsOnDemandPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsStandardOneYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationsSourcesRecommendationSourceArn
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationsSourcesRecommendationSourceType
  - typingsJapgolly.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
  - typingsJapgolly.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesCpuVendorArchitectures
  - typingsJapgolly.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesInferredWorkloadTypes
  - typingsJapgolly.awsSdk.awsSdkStrings.InferredWorkloadTypes
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsMigrationEffort
*/
type ExportableInstanceField = _ExportableInstanceField | (/* RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum */ String)

type ExportableInstanceFields = js.Array[ExportableInstanceField]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.FunctionArn
  - typingsJapgolly.awsSdk.awsSdkStrings.FunctionVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
  - typingsJapgolly.awsSdk.awsSdkStrings.FindingReasonCodes
  - typingsJapgolly.awsSdk.awsSdkStrings.NumberOfInvocations
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDurationMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsDurationAverage
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsMemoryAverage
  - typingsJapgolly.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationMemorySize
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationTimeout
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentCostTotal
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentCostAverage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMemorySize
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsCostLow
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsCostHigh
  - / * RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound * / java.lang.String
  - typingsJapgolly.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
*/
type ExportableLambdaFunctionField = _ExportableLambdaFunctionField | (/* RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound */ String)

type ExportableLambdaFunctionFields = js.Array[ExportableLambdaFunctionField]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.VolumeArn
  - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsVolumeReadOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsVolumeWriteOpsPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsVolumeReadBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.UtilizationMetricsVolumeWriteBytesPerSecondMaximum
  - typingsJapgolly.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationVolumeType
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBaselineIOPS
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBaselineThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBurstIOPS
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBurstThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentConfigurationVolumeSize
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentMonthlyPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeType
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBaselineIOPS
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBaselineThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBurstIOPS
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBurstThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeSize
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsMonthlyPrice
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
  - java.lang.String
*/
type ExportableVolumeField = _ExportableVolumeField | String

type ExportableVolumeFields = js.Array[ExportableVolumeField]

type FailureReason = String

type FileFormat = Csv_ | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
  - typingsJapgolly.awsSdk.awsSdkStrings.FindingReasonCodes
  - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationSourceType
  - java.lang.String
*/
type FilterName = _FilterName | String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Underprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.Overprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.Optimized
  - typingsJapgolly.awsSdk.awsSdkStrings.NotOptimized
  - java.lang.String
*/
type Finding = _Finding | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryUnderprovisioned
  - java.lang.String
*/
type FindingReasonCode = _FindingReasonCode | String

type FunctionArn = String

type FunctionArns = js.Array[FunctionArn]

type FunctionVersion = String

type GetRecommendationErrors = js.Array[GetRecommendationError]

type High = Double

type Identifier = String

type IncludeMemberAccounts = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AmazonEmr
  - typingsJapgolly.awsSdk.awsSdkStrings.ApacheCassandra
  - typingsJapgolly.awsSdk.awsSdkStrings.ApacheHadoop
  - typingsJapgolly.awsSdk.awsSdkStrings.Memcached
  - typingsJapgolly.awsSdk.awsSdkStrings.Nginx
  - typingsJapgolly.awsSdk.awsSdkStrings.PostgreSql_
  - typingsJapgolly.awsSdk.awsSdkStrings.Redis
  - java.lang.String
*/
type InferredWorkloadType = _InferredWorkloadType | String

type InferredWorkloadTypes = js.Array[InferredWorkloadType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type InferredWorkloadTypesPreference = _InferredWorkloadTypesPreference | String

type InstanceArn = String

type InstanceArns = js.Array[InstanceArn]

type InstanceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPUOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.CPUUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.EBSThroughputOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.EBSThroughputUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.EBSIOPSOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.EBSIOPSUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkBandwidthOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkBandwidthUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkPPSOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkPPSUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskIOPSOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskIOPSUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskThroughputOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskThroughputUnderprovisioned
  - java.lang.String
*/
type InstanceRecommendationFindingReasonCode = _InstanceRecommendationFindingReasonCode | String

type InstanceRecommendationFindingReasonCodes = js.Array[InstanceRecommendationFindingReasonCode]

type InstanceRecommendations = js.Array[InstanceRecommendation]

type InstanceType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceType
  - typingsJapgolly.awsSdk.awsSdkStrings.JobStatus
  - java.lang.String
*/
type JobFilterName = _JobFilterName | String

type JobFilters = js.Array[JobFilter]

type JobId = String

type JobIds = js.Array[JobId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Queued_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type JobStatus = _JobStatus | String

type LambdaFunctionMemoryMetricName = Duration_ | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LowerBound
  - typingsJapgolly.awsSdk.awsSdkStrings.UpperBound
  - typingsJapgolly.awsSdk.awsSdkStrings.Expected
  - java.lang.String
*/
type LambdaFunctionMemoryMetricStatistic = _LambdaFunctionMemoryMetricStatistic | String

type LambdaFunctionMemoryProjectedMetrics = js.Array[LambdaFunctionMemoryProjectedMetric]

type LambdaFunctionMemoryRecommendationOptions = js.Array[LambdaFunctionMemoryRecommendationOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Duration_
  - typingsJapgolly.awsSdk.awsSdkStrings.Memory_
  - java.lang.String
*/
type LambdaFunctionMetricName = _LambdaFunctionMetricName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - java.lang.String
*/
type LambdaFunctionMetricStatistic = _LambdaFunctionMetricStatistic | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
  - typingsJapgolly.awsSdk.awsSdkStrings.FindingReasonCode
  - java.lang.String
*/
type LambdaFunctionRecommendationFilterName = _LambdaFunctionRecommendationFilterName | String

type LambdaFunctionRecommendationFilters = js.Array[LambdaFunctionRecommendationFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Optimized
  - typingsJapgolly.awsSdk.awsSdkStrings.NotOptimized
  - typingsJapgolly.awsSdk.awsSdkStrings.Unavailable_
  - java.lang.String
*/
type LambdaFunctionRecommendationFinding = _LambdaFunctionRecommendationFinding | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryOverprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryUnderprovisioned
  - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientData
  - typingsJapgolly.awsSdk.awsSdkStrings.Inconclusive
  - java.lang.String
*/
type LambdaFunctionRecommendationFindingReasonCode = _LambdaFunctionRecommendationFindingReasonCode | String

type LambdaFunctionRecommendationFindingReasonCodes = js.Array[LambdaFunctionRecommendationFindingReasonCode]

type LambdaFunctionRecommendations = js.Array[LambdaFunctionRecommendation]

type LambdaFunctionUtilizationMetrics = js.Array[LambdaFunctionUtilizationMetric]

type LastRefreshTimestamp = js.Date

type LastUpdatedTimestamp = js.Date

type LookBackPeriodInDays = Double

type Low = Double

type MaxResults = Double

type MaxSize = Double

type Medium = Double

type MemberAccountsEnrolled = Boolean

type MemorySize = Double

type Message = String

type MetadataKey = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Cpu_
  - typingsJapgolly.awsSdk.awsSdkStrings.Memory_
  - typingsJapgolly.awsSdk.awsSdkStrings.EBS_READ_OPS_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.EBS_WRITE_OPS_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.EBS_READ_BYTES_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.EBS_WRITE_BYTES_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.DISK_READ_OPS_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.DISK_WRITE_OPS_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.DISK_READ_BYTES_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.DISK_WRITE_BYTES_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_IN_BYTES_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_OUT_BYTES_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_PACKETS_IN_PER_SECOND
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_PACKETS_OUT_PER_SECOND
  - java.lang.String
*/
type MetricName = _MetricName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

type MetricValue = Double

type MetricValues = js.Array[MetricValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VeryLow
  - typingsJapgolly.awsSdk.awsSdkStrings.Low_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type MigrationEffort = _MigrationEffort | String

type MinSize = Double

type NextToken = String

type NumberOfInvocations = Double

type NumberOfMemberAccountsOptedIn = Double

type PerformanceRisk = Double

type Period = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Hypervisor_
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkInterface
  - typingsJapgolly.awsSdk.awsSdkStrings.StorageInterface
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceStoreAvailability
  - typingsJapgolly.awsSdk.awsSdkStrings.VirtualizationType
  - typingsJapgolly.awsSdk.awsSdkStrings.Architecture
  - java.lang.String
*/
type PlatformDifference = _PlatformDifference | String

type PlatformDifferences = js.Array[PlatformDifference]

type ProjectedMetrics = js.Array[ProjectedMetric]

type ProjectedUtilizationMetrics = js.Array[UtilizationMetric]

type Rank = Double

type ReasonCodeSummaries = js.Array[ReasonCodeSummary]

type RecommendationExportJobs = js.Array[RecommendationExportJob]

type RecommendationOptions = js.Array[InstanceRecommendationOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EnhancedInfrastructureMetrics
  - typingsJapgolly.awsSdk.awsSdkStrings.InferredWorkloadTypes
  - java.lang.String
*/
type RecommendationPreferenceName = _RecommendationPreferenceName | String

type RecommendationPreferenceNames = js.Array[RecommendationPreferenceName]

type RecommendationPreferencesDetails = js.Array[RecommendationPreferencesDetail]

type RecommendationSourceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2Instance_
  - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.EbsVolume
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunction
  - java.lang.String
*/
type RecommendationSourceType = _RecommendationSourceType | String

type RecommendationSources = js.Array[RecommendationSource]

type RecommendationSummaries = js.Array[RecommendationSummary]

type RecommendedInstanceType = String

type RecommendedOptionProjectedMetrics = js.Array[RecommendedOptionProjectedMetric]

type ResourceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2Instance_
  - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.EbsVolume
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunction
  - typingsJapgolly.awsSdk.awsSdkStrings.NotApplicable
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type SavingsOpportunityPercentage = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Organization_
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceArn
  - java.lang.String
*/
type ScopeName = _ScopeName | String

type ScopeValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type Status = _Status | String

type StatusReason = String

type Summaries = js.Array[Summary]

type SummaryValue = Double

type Timestamp = js.Date

type Timestamps = js.Array[js.Date]

type UtilizationMetrics = js.Array[UtilizationMetric]

type Value = Double

type VeryLow = Double

type VolumeArn = String

type VolumeArns = js.Array[VolumeArn]

type VolumeBaselineIOPS = Double

type VolumeBaselineThroughput = Double

type VolumeBurstIOPS = Double

type VolumeBurstThroughput = Double

type VolumeRecommendationOptions = js.Array[VolumeRecommendationOption]

type VolumeRecommendations = js.Array[VolumeRecommendation]

type VolumeSize = Double

type VolumeType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
