package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3Mod {
  type AbortDate = js.Date
  type AbortRuleId = java.lang.String
  type AcceptRanges = java.lang.String
  type AccountId = java.lang.String
  type AllowQuotedRecordDelimiter = scala.Boolean
  type AllowedHeader = java.lang.String
  type AllowedHeaders = js.Array[typingsJapgolly.awsSdk.s3Mod.AllowedHeader]
  type AllowedMethod = java.lang.String
  type AllowedMethods = js.Array[typingsJapgolly.awsSdk.s3Mod.AllowedMethod]
  type AllowedOrigin = java.lang.String
  type AllowedOrigins = js.Array[typingsJapgolly.awsSdk.s3Mod.AllowedOrigin]
  type AnalyticsConfigurationList = js.Array[typingsJapgolly.awsSdk.s3Mod.AnalyticsConfiguration]
  type AnalyticsId = java.lang.String
  type AnalyticsS3ExportFileFormat = typingsJapgolly.awsSdk.awsSdkStrings.CSV | java.lang.String
  type Body = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.s3Mod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type BucketAccelerateStatus = typingsJapgolly.awsSdk.s3Mod._BucketAccelerateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.private__
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
    - java.lang.String
  */
  type BucketCannedACL = typingsJapgolly.awsSdk.s3Mod._BucketCannedACL | java.lang.String
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
  type BucketLocationConstraint = typingsJapgolly.awsSdk.s3Mod._BucketLocationConstraint | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsJapgolly.awsSdk.awsSdkStrings.READ
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
    - java.lang.String
  */
  type BucketLogsPermission = typingsJapgolly.awsSdk.s3Mod._BucketLogsPermission | java.lang.String
  type BucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type BucketVersioningStatus = typingsJapgolly.awsSdk.s3Mod._BucketVersioningStatus | java.lang.String
  type Buckets = js.Array[typingsJapgolly.awsSdk.s3Mod.Bucket]
  type BypassGovernanceRetention = scala.Boolean
  type BytesProcessed = scala.Double
  type BytesReturned = scala.Double
  type BytesScanned = scala.Double
  type CORSRules = js.Array[typingsJapgolly.awsSdk.s3Mod.CORSRule]
  type CacheControl = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typingsJapgolly.awsSdk.s3Mod.ClientApiVersions
  type CloudFunction = java.lang.String
  type CloudFunctionInvocationRole = java.lang.String
  type Code = java.lang.String
  type Comments = java.lang.String
  type CommonPrefixList = js.Array[typingsJapgolly.awsSdk.s3Mod.CommonPrefix]
  type CompletedPartList = js.Array[typingsJapgolly.awsSdk.s3Mod.CompletedPart]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.BZIP2
    - java.lang.String
  */
  type CompressionType = typingsJapgolly.awsSdk.s3Mod._CompressionType | java.lang.String
  type ConfirmRemoveSelfBucketAccess = scala.Boolean
  type ContentDisposition = java.lang.String
  type ContentEncoding = java.lang.String
  type ContentLanguage = java.lang.String
  type ContentLength = scala.Double
  type ContentMD5 = java.lang.String
  type ContentRange = java.lang.String
  type ContentType = java.lang.String
  type CopySource = java.lang.String
  type CopySourceIfMatch = java.lang.String
  type CopySourceIfModifiedSince = js.Date
  type CopySourceIfNoneMatch = java.lang.String
  type CopySourceIfUnmodifiedSince = js.Date
  type CopySourceRange = java.lang.String
  type CopySourceSSECustomerAlgorithm = java.lang.String
  type CopySourceSSECustomerKey = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.s3Mod.Blob | java.lang.String
  type CopySourceSSECustomerKeyMD5 = java.lang.String
  type CopySourceVersionId = java.lang.String
  type CreationDate = js.Date
  type Date = js.Date
  type Days = scala.Double
  type DaysAfterInitiation = scala.Double
  type DeleteMarker = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type DeleteMarkerReplicationStatus = typingsJapgolly.awsSdk.s3Mod._DeleteMarkerReplicationStatus | java.lang.String
  type DeleteMarkerVersionId = java.lang.String
  type DeleteMarkers = js.Array[typingsJapgolly.awsSdk.s3Mod.DeleteMarkerEntry]
  type DeletedObjects = js.Array[typingsJapgolly.awsSdk.s3Mod.DeletedObject]
  type Delimiter = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type ETag = java.lang.String
  type EmailAddress = java.lang.String
  type EnableRequestProgress = scala.Boolean
  type EncodingType = typingsJapgolly.awsSdk.awsSdkStrings.url_ | java.lang.String
  type End = scala.Double
  type Errors = js.Array[typingsJapgolly.awsSdk.s3Mod.Error]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReducedRedundancyLostObject
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonAsterisk
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPut
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPost
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCopy
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonAsterisk
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDelete
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonAsterisk
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonPost
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonAsterisk
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationFailedReplication
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationNotTracked
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationMissedThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
    - java.lang.String
  */
  type Event = typingsJapgolly.awsSdk.s3Mod._Event | java.lang.String
  type EventList = js.Array[typingsJapgolly.awsSdk.s3Mod.Event]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ExistingObjectReplicationStatus = typingsJapgolly.awsSdk.s3Mod._ExistingObjectReplicationStatus | java.lang.String
  type Expiration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ExpirationStatus = typingsJapgolly.awsSdk.s3Mod._ExpirationStatus | java.lang.String
  type ExpiredObjectDeleteMarker = scala.Boolean
  type Expires = js.Date
  type ExposeHeader = java.lang.String
  type ExposeHeaders = js.Array[typingsJapgolly.awsSdk.s3Mod.ExposeHeader]
  type Expression = java.lang.String
  type ExpressionType = typingsJapgolly.awsSdk.awsSdkStrings.SQL | java.lang.String
  type FetchOwner = scala.Boolean
  type FieldDelimiter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USE
    - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = typingsJapgolly.awsSdk.s3Mod._FileHeaderInfo | java.lang.String
  type FilterRuleList = js.Array[typingsJapgolly.awsSdk.s3Mod.FilterRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.prefix_
    - typingsJapgolly.awsSdk.awsSdkStrings.suffix
    - java.lang.String
  */
  type FilterRuleName = typingsJapgolly.awsSdk.s3Mod._FilterRuleName | java.lang.String
  type FilterRuleValue = java.lang.String
  type GrantFullControl = java.lang.String
  type GrantRead = java.lang.String
  type GrantReadACP = java.lang.String
  type GrantWrite = java.lang.String
  type GrantWriteACP = java.lang.String
  type Grants = js.Array[typingsJapgolly.awsSdk.s3Mod.Grant]
  type HostName = java.lang.String
  type HttpErrorCodeReturnedEquals = java.lang.String
  type HttpRedirectCode = java.lang.String
  type ID = java.lang.String
  type IfMatch = java.lang.String
  type IfModifiedSince = js.Date
  type IfNoneMatch = java.lang.String
  type IfUnmodifiedSince = js.Date
  type Initiated = js.Date
  type InventoryConfigurationList = js.Array[typingsJapgolly.awsSdk.s3Mod.InventoryConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.ORC
    - typingsJapgolly.awsSdk.awsSdkStrings.Parquet
    - java.lang.String
  */
  type InventoryFormat = typingsJapgolly.awsSdk.s3Mod._InventoryFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Daily_
    - typingsJapgolly.awsSdk.awsSdkStrings.Weekly_
    - java.lang.String
  */
  type InventoryFrequency = typingsJapgolly.awsSdk.s3Mod._InventoryFrequency | java.lang.String
  type InventoryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.All_
    - typingsJapgolly.awsSdk.awsSdkStrings.Current_
    - java.lang.String
  */
  type InventoryIncludedObjectVersions = typingsJapgolly.awsSdk.s3Mod._InventoryIncludedObjectVersions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Size_
    - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedDate
    - typingsJapgolly.awsSdk.awsSdkStrings.StorageClass
    - typingsJapgolly.awsSdk.awsSdkStrings.ETag
    - typingsJapgolly.awsSdk.awsSdkStrings.IsMultipartUploaded
    - typingsJapgolly.awsSdk.awsSdkStrings.ReplicationStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.EncryptionStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.ObjectLockRetainUntilDate
    - typingsJapgolly.awsSdk.awsSdkStrings.ObjectLockMode
    - typingsJapgolly.awsSdk.awsSdkStrings.ObjectLockLegalHoldStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.IntelligentTieringAccessTier
    - java.lang.String
  */
  type InventoryOptionalField = typingsJapgolly.awsSdk.s3Mod._InventoryOptionalField | java.lang.String
  type InventoryOptionalFields = js.Array[typingsJapgolly.awsSdk.s3Mod.InventoryOptionalField]
  type IsEnabled = scala.Boolean
  type IsLatest = scala.Boolean
  type IsPublic = scala.Boolean
  type IsTruncated = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.LINES
    - java.lang.String
  */
  type JSONType = typingsJapgolly.awsSdk.s3Mod._JSONType | java.lang.String
  type KMSContext = java.lang.String
  type KeyCount = scala.Double
  type KeyMarker = java.lang.String
  type KeyPrefixEquals = java.lang.String
  type LambdaFunctionArn = java.lang.String
  type LambdaFunctionConfigurationList = js.Array[typingsJapgolly.awsSdk.s3Mod.LambdaFunctionConfiguration]
  type LastModified = js.Date
  type LifecycleRules = js.Array[typingsJapgolly.awsSdk.s3Mod.LifecycleRule]
  type Location = java.lang.String
  type LocationPrefix = java.lang.String
  type MFA = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type MFADelete = typingsJapgolly.awsSdk.s3Mod._MFADelete | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type MFADeleteStatus = typingsJapgolly.awsSdk.s3Mod._MFADeleteStatus | java.lang.String
  type Marker = java.lang.String
  type MaxAgeSeconds = scala.Double
  type MaxKeys = scala.Double
  type MaxParts = scala.Double
  type MaxUploads = scala.Double
  type Message = java.lang.String
  type Metadata = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.s3Mod.MetadataValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COPY
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type MetadataDirective = typingsJapgolly.awsSdk.s3Mod._MetadataDirective | java.lang.String
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type MetricsConfigurationList = js.Array[typingsJapgolly.awsSdk.s3Mod.MetricsConfiguration]
  type MetricsId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type MetricsStatus = typingsJapgolly.awsSdk.s3Mod._MetricsStatus | java.lang.String
  type Minutes = scala.Double
  type MissingMeta = scala.Double
  type MultipartUploadId = java.lang.String
  type MultipartUploadList = js.Array[typingsJapgolly.awsSdk.s3Mod.MultipartUpload]
  type NextKeyMarker = java.lang.String
  type NextMarker = java.lang.String
  type NextPartNumberMarker = scala.Double
  type NextToken = java.lang.String
  type NextUploadIdMarker = java.lang.String
  type NextVersionIdMarker = java.lang.String
  type NoncurrentVersionTransitionList = js.Array[typingsJapgolly.awsSdk.s3Mod.NoncurrentVersionTransition]
  type NotificationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.private__
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type ObjectCannedACL = typingsJapgolly.awsSdk.s3Mod._ObjectCannedACL | java.lang.String
  type ObjectIdentifierList = js.Array[typingsJapgolly.awsSdk.s3Mod.ObjectIdentifier]
  type ObjectKey = java.lang.String
  type ObjectList = js.Array[typingsJapgolly.awsSdk.s3Mod.Object]
  type ObjectLockEnabled = typingsJapgolly.awsSdk.awsSdkStrings.Enabled_ | java.lang.String
  type ObjectLockEnabledForBucket = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ON
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type ObjectLockLegalHoldStatus = typingsJapgolly.awsSdk.s3Mod._ObjectLockLegalHoldStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockMode = typingsJapgolly.awsSdk.s3Mod._ObjectLockMode | java.lang.String
  type ObjectLockRetainUntilDate = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockRetentionMode = typingsJapgolly.awsSdk.s3Mod._ObjectLockRetentionMode | java.lang.String
  type ObjectLockToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type ObjectStorageClass = typingsJapgolly.awsSdk.s3Mod._ObjectStorageClass | java.lang.String
  type ObjectVersionId = java.lang.String
  type ObjectVersionList = js.Array[typingsJapgolly.awsSdk.s3Mod.ObjectVersion]
  type ObjectVersionStorageClass = typingsJapgolly.awsSdk.awsSdkStrings.STANDARD | java.lang.String
  type OwnerOverride = typingsJapgolly.awsSdk.awsSdkStrings.Destination | java.lang.String
  type PartNumber = scala.Double
  type PartNumberMarker = scala.Double
  type Parts = js.Array[typingsJapgolly.awsSdk.s3Mod.Part]
  type PartsCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Requester
    - typingsJapgolly.awsSdk.awsSdkStrings.BucketOwner
    - java.lang.String
  */
  type Payer = typingsJapgolly.awsSdk.s3Mod._Payer | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
    - typingsJapgolly.awsSdk.awsSdkStrings.READ
    - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
    - java.lang.String
  */
  type Permission = typingsJapgolly.awsSdk.s3Mod._Permission | java.lang.String
  type Policy = java.lang.String
  type Prefix = java.lang.String
  type Priority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.http_
    - typingsJapgolly.awsSdk.awsSdkStrings.https_
    - java.lang.String
  */
  type Protocol = typingsJapgolly.awsSdk.s3Mod._Protocol | java.lang.String
  type QueueArn = java.lang.String
  type QueueConfigurationList = js.Array[typingsJapgolly.awsSdk.s3Mod.QueueConfiguration]
  type Quiet = scala.Boolean
  type QuoteCharacter = java.lang.String
  type QuoteEscapeCharacter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = typingsJapgolly.awsSdk.s3Mod._QuoteFields | java.lang.String
  type Range = java.lang.String
  type RecordDelimiter = java.lang.String
  type ReplaceKeyPrefixWith = java.lang.String
  type ReplaceKeyWith = java.lang.String
  type ReplicaKmsKeyID = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ReplicationRuleStatus = typingsJapgolly.awsSdk.s3Mod._ReplicationRuleStatus | java.lang.String
  type ReplicationRules = js.Array[typingsJapgolly.awsSdk.s3Mod.ReplicationRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICA
    - java.lang.String
  */
  type ReplicationStatus = typingsJapgolly.awsSdk.s3Mod._ReplicationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ReplicationTimeStatus = typingsJapgolly.awsSdk.s3Mod._ReplicationTimeStatus | java.lang.String
  type RequestCharged = typingsJapgolly.awsSdk.awsSdkStrings.requester_ | java.lang.String
  type RequestPayer = typingsJapgolly.awsSdk.awsSdkStrings.requester_ | java.lang.String
  type ResponseCacheControl = java.lang.String
  type ResponseContentDisposition = java.lang.String
  type ResponseContentEncoding = java.lang.String
  type ResponseContentLanguage = java.lang.String
  type ResponseContentType = java.lang.String
  type ResponseExpires = js.Date
  type Restore = java.lang.String
  type RestoreOutputPath = java.lang.String
  type RestoreRequestType = typingsJapgolly.awsSdk.awsSdkStrings.SELECT | java.lang.String
  type Role = java.lang.String
  type RoutingRules = js.Array[typingsJapgolly.awsSdk.s3Mod.RoutingRule]
  type Rules = js.Array[typingsJapgolly.awsSdk.s3Mod.Rule]
  type SSECustomerAlgorithm = java.lang.String
  type SSECustomerKey = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.s3Mod.Blob | java.lang.String
  type SSECustomerKeyMD5 = java.lang.String
  type SSEKMSEncryptionContext = java.lang.String
  type SSEKMSKeyId = java.lang.String
  type SelectObjectContentEventStream = typingsJapgolly.awsSdk.eventStreamMod.EventStream[typingsJapgolly.awsSdk.AnonCont]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AES256
    - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
    - java.lang.String
  */
  type ServerSideEncryption = typingsJapgolly.awsSdk.s3Mod._ServerSideEncryption | java.lang.String
  type ServerSideEncryptionRules = js.Array[typingsJapgolly.awsSdk.s3Mod.ServerSideEncryptionRule]
  type Setting = scala.Boolean
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type SseKmsEncryptedObjectsStatus = typingsJapgolly.awsSdk.s3Mod._SseKmsEncryptedObjectsStatus | java.lang.String
  type Start = scala.Double
  type StartAfter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
    - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type StorageClass = typingsJapgolly.awsSdk.s3Mod._StorageClass | java.lang.String
  type StorageClassAnalysisSchemaVersion = typingsJapgolly.awsSdk.awsSdkStrings.V_1 | java.lang.String
  type Suffix = java.lang.String
  type TagCount = scala.Double
  type TagSet = js.Array[typingsJapgolly.awsSdk.s3Mod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COPY
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type TaggingDirective = typingsJapgolly.awsSdk.s3Mod._TaggingDirective | java.lang.String
  type TaggingHeader = java.lang.String
  type TargetBucket = java.lang.String
  type TargetGrants = js.Array[typingsJapgolly.awsSdk.s3Mod.TargetGrant]
  type TargetPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
    - typingsJapgolly.awsSdk.awsSdkStrings.Bulk_
    - typingsJapgolly.awsSdk.awsSdkStrings.Expedited
    - java.lang.String
  */
  type Tier = typingsJapgolly.awsSdk.s3Mod._Tier | java.lang.String
  type Token = java.lang.String
  type TopicArn = java.lang.String
  type TopicConfigurationList = js.Array[typingsJapgolly.awsSdk.s3Mod.TopicConfiguration]
  type TransitionList = js.Array[typingsJapgolly.awsSdk.s3Mod.Transition]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type TransitionStorageClass = typingsJapgolly.awsSdk.s3Mod._TransitionStorageClass | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CanonicalUser
    - typingsJapgolly.awsSdk.awsSdkStrings.AmazonCustomerByEmail
    - typingsJapgolly.awsSdk.awsSdkStrings.Group_
    - java.lang.String
  */
  type Type = typingsJapgolly.awsSdk.s3Mod._Type | java.lang.String
  type URI = java.lang.String
  type UploadIdMarker = java.lang.String
  type UserMetadata = js.Array[typingsJapgolly.awsSdk.s3Mod.MetadataEntry]
  type Value = java.lang.String
  type VersionIdMarker = java.lang.String
  type WebsiteRedirectLocation = java.lang.String
  type Years = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2006-03-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.s3Mod._apiVersion | java.lang.String
}
