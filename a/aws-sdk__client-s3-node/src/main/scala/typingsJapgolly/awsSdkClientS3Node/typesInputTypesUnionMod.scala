package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsJapgolly.awsSdkClientS3Node.typesAccelerateConfigurationMod.AccelerateConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesBucketLoggingStatusMod.BucketLoggingStatus
import typingsJapgolly.awsSdkClientS3Node.typesCorsconfigurationMod.CORSConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteMod.Delete
import typingsJapgolly.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typingsJapgolly.awsSdkClientS3Node.typesInventoryConfigurationMod.InventoryConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesMetricsConfigurationMod.MetricsConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import typingsJapgolly.awsSdkClientS3Node.typesNotificationConfigurationMod.NotificationConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typingsJapgolly.awsSdkClientS3Node.typesReplicationConfigurationMod.ReplicationConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesTaggingMod.Tagging
import typingsJapgolly.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsJapgolly.awsSdkClientS3Node.typesVersioningConfigurationMod.VersioningConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesWebsiteConfigurationMod.WebsiteConfiguration
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
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
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    inline def AbortMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsJapgolly.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    inline def CompleteMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsJapgolly.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    inline def CopyObjectInput(Bucket: String, CopySource: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput]
    }
    
    inline def CreateBucketInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput]
    }
    
    inline def CreateMultipartUploadInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput]
    }
    
    inline def DeleteBucketCorsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput]
    }
    
    inline def DeleteBucketEncryptionInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput]
    }
    
    inline def DeleteBucketInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput]
    }
    
    inline def DeleteBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput]
    }
    
    inline def DeleteBucketLifecycleInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput]
    }
    
    inline def DeleteBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput]
    }
    
    inline def DeleteBucketPolicyInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput]
    }
    
    inline def DeleteBucketReplicationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput]
    }
    
    inline def DeleteBucketTaggingInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput]
    }
    
    inline def DeleteBucketWebsiteInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput]
    }
    
    inline def DeleteObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput]
    }
    
    inline def DeleteObjectTaggingInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput]
    }
    
    inline def DeleteObjectsInput(Bucket: String, Delete: Delete): typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput]
    }
    
    inline def GetBucketAccelerateConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput]
    }
    
    inline def GetBucketAclInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput]
    }
    
    inline def GetBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput]
    }
    
    inline def GetBucketCorsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput]
    }
    
    inline def GetBucketEncryptionInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput]
    }
    
    inline def GetBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput]
    }
    
    inline def GetBucketLifecycleConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput]
    }
    
    inline def GetBucketLifecycleInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput]
    }
    
    inline def GetBucketLocationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput]
    }
    
    inline def GetBucketLoggingInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput]
    }
    
    inline def GetBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput]
    }
    
    inline def GetBucketNotificationConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput]
    }
    
    inline def GetBucketNotificationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput]
    }
    
    inline def GetBucketPolicyInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput]
    }
    
    inline def GetBucketReplicationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput]
    }
    
    inline def GetBucketRequestPaymentInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput]
    }
    
    inline def GetBucketTaggingInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput]
    }
    
    inline def GetBucketVersioningInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput]
    }
    
    inline def GetBucketWebsiteInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput]
    }
    
    inline def GetObjectAclInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput]
    }
    
    inline def GetObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput]
    }
    
    inline def GetObjectTaggingInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput]
    }
    
    inline def GetObjectTorrentInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput]
    }
    
    inline def HeadBucketInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput]
    }
    
    inline def HeadObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput]
    }
    
    inline def ListBucketAnalyticsConfigurationsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput]
    }
    
    inline def ListBucketInventoryConfigurationsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput]
    }
    
    inline def ListBucketMetricsConfigurationsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput]
    }
    
    inline def ListBucketsInput(): typingsJapgolly.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput]
    }
    
    inline def ListMultipartUploadsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    inline def ListObjectVersionsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput]
    }
    
    inline def ListObjectsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput]
    }
    
    inline def ListObjectsV2Input(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input]
    }
    
    inline def ListPartsInput(Bucket: String, Key: String, UploadId: String): typingsJapgolly.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput]
    }
    
    inline def PutBucketAccelerateConfigurationInput(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput]
    }
    
    inline def PutBucketAclInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput]
    }
    
    inline def PutBucketAnalyticsConfigurationInput(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput]
    }
    
    inline def PutBucketCorsInput(Bucket: String, CORSConfiguration: CORSConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput]
    }
    
    inline def PutBucketEncryptionInput(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput]
    }
    
    inline def PutBucketInventoryConfigurationInput(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput]
    }
    
    inline def PutBucketLifecycleConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput]
    }
    
    inline def PutBucketLifecycleInput(Bucket: String): typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput]
    }
    
    inline def PutBucketLoggingInput(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): typingsJapgolly.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput]
    }
    
    inline def PutBucketMetricsConfigurationInput(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput]
    }
    
    inline def PutBucketNotificationConfigurationInput(Bucket: String, NotificationConfiguration: NotificationConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput]
    }
    
    inline def PutBucketNotificationInput(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput]
    }
    
    inline def PutBucketPolicyInput(Bucket: String, Policy: String): typingsJapgolly.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput]
    }
    
    inline def PutBucketReplicationInput(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput]
    }
    
    inline def PutBucketRequestPaymentInput(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput]
    }
    
    inline def PutBucketTaggingInput(Bucket: String, Tagging: Tagging): typingsJapgolly.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput]
    }
    
    inline def PutBucketVersioningInput(Bucket: String, VersioningConfiguration: VersioningConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput]
    }
    
    inline def PutBucketWebsiteInput(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput]
    }
    
    inline def PutObjectAclInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput]
    }
    
    inline def PutObjectTaggingInput(Bucket: String, Key: String, Tagging: Tagging): typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput]
    }
    
    inline def RestoreObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput]
    }
    
    inline def SelectObjectContentInput(
      Bucket: String,
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      Key: String,
      OutputSerialization: OutputSerialization
    ): typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput]
    }
    
    inline def UploadPartCopyInput(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): typingsJapgolly.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput]
    }
  }
}
