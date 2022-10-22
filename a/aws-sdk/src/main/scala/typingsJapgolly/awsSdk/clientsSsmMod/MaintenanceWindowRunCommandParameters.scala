package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowRunCommandParameters extends StObject {
  
  var CloudWatchOutputConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.CloudWatchOutputConfig] = js.undefined
  
  /**
    * Information about the commands to run.
    */
  var Comment: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.Comment] = js.undefined
  
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var DocumentHash: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DocumentHash] = js.undefined
  
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
    */
  var DocumentHashType: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DocumentHashType] = js.undefined
  
  /**
    * The Amazon Web Services Systems Manager document (SSM document) version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the Amazon Web Services CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example:  --document-version "\$DEFAULT"   --document-version "\$LATEST"   --document-version "3" 
    */
  var DocumentVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * Configurations for sending notifications about command status changes on a per-managed node basis.
    */
  var NotificationConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.NotificationConfig] = js.undefined
  
  /**
    * The name of the Amazon Simple Storage Service (Amazon S3) bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * The parameters for the RUN_COMMAND task execution.
    */
  var Parameters: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.Parameters] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  
  /**
    * If this time is reached and the command hasn't already started running, it doesn't run.
    */
  var TimeoutSeconds: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.TimeoutSeconds] = js.undefined
}
object MaintenanceWindowRunCommandParameters {
  
  inline def apply(): MaintenanceWindowRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
  }
  
  extension [Self <: MaintenanceWindowRunCommandParameters](x: Self) {
    
    inline def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = StObject.set(x, "CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchOutputConfigUndefined: Self = StObject.set(x, "CloudWatchOutputConfig", js.undefined)
    
    inline def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setDocumentHash(value: DocumentHash): Self = StObject.set(x, "DocumentHash", value.asInstanceOf[js.Any])
    
    inline def setDocumentHashType(value: DocumentHashType): Self = StObject.set(x, "DocumentHashType", value.asInstanceOf[js.Any])
    
    inline def setDocumentHashTypeUndefined: Self = StObject.set(x, "DocumentHashType", js.undefined)
    
    inline def setDocumentHashUndefined: Self = StObject.set(x, "DocumentHash", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "NotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "NotificationConfig", js.undefined)
    
    inline def setOutputS3BucketName(value: S3BucketName): Self = StObject.set(x, "OutputS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputS3BucketNameUndefined: Self = StObject.set(x, "OutputS3BucketName", js.undefined)
    
    inline def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "OutputS3KeyPrefix", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setTimeoutSeconds(value: TimeoutSeconds): Self = StObject.set(x, "TimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "TimeoutSeconds", js.undefined)
  }
}
