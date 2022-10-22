package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.Report_CSV_20180820
import typingsJapgolly.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20211130
import typingsJapgolly.awsSdk.awsSdkStrings.V_1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPointList = js.Array[AccessPoint]

type AccessPointName = String

type AccountId = String

type Alias = String

type AsyncCreationTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateMultiRegionAccessPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteMultiRegionAccessPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.PutMultiRegionAccessPointPolicy
  - java.lang.String
*/
type AsyncOperationName = _AsyncOperationName | String

type AsyncRequestStatus = String

type AsyncRequestTokenARN = String

type AwsLambdaTransformationPayload = String

type AwsOrgArn = String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.private__
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
  - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
  - java.lang.String
*/
type BucketCannedACL = _BucketCannedACL | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EU
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - java.lang.String
*/
type BucketLocationConstraint = _BucketLocationConstraint | String

type BucketName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketVersioningStatus = _BucketVersioningStatus | String

type Buckets = js.Array[S3BucketArnString]

type ConfigId = String

type ConfirmRemoveSelfBucketAccess = scala.Boolean

type ConfirmationRequired = scala.Boolean

type ContinuationToken = String

type CreationDate = js.Date

type CreationTimestamp = js.Date

type Date = js.Date

type Days = Double

type DaysAfterInitiation = Double

