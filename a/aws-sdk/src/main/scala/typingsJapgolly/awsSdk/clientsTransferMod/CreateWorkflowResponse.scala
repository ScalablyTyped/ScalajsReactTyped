package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowResponse extends StObject {
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typingsJapgolly.awsSdk.clientsTransferMod.WorkflowId
}
object CreateWorkflowResponse {
  
  inline def apply(WorkflowId: WorkflowId): CreateWorkflowResponse = {
    val __obj = js.Dynamic.literal(WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowResponse]
  }
  
  extension [Self <: CreateWorkflowResponse](x: Self) {
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
