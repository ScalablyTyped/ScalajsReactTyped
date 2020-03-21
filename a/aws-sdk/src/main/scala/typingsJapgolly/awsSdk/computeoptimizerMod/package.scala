package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object computeoptimizerMod {
  type AccountId = java.lang.String
  type AccountIds = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.AccountId]
  type AutoScalingGroupArn = java.lang.String
  type AutoScalingGroupArns = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.AutoScalingGroupArn]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupRecommendationOptions = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.AutoScalingGroupRecommendationOption]
  type AutoScalingGroupRecommendations = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.AutoScalingGroupRecommendation]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.computeoptimizerMod.ClientApiVersions
  type Code = java.lang.String
  type CurrentInstanceType = java.lang.String
  type DesiredCapacity = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Finding_
    - typingsJapgolly.awsSdk.awsSdkStrings.RecommendationSourceType
    - java.lang.String
  */
  type FilterName = typingsJapgolly.awsSdk.computeoptimizerMod._FilterName | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.FilterValue]
  type Filters = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Underprovisioned
    - typingsJapgolly.awsSdk.awsSdkStrings.Overprovisioned
    - typingsJapgolly.awsSdk.awsSdkStrings.Optimized
    - typingsJapgolly.awsSdk.awsSdkStrings.NotOptimized
    - java.lang.String
  */
  type Finding = typingsJapgolly.awsSdk.computeoptimizerMod._Finding | java.lang.String
  type GetRecommendationErrors = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.GetRecommendationError]
  type Identifier = java.lang.String
  type IncludeMemberAccounts = scala.Boolean
  type InstanceArn = java.lang.String
  type InstanceArns = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.InstanceArn]
  type InstanceName = java.lang.String
  type InstanceRecommendations = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.InstanceRecommendation]
  type InstanceType = java.lang.String
  type LastRefreshTimestamp = js.Date
  type LookBackPeriodInDays = scala.Double
  type MaxResults = scala.Double
  type MaxSize = scala.Double
  type MemberAccountsEnrolled = scala.Boolean
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Cpu_
    - typingsJapgolly.awsSdk.awsSdkStrings.Memory_
    - java.lang.String
  */
  type MetricName = typingsJapgolly.awsSdk.computeoptimizerMod._MetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Average_
    - java.lang.String
  */
  type MetricStatistic = typingsJapgolly.awsSdk.computeoptimizerMod._MetricStatistic | java.lang.String
  type MetricValue = scala.Double
  type MetricValues = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.MetricValue]
  type MinSize = scala.Double
  type NextToken = java.lang.String
  type PerformanceRisk = scala.Double
  type Period = scala.Double
  type ProjectedMetrics = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.ProjectedMetric]
  type ProjectedUtilizationMetrics = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.UtilizationMetric]
  type Rank = scala.Double
  type RecommendationOptions = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.InstanceRecommendationOption]
  type RecommendationSourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ec2Instance_
    - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroup
    - java.lang.String
  */
  type RecommendationSourceType = typingsJapgolly.awsSdk.computeoptimizerMod._RecommendationSourceType | java.lang.String
  type RecommendationSources = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.RecommendationSource]
  type RecommendationSummaries = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.RecommendationSummary]
  type RecommendedInstanceType = java.lang.String
  type RecommendedOptionProjectedMetrics = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.RecommendedOptionProjectedMetric]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.computeoptimizerMod._Status | java.lang.String
  type StatusReason = java.lang.String
  type Summaries = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.Summary]
  type SummaryValue = scala.Double
  type Timestamp = js.Date
  type Timestamps = js.Array[js.Date]
  type UtilizationMetrics = js.Array[typingsJapgolly.awsSdk.computeoptimizerMod.UtilizationMetric]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.computeoptimizerMod._apiVersion | java.lang.String
}
