package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMailboxExportJobResponse extends StObject {
  
  /**
    * The mailbox export job description.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.Description] = js.undefined
  
  /**
    * The mailbox export job end timestamp.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the user or resource associated with the mailbox.
    */
  var EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined
  
  /**
    * Error information for failed mailbox export jobs.
    */
  var ErrorInfo: js.UndefOr[MailboxExportErrorInfo] = js.undefined
  
  /**
    * The estimated progress of the mailbox export job, in percentage points.
    */
  var EstimatedProgress: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the exported mailbox content.
    */
  var KmsKeyArn: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.KmsKeyArn] = js.undefined
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon Simple Storage Service (Amazon S3) bucket.
    */
  var RoleArn: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.RoleArn] = js.undefined
  
  /**
    * The name of the S3 bucket.
    */
  var S3BucketName: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.S3BucketName] = js.undefined
  
  /**
    * The path to the S3 bucket and file that the mailbox export job is exporting to.
    */
  var S3Path: js.UndefOr[S3ObjectKey] = js.undefined
  
  /**
    * The S3 bucket prefix.
    */
  var S3Prefix: js.UndefOr[S3ObjectKey] = js.undefined
  
  /**
    * The mailbox export job start timestamp.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the mailbox export job.
    */
  var State: js.UndefOr[MailboxExportJobState] = js.undefined
}
object DescribeMailboxExportJobResponse {
  
  inline def apply(): DescribeMailboxExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMailboxExportJobResponse]
  }
  
  extension [Self <: DescribeMailboxExportJobResponse](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    inline def setErrorInfo(value: MailboxExportErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    inline def setEstimatedProgress(value: Percentage): Self = StObject.set(x, "EstimatedProgress", value.asInstanceOf[js.Any])
    
    inline def setEstimatedProgressUndefined: Self = StObject.set(x, "EstimatedProgress", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3Path(value: S3ObjectKey): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    inline def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    inline def setS3Prefix(value: S3ObjectKey): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: MailboxExportJobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
