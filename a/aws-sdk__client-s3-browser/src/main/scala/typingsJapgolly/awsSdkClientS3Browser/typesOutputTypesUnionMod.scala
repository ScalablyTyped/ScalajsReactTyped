package typingsJapgolly.awsSdkClientS3Browser

import org.scalajs.dom.Blob
import typingsJapgolly.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsJapgolly.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput[org.scalajs.dom.Blob]
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[org.scalajs.dom.Blob]
    - typingsJapgolly.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output
    - typingsJapgolly.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput
    - typingsJapgolly.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput
  */
  type OutputTypesUnion = _OutputTypesUnion | GetObjectOutput[Blob] | GetObjectTorrentOutput[Blob]
  
  trait _OutputTypesUnion extends StObject
  object _OutputTypesUnion {
    
    inline def AbortMultipartUploadOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    inline def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    inline def CopyObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    inline def CreateBucketOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    inline def CreateMultipartUploadOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    inline def DeleteBucketCorsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    inline def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    inline def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    inline def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    inline def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    inline def DeleteBucketOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    inline def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    inline def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    inline def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    inline def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    inline def DeleteObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    inline def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    inline def DeleteObjectsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    inline def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    inline def GetBucketAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    inline def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    inline def GetBucketCorsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    inline def GetBucketEncryptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    inline def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    inline def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    inline def GetBucketLifecycleOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    inline def GetBucketLocationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    inline def GetBucketLoggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    inline def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    inline def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    inline def GetBucketNotificationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    inline def GetBucketPolicyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    inline def GetBucketReplicationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    inline def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    inline def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    inline def GetBucketVersioningOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    inline def GetBucketWebsiteOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    inline def GetObjectAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    inline def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    inline def HeadBucketOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    inline def HeadObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    inline def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    inline def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    inline def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    inline def ListBucketsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    inline def ListMultipartUploadsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    inline def ListObjectVersionsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    inline def ListObjectsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    inline def ListObjectsV2Output($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    inline def ListPartsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput]
    }
    
    inline def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    inline def PutBucketAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    inline def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    inline def PutBucketCorsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    inline def PutBucketEncryptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    inline def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    inline def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    inline def PutBucketLifecycleOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    inline def PutBucketLoggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    inline def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    inline def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    inline def PutBucketNotificationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    inline def PutBucketPolicyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    inline def PutBucketReplicationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    inline def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    inline def PutBucketTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    inline def PutBucketVersioningOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    inline def PutBucketWebsiteOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    inline def PutObjectAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    inline def PutObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    inline def PutObjectTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    inline def RestoreObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    inline def SelectObjectContentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    inline def UploadPartCopyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    inline def UploadPartOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
