package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLabelingJobResponse extends StObject {
  
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: js.Date
  
  /**
    * If the job failed, the reason that it failed. 
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * Configuration information required for human workers to complete a labeling task.
    */
  var HumanTaskConfig: typingsJapgolly.awsSdk.clientsSagemakerMod.HumanTaskConfig
  
  /**
    * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
    */
  var InputConfig: LabelingJobInputConfig
  
  /**
    * A unique identifier for work done as part of a labeling job.
    */
  var JobReferenceCode: typingsJapgolly.awsSdk.clientsSagemakerMod.JobReferenceCode
  
  /**
    * The attribute used as the label in the output manifest file.
    */
  var LabelAttributeName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.LabelAttributeName] = js.undefined
  
  /**
    * The S3 location of the JSON file that defines the categories used to label data objects. Please note the following label-category limits:   Semantic segmentation labeling jobs using automated labeling: 20 labels   Box bounding labeling jobs (all): 10 labels   The file is a JSON structure in the following format:  {    "document-version": "2018-11-28"    "labels": [    {    "label": "label 1"    },    {    "label": "label 2"    },    ...    {    "label": "label n"    }    ]   } 
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine, the number of objects than couldn't be labeled, and the total number of objects labeled. 
    */
  var LabelCounters: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelCounters
  
  /**
    * Configuration information for automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobAlgorithmsConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobArn
  
  /**
    * The name assigned to the labeling job when it was created.
    */
  var LabelingJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobName
  
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobOutput] = js.undefined
  
  /**
    * The processing status of the labeling job. 
    */
  var LabelingJobStatus: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobStatus
  
  /**
    * The date and time that the labeling job was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The location of the job's output data and the Amazon Web Services Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) that SageMaker assumes to perform tasks on your behalf during data labeling.
    */
  var RoleArn: typingsJapgolly.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined
  
  /**
    * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. For more information, see Tagging Amazon Web Services Resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object DescribeLabelingJobResponse {
  
  inline def apply(
    CreationTime: js.Date,
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    JobReferenceCode: JobReferenceCode,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: js.Date,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn
  ): DescribeLabelingJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskConfig = HumanTaskConfig.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], LabelCounters = LabelCounters.asInstanceOf[js.Any], LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelingJobResponse]
  }
  
  extension [Self <: DescribeLabelingJobResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHumanTaskConfig(value: HumanTaskConfig): Self = StObject.set(x, "HumanTaskConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: LabelingJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobReferenceCode(value: JobReferenceCode): Self = StObject.set(x, "JobReferenceCode", value.asInstanceOf[js.Any])
    
    inline def setLabelAttributeName(value: LabelAttributeName): Self = StObject.set(x, "LabelAttributeName", value.asInstanceOf[js.Any])
    
    inline def setLabelAttributeNameUndefined: Self = StObject.set(x, "LabelAttributeName", js.undefined)
    
    inline def setLabelCategoryConfigS3Uri(value: S3Uri): Self = StObject.set(x, "LabelCategoryConfigS3Uri", value.asInstanceOf[js.Any])
    
    inline def setLabelCategoryConfigS3UriUndefined: Self = StObject.set(x, "LabelCategoryConfigS3Uri", js.undefined)
    
    inline def setLabelCounters(value: LabelCounters): Self = StObject.set(x, "LabelCounters", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobAlgorithmsConfig(value: LabelingJobAlgorithmsConfig): Self = StObject.set(x, "LabelingJobAlgorithmsConfig", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobAlgorithmsConfigUndefined: Self = StObject.set(x, "LabelingJobAlgorithmsConfig", js.undefined)
    
    inline def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobOutput(value: LabelingJobOutput): Self = StObject.set(x, "LabelingJobOutput", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobOutputUndefined: Self = StObject.set(x, "LabelingJobOutput", js.undefined)
    
    inline def setLabelingJobStatus(value: LabelingJobStatus): Self = StObject.set(x, "LabelingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: LabelingJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditions(value: LabelingJobStoppingConditions): Self = StObject.set(x, "StoppingConditions", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionsUndefined: Self = StObject.set(x, "StoppingConditions", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
