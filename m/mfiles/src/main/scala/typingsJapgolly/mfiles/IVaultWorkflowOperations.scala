package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultWorkflowOperations extends js.Object {
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
  def GetStateTransitionSignatureSettings(FromState: Double, ToState: Double): ISignatureSettings
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double): ISignatureSettings
  def GetWorkflowAdmin(WorkflowID: Double): IWorkflowAdmin
  def GetWorkflowForClient(WorkflowID: Double, UpdateFromServer: Boolean): IWorkflow
  def GetWorkflowIDByAlias(Alias: String): Double
  def GetWorkflowIDByGUID(WorkflowGUID: String): Double
  def GetWorkflowStateIDByAlias(Alias: String): Double
  def GetWorkflowStateIDByGUID(StateGUID: String): Double
  def GetWorkflowStateTransitionIDByAlias(Alias: String): Double
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String): Double
  def GetWorkflowStateTransitions(Workflow: Double, CurrentState: ITypedValue): IStateTransitionsForClient
  def GetWorkflowStateTransitionsAsJSON(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): String
  def GetWorkflowStateTransitionsEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient
  def GetWorkflowStates(Workflow: Double, CurrentState: ITypedValue): IStates
  def GetWorkflowStatesEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates
  def GetWorkflowsAdmin(): IWorkflowsAdmin
  def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean): IValueListItems
  def GetWorkflowsForClient(UpdateFromServer: Boolean): IWorkflows
  def RemoveWorkflowAdmin(WorkflowID: Double): Unit
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
}

object IVaultWorkflowOperations {
  @scala.inline
  def apply(
    AddWorkflowAdmin: IWorkflowAdmin => CallbackTo[IWorkflowAdmin],
    GetStateTransitionSignatureSettings: (Double, Double) => CallbackTo[ISignatureSettings],
    GetStateTransitionSignatureSettingsByID: Double => CallbackTo[ISignatureSettings],
    GetWorkflowAdmin: Double => CallbackTo[IWorkflowAdmin],
    GetWorkflowForClient: (Double, Boolean) => CallbackTo[IWorkflow],
    GetWorkflowIDByAlias: String => CallbackTo[Double],
    GetWorkflowIDByGUID: String => CallbackTo[Double],
    GetWorkflowStateIDByAlias: String => CallbackTo[Double],
    GetWorkflowStateIDByGUID: String => CallbackTo[Double],
    GetWorkflowStateTransitionIDByAlias: String => CallbackTo[Double],
    GetWorkflowStateTransitionIDByGUID: String => CallbackTo[Double],
    GetWorkflowStateTransitions: (Double, ITypedValue) => CallbackTo[IStateTransitionsForClient],
    GetWorkflowStateTransitionsAsJSON: (Double, ITypedValue, IObjVer) => CallbackTo[String],
    GetWorkflowStateTransitionsEx: (Double, ITypedValue, IObjVer) => CallbackTo[IStateTransitionsForClient],
    GetWorkflowStates: (Double, ITypedValue) => CallbackTo[IStates],
    GetWorkflowStatesEx: (Double, ITypedValue, IObjVer) => CallbackTo[IStates],
    GetWorkflowsAdmin: CallbackTo[IWorkflowsAdmin],
    GetWorkflowsAsValueListItems: Boolean => CallbackTo[IValueListItems],
    GetWorkflowsForClient: Boolean => CallbackTo[IWorkflows],
    RemoveWorkflowAdmin: Double => Callback,
    UpdateWorkflowAdmin: IWorkflowAdmin => CallbackTo[IWorkflowAdmin]
  ): IVaultWorkflowOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddWorkflowAdmin")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IWorkflowAdmin) => AddWorkflowAdmin(t0).runNow()))
    __obj.updateDynamic("GetStateTransitionSignatureSettings")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => GetStateTransitionSignatureSettings(t0, t1).runNow()))
    __obj.updateDynamic("GetStateTransitionSignatureSettingsByID")(js.Any.fromFunction1((t0: scala.Double) => GetStateTransitionSignatureSettingsByID(t0).runNow()))
    __obj.updateDynamic("GetWorkflowAdmin")(js.Any.fromFunction1((t0: scala.Double) => GetWorkflowAdmin(t0).runNow()))
    __obj.updateDynamic("GetWorkflowForClient")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => GetWorkflowForClient(t0, t1).runNow()))
    __obj.updateDynamic("GetWorkflowIDByAlias")(js.Any.fromFunction1((t0: java.lang.String) => GetWorkflowIDByAlias(t0).runNow()))
    __obj.updateDynamic("GetWorkflowIDByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetWorkflowIDByGUID(t0).runNow()))
    __obj.updateDynamic("GetWorkflowStateIDByAlias")(js.Any.fromFunction1((t0: java.lang.String) => GetWorkflowStateIDByAlias(t0).runNow()))
    __obj.updateDynamic("GetWorkflowStateIDByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetWorkflowStateIDByGUID(t0).runNow()))
    __obj.updateDynamic("GetWorkflowStateTransitionIDByAlias")(js.Any.fromFunction1((t0: java.lang.String) => GetWorkflowStateTransitionIDByAlias(t0).runNow()))
    __obj.updateDynamic("GetWorkflowStateTransitionIDByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetWorkflowStateTransitionIDByGUID(t0).runNow()))
    __obj.updateDynamic("GetWorkflowStateTransitions")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.ITypedValue) => GetWorkflowStateTransitions(t0, t1).runNow()))
    __obj.updateDynamic("GetWorkflowStateTransitionsAsJSON")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.mfiles.ITypedValue, t2: typingsJapgolly.mfiles.IObjVer) => GetWorkflowStateTransitionsAsJSON(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetWorkflowStateTransitionsEx")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.mfiles.ITypedValue, t2: typingsJapgolly.mfiles.IObjVer) => GetWorkflowStateTransitionsEx(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetWorkflowStates")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.ITypedValue) => GetWorkflowStates(t0, t1).runNow()))
    __obj.updateDynamic("GetWorkflowStatesEx")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.mfiles.ITypedValue, t2: typingsJapgolly.mfiles.IObjVer) => GetWorkflowStatesEx(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetWorkflowsAdmin")(GetWorkflowsAdmin.toJsFn)
    __obj.updateDynamic("GetWorkflowsAsValueListItems")(js.Any.fromFunction1((t0: scala.Boolean) => GetWorkflowsAsValueListItems(t0).runNow()))
    __obj.updateDynamic("GetWorkflowsForClient")(js.Any.fromFunction1((t0: scala.Boolean) => GetWorkflowsForClient(t0).runNow()))
    __obj.updateDynamic("RemoveWorkflowAdmin")(js.Any.fromFunction1((t0: scala.Double) => RemoveWorkflowAdmin(t0).runNow()))
    __obj.updateDynamic("UpdateWorkflowAdmin")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IWorkflowAdmin) => UpdateWorkflowAdmin(t0).runNow()))
    __obj.asInstanceOf[IVaultWorkflowOperations]
  }
}

