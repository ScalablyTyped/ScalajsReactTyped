package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typingsJapgolly.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsJapgolly.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
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
  
  trait _OutputTypesUnion extends StObject
  object _OutputTypesUnion {
    
    inline def AbortMultipartUploadOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    inline def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    inline def CopyObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    inline def CreateBucketOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    inline def CreateMultipartUploadOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    inline def DeleteBucketCorsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    inline def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    inline def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    inline def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    inline def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    inline def DeleteBucketOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    inline def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    inline def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    inline def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    inline def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    inline def DeleteObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    inline def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    inline def DeleteObjectsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    inline def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    inline def GetBucketAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    inline def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    inline def GetBucketCorsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    inline def GetBucketEncryptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    inline def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    inline def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    inline def GetBucketLifecycleOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    inline def GetBucketLocationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    inline def GetBucketLoggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    inline def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    inline def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    inline def GetBucketNotificationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    inline def GetBucketPolicyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    inline def GetBucketReplicationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    inline def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    inline def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsJapgolly.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    inline def GetBucketVersioningOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    inline def GetBucketWebsiteOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    inline def GetObjectAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    inline def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    inline def HeadBucketOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    inline def HeadObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    inline def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    inline def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    inline def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    inline def ListBucketsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    inline def ListMultipartUploadsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    inline def ListObjectVersionsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    inline def ListObjectsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    inline def ListObjectsV2Output($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    inline def ListPartsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput]
    }
    
    inline def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    inline def PutBucketAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    inline def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    inline def PutBucketCorsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    inline def PutBucketEncryptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    inline def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    inline def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    inline def PutBucketLifecycleOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    inline def PutBucketLoggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    inline def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    inline def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    inline def PutBucketNotificationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    inline def PutBucketPolicyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    inline def PutBucketReplicationOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    inline def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    inline def PutBucketTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    inline def PutBucketVersioningOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    inline def PutBucketWebsiteOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    inline def PutObjectAclOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    inline def PutObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    inline def PutObjectTaggingOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    inline def RestoreObjectOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    inline def SelectObjectContentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    inline def UploadPartCopyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    inline def UploadPartOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
