package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflowAdmin extends StObject {
  
  def Clone(): IWorkflowAdmin
  
  var Description: String
  
  var Permissions: IAccessControlList
  
  var SemanticAliases: ISemanticAliases
  
  var StateTransitions: IStateTransitions
  
  var States: IStatesAdmin
  
  var Workflow: IWorkflow
}
object IWorkflowAdmin {
  
  inline def apply(
    Clone: CallbackTo[IWorkflowAdmin],
    Description: String,
    Permissions: IAccessControlList,
    SemanticAliases: ISemanticAliases,
    StateTransitions: IStateTransitions,
    States: IStatesAdmin,
    Workflow: IWorkflow
  ): IWorkflowAdmin = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Description = Description.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], StateTransitions = StateTransitions.asInstanceOf[js.Any], States = States.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowAdmin]
  }
  
  extension [Self <: IWorkflowAdmin](x: Self) {
    
    inline def setClone(value: CallbackTo[IWorkflowAdmin]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: IAccessControlList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    inline def setStateTransitions(value: IStateTransitions): Self = StObject.set(x, "StateTransitions", value.asInstanceOf[js.Any])
    
    inline def setStates(value: IStatesAdmin): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    inline def setWorkflow(value: IWorkflow): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
  }
}
