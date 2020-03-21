package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3controlMod {
  type AccessPointList = js.Array[typingsJapgolly.awsSdk.s3controlMod.AccessPoint]
  type AccessPointName = java.lang.String
  type AccountId = java.lang.String
  type Boolean = scala.Boolean
  type BucketName = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typingsJapgolly.awsSdk.s3controlMod.ClientApiVersions
  type ConfirmationRequired = scala.Boolean
  type CreationDate = js.Date
  type IAMRoleArn = java.lang.String
  type IsPublic = scala.Boolean
  type JobArn = java.lang.String
  type JobCreationTime = js.Date
  type JobFailureCode = java.lang.String
  type JobFailureList = js.Array[typingsJapgolly.awsSdk.s3controlMod.JobFailure]
  type JobFailureReason = java.lang.String
  type JobId = java.lang.String
  type JobListDescriptorList = js.Array[typingsJapgolly.awsSdk.s3controlMod.JobListDescriptor]
  type JobManifestFieldList = js.Array[typingsJapgolly.awsSdk.s3controlMod.JobManifestFieldName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ignore_
    - typingsJapgolly.awsSdk.awsSdkStrings.Bucket
    - typingsJapgolly.awsSdk.awsSdkStrings.Key_
    - typingsJapgolly.awsSdk.awsSdkStrings.VersionId
    - java.lang.String
  */
  type JobManifestFieldName = typingsJapgolly.awsSdk.s3controlMod._JobManifestFieldName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.S3BatchOperations_CSV_20180820
    - typingsJapgolly.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20161130
    - java.lang.String
  */
  type JobManifestFormat = typingsJapgolly.awsSdk.s3controlMod._JobManifestFormat | java.lang.String
  type JobNumberOfTasksFailed = scala.Double
  type JobNumberOfTasksSucceeded = scala.Double
  type JobPriority = scala.Double
  type JobReportFormat = typingsJapgolly.awsSdk.awsSdkStrings.Report_CSV_20180820 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AllTasks
    - typingsJapgolly.awsSdk.awsSdkStrings.FailedTasksOnly
    - java.lang.String
  */
  type JobReportScope = typingsJapgolly.awsSdk.s3controlMod._JobReportScope | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failing_
    - typingsJapgolly.awsSdk.awsSdkStrings.New_
    - typingsJapgolly.awsSdk.awsSdkStrings.Paused_
    - typingsJapgolly.awsSdk.awsSdkStrings.Pausing
    - typingsJapgolly.awsSdk.awsSdkStrings.Preparing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
    - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.s3controlMod._JobStatus | java.lang.String
  type JobStatusList = js.Array[typingsJapgolly.awsSdk.s3controlMod.JobStatus]
  type JobStatusUpdateReason = java.lang.String
  type JobTerminationDate = js.Date
  type JobTotalNumberOfTasks = scala.Double
  type KmsKeyArnString = java.lang.String
  type MaxLength1024String = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Internet_
    - typingsJapgolly.awsSdk.awsSdkStrings.VPC
    - java.lang.String
  */
  type NetworkOrigin = typingsJapgolly.awsSdk.s3controlMod._NetworkOrigin | java.lang.String
  type NonEmptyMaxLength1024String = java.lang.String
  type NonEmptyMaxLength2048String = java.lang.String
  type NonEmptyMaxLength256String = java.lang.String
  type NonEmptyMaxLength64String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaInvoke
    - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectCopy
    - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectAcl
    - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectTagging
    - typingsJapgolly.awsSdk.awsSdkStrings.S3InitiateRestoreObject
    - java.lang.String
  */
  type OperationName = typingsJapgolly.awsSdk.s3controlMod._OperationName | java.lang.String
  type Policy = java.lang.String
  type ReportPrefixString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type RequestedJobStatus = typingsJapgolly.awsSdk.s3controlMod._RequestedJobStatus | java.lang.String
  type S3BucketArnString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.private__
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type S3CannedAccessControlList = typingsJapgolly.awsSdk.s3controlMod._S3CannedAccessControlList | java.lang.String
  type S3ContentLength = scala.Double
  type S3ExpirationInDays = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BULK
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type S3GlacierJobTier = typingsJapgolly.awsSdk.s3controlMod._S3GlacierJobTier | java.lang.String
  type S3GrantList = js.Array[typingsJapgolly.awsSdk.s3controlMod.S3Grant]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.id__
    - typingsJapgolly.awsSdk.awsSdkStrings.emailAddress_
    - typingsJapgolly.awsSdk.awsSdkStrings.uri_
    - java.lang.String
  */
  type S3GranteeTypeIdentifier = typingsJapgolly.awsSdk.s3controlMod._S3GranteeTypeIdentifier | java.lang.String
  type S3KeyArnString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COPY
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type S3MetadataDirective = typingsJapgolly.awsSdk.s3controlMod._S3MetadataDirective | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.ON
    - java.lang.String
  */
  type S3ObjectLockLegalHoldStatus = typingsJapgolly.awsSdk.s3controlMod._S3ObjectLockLegalHoldStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockMode = typingsJapgolly.awsSdk.s3controlMod._S3ObjectLockMode | java.lang.String
  type S3ObjectVersionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsJapgolly.awsSdk.awsSdkStrings.READ
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
    - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
    - java.lang.String
  */
  type S3Permission = typingsJapgolly.awsSdk.s3controlMod._S3Permission | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AES256
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type S3SSEAlgorithm = typingsJapgolly.awsSdk.s3controlMod._S3SSEAlgorithm | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
    - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = typingsJapgolly.awsSdk.s3controlMod._S3StorageClass | java.lang.String
  type S3TagSet = js.Array[typingsJapgolly.awsSdk.s3controlMod.S3Tag]
  type S3UserMetadata = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.s3controlMod.MaxLength1024String]
  type Setting = scala.Boolean
  type SuspendedCause = java.lang.String
  type SuspendedDate = js.Date
  type TimeStamp = js.Date
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-08-20`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.s3controlMod._apiVersion | java.lang.String
}
