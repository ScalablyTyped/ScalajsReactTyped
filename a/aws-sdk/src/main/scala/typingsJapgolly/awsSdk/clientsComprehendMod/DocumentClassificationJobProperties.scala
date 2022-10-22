package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassificationJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. 
    */
  var DocumentClassifierArn: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.DocumentClassifierArn] = js.undefined
  
  /**
    * The time that the document classification job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input data configuration that you supplied when you created the document classification job.
    */
  var InputDataConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.InputDataConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the document classification job. It is a unique, fully qualified identifier for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:  arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;  The following is an example job ARN:  arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab 
    */
  var JobArn: js.UndefOr[ComprehendArn] = js.undefined
  
  /**
    * The identifier assigned to the document classification job.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * The name that you assigned to the document classification job.
    */
  var JobName: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobName] = js.undefined
  
  /**
    * The current status of the document classification job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
  
  /**
    * A description of the status of the job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The output data configuration that you supplied when you created the document classification job.
    */
  var OutputDataConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.OutputDataConfig] = js.undefined
  
  /**
    * The time that the document classification job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your document classification job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.VpcConfig] = js.undefined
}
object DocumentClassificationJobProperties {
  
  inline def apply(): DocumentClassificationJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassificationJobProperties]
  }
  
  extension [Self <: DocumentClassificationJobProperties](x: Self) {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierArnUndefined: Self = StObject.set(x, "DocumentClassifierArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setJobArn(value: ComprehendArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "JobArn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
