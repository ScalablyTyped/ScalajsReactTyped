package typingsJapgolly.reduxDevtoolsInstrument.mod

import typingsJapgolly.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reduxDevtoolsInstrument.mod.PerformAction[A]
  - typingsJapgolly.reduxDevtoolsInstrument.mod.ResetAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.RollbackAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.CommitAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.SweepAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.ToggleAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.SetActionsActiveAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.ReorderAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToStateAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToActionAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.ImportStateAction[S, A, MonitorState]
  - typingsJapgolly.reduxDevtoolsInstrument.mod.LockChangesAction
  - typingsJapgolly.reduxDevtoolsInstrument.mod.PauseRecordingAction
*/
trait LiftedAction[S, A /* <: Action[Any] */, MonitorState] extends StObject
object LiftedAction {
  
  inline def CommitAction(timestamp: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.CommitAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("COMMIT")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.CommitAction]
  }
  
  inline def ImportStateAction[S, A /* <: Action[Any] */, MonitorState](nextLiftedState: (LiftedState[S, A, MonitorState]) | js.Array[A]): typingsJapgolly.reduxDevtoolsInstrument.mod.ImportStateAction[S, A, MonitorState] = {
    val __obj = js.Dynamic.literal(nextLiftedState = nextLiftedState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IMPORT_STATE")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.ImportStateAction[S, A, MonitorState]]
  }
  
  inline def JumpToActionAction(actionId: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToActionAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JUMP_TO_ACTION")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToActionAction]
  }
  
  inline def JumpToStateAction(index: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToStateAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JUMP_TO_STATE")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToStateAction]
  }
  
  inline def LockChangesAction(status: Boolean): typingsJapgolly.reduxDevtoolsInstrument.mod.LockChangesAction = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LOCK_CHANGES")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.LockChangesAction]
  }
  
  inline def PauseRecordingAction(status: Boolean): typingsJapgolly.reduxDevtoolsInstrument.mod.PauseRecordingAction = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PAUSE_RECORDING")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.PauseRecordingAction]
  }
  
  inline def PerformAction[A /* <: Action[Any] */](action: A, timestamp: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.PerformAction[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PERFORM_ACTION")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.PerformAction[A]]
  }
  
  inline def ReorderAction(actionId: Double, beforeActionId: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.ReorderAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], beforeActionId = beforeActionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REORDER_ACTION")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.ReorderAction]
  }
  
  inline def ResetAction(timestamp: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.ResetAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.ResetAction]
  }
  
  inline def RollbackAction(timestamp: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.RollbackAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ROLLBACK")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.RollbackAction]
  }
  
  inline def SetActionsActiveAction(active: Boolean, end: Double, start: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.SetActionsActiveAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_ACTIONS_ACTIVE")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.SetActionsActiveAction]
  }
  
  inline def SweepAction(): typingsJapgolly.reduxDevtoolsInstrument.mod.SweepAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SWEEP")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.SweepAction]
  }
  
  inline def ToggleAction(id: Double): typingsJapgolly.reduxDevtoolsInstrument.mod.ToggleAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TOGGLE_ACTION")
    __obj.asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.mod.ToggleAction]
  }
}
