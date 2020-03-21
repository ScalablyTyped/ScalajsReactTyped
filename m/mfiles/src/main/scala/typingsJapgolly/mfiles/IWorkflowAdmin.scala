package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowAdmin extends js.Object {
  var Description: String
  var Permissions: IAccessControlList
  var SemanticAliases: ISemanticAliases
  var StateTransitions: IStateTransitions
  var States: IStatesAdmin
  var Workflow: IWorkflow
  def Clone(): IWorkflowAdmin
}

object IWorkflowAdmin {
  @scala.inline
  def apply(
    Clone: CallbackTo[IWorkflowAdmin],
    Description: String,
    Permissions: IAccessControlList,
    SemanticAliases: ISemanticAliases,
    StateTransitions: IStateTransitions,
    States: IStatesAdmin,
    Workflow: IWorkflow
  ): IWorkflowAdmin = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], StateTransitions = StateTransitions.asInstanceOf[js.Any], States = States.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IWorkflowAdmin]
  }
}

