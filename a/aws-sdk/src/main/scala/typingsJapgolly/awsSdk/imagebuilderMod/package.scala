package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imagebuilderMod {
  type AccountList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.NonEmptyString]
  type AmiList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.Ami]
  type AmiNameString = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.Arn]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.imagebuilderMod.ClientApiVersions
  type ClientToken = java.lang.String
  type ComponentBuildVersionArn = java.lang.String
  type ComponentConfigurationList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ComponentConfiguration]
  type ComponentData = java.lang.String
  type ComponentFormat = typingsJapgolly.awsSdk.awsSdkStrings.SHELL | java.lang.String
  type ComponentSummaryList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ComponentSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
    - typingsJapgolly.awsSdk.awsSdkStrings.TEST
    - java.lang.String
  */
  type ComponentType = typingsJapgolly.awsSdk.imagebuilderMod._ComponentType | java.lang.String
  type ComponentVersionArn = java.lang.String
  type ComponentVersionArnOrBuildVersionArn = java.lang.String
  type ComponentVersionList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ComponentVersion]
  type DateTime = java.lang.String
  type DistributionConfigurationArn = java.lang.String
  type DistributionConfigurationSummaryList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.DistributionConfigurationSummary]
  type DistributionList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.Distribution]
  type DistributionTimeoutMinutes = scala.Double
  type EbsIopsInteger = scala.Double
  type EbsVolumeSizeInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - typingsJapgolly.awsSdk.awsSdkStrings.io1
    - typingsJapgolly.awsSdk.awsSdkStrings.gp2
    - typingsJapgolly.awsSdk.awsSdkStrings.sc1
    - typingsJapgolly.awsSdk.awsSdkStrings.st1
    - java.lang.String
  */
  type EbsVolumeType = typingsJapgolly.awsSdk.imagebuilderMod._EbsVolumeType | java.lang.String
  type EmptyString = java.lang.String
  type FilterList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.Filter]
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.FilterValue]
  type ImageBuildVersionArn = java.lang.String
  type ImageBuilderArn = java.lang.String
  type ImagePipelineArn = java.lang.String
  type ImagePipelineList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ImagePipeline]
  type ImageRecipeArn = java.lang.String
  type ImageRecipeSummaryList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ImageRecipeSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.TESTING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISTRIBUTING
    - typingsJapgolly.awsSdk.awsSdkStrings.INTEGRATING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ImageStatus = typingsJapgolly.awsSdk.imagebuilderMod._ImageStatus | java.lang.String
  type ImageSummaryList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ImageSummary]
  type ImageTestsTimeoutMinutes = scala.Double
  type ImageVersionArn = java.lang.String
  type ImageVersionList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.ImageVersion]
  type InfrastructureConfigurationArn = java.lang.String
  type InfrastructureConfigurationSummaryList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.InfrastructureConfigurationSummary]
  type InlineComponentData = java.lang.String
  type InstanceBlockDeviceMappings = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.InstanceBlockDeviceMapping]
  type InstanceType = java.lang.String
  type InstanceTypeList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.InstanceType]
  type NonEmptyString = java.lang.String
  type NullableBoolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Self_
    - typingsJapgolly.awsSdk.awsSdkStrings.Shared_
    - typingsJapgolly.awsSdk.awsSdkStrings.Amazon_
    - java.lang.String
  */
  type Ownership = typingsJapgolly.awsSdk.imagebuilderMod._Ownership | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESSION_MATCH_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
    - java.lang.String
  */
  type PipelineExecutionStartCondition = typingsJapgolly.awsSdk.imagebuilderMod._PipelineExecutionStartCondition | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type PipelineStatus = typingsJapgolly.awsSdk.imagebuilderMod._PipelineStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Windows_
    - typingsJapgolly.awsSdk.awsSdkStrings.Linux_
    - java.lang.String
  */
  type Platform = typingsJapgolly.awsSdk.imagebuilderMod._Platform | java.lang.String
  type ResourceName = java.lang.String
  type RestrictedInteger = scala.Double
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.NonEmptyString]
  type SnsTopicArn = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.imagebuilderMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.imagebuilderMod.TagValue]
  type TagValue = java.lang.String
  type Uri = java.lang.String
  type VersionNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.imagebuilderMod._apiVersion | java.lang.String
}
