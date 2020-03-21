package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typingsJapgolly.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  trait _InputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typingsJapgolly.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typingsJapgolly.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput
    - typingsJapgolly.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
    - typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput
    - typingsJapgolly.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput
    - typingsJapgolly.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
    - typingsJapgolly.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input
    - typingsJapgolly.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput[typingsJapgolly.node.streamMod.Readable]
    - typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
    - typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
    - typingsJapgolly.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput
    - typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
    - typingsJapgolly.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput[typingsJapgolly.node.streamMod.Readable]
    - typingsJapgolly.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput
  */
  type InputTypesUnion = _InputTypesUnion | PutObjectInput[Readable] | UploadPartInput[Readable]
}

