package typingsJapgolly.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryWorkflowStepRequest extends StObject {
  
  /**
    * The ID of the step.
    */
  var id: StepId
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: StepGroupId
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: MigrationWorkflowId
}
object RetryWorkflowStepRequest {
  
  inline def apply(id: StepId, stepGroupId: StepGroupId, workflowId: MigrationWorkflowId): RetryWorkflowStepRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stepGroupId = stepGroupId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryWorkflowStepRequest]
  }
  
  extension [Self <: RetryWorkflowStepRequest](x: Self) {
    
    inline def setId(value: StepId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStepGroupId(value: StepGroupId): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
