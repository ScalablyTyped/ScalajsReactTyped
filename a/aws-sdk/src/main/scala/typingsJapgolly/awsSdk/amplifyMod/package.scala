package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplifyMod {
  type AccessToken = java.lang.String
  type ActiveJobId = java.lang.String
  type AppArn = java.lang.String
  type AppId = java.lang.String
  type Apps = js.Array[typingsJapgolly.awsSdk.amplifyMod.App]
  type ArtifactFileName = java.lang.String
  type ArtifactId = java.lang.String
  type ArtifactUrl = java.lang.String
  type Artifacts = js.Array[typingsJapgolly.awsSdk.amplifyMod.Artifact]
  type ArtifactsUrl = java.lang.String
  type AssociatedResource = java.lang.String
  type AssociatedResources = js.Array[typingsJapgolly.awsSdk.amplifyMod.AssociatedResource]
  type AutoBranchCreationPattern = java.lang.String
  type AutoBranchCreationPatterns = js.Array[typingsJapgolly.awsSdk.amplifyMod.AutoBranchCreationPattern]
  type BackendEnvironmentArn = java.lang.String
  type BackendEnvironments = js.Array[typingsJapgolly.awsSdk.amplifyMod.BackendEnvironment]
  type BasicAuthCredentials = java.lang.String
  type BranchArn = java.lang.String
  type BranchName = java.lang.String
  type Branches = js.Array[typingsJapgolly.awsSdk.amplifyMod.Branch]
  type BuildSpec = java.lang.String
  type CertificateVerificationDNSRecord = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.amplifyMod.ClientApiVersions
  type CommitId = java.lang.String
  type CommitMessage = java.lang.String
  type CommitTime = js.Date
  type Condition = java.lang.String
  type Context = java.lang.String
  type CreateTime = js.Date
  type CustomDomain = java.lang.String
  type CustomDomains = js.Array[typingsJapgolly.awsSdk.amplifyMod.CustomDomain]
  type CustomRules = js.Array[typingsJapgolly.awsSdk.amplifyMod.CustomRule]
  type DNSRecord = java.lang.String
  type DefaultDomain = java.lang.String
  type DeploymentArtifacts = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type DomainAssociationArn = java.lang.String
  type DomainAssociations = js.Array[typingsJapgolly.awsSdk.amplifyMod.DomainAssociation]
  type DomainName = java.lang.String
  type DomainPrefix = java.lang.String
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
  type DomainStatus = typingsJapgolly.awsSdk.amplifyMod._DomainStatus | java.lang.String
  type EnableAutoBranchCreation = scala.Boolean
  type EnableAutoBuild = scala.Boolean
  type EnableAutoSubDomain = scala.Boolean
  type EnableBasicAuth = scala.Boolean
  type EnableBranchAutoBuild = scala.Boolean
  type EnableNotification = scala.Boolean
  type EnablePullRequestPreview = scala.Boolean
  type EndTime = js.Date
  type EnvKey = java.lang.String
  type EnvValue = java.lang.String
  type EnvironmentName = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.amplifyMod.EnvValue]
  type FileMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.amplifyMod.MD5Hash]
  type FileName = java.lang.String
  type FileUploadUrls = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.amplifyMod.UploadUrl]
  type Framework = java.lang.String
  type JobArn = java.lang.String
  type JobId = java.lang.String
  type JobReason = java.lang.String
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
  type JobStatus = typingsJapgolly.awsSdk.amplifyMod._JobStatus | java.lang.String
  type JobSummaries = js.Array[typingsJapgolly.awsSdk.amplifyMod.JobSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RELEASE
    - typingsJapgolly.awsSdk.awsSdkStrings.RETRY
    - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.WEB_HOOK
    - java.lang.String
  */
  type JobType = typingsJapgolly.awsSdk.amplifyMod._JobType | java.lang.String
  type LastDeployTime = js.Date
  type LogUrl = java.lang.String
  type MD5Hash = java.lang.String
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OauthToken = java.lang.String
  type Platform = typingsJapgolly.awsSdk.awsSdkStrings.WEB | java.lang.String
  type PullRequestEnvironmentName = java.lang.String
  type Repository = java.lang.String
  type ResourceArn = java.lang.String
  type Screenshots = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.amplifyMod.ThumbnailUrl]
  type ServiceRoleArn = java.lang.String
  type Source = java.lang.String
  type SourceUrl = java.lang.String
  type StackName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCTION
    - typingsJapgolly.awsSdk.awsSdkStrings.BETA
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVELOPMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPERIMENTAL
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST
    - java.lang.String
  */
  type Stage = typingsJapgolly.awsSdk.amplifyMod._Stage | java.lang.String
  type StartTime = js.Date
  type Status = java.lang.String
  type StatusReason = java.lang.String
  type StepName = java.lang.String
  type Steps = js.Array[typingsJapgolly.awsSdk.amplifyMod.Step]
  type SubDomainSettings = js.Array[typingsJapgolly.awsSdk.amplifyMod.SubDomainSetting]
  type SubDomains = js.Array[typingsJapgolly.awsSdk.amplifyMod.SubDomain]
  type TTL = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.amplifyMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.amplifyMod.TagValue]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TestArtifactsUrl = java.lang.String
  type TestConfigUrl = java.lang.String
  type ThumbnailName = java.lang.String
  type ThumbnailUrl = java.lang.String
  type TotalNumberOfJobs = java.lang.String
  type UpdateTime = js.Date
  type UploadUrl = java.lang.String
  type Verified = scala.Boolean
  type WebhookArn = java.lang.String
  type WebhookId = java.lang.String
  type WebhookUrl = java.lang.String
  type Webhooks = js.Array[typingsJapgolly.awsSdk.amplifyMod.Webhook]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.amplifyMod._apiVersion | java.lang.String
}
