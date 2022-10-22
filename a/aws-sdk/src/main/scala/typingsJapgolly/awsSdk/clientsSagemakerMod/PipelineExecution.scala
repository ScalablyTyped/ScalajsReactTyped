package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineExecution extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The creation time of the pipeline execution.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If the execution failed, a message describing why.
    */
  var FailureReason: js.UndefOr[PipelineExecutionFailureReason] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time that the pipeline execution was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The parallelism configuration applied to the pipeline execution.
    */
  var ParallelismConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline that was executed.
    */
  var PipelineArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PipelineArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PipelineExecutionArn] = js.undefined
  
  /**
    * The description of the pipeline execution.
    */
  var PipelineExecutionDescription: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PipelineExecutionDescription] = js.undefined
  
  /**
    * The display name of the pipeline execution.
    */
  var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined
  
  /**
    * The status of the pipeline status.
    */
  var PipelineExecutionStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PipelineExecutionStatus] = js.undefined
  
  var PipelineExperimentConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PipelineExperimentConfig] = js.undefined
  
  /**
    * Contains a list of pipeline parameters. This list can be empty. 
    */
  var PipelineParameters: js.UndefOr[ParameterList] = js.undefined
}
object PipelineExecution {
  
  inline def apply(): PipelineExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecution]
  }
  
  extension [Self <: PipelineExecution](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: PipelineExecutionFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionArnUndefined: Self = StObject.set(x, "PipelineExecutionArn", js.undefined)
    
    inline def setPipelineExecutionDescription(value: PipelineExecutionDescription): Self = StObject.set(x, "PipelineExecutionDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDescriptionUndefined: Self = StObject.set(x, "PipelineExecutionDescription", js.undefined)
    
    inline def setPipelineExecutionDisplayName(value: PipelineExecutionName): Self = StObject.set(x, "PipelineExecutionDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDisplayNameUndefined: Self = StObject.set(x, "PipelineExecutionDisplayName", js.undefined)
    
    inline def setPipelineExecutionStatus(value: PipelineExecutionStatus): Self = StObject.set(x, "PipelineExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionStatusUndefined: Self = StObject.set(x, "PipelineExecutionStatus", js.undefined)
    
    inline def setPipelineExperimentConfig(value: PipelineExperimentConfig): Self = StObject.set(x, "PipelineExperimentConfig", value.asInstanceOf[js.Any])
    
    inline def setPipelineExperimentConfigUndefined: Self = StObject.set(x, "PipelineExperimentConfig", js.undefined)
    
    inline def setPipelineParameters(value: ParameterList): Self = StObject.set(x, "PipelineParameters", value.asInstanceOf[js.Any])
    
    inline def setPipelineParametersUndefined: Self = StObject.set(x, "PipelineParameters", js.undefined)
    
    inline def setPipelineParametersVarargs(value: Parameter*): Self = StObject.set(x, "PipelineParameters", js.Array(value*))
  }
}
