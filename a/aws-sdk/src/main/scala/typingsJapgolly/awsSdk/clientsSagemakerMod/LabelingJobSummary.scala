package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers into a label for a data object. For more information, see Annotation Consolidation.
    */
  var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined
  
  /**
    * The date and time that the job was created (timestamp).
    */
  var CreationTime: js.Date
  
  /**
    * If the LabelingJobStatus field is Failed, this field contains a description of the error.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * Input configuration for the labeling job.
    */
  var InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined
  
  /**
    * Counts showing the progress of the labeling job.
    */
  var LabelCounters: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelCounters
  
  /**
    * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
    */
  var LabelingJobArn: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobArn
  
  /**
    * The name of the labeling job.
    */
  var LabelingJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobName
  
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobOutput] = js.undefined
  
  /**
    * The current status of the labeling job. 
    */
  var LabelingJobStatus: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobStatus
  
  /**
    * The date and time that the job was last modified (timestamp).
    */
  var LastModifiedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a worker.
    */
  var PreHumanTaskLambdaArn: LambdaFunctionArn
  
  /**
    * The Amazon Resource Name (ARN) of the work team assigned to the job.
    */
  var WorkteamArn: typingsJapgolly.awsSdk.clientsSagemakerMod.WorkteamArn
}
object LabelingJobSummary {
  
  inline def apply(
    CreationTime: js.Date,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: js.Date,
    PreHumanTaskLambdaArn: LambdaFunctionArn,
    WorkteamArn: WorkteamArn
  ): LabelingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LabelCounters = LabelCounters.asInstanceOf[js.Any], LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], PreHumanTaskLambdaArn = PreHumanTaskLambdaArn.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobSummary]
  }
  
  extension [Self <: LabelingJobSummary](x: Self) {
    
    inline def setAnnotationConsolidationLambdaArn(value: LambdaFunctionArn): Self = StObject.set(x, "AnnotationConsolidationLambdaArn", value.asInstanceOf[js.Any])
    
    inline def setAnnotationConsolidationLambdaArnUndefined: Self = StObject.set(x, "AnnotationConsolidationLambdaArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInputConfig(value: LabelingJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "InputConfig", js.undefined)
    
    inline def setLabelCounters(value: LabelCounters): Self = StObject.set(x, "LabelCounters", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobOutput(value: LabelingJobOutput): Self = StObject.set(x, "LabelingJobOutput", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobOutputUndefined: Self = StObject.set(x, "LabelingJobOutput", js.undefined)
    
    inline def setLabelingJobStatus(value: LabelingJobStatus): Self = StObject.set(x, "LabelingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setPreHumanTaskLambdaArn(value: LambdaFunctionArn): Self = StObject.set(x, "PreHumanTaskLambdaArn", value.asInstanceOf[js.Any])
    
    inline def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
  }
}
