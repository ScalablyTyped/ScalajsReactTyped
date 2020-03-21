package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.ISignatureSettings
import typingsJapgolly.mfiles.IStateTransitionsForClient
import typingsJapgolly.mfiles.IStates
import typingsJapgolly.mfiles.ITypedValue
import typingsJapgolly.mfiles.IValueListItems
import typingsJapgolly.mfiles.IVaultWorkflowOperations
import typingsJapgolly.mfiles.IWorkflow
import typingsJapgolly.mfiles.IWorkflowAdmin
import typingsJapgolly.mfiles.IWorkflows
import typingsJapgolly.mfiles.IWorkflowsAdmin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultWorkflowOperations")
@js.native
class VaultWorkflowOperations () extends IVaultWorkflowOperations {
  /* CompleteClass */
  override def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin = js.native
  /* CompleteClass */
  override def GetStateTransitionSignatureSettings(FromState: Double, ToState: Double): ISignatureSettings = js.native
  /* CompleteClass */
  override def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double): ISignatureSettings = js.native
  /* CompleteClass */
  override def GetWorkflowAdmin(WorkflowID: Double): IWorkflowAdmin = js.native
  /* CompleteClass */
  override def GetWorkflowForClient(WorkflowID: Double, UpdateFromServer: Boolean): IWorkflow = js.native
  /* CompleteClass */
  override def GetWorkflowIDByAlias(Alias: String): Double = js.native
  /* CompleteClass */
  override def GetWorkflowIDByGUID(WorkflowGUID: String): Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateIDByAlias(Alias: String): Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateIDByGUID(StateGUID: String): Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionIDByAlias(Alias: String): Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String): Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitions(Workflow: Double, CurrentState: ITypedValue): IStateTransitionsForClient = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionsAsJSON(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): String = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionsEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient = js.native
  /* CompleteClass */
  override def GetWorkflowStates(Workflow: Double, CurrentState: ITypedValue): IStates = js.native
  /* CompleteClass */
  override def GetWorkflowStatesEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates = js.native
  /* CompleteClass */
  override def GetWorkflowsAdmin(): IWorkflowsAdmin = js.native
  /* CompleteClass */
  override def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean): IValueListItems = js.native
  /* CompleteClass */
  override def GetWorkflowsForClient(UpdateFromServer: Boolean): IWorkflows = js.native
  /* CompleteClass */
  override def RemoveWorkflowAdmin(WorkflowID: Double): Unit = js.native
  /* CompleteClass */
  override def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin = js.native
}

@JSGlobal("MFiles.VaultWorkflowOperations")
@js.native
object VaultWorkflowOperations extends Instantiable0[IVaultWorkflowOperations]

