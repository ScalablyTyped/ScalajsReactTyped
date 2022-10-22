package typingsJapgolly.xstate

import typingsJapgolly.xstate.anon.Id
import typingsJapgolly.xstate.anon.Type
import typingsJapgolly.xstate.anon.TypeUpdate
import typingsJapgolly.xstate.libStateMod.State
import typingsJapgolly.xstate.libStateNodeMod.StateNode
import typingsJapgolly.xstate.libTypesMod.Action
import typingsJapgolly.xstate.libTypesMod.ActionFunction
import typingsJapgolly.xstate.libTypesMod.ActionFunctionMap
import typingsJapgolly.xstate.libTypesMod.ActionObject
import typingsJapgolly.xstate.libTypesMod.ActionType
import typingsJapgolly.xstate.libTypesMod.ActivityActionObject
import typingsJapgolly.xstate.libTypesMod.ActivityDefinition
import typingsJapgolly.xstate.libTypesMod.AnyActorRef
import typingsJapgolly.xstate.libTypesMod.AnyEventObject
import typingsJapgolly.xstate.libTypesMod.AssignAction
import typingsJapgolly.xstate.libTypesMod.Assigner
import typingsJapgolly.xstate.libTypesMod.BaseActionObject
import typingsJapgolly.xstate.libTypesMod.CancelAction
import typingsJapgolly.xstate.libTypesMod.Cast
import typingsJapgolly.xstate.libTypesMod.ChooseAction
import typingsJapgolly.xstate.libTypesMod.ChooseCondition
import typingsJapgolly.xstate.libTypesMod.DelayFunctionMap
import typingsJapgolly.xstate.libTypesMod.DoneEvent
import typingsJapgolly.xstate.libTypesMod.DoneEventObject
import typingsJapgolly.xstate.libTypesMod.ErrorPlatformEvent
import typingsJapgolly.xstate.libTypesMod.EventFrom
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.Expr
import typingsJapgolly.xstate.libTypesMod.ExprWithMeta
import typingsJapgolly.xstate.libTypesMod.LogAction
import typingsJapgolly.xstate.libTypesMod.LogActionObject
import typingsJapgolly.xstate.libTypesMod.LogExpr
import typingsJapgolly.xstate.libTypesMod.PredictableActionArgumentsExec
import typingsJapgolly.xstate.libTypesMod.PropertyAssigner
import typingsJapgolly.xstate.libTypesMod.PureAction
import typingsJapgolly.xstate.libTypesMod.RaiseAction
import typingsJapgolly.xstate.libTypesMod.RaiseActionObject
import typingsJapgolly.xstate.libTypesMod.ResolveEventType
import typingsJapgolly.xstate.libTypesMod.SCXML.Event
import typingsJapgolly.xstate.libTypesMod.SendAction
import typingsJapgolly.xstate.libTypesMod.SendActionObject
import typingsJapgolly.xstate.libTypesMod.SendActionOptions
import typingsJapgolly.xstate.libTypesMod.SendExpr
import typingsJapgolly.xstate.libTypesMod.SingleOrArray
import typingsJapgolly.xstate.libTypesMod.StopAction
import typingsJapgolly.xstate.libTypesMod.StopActionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionsMod {
  
  @JSImport("xstate/lib/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object actionTypes {
    
    @JSImport("xstate/lib/actions", "actionTypes.after")
    @js.native
    val after: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.assign")
    @js.native
    val assign: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.cancel")
    @js.native
    val cancel: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.choose")
    @js.native
    val choose: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.doneState")
    @js.native
    val doneState: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.error")
    @js.native
    val error: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.errorExecution")
    @js.native
    val errorExecution: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.errorPlatform")
    @js.native
    val errorPlatform: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.init")
    @js.native
    val init: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.invoke")
    @js.native
    val invoke: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.log")
    @js.native
    val log: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.nullEvent")
    @js.native
    val nullEvent: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.pure")
    @js.native
    val pure: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.raise")
    @js.native
    val raise: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.send")
    @js.native
    val send: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.start")
    @js.native
    val start: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.stop")
    @js.native
    val stop: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.update")
    @js.native
    val update: String | Double = js.native
  }
  
  inline def after(delayRef: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def after(delayRef: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def after(delayRef: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def after(delayRef: Double, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  inline def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  
  inline def cancel(sendId: String): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
  inline def cancel(sendId: Double): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
  
  inline def choose[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseCondition[TContext, TEvent]]): ChooseAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(conds.asInstanceOf[js.Any]).asInstanceOf[ChooseAction[TContext, TEvent]]
  
  inline def done(id: String): DoneEventObject = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEventObject]
  inline def done(id: String, data: Any): DoneEventObject = (^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEventObject]
  
  inline def doneInvoke(id: String): DoneEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEvent]
  inline def doneInvoke(id: String, data: Any): DoneEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEvent]
  
  inline def error(id: String): ErrorPlatformEvent & String = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any]).asInstanceOf[ErrorPlatformEvent & String]
  inline def error(id: String, data: Any): ErrorPlatformEvent & String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ErrorPlatformEvent & String]
  
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
    errorData: ExprWithMeta[TContext, TEvent, TErrorData],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[
    (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
  ]]
  inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]): js.UndefOr[
    (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
  ]]
  
  @JSImport("xstate/lib/actions", "initEvent")
  @js.native
  val initEvent: Event[Type] = js.native
  
  inline def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean]
  
  inline def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: Unit, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
  
  inline def pure[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(getActions.asInstanceOf[js.Any]).asInstanceOf[PureAction[TContext, TEvent]]
  
  inline def raise[TContext, TEvent /* <: EventObject */](event: typingsJapgolly.xstate.libTypesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent]) = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any]).asInstanceOf[RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent])]
  
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
    predictableExec: Unit,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
    predictableExec: PredictableActionArgumentsExec
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
    predictableExec: PredictableActionArgumentsExec,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
    predictableExec: Unit,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
    predictableExec: PredictableActionArgumentsExec
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
    predictableExec: PredictableActionArgumentsExec,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  
  inline def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLog")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[LogActionObject[TContext, TEvent]]
  
  inline def resolveRaise[TEvent /* <: EventObject */](action: RaiseAction[TEvent]): RaiseActionObject[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRaise")(action.asInstanceOf[js.Any]).asInstanceOf[RaiseActionObject[TEvent]]
  
  inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](action: SendAction[TContext, TEvent, TSentEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent, TSentEvent],
    ctx: TContext,
    _event: Event[TEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], delaysMap.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  
  inline def resolveStop[TContext, TEvent /* <: EventObject */](action: StopAction[TContext, TEvent], context: TContext, _event: Event[TEvent]): StopActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStop")(action.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[StopActionObject]
  
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsJapgolly.xstate.libTypesMod.Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typingsJapgolly.xstate.libTypesMod.Event[TEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsJapgolly.xstate.libTypesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typingsJapgolly.xstate.libTypesMod.Event[TSentEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsJapgolly.xstate.libTypesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typingsJapgolly.xstate.libTypesMod.Event[TSentEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](actor: TActor, event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: TActor,
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: TActor,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: TActor,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](actor: String, event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: String,
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: String,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: String,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function1[/* ctx */ TContext, TActor],
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function1[/* ctx */ TContext, TActor],
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function1[/* ctx */ TContext, TActor],
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function1[/* ctx */ TContext, TActor],
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  
  inline def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendUpdate")().asInstanceOf[SendAction[TContext, TEvent, TypeUpdate]]
  
  inline def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
  inline def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
  
  inline def stop[TContext, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
  inline def stop[TContext, TEvent /* <: EventObject */](actorRef: ActivityDefinition[TContext, TEvent]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
  inline def stop[TContext, TEvent /* <: EventObject */](actorRef: Expr[TContext, TEvent, String | Id]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
  
  inline def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[ActionObject[TContext, TEvent]]
  inline def toActionObject[TContext, TEvent /* <: EventObject */](
    action: Action[TContext, TEvent],
    actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]
  ): ActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TContext, TEvent]]
  
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")().asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: Unit, actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: SingleOrArray[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: SingleOrArray[Action[TContext, TEvent]],
    actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]
  ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  
  inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
  inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
  
  type InferEvent[E /* <: EventObject */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ T in E['type'] ]: {  type :T} & std.Extract<E, {  type :T}>}[E['type']] */ js.Any
}
