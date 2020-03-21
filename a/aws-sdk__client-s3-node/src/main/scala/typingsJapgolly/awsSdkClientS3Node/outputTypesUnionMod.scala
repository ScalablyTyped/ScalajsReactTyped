package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typingsJapgolly.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/OutputTypesUnion", JSImport.Namespace)
@js.native
object outputTypesUnionMod extends js.Object {
  trait _OutputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
    - typingsJapgolly.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
    - typingsJapgolly.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
    - typingsJapgolly.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput
    - typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput[typingsJapgolly.node.streamMod.Readable]
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[typingsJapgolly.node.streamMod.Readable]
    - typingsJapgolly.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput
    - typingsJapgolly.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output
    - typingsJapgolly.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput
    - typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
    - typingsJapgolly.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput
    - typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
    - typingsJapgolly.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput
    - typingsJapgolly.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput
  */
  type OutputTypesUnion = _OutputTypesUnion | GetObjectOutput[Readable] | GetObjectTorrentOutput[Readable]
}

