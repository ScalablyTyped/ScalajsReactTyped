package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
import typingsJapgolly.awsSdk.awsSdkStrings.DOCKER
import typingsJapgolly.awsSdk.awsSdkStrings.ECR
import typingsJapgolly.awsSdk.awsSdkStrings.SHELL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type AccountList = js.Array[AccountId]

type AmiList = js.Array[Ami]

type AmiNameString = String

type Arn = String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
  - java.lang.String
*/
type BuildType = _BuildType | String

type ClientToken = String

type ComponentBuildVersionArn = String

type ComponentConfigurationList = js.Array[ComponentConfiguration]

type ComponentData = String

type ComponentFormat = SHELL | String

type ComponentParameterDescription = String

type ComponentParameterDetailList = js.Array[ComponentParameterDetail]

type ComponentParameterList = js.Array[ComponentParameter]

type ComponentParameterName = String

type ComponentParameterType = String

type ComponentParameterValue = String

type ComponentParameterValueList = js.Array[ComponentParameterValue]

type ComponentStatus = DEPRECATED | String

type ComponentSummaryList = js.Array[ComponentSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST
  - java.lang.String
*/
type ComponentType = _ComponentType | String

type ComponentVersionArn = String

type ComponentVersionArnOrBuildVersionArn = String

type ComponentVersionList = js.Array[ComponentVersion]

type ContainerList = js.Array[Container]

type ContainerRecipeArn = String

type ContainerRecipeSummaryList = js.Array[ContainerRecipeSummary]

type ContainerRepositoryService = ECR | String

type ContainerType = DOCKER | String

type DateTime = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VMDK
  - typingsJapgolly.awsSdk.awsSdkStrings.RAW
  - typingsJapgolly.awsSdk.awsSdkStrings.VHD
  - java.lang.String
*/
type DiskImageFormat = _DiskImageFormat | String

type DistributionConfigurationArn = String

type DistributionConfigurationSummaryList = js.Array[DistributionConfigurationSummary]

type DistributionList = js.Array[Distribution]

type DistributionTimeoutMinutes = Double

type DockerFileTemplate = String

type EbsIopsInteger = Double

type EbsVolumeSizeInteger = Double

type EbsVolumeThroughput = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.standard__
  - typingsJapgolly.awsSdk.awsSdkStrings.io1_
  - typingsJapgolly.awsSdk.awsSdkStrings.io2_
  - typingsJapgolly.awsSdk.awsSdkStrings.gp2_
  - typingsJapgolly.awsSdk.awsSdkStrings.gp3_
  - typingsJapgolly.awsSdk.awsSdkStrings.sc1_
  - typingsJapgolly.awsSdk.awsSdkStrings.st1_
  - java.lang.String
*/
type EbsVolumeType = _EbsVolumeType | String

type EmptyString = String

type FastLaunchConfigurationList = js.Array[FastLaunchConfiguration]

type FilterList = js.Array[Filter]

type FilterName = String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type HttpPutResponseHopLimit = Double

type HttpTokens = String

type ImageBuildVersionArn = String

type ImageBuilderArn = String

type ImagePackageList = js.Array[ImagePackage]

type ImagePipelineArn = String

type ImagePipelineList = js.Array[ImagePipeline]

type ImageRecipeArn = String

type ImageRecipeSummaryList = js.Array[ImageRecipeSummary]

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
type ImageStatus = _ImageStatus | String

type ImageSummaryList = js.Array[ImageSummary]

type ImageTestsTimeoutMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AMI
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCKER
  - java.lang.String
*/
type ImageType = _ImageType | String

type ImageVersionArn = String

type ImageVersionArnOrBuildVersionArn = String

type ImageVersionList = js.Array[ImageVersion]

type InfrastructureConfigurationArn = String

type InfrastructureConfigurationSummaryList = js.Array[InfrastructureConfigurationSummary]

type InlineComponentData = String

type InlineDockerFileTemplate = String

type InstanceBlockDeviceMappings = js.Array[InstanceBlockDeviceMapping]

type InstanceProfileNameType = String

type InstanceType = String

type InstanceTypeList = js.Array[InstanceType]

type LaunchTemplateConfigurationList = js.Array[LaunchTemplateConfiguration]

type LaunchTemplateId = String

type LicenseConfigurationArn = String

type LicenseConfigurationArnList = js.Array[LicenseConfigurationArn]

type MaxParallelLaunches = Double

type NonEmptyString = String

type NullableBoolean = scala.Boolean

type OrganizationArn = String

type OrganizationArnList = js.Array[OrganizationArn]

type OrganizationalUnitArn = String

type OrganizationalUnitArnList = js.Array[OrganizationalUnitArn]

type OsVersion = String

type OsVersionList = js.Array[OsVersion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Self_
  - typingsJapgolly.awsSdk.awsSdkStrings.Shared_
  - typingsJapgolly.awsSdk.awsSdkStrings.Amazon_
  - java.lang.String
*/
type Ownership = _Ownership | String

type PaginationToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESSION_MATCH_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
  - java.lang.String
*/
type PipelineExecutionStartCondition = _PipelineExecutionStartCondition | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type PipelineStatus = _PipelineStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Windows_
  - typingsJapgolly.awsSdk.awsSdkStrings.Linux_
  - java.lang.String
*/
type Platform = _Platform | String

type RegionList = js.Array[NonEmptyString]

type ResourceName = String

type ResourcePolicyDocument = String

type ResourceTagMap = StringDictionary[TagValue]

type RestrictedInteger = Double

type SecurityGroupIds = js.Array[NonEmptyString]

type SnsTopicArn = String

type StringList = js.Array[NonEmptyString]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TargetResourceCount = Double

type Timezone = String

type Uri = String

type UserDataOverride = String

type VersionNumber = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-02`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
