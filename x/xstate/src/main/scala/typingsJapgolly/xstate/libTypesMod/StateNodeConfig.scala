package typingsJapgolly.xstate.libTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.xstate.anon.Context
import typingsJapgolly.xstate.anon.`3`
import typingsJapgolly.xstate.libStateNodeMod.StateNode
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled
import typingsJapgolly.xstate.xstateStrings.`final`
import typingsJapgolly.xstate.xstateStrings.atomic
import typingsJapgolly.xstate.xstateStrings.compound
import typingsJapgolly.xstate.xstateStrings.deep
import typingsJapgolly.xstate.xstateStrings.history
import typingsJapgolly.xstate.xstateStrings.parallel
import typingsJapgolly.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateNodeConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] extends StObject {
  
  /**
    * The activities to be started upon entering the state node,
    * and stopped upon exiting the state node.
    *
    * @deprecated Use `invoke` instead.
    */
  var activities: js.UndefOr[SingleOrArray[Activity[TContext, TEvent]]] = js.undefined
  
  /**
    * The mapping (or array) of delays (in milliseconds) to their potential transition(s).
    * The delayed transitions are taken after the specified delay in an interpreter.
    */
  var after: js.UndefOr[DelayedTransitions[TContext, TEvent]] = js.undefined
  
  /**
    * An eventless transition that is always taken when this state node is active.
    * Equivalent to a transition specified as an empty `''`' string in the `on` property.
    */
  var always: js.UndefOr[TransitionConfigOrTarget[TContext, TEvent]] = js.undefined
  
  /**
    * The data sent with the "done.state._id_" event if this is a final state node.
    *
    * The data will be evaluated with the current `context` and placed on the `.data` property
    * of the event.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent, Any]) | (PropertyMapper[TContext, TEvent, Any])] = js.undefined
  
  /**
    * The string delimiter for serializing the path to a string. The default is "."
    */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /**
    * A text description of the state node
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The action(s) to be executed upon entering the state node.
    */
  var entry: js.UndefOr[BaseActions[TContext, TEvent, TAction]] = js.undefined
  
  /**
    * The action(s) to be executed upon exiting the state node.
    */
  var exit: js.UndefOr[BaseActions[TContext, TEvent, TAction]] = js.undefined
  
  /**
    * Indicates whether the state node is a history state node, and what
    * type of history:
    * shallow, deep, true (shallow), false (none), undefined (none)
    */
  var history: js.UndefOr[shallow | deep | Boolean] = js.undefined
  
  /**
    * The unique ID of the state node, which can be referenced as a transition target via the
    * `#id` syntax.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The initial state node key.
    */
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.undefined
  
  /**
    * The services to invoke upon entering this state node. These services will be stopped upon exiting this state node.
    */
  var invoke: js.UndefOr[SingleOrArray[(InvokeConfig[TContext, TEvent]) | AnyStateMachine]] = js.undefined
  
  /**
    * The relative key of the state node, which represents its location in the overall state value.
    * This is automatically determined by the configuration shape via the key where it was defined.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The meta data associated with this state node, which will be returned in State instances.
    */
  var meta: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TStateSchema extends {  meta :infer D} ? D : any */ js.Any
  ] = js.undefined
  
  /**
    * The mapping of event types to their potential transition(s).
    */
  var on: js.UndefOr[TransitionsConfig[TContext, TEvent]] = js.undefined
  
  /**
    * The potential transition(s) to be taken upon reaching a final child state node.
    *
    * This is equivalent to defining a `[done(id)]` transition on this state node's `on` property.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])] = js.undefined
  
  /**
    * The action(s) to be executed upon entering the state node.
    *
    * @deprecated Use `entry` instead.
    */
  var onEntry: js.UndefOr[Actions[TContext, TEvent]] = js.undefined
  
  /**
    * The action(s) to be executed upon exiting the state node.
    *
    * @deprecated Use `exit` instead.
    */
  var onExit: js.UndefOr[Actions[TContext, TEvent]] = js.undefined
  
  /**
    * The order this state node appears. Corresponds to the implicit SCXML document order.
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated
    */
  var parallel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @private
    */
  var parent: js.UndefOr[StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]] = js.undefined
  
  /**
    * Whether XState calls actions with the event directly responsible for the related transition.
    *
    * @default false
    */
  var predictableActionArguments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether actions should be called in order.
    * When `false` (default), `assign(...)` actions are prioritized before other actions.
    *
    * @default false
    */
  var preserveActionOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The mapping of state node keys to their state node configurations (recursive).
    */
  var states: js.UndefOr[StatesConfig[TContext, TStateSchema, TEvent, TAction]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags for this state node, which are accumulated into the `state.tags` property.
    */
  var tags: js.UndefOr[SingleOrArray[String]] = js.undefined
  
  /**
    * The type of this state node:
    *
    *  - `'atomic'` - no child state nodes
    *  - `'compound'` - nested child state nodes (XOR)
    *  - `'parallel'` - orthogonal nested child state nodes (AND)
    *  - `'history'` - history state node
    *  - `'final'` - final state node
    */
  var `type`: js.UndefOr[atomic | compound | parallel | `final` | history] = js.undefined
}
object StateNodeConfig {
  
