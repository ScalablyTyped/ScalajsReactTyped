package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codebuildMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_ID
    - java.lang.String
  */
  type ArtifactNamespace = typingsJapgolly.awsSdk.codebuildMod._ArtifactNamespace | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
    - java.lang.String
  */
  type ArtifactPackaging = typingsJapgolly.awsSdk.codebuildMod._ArtifactPackaging | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CODEPIPELINE
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_ARTIFACTS
    - java.lang.String
  */
  type ArtifactsType = typingsJapgolly.awsSdk.codebuildMod._ArtifactsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OAUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.BASIC_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
    - java.lang.String
  */
  type AuthType = typingsJapgolly.awsSdk.codebuildMod._AuthType | java.lang.String
  type Boolean = scala.Boolean
  type BuildArtifactsList = js.Array[typingsJapgolly.awsSdk.codebuildMod.BuildArtifacts]
  type BuildIds = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
    - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOAD_SOURCE
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTALL
    - typingsJapgolly.awsSdk.awsSdkStrings.PRE_BUILD
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
    - typingsJapgolly.awsSdk.awsSdkStrings.POST_BUILD
    - typingsJapgolly.awsSdk.awsSdkStrings.UPLOAD_ARTIFACTS
    - typingsJapgolly.awsSdk.awsSdkStrings.FINALIZING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type BuildPhaseType = typingsJapgolly.awsSdk.codebuildMod._BuildPhaseType | java.lang.String
  type BuildPhases = js.Array[typingsJapgolly.awsSdk.codebuildMod.BuildPhase]
  type BuildReportArns = js.Array[typingsJapgolly.awsSdk.codebuildMod.String]
  type Builds = js.Array[typingsJapgolly.awsSdk.codebuildMod.Build]
  type BuildsNotDeleted = js.Array[typingsJapgolly.awsSdk.codebuildMod.BuildNotDeleted]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_DOCKER_LAYER_CACHE
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_SOURCE_CACHE
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_CUSTOM_CACHE
    - java.lang.String
  */
  type CacheMode = typingsJapgolly.awsSdk.codebuildMod._CacheMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_CACHE
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL
    - java.lang.String
  */
  type CacheType = typingsJapgolly.awsSdk.codebuildMod._CacheType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codebuildMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_2XLARGE
    - java.lang.String
  */
  type ComputeType = typingsJapgolly.awsSdk.codebuildMod._ComputeType | java.lang.String
  type CredentialProviderType = typingsJapgolly.awsSdk.awsSdkStrings.SECRETS_MANAGER | java.lang.String
  type EnvironmentImages = js.Array[typingsJapgolly.awsSdk.codebuildMod.EnvironmentImage]
  type EnvironmentLanguages = js.Array[typingsJapgolly.awsSdk.codebuildMod.EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[typingsJapgolly.awsSdk.codebuildMod.EnvironmentPlatform]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_CONTAINER
    - typingsJapgolly.awsSdk.awsSdkStrings.LINUX_CONTAINER
    - typingsJapgolly.awsSdk.awsSdkStrings.LINUX_GPU_CONTAINER
    - typingsJapgolly.awsSdk.awsSdkStrings.ARM_CONTAINER
    - java.lang.String
  */
  type EnvironmentType = typingsJapgolly.awsSdk.codebuildMod._EnvironmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
    - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_STORE
    - typingsJapgolly.awsSdk.awsSdkStrings.SECRETS_MANAGER
    - java.lang.String
  */
  type EnvironmentVariableType = typingsJapgolly.awsSdk.codebuildMod._EnvironmentVariableType | java.lang.String
  type EnvironmentVariables = js.Array[typingsJapgolly.awsSdk.codebuildMod.EnvironmentVariable]
  type ExportedEnvironmentVariables = js.Array[typingsJapgolly.awsSdk.codebuildMod.ExportedEnvironmentVariable]
  type FileSystemType = typingsJapgolly.awsSdk.awsSdkStrings.EFS | java.lang.String
  type FilterGroup = js.Array[typingsJapgolly.awsSdk.codebuildMod.WebhookFilter]
  type FilterGroups = js.Array[typingsJapgolly.awsSdk.codebuildMod.FilterGroup]
  type GitCloneDepth = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CODEBUILD
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_ROLE
    - java.lang.String
  */
  type ImagePullCredentialsType = typingsJapgolly.awsSdk.codebuildMod._ImagePullCredentialsType | java.lang.String
  type ImageVersions = js.Array[typingsJapgolly.awsSdk.codebuildMod.String]
  type KeyInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JAVA
    - typingsJapgolly.awsSdk.awsSdkStrings.PYTHON
    - typingsJapgolly.awsSdk.awsSdkStrings.NODE_JS
    - typingsJapgolly.awsSdk.awsSdkStrings.RUBY
    - typingsJapgolly.awsSdk.awsSdkStrings.GOLANG
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCKER
    - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
    - typingsJapgolly.awsSdk.awsSdkStrings.DOTNET
    - typingsJapgolly.awsSdk.awsSdkStrings.BASE
    - typingsJapgolly.awsSdk.awsSdkStrings.PHP
    - java.lang.String
  */
  type LanguageType = typingsJapgolly.awsSdk.codebuildMod._LanguageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LogsConfigStatusType = typingsJapgolly.awsSdk.codebuildMod._LogsConfigStatusType | java.lang.String
  type NonEmptyString = java.lang.String
  type PageSize = scala.Double
  type PhaseContexts = js.Array[typingsJapgolly.awsSdk.codebuildMod.PhaseContext]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEBIAN
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typingsJapgolly.awsSdk.awsSdkStrings.UBUNTU
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER
    - java.lang.String
  */
  type PlatformType = typingsJapgolly.awsSdk.codebuildMod._PlatformType | java.lang.String
  type ProjectArns = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  type ProjectArtifactsList = js.Array[typingsJapgolly.awsSdk.codebuildMod.ProjectArtifacts]
  type ProjectCacheModes = js.Array[typingsJapgolly.awsSdk.codebuildMod.CacheMode]
  type ProjectDescription = java.lang.String
  type ProjectFileSystemLocations = js.Array[typingsJapgolly.awsSdk.codebuildMod.ProjectFileSystemLocation]
  type ProjectName = java.lang.String
  type ProjectNames = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[typingsJapgolly.awsSdk.codebuildMod.ProjectSourceVersion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ProjectSortByType = typingsJapgolly.awsSdk.codebuildMod._ProjectSortByType | java.lang.String
  type ProjectSources = js.Array[typingsJapgolly.awsSdk.codebuildMod.ProjectSource]
  type Projects = js.Array[typingsJapgolly.awsSdk.codebuildMod.Project]
  type ReportArns = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_EXPORT
    - java.lang.String
  */
  type ReportExportConfigType = typingsJapgolly.awsSdk.codebuildMod._ReportExportConfigType | java.lang.String
  type ReportGroupArns = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  type ReportGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ReportGroupSortByType = typingsJapgolly.awsSdk.codebuildMod._ReportGroupSortByType | java.lang.String
  type ReportGroups = js.Array[typingsJapgolly.awsSdk.codebuildMod.ReportGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReportPackagingType = typingsJapgolly.awsSdk.codebuildMod._ReportPackagingType | java.lang.String
  type ReportStatusCounts = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codebuildMod.WrapperInt]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GENERATING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ReportStatusType = typingsJapgolly.awsSdk.codebuildMod._ReportStatusType | java.lang.String
  type ReportType = typingsJapgolly.awsSdk.awsSdkStrings.TEST | java.lang.String
  type Reports = js.Array[typingsJapgolly.awsSdk.codebuildMod.Report]
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  type SensitiveNonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
    - typingsJapgolly.awsSdk.awsSdkStrings.BITBUCKET
    - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
    - java.lang.String
  */
  type ServerType = typingsJapgolly.awsSdk.codebuildMod._ServerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFIED_TIME
    - java.lang.String
  */
  type SharedResourceSortByType = typingsJapgolly.awsSdk.codebuildMod._SharedResourceSortByType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrderType = typingsJapgolly.awsSdk.codebuildMod._SortOrderType | java.lang.String
  type SourceAuthType = typingsJapgolly.awsSdk.awsSdkStrings.OAUTH | java.lang.String
  type SourceCredentialsInfos = js.Array[typingsJapgolly.awsSdk.codebuildMod.SourceCredentialsInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CODECOMMIT
    - typingsJapgolly.awsSdk.awsSdkStrings.CODEPIPELINE
    - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - typingsJapgolly.awsSdk.awsSdkStrings.BITBUCKET
    - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_SOURCE
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.codebuildMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type StatusType = typingsJapgolly.awsSdk.codebuildMod._StatusType | java.lang.String
  type String = java.lang.String
  type Subnets = js.Array[typingsJapgolly.awsSdk.codebuildMod.NonEmptyString]
  type TagList = js.Array[typingsJapgolly.awsSdk.codebuildMod.Tag]
  type TestCases = js.Array[typingsJapgolly.awsSdk.codebuildMod.TestCase]
  type TimeOut = scala.Double
  type Timestamp = js.Date
  type ValueInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.BASE_REF
    - typingsJapgolly.awsSdk.awsSdkStrings.HEAD_REF
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTOR_ACCOUNT_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.FILE_PATH
    - java.lang.String
  */
  type WebhookFilterType = typingsJapgolly.awsSdk.codebuildMod._WebhookFilterType | java.lang.String
  type WrapperBoolean = scala.Boolean
  type WrapperInt = scala.Double
  type WrapperLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-10-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codebuildMod._apiVersion | java.lang.String
}
