package typingsJapgolly.awsSdkClientS3Browser

import org.scalajs.dom.Blob
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typingsJapgolly.awsSdkClientS3Browser.typesAccelerateConfigurationMod.AccelerateConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesBucketLoggingStatusMod.BucketLoggingStatus
import typingsJapgolly.awsSdkClientS3Browser.typesCorsconfigurationMod.CORSConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesDeleteMod.Delete
import typingsJapgolly.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
import typingsJapgolly.awsSdkClientS3Browser.typesInventoryConfigurationMod.InventoryConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesMetricsConfigurationMod.MetricsConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import typingsJapgolly.awsSdkClientS3Browser.typesNotificationConfigurationMod.NotificationConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
import typingsJapgolly.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typingsJapgolly.awsSdkClientS3Browser.typesReplicationConfigurationMod.ReplicationConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesTaggingMod.Tagging
import typingsJapgolly.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typingsJapgolly.awsSdkClientS3Browser.typesVersioningConfigurationMod.VersioningConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesWebsiteConfigurationMod.WebsiteConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typingsJapgolly.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typingsJapgolly.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput
    - typingsJapgolly.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput
    - typingsJapgolly.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput
    - typingsJapgolly.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput
    - typingsJapgolly.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input
    - typingsJapgolly.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput[org.scalajs.dom.Blob]
    - typingsJapgolly.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput
    - typingsJapgolly.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput
    - typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
    - typingsJapgolly.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput[org.scalajs.dom.Blob]
    - typingsJapgolly.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput
  */
  type InputTypesUnion = _InputTypesUnion | PutObjectInput[Blob] | UploadPartInput[Blob]
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    inline def AbortMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsJapgolly.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    inline def CompleteMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsJapgolly.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    inline def CopyObjectInput(Bucket: String, CopySource: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput]
    }
    
    inline def CreateBucketInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput]
    }
    
    inline def CreateMultipartUploadInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput]
    }
    
    inline def DeleteBucketCorsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput]
    }
    
    inline def DeleteBucketEncryptionInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput]
    }
    
    inline def DeleteBucketInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput]
    }
    
    inline def DeleteBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput]
    }
    
    inline def DeleteBucketLifecycleInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput]
    }
    
    inline def DeleteBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput]
    }
    
    inline def DeleteBucketPolicyInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput]
    }
    
    inline def DeleteBucketReplicationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput]
    }
    
    inline def DeleteBucketTaggingInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput]
    }
    
    inline def DeleteBucketWebsiteInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput]
    }
    
    inline def DeleteObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput]
    }
    
    inline def DeleteObjectTaggingInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput]
    }
    
    inline def DeleteObjectsInput(Bucket: String, Delete: Delete): typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput]
    }
    
    inline def GetBucketAccelerateConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput]
    }
    
    inline def GetBucketAclInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput]
    }
    
    inline def GetBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput]
    }
    
    inline def GetBucketCorsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput]
    }
    
    inline def GetBucketEncryptionInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput]
    }
    
    inline def GetBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput]
    }
    
    inline def GetBucketLifecycleConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput]
    }
    
    inline def GetBucketLifecycleInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput]
    }
    
    inline def GetBucketLocationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput]
    }
    
    inline def GetBucketLoggingInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput]
    }
    
    inline def GetBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput]
    }
    
    inline def GetBucketNotificationConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput]
    }
    
    inline def GetBucketNotificationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput]
    }
    
    inline def GetBucketPolicyInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput]
    }
    
    inline def GetBucketReplicationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput]
    }
    
    inline def GetBucketRequestPaymentInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput]
    }
    
    inline def GetBucketTaggingInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput]
    }
    
    inline def GetBucketVersioningInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput]
    }
    
    inline def GetBucketWebsiteInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput]
    }
    
    inline def GetObjectAclInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput]
    }
    
    inline def GetObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput]
    }
    
    inline def GetObjectTaggingInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput]
    }
    
    inline def GetObjectTorrentInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput]
    }
    
    inline def HeadBucketInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput]
    }
    
    inline def HeadObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput]
    }
    
    inline def ListBucketAnalyticsConfigurationsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput]
    }
    
    inline def ListBucketInventoryConfigurationsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput]
    }
    
    inline def ListBucketMetricsConfigurationsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput]
    }
    
    inline def ListBucketsInput(): typingsJapgolly.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput]
    }
    
    inline def ListMultipartUploadsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    inline def ListObjectVersionsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput]
    }
    
    inline def ListObjectsInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput]
    }
    
    inline def ListObjectsV2Input(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input]
    }
    
    inline def ListPartsInput(Bucket: String, Key: String, UploadId: String): typingsJapgolly.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput]
    }
    
    inline def PutBucketAccelerateConfigurationInput(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput]
    }
    
    inline def PutBucketAclInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput]
    }
    
    inline def PutBucketAnalyticsConfigurationInput(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput]
    }
    
    inline def PutBucketCorsInput(Bucket: String, CORSConfiguration: CORSConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput]
    }
    
    inline def PutBucketEncryptionInput(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput]
    }
    
    inline def PutBucketInventoryConfigurationInput(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput]
    }
    
    inline def PutBucketLifecycleConfigurationInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput]
    }
    
    inline def PutBucketLifecycleInput(Bucket: String): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput]
    }
    
    inline def PutBucketLoggingInput(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput]
    }
    
    inline def PutBucketMetricsConfigurationInput(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput]
    }
    
    inline def PutBucketNotificationConfigurationInput(Bucket: String, NotificationConfiguration: NotificationConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput]
    }
    
    inline def PutBucketNotificationInput(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput]
    }
    
    inline def PutBucketPolicyInput(Bucket: String, Policy: String): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput]
    }
    
    inline def PutBucketReplicationInput(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput]
    }
    
    inline def PutBucketRequestPaymentInput(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput]
    }
    
    inline def PutBucketTaggingInput(Bucket: String, Tagging: Tagging): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput]
    }
    
    inline def PutBucketVersioningInput(Bucket: String, VersioningConfiguration: VersioningConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput]
    }
    
    inline def PutBucketWebsiteInput(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput]
    }
    
    inline def PutObjectAclInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput]
    }
    
    inline def PutObjectTaggingInput(Bucket: String, Key: String, Tagging: Tagging): typingsJapgolly.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput]
    }
    
    inline def RestoreObjectInput(Bucket: String, Key: String): typingsJapgolly.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput]
    }
    
    inline def SelectObjectContentInput(
      Bucket: String,
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      Key: String,
      OutputSerialization: OutputSerialization
    ): typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput]
    }
    
    inline def UploadPartCopyInput(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): typingsJapgolly.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput]
    }
  }
}