  inline def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */](): StateNodeConfig[TContext, TStateSchema, TEvent, TAction] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateNodeConfig[TContext, TStateSchema, TEvent, TAction]]
  }
  
  extension [Self <: StateNodeConfig[?, ?, ?, ?], TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */](x: Self & (StateNodeConfig[TContext, TStateSchema, TEvent, TAction])) {
    
    inline def setActivities(value: SingleOrArray[Activity[TContext, TEvent]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: (Activity[TContext, TEvent])*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setAfter(value: DelayedTransitions[TContext, TEvent]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(
      value: ((TransitionConfig[TContext, TEvent]) & (typingsJapgolly.xstate.anon.Delay[TContext, TEvent]))*
    ): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setAlways(value: TransitionConfigOrTarget[TContext, TEvent]): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setAlwaysVarargs(value: ((TransitionConfigTarget[TContext, TEvent]) | (TransitionConfig[TContext, TEvent]))*): Self = StObject.set(x, "always", js.Array(value*))
    
    inline def setData(value: (Mapper[TContext, TEvent, Any]) | (PropertyMapper[TContext, TEvent, Any])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFunction2(value: (TContext, TEvent) => Any): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntry(value: BaseActions[TContext, TEvent, TAction]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Callback): Self = StObject.set(x, "entry", js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: (BaseAction[TContext, TEvent, TAction])*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setExit(value: BaseActions[TContext, TEvent, TAction]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setExitVarargs(value: (BaseAction[TContext, TEvent, TAction])*): Self = StObject.set(x, "exit", js.Array(value*))
    
    inline def setHistory(value: shallow | deep | Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInvoke(value: SingleOrArray[(InvokeConfig[TContext, TEvent]) | AnyStateMachine]): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    inline def setInvokeUndefined: Self = StObject.set(x, "invoke", js.undefined)
    
    inline def setInvokeVarargs(value: ((InvokeConfig[TContext, TEvent]) | AnyStateMachine)*): Self = StObject.set(x, "invoke", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMeta(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TStateSchema extends {  meta :infer D} ? D : any */ js.Any
    ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOn(value: TransitionsConfig[TContext, TEvent]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
    
    inline def setOnDoneVarargs(value: (TransitionConfig[TContext, DoneEventObject])*): Self = StObject.set(x, "onDone", js.Array(value*))
    
    inline def setOnEntry(value: Actions[TContext, TEvent]): Self = StObject.set(x, "onEntry", value.asInstanceOf[js.Any])
    
    inline def setOnEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Callback): Self = StObject.set(x, "onEntry", js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnEntryUndefined: Self = StObject.set(x, "onEntry", js.undefined)
    
    inline def setOnEntryVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "onEntry", js.Array(value*))
    
    inline def setOnExit(value: Actions[TContext, TEvent]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    inline def setOnExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Callback): Self = StObject.set(x, "onExit", js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExitVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "onExit", js.Array(value*))
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOnVarargs(
      value: ((/* import warning: importer.ImportType#apply Failed type conversion: TEvent extends xstate.xstate/lib/types.EventObject ? xstate.xstate/lib/types.TransitionConfig<TContext, TEvent> & {  event :TEvent['type']} : never */ js.Any) | ((TransitionConfig[TContext, TEvent]) & typingsJapgolly.xstate.anon.Event) | ((TransitionConfig[TContext, TEvent]) & `3`))*
    ): Self = StObject.set(x, "on", js.Array(value*))
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setParent(value: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPredictableActionArguments(value: Boolean): Self = StObject.set(x, "predictableActionArguments", value.asInstanceOf[js.Any])
    
    inline def setPredictableActionArgumentsUndefined: Self = StObject.set(x, "predictableActionArguments", js.undefined)
    
    inline def setPreserveActionOrder(value: Boolean): Self = StObject.set(x, "preserveActionOrder", value.asInstanceOf[js.Any])
    
    inline def setPreserveActionOrderUndefined: Self = StObject.set(x, "preserveActionOrder", js.undefined)
    
    inline def setStates(value: StatesConfig[TContext, TStateSchema, TEvent, TAction]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTags(value: SingleOrArray[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: atomic | compound | parallel | `final` | history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
