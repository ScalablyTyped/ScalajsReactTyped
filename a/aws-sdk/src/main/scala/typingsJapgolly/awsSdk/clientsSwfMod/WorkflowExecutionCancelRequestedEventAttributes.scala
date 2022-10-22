package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionCancelRequestedEventAttributes extends StObject {
  
  /**
    * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set to cancel child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined
  
  /**
    * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.undefined
  
  /**
    * The external workflow execution for which the cancellation was requested.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
}
object WorkflowExecutionCancelRequestedEventAttributes {
  
  inline def apply(): WorkflowExecutionCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
  }
  
  extension [Self <: WorkflowExecutionCancelRequestedEventAttributes](x: Self) {
    
    inline def setCause(value: WorkflowExecutionCancelRequestedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setExternalInitiatedEventId(value: EventId): Self = StObject.set(x, "externalInitiatedEventId", value.asInstanceOf[js.Any])
    
    inline def setExternalInitiatedEventIdUndefined: Self = StObject.set(x, "externalInitiatedEventId", js.undefined)
    
    inline def setExternalWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "externalWorkflowExecution", value.asInstanceOf[js.Any])
    
    inline def setExternalWorkflowExecutionUndefined: Self = StObject.set(x, "externalWorkflowExecution", js.undefined)
  }
}
