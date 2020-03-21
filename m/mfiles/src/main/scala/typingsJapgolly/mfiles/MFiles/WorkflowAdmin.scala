package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.ISemanticAliases
import typingsJapgolly.mfiles.IStateTransitions
import typingsJapgolly.mfiles.IStatesAdmin
import typingsJapgolly.mfiles.IWorkflow
import typingsJapgolly.mfiles.IWorkflowAdmin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.WorkflowAdmin")
@js.native
class WorkflowAdmin () extends IWorkflowAdmin {
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var Permissions: IAccessControlList = js.native
  /* CompleteClass */
  override var SemanticAliases: ISemanticAliases = js.native
  /* CompleteClass */
  override var StateTransitions: IStateTransitions = js.native
  /* CompleteClass */
  override var States: IStatesAdmin = js.native
  /* CompleteClass */
  override var Workflow: IWorkflow = js.native
  /* CompleteClass */
  override def Clone(): IWorkflowAdmin = js.native
}

@JSGlobal("MFiles.WorkflowAdmin")
@js.native
object WorkflowAdmin extends Instantiable0[IWorkflowAdmin]

