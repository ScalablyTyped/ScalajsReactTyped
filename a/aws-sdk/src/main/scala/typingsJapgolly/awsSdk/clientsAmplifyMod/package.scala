package typingsJapgolly.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessToken = String

type ActiveJobId = String

type AppArn = String

type AppId = String

type Apps = js.Array[App]

type ArtifactFileName = String

type ArtifactId = String

type ArtifactUrl = String

type Artifacts = js.Array[Artifact]

type ArtifactsUrl = String

type AssociatedResource = String

type AssociatedResources = js.Array[AssociatedResource]

type AutoBranchCreationPattern = String

type AutoBranchCreationPatterns = js.Array[AutoBranchCreationPattern]

type AutoSubDomainCreationPattern = String

type AutoSubDomainCreationPatterns = js.Array[AutoSubDomainCreationPattern]

type AutoSubDomainIAMRole = String

type BackendEnvironmentArn = String

type BackendEnvironments = js.Array[BackendEnvironment]

type BasicAuthCredentials = String

type BranchArn = String

type BranchName = String

type Branches = js.Array[Branch]

type BuildSpec = String

type CertificateVerificationDNSRecord = String

type CommitId = String

type CommitMessage = String

type CommitTime = js.Date

type Condition = String

type Context = String

type CreateTime = js.Date

type CustomDomain = String

type CustomDomains = js.Array[CustomDomain]

type CustomHeaders = String

type CustomRules = js.Array[CustomRule]

type DNSRecord = String

type DefaultDomain = String

type DeploymentArtifacts = String

type Description = String

type DisplayName = String

type DomainAssociationArn = String

type DomainAssociations = js.Array[DomainAssociation]

type DomainName = String

type DomainPrefix = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VERIFICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUESTING_CERTIFICATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type DomainStatus = _DomainStatus | String

type EnableAutoBranchCreation = Boolean

type EnableAutoBuild = Boolean

type EnableAutoSubDomain = Boolean

type EnableBasicAuth = Boolean

type EnableBranchAutoBuild = Boolean

type EnableBranchAutoDeletion = Boolean

type EnableNotification = Boolean

type EnablePerformanceMode = Boolean

type EnablePullRequestPreview = Boolean

type EndTime = js.Date

type EnvKey = String

type EnvValue = String

type EnvironmentName = String

type EnvironmentVariables = StringDictionary[EnvValue]

type FileMap = StringDictionary[MD5Hash]

type FileName = String

type FileUploadUrls = StringDictionary[UploadUrl]

type Framework = String

type JobArn = String

type JobId = String

type JobReason = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type JobStatus = _JobStatus | String

type JobSummaries = js.Array[JobSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RELEASE
  - typingsJapgolly.awsSdk.awsSdkStrings.RETRY
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB_HOOK
  - java.lang.String
*/
type JobType = _JobType | String

type LastDeployTime = js.Date

type LogUrl = String

type MD5Hash = String

type MaxResults = Double

type Name = String

type NextToken = String

type OauthToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB_DYNAMIC
  - java.lang.String
*/
type Platform = _Platform | String

type PullRequestEnvironmentName = String

type Repository = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSH
  - typingsJapgolly.awsSdk.awsSdkStrings.TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGV4
  - java.lang.String
*/
type RepositoryCloneMethod = _RepositoryCloneMethod | String

type ResourceArn = String

type Screenshots = StringDictionary[ThumbnailUrl]

type ServiceRoleArn = String

type Source = String

type SourceUrl = String

type StackName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCTION
  - typingsJapgolly.awsSdk.awsSdkStrings.BETA
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVELOPMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPERIMENTAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST
  - java.lang.String
*/
type Stage = _Stage | String

type StartTime = js.Date

type Status = String

type StatusReason = String

type StepName = String

type Steps = js.Array[Step]

type SubDomainSettings = js.Array[SubDomainSetting]

type SubDomains = js.Array[SubDomain]

type TTL = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type Target = String

type TestArtifactsUrl = String

type TestConfigUrl = String

type ThumbnailName = String

type ThumbnailUrl = String

type TotalNumberOfJobs = String

type UpdateTime = js.Date

type UploadUrl = String

type Verified = Boolean

type WebhookArn = String

type WebhookId = String

type WebhookUrl = String

type Webhooks = js.Array[Webhook]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
