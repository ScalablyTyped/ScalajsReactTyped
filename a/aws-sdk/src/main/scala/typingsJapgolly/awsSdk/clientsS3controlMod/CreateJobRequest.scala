package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID that creates the job.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.
    */
  var ClientRequestToken: NonEmptyMaxLength64String
  
  /**
    * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typingsJapgolly.awsSdk.clientsS3controlMod.ConfirmationRequired] = js.undefined
  
  /**
    * A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined
  
  /**
    * Configuration parameters for the manifest.
    */
  var Manifest: js.UndefOr[JobManifest] = js.undefined
  
  /**
    * The attribute container for the ManifestGenerator details. Jobs must be created with either a manifest file or a ManifestGenerator, but not both.
    */
  var ManifestGenerator: js.UndefOr[JobManifestGenerator] = js.undefined
  
  /**
    * The action that you want this job to perform on every object listed in the manifest. For more information about the available actions, see Operations in the Amazon S3 User Guide.
    */
  var Operation: JobOperation
  
  /**
    * The numerical priority for this job. Higher numbers indicate higher priority.
    */
  var Priority: JobPriority
  
  /**
    * Configuration parameters for the optional job-completion report.
    */
  var Report: JobReport
  
  /**
    * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) role that Batch Operations will use to run this job's action on every object in the manifest.
    */
  var RoleArn: IAMRoleArn
  
  /**
    * A set of tags to associate with the S3 Batch Operations job. This is an optional parameter. 
    */
  var Tags: js.UndefOr[S3TagSet] = js.undefined
}
object CreateJobRequest {
  
  inline def apply(
    AccountId: AccountId,
    ClientRequestToken: NonEmptyMaxLength64String,
    Operation: JobOperation,
    Priority: JobPriority,
    Report: JobReport,
    RoleArn: IAMRoleArn
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  extension [Self <: CreateJobRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: NonEmptyMaxLength64String): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setConfirmationRequired(value: ConfirmationRequired): Self = StObject.set(x, "ConfirmationRequired", value.asInstanceOf[js.Any])
    
    inline def setConfirmationRequiredUndefined: Self = StObject.set(x, "ConfirmationRequired", js.undefined)
    
    inline def setDescription(value: NonEmptyMaxLength256String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setManifest(value: JobManifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestGenerator(value: JobManifestGenerator): Self = StObject.set(x, "ManifestGenerator", value.asInstanceOf[js.Any])
    
    inline def setManifestGeneratorUndefined: Self = StObject.set(x, "ManifestGenerator", js.undefined)
    
    inline def setManifestUndefined: Self = StObject.set(x, "Manifest", js.undefined)
    
    inline def setOperation(value: JobOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: JobPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setReport(value: JobReport): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: S3TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
