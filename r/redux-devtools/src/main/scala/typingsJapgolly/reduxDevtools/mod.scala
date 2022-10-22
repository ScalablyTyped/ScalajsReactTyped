package typingsJapgolly.reduxDevtools

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.reduxDevtools.anon.Instantiable
import typingsJapgolly.reduxDevtoolsInstrument.mod.CommitAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.ImportStateAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.InstrumentExt
import typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToActionAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.JumpToStateAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.LiftedState
import typingsJapgolly.reduxDevtoolsInstrument.mod.LockChangesAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.Options
import typingsJapgolly.reduxDevtoolsInstrument.mod.PauseRecordingAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.ReorderAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.ResetAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.RollbackAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.SetActionsActiveAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.SweepAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.ToggleAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ActionCreators {
    
    @JSImport("redux-devtools", "ActionCreators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def commit(): CommitAction = ^.asInstanceOf[js.Dynamic].applyDynamic("commit")().asInstanceOf[CommitAction]
    
    inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: js.Array[A_1]): ImportStateAction[S, A_1, MonitorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any]).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
    inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: js.Array[A_1], noRecompute: Boolean): ImportStateAction[S, A_1, MonitorState] = (^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any], noRecompute.asInstanceOf[js.Any])).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
    inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: LiftedState[S, A_1, MonitorState]): ImportStateAction[S, A_1, MonitorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any]).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
    inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: LiftedState[S, A_1, MonitorState], noRecompute: Boolean): ImportStateAction[S, A_1, MonitorState] = (^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any], noRecompute.asInstanceOf[js.Any])).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
    
    inline def jumpToAction(actionId: Double): JumpToActionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpToAction")(actionId.asInstanceOf[js.Any]).asInstanceOf[JumpToActionAction]
    
    inline def jumpToState(index: Double): JumpToStateAction = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpToState")(index.asInstanceOf[js.Any]).asInstanceOf[JumpToStateAction]
    
    inline def lockChanges(status: Boolean): LockChangesAction = ^.asInstanceOf[js.Dynamic].applyDynamic("lockChanges")(status.asInstanceOf[js.Any]).asInstanceOf[LockChangesAction]
    
    inline def pauseRecording(status: Boolean): PauseRecordingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseRecording")(status.asInstanceOf[js.Any]).asInstanceOf[PauseRecordingAction]
    
    inline def performAction[A /* <: Action[Any] */](action: A): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: js.Function1[/* action */ A, js.UndefOr[String]]): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: js.Function1[/* action */ A, js.UndefOr[String]], traceLimit: Double): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](
      action: A,
      trace: js.Function1[/* action */ A, js.UndefOr[String]],
      traceLimit: Double,
      toExcludeFromTrace: js.Function
    ): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](
      action: A,
      trace: js.Function1[/* action */ A, js.UndefOr[String]],
      traceLimit: Unit,
      toExcludeFromTrace: js.Function
    ): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Double): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Double, toExcludeFromTrace: js.Function): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Unit, toExcludeFromTrace: js.Function): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Double): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Double, toExcludeFromTrace: js.Function): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    inline def performAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Unit, toExcludeFromTrace: js.Function): typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reduxDevtoolsInstrument.anon.Action[A]]
    
    inline def reorderAction(actionId: Double, beforeActionId: Double): ReorderAction = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderAction")(actionId.asInstanceOf[js.Any], beforeActionId.asInstanceOf[js.Any])).asInstanceOf[ReorderAction]
    
    inline def reset(): ResetAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[ResetAction]
    
    inline def rollback(): RollbackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("rollback")().asInstanceOf[RollbackAction]
    
    inline def setActionsActive(start: Double, end: Double): SetActionsActiveAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setActionsActive")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[SetActionsActiveAction]
    inline def setActionsActive(start: Double, end: Double, active: Boolean): SetActionsActiveAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setActionsActive")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[SetActionsActiveAction]
    
    inline def sweep(): SweepAction = ^.asInstanceOf[js.Dynamic].applyDynamic("sweep")().asInstanceOf[SweepAction]
    
    inline def toggleAction(id: Double): ToggleAction = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleAction")(id.asInstanceOf[js.Any]).asInstanceOf[ToggleAction]
  }
  
  object ActionTypes {
    
    @JSImport("redux-devtools", "ActionTypes.COMMIT")
    @js.native
    val COMMIT: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.COMMIT = js.native
    
    @JSImport("redux-devtools", "ActionTypes.IMPORT_STATE")
    @js.native
    val IMPORT_STATE: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.IMPORT_STATE = js.native
    
    @JSImport("redux-devtools", "ActionTypes.JUMP_TO_ACTION")
    @js.native
    val JUMP_TO_ACTION: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.JUMP_TO_ACTION = js.native
    
    @JSImport("redux-devtools", "ActionTypes.JUMP_TO_STATE")
    @js.native
    val JUMP_TO_STATE: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.JUMP_TO_STATE = js.native
    
    @JSImport("redux-devtools", "ActionTypes.LOCK_CHANGES")
    @js.native
    val LOCK_CHANGES: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.LOCK_CHANGES = js.native
    
    @JSImport("redux-devtools", "ActionTypes.PAUSE_RECORDING")
    @js.native
    val PAUSE_RECORDING: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.PAUSE_RECORDING = js.native
    
    @JSImport("redux-devtools", "ActionTypes.PERFORM_ACTION")
    @js.native
    val PERFORM_ACTION: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.PERFORM_ACTION = js.native
    
    @JSImport("redux-devtools", "ActionTypes.REORDER_ACTION")
    @js.native
    val REORDER_ACTION: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.REORDER_ACTION = js.native
    
    @JSImport("redux-devtools", "ActionTypes.RESET")
    @js.native
    val RESET: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.RESET = js.native
    
    @JSImport("redux-devtools", "ActionTypes.ROLLBACK")
    @js.native
    val ROLLBACK: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.ROLLBACK = js.native
    
    @JSImport("redux-devtools", "ActionTypes.SET_ACTIONS_ACTIVE")
    @js.native
    val SET_ACTIONS_ACTIVE: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.SET_ACTIONS_ACTIVE = js.native
    
    @JSImport("redux-devtools", "ActionTypes.SWEEP")
    @js.native
    val SWEEP: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.SWEEP = js.native
    
    @JSImport("redux-devtools", "ActionTypes.TOGGLE_ACTION")
    @js.native
    val TOGGLE_ACTION: typingsJapgolly.reduxDevtools.reduxDevtoolsStrings.TOGGLE_ACTION = js.native
  }
  
  inline def createDevTools[S, A /* <: Action[Any] */, MonitorProps /* <: LiftedState[S, A, MonitorState] */, MonitorState, MonitorAction /* <: Action[Any] */](children: Element): Instantiable[S, A, MonitorState, MonitorAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDevTools")(children.asInstanceOf[js.Any]).asInstanceOf[Instantiable[S, A, MonitorState, MonitorAction]]
  
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("instrument")().asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](monitorReducer: Unit, options: Options[OptionsS, OptionsA, MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](monitorReducer: Reducer[MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(monitorReducer.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](
    monitorReducer: Reducer[MonitorState, MonitorAction],
    options: Options[OptionsS, OptionsA, MonitorState, MonitorAction]
  ): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistState")().asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: String): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: String, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](
    sessionId: String,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: String, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Null, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](
    sessionId: Null,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Null, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Unit, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](
    sessionId: Unit,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Unit, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
}