type Endpoints = StringDictionary[NonEmptyMaxLength1024String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExpirationStatus = _ExpirationStatus | String

type ExpiredObjectDeleteMarker = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.Parquet_
  - java.lang.String
*/
type Format = _Format | String

type FunctionArnString = String

type GeneratedManifestFormat = S3InventoryReport_CSV_20211130 | String

type GrantFullControl = String

type GrantRead = String

type GrantReadACP = String

type GrantWrite = String

type GrantWriteACP = String

type IAMRoleArn = String

type ID = String

type IsEnabled = scala.Boolean

type IsPublic = scala.Boolean

type JobArn = String

type JobCreationTime = js.Date

type JobFailureCode = String

type JobFailureList = js.Array[JobFailure]

type JobFailureReason = String

type JobId = String

type JobListDescriptorList = js.Array[JobListDescriptor]

type JobManifestFieldList = js.Array[JobManifestFieldName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ignore_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bucket
  - typingsJapgolly.awsSdk.awsSdkStrings.Key_
  - typingsJapgolly.awsSdk.awsSdkStrings.VersionId
  - java.lang.String
*/
type JobManifestFieldName = _JobManifestFieldName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3BatchOperations_CSV_20180820
  - typingsJapgolly.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20161130
  - java.lang.String
*/
type JobManifestFormat = _JobManifestFormat | String

type JobNumberOfTasksFailed = Double

type JobNumberOfTasksSucceeded = Double

type JobPriority = Double

type JobReportFormat = Report_CSV_20180820 | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AllTasks
  - typingsJapgolly.awsSdk.awsSdkStrings.FailedTasksOnly
  - java.lang.String
*/
type JobReportScope = _JobReportScope | String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.Pausing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Preparing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
  - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type JobStatus = _JobStatus | String

type JobStatusList = js.Array[JobStatus]

type JobStatusUpdateReason = String

type JobTerminationDate = js.Date

type JobTimeInStateSeconds = Double

type JobTotalNumberOfTasks = Double

type KmsKeyArnString = String

type LifecycleRules = js.Array[LifecycleRule]

type Location = String

type MFA = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADelete = _MFADelete | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADeleteStatus = _MFADeleteStatus | String

type ManifestPrefixString = String

type MaxLength1024String = String

type MaxResults = Double

type MinStorageBytesPercentage = Double

type MultiRegionAccessPointAlias = String

type MultiRegionAccessPointClientToken = String

type MultiRegionAccessPointName = String

type MultiRegionAccessPointRegionalResponseList = js.Array[MultiRegionAccessPointRegionalResponse]

type MultiRegionAccessPointReportList = js.Array[MultiRegionAccessPointReport]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.INCONSISTENT_ACROSS_REGIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIALLY_CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIALLY_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type MultiRegionAccessPointStatus = _MultiRegionAccessPointStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Internet_
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC
  - java.lang.String
*/
type NetworkOrigin = _NetworkOrigin | String

type NonEmptyMaxLength1024String = String

type NonEmptyMaxLength2048String = String

type NonEmptyMaxLength256String = String

type NonEmptyMaxLength64String = String

type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]

type ObjectCreationTime = js.Date

type ObjectLambdaAccessPointArn = String

type ObjectLambdaAccessPointList = js.Array[ObjectLambdaAccessPoint]

type ObjectLambdaAccessPointName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`GetObject-Range`
  - typingsJapgolly.awsSdk.awsSdkStrings.`GetObject-PartNumber`
  - typingsJapgolly.awsSdk.awsSdkStrings.`HeadObject-Range`
  - typingsJapgolly.awsSdk.awsSdkStrings.`HeadObject-PartNumber`
  - java.lang.String
*/
type ObjectLambdaAllowedFeature = _ObjectLambdaAllowedFeature | String

type ObjectLambdaAllowedFeaturesList = js.Array[ObjectLambdaAllowedFeature]

type ObjectLambdaPolicy = String

type ObjectLambdaSupportingAccessPointArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GetObject
  - typingsJapgolly.awsSdk.awsSdkStrings.HeadObject
  - typingsJapgolly.awsSdk.awsSdkStrings.ListObjects
  - typingsJapgolly.awsSdk.awsSdkStrings.ListObjectsV2
  - java.lang.String
*/
type ObjectLambdaTransformationConfigurationAction = _ObjectLambdaTransformationConfigurationAction | String

type ObjectLambdaTransformationConfigurationActionsList = js.Array[ObjectLambdaTransformationConfigurationAction]

type ObjectLambdaTransformationConfigurationsList = js.Array[ObjectLambdaTransformationConfiguration]

type ObjectLockEnabledForBucket = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaInvoke
  - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectCopy
  - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectAcl
  - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectTagging
  - typingsJapgolly.awsSdk.awsSdkStrings.S3DeleteObjectTagging
  - typingsJapgolly.awsSdk.awsSdkStrings.S3InitiateRestoreObject
  - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectLegalHold
  - typingsJapgolly.awsSdk.awsSdkStrings.S3PutObjectRetention
  - typingsJapgolly.awsSdk.awsSdkStrings.S3ReplicateObject
  - java.lang.String
*/
type OperationName = _OperationName | String

type OutputSchemaVersion = V_1 | String

type Policy = String

type Prefix = String

type PublicAccessBlockEnabled = scala.Boolean

type RegionCreationList = js.Array[Region]

type RegionName = String

type RegionReportList = js.Array[RegionReport]

type RegionalBucketList = js.Array[RegionalBucket]

type Regions = js.Array[S3AWSRegion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICA
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

type ReplicationStatusFilterList = js.Array[ReplicationStatus]

type ReportPrefixString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type RequestedJobStatus = _RequestedJobStatus | String

type S3AWSRegion = String

type S3AccessPointArn = String

type S3BucketArnString = String

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
type S3CannedAccessControlList = _S3CannedAccessControlList | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRC32
  - typingsJapgolly.awsSdk.awsSdkStrings.CRC32C
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA1
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA256
  - java.lang.String
*/
type S3ChecksumAlgorithm = _S3ChecksumAlgorithm | String

type S3ContentLength = Double

type S3ExpirationInDays = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BULK
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type S3GlacierJobTier = _S3GlacierJobTier | String

type S3GrantList = js.Array[S3Grant]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.id__
  - typingsJapgolly.awsSdk.awsSdkStrings.emailAddress_
  - typingsJapgolly.awsSdk.awsSdkStrings.uri_
  - java.lang.String
*/
type S3GranteeTypeIdentifier = _S3GranteeTypeIdentifier | String

type S3KeyArnString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type S3MetadataDirective = _S3MetadataDirective | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - typingsJapgolly.awsSdk.awsSdkStrings.ON
  - java.lang.String
*/
type S3ObjectLockLegalHoldStatus = _S3ObjectLockLegalHoldStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
  - java.lang.String
*/
type S3ObjectLockMode = _S3ObjectLockMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
  - java.lang.String
*/
type S3ObjectLockRetentionMode = _S3ObjectLockRetentionMode | String

type S3ObjectVersionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
  - java.lang.String
*/
type S3Permission = _S3Permission | String

type S3RegionalBucketArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256
  - typingsJapgolly.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type S3SSEAlgorithm = _S3SSEAlgorithm | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER_IR
  - java.lang.String
*/
type S3StorageClass = _S3StorageClass | String

type S3TagSet = js.Array[S3Tag]

type S3UserMetadata = StringDictionary[MaxLength1024String]

type SSEKMSKeyId = String

type Setting = scala.Boolean

type StorageLensArn = String

type StorageLensConfigurationList = js.Array[ListStorageLensConfigurationEntry]

type StorageLensPrefixLevelDelimiter = String

type StorageLensPrefixLevelMaxDepth = Double

type StorageLensTags = js.Array[StorageLensTag]

type StringForNextToken = String

type SuspendedCause = String

type SuspendedDate = js.Date

type TagKeyString = String

type TagValueString = String

type TimeStamp = js.Date

type TransitionList = js.Array[Transition]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - java.lang.String
*/
type TransitionStorageClass = _TransitionStorageClass | String

type VpcId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-08-20`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
