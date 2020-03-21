package typingsJapgolly.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xstate.typesMod.ActionType
    - typingsJapgolly.xstate.typesMod.ActionObject[TContext, TEvent]
    - typingsJapgolly.xstate.typesMod.ActionFunction[TContext, TEvent]
    - typingsJapgolly.xstate.typesMod.AssignAction[typingsJapgolly.std.Required[TContext], TEvent]
    - typingsJapgolly.xstate.typesMod.SendAction[TContext, TEvent]
    - typingsJapgolly.xstate.typesMod.RaiseAction[typingsJapgolly.xstate.typesMod.AnyEventObject]
  */
  type Action[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = (typingsJapgolly.xstate.typesMod._Action[TContext, TEvent]) | (typingsJapgolly.xstate.typesMod.AssignAction[typingsJapgolly.std.Required[TContext], TEvent]) | typingsJapgolly.xstate.typesMod.RaiseAction[typingsJapgolly.xstate.typesMod.AnyEventObject] | typingsJapgolly.xstate.typesMod.ActionType | (typingsJapgolly.xstate.typesMod.ActionFunction[TContext, TEvent])
  type ActionFunction[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent], 
    js.Any | scala.Unit
  ]
  type ActionFunctionMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.std.Record[
    java.lang.String, 
    (typingsJapgolly.xstate.typesMod.ActionObject[TContext, TEvent]) | (typingsJapgolly.xstate.typesMod.ActionFunction[TContext, TEvent])
  ]
  type ActionType = java.lang.String
  type Actions[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.xstate.typesMod.SingleOrArray[typingsJapgolly.xstate.typesMod.Action[TContext, TEvent]]
  type Activity[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = java.lang.String | (typingsJapgolly.xstate.typesMod.ActivityDefinition[TContext, TEvent])
  type ActivityConfig[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function2[
    /* ctx */ TContext, 
    /* activity */ typingsJapgolly.xstate.typesMod.ActivityDefinition[TContext, TEvent], 
    typingsJapgolly.xstate.typesMod.DisposeActivityFunction | scala.Unit
  ]
  type ActivityMap = org.scalablytyped.runtime.StringDictionary[
    (typingsJapgolly.xstate.typesMod.ActivityDefinition[js.Any, js.Any]) | typingsJapgolly.xstate.xstateBooleans.`false`
  ]
  type AdjacencyMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.xstate.typesMod.TransitionMap]
  ]
  type AnyStateNodeDefinition = typingsJapgolly.xstate.typesMod.StateNodeDefinition[js.Any, js.Any, js.Any]
  type Assigner[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsJapgolly.xstate.typesMod.AssignMeta[TContext, TEvent], 
    typingsJapgolly.std.Partial[TContext]
  ]
  type Condition[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = java.lang.String | (typingsJapgolly.xstate.typesMod.ConditionPredicate[TContext, TEvent]) | (typingsJapgolly.xstate.typesMod.Guard[TContext, TEvent])
  type ConditionPredicate[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsJapgolly.xstate.typesMod.GuardMeta[TContext, TEvent], 
    scala.Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Array[typingsJapgolly.xstate.typesMod.TransitionConfig[TContext, TEvent]]
  type DefaultContext = js.UndefOr[typingsJapgolly.std.Record[java.lang.String, js.Any]]
  type DefaultGuardType = typingsJapgolly.xstate.xstateStrings.xstateDotguard
  type DelayConfig[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = scala.Double | (typingsJapgolly.xstate.typesMod.DelayExpr[TContext, TEvent])
  type DelayExpr[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.xstate.typesMod.ExprWithMeta[TContext, TEvent, scala.Double]
  type DelayFunctionMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.xstate.typesMod.DelayConfig[TContext, TEvent]]
  type DelayedTransitions[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = (typingsJapgolly.std.Record[
    java.lang.String | scala.Double, 
    java.lang.String | (typingsJapgolly.xstate.typesMod.SingleOrArray[typingsJapgolly.xstate.typesMod.TransitionConfig[TContext, TEvent]])
  ]) | (js.Array[
    (typingsJapgolly.xstate.typesMod.TransitionConfig[TContext, TEvent]) with (typingsJapgolly.xstate.AnonDelay[TContext, TEvent])
  ])
  type DisposeActivityFunction = js.Function0[scala.Unit]
  type DoneEvent = typingsJapgolly.xstate.typesMod.DoneEventObject with java.lang.String
  type Event[TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent
  type EventData = (typingsJapgolly.std.Record[java.lang.String, _]) with js.Object
  type EventType = java.lang.String
  type Expr[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type ExprWithMeta[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */, T] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsJapgolly.xstate.typesMod.SCXMLEventMeta[TEvent], 
    T
  ]
  type ExtractStateValue[TS /* <: typingsJapgolly.xstate.typesMod.StateSchema[_] */, TSS] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TSS ]:? TSS[K] extends {  states  :any}? keyof TSS[K]['states'] : never | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias xstate.xstate/lib/types.ExtractStateValue<TSS[K], TSS[K]['states']> * / object}
    */ typingsJapgolly.xstate.xstateStrings.ExtractStateValue with TSS
  type Guard[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = (typingsJapgolly.xstate.typesMod.GuardPredicate[TContext, TEvent]) | ((typingsJapgolly.std.Record[java.lang.String, _]) with typingsJapgolly.xstate.AnonTypeString)
  type InvokeCallback = js.Function2[
    /* callback */ typingsJapgolly.xstate.typesMod.Sender[js.Any], 
    /* onReceive */ typingsJapgolly.xstate.typesMod.Receiver[typingsJapgolly.xstate.typesMod.EventObject], 
    js.Any
  ]
  type InvokeConfig[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = (typingsJapgolly.xstate.AnonData[TContext, TEvent]) | (typingsJapgolly.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any])
  type InvokeCreator[TContext, TEvent, TFinalContext] = js.Function2[
    /* context */ TContext, 
    /* event */ TEvent, 
    js.Thenable[TFinalContext] | (typingsJapgolly.xstate.typesMod.StateMachine[TFinalContext, js.Any, js.Any, js.Any]) | typingsJapgolly.xstate.typesMod.Subscribable[js.Any] | typingsJapgolly.xstate.typesMod.InvokeCallback
  ]
  type LogExpr[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.xstate.typesMod.ExprWithMeta[TContext, TEvent, js.Any]
  type Mapper[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]
  type MetaObject = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type PathMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.xstate.typesMod.PathItem[TContext, TEvent]]
  type PathsMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.xstate.typesMod.PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]:? (context : TContext, event : TEvent, meta : xstate.xstate/lib/types.AssignMeta<TContext, TEvent>): TContext[K] | TContext[K]}
    */ typingsJapgolly.xstate.xstateStrings.PropertyAssigner with js.Any
  type Receiver[TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, scala.Unit], scala.Unit]
  type SendExpr[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.xstate.typesMod.ExprWithMeta[TContext, TEvent, TEvent]
  type Sender[TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function1[/* event */ typingsJapgolly.xstate.typesMod.Event[TEvent], scala.Unit]
  type ServiceConfig[TContext] = java.lang.String | (typingsJapgolly.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]) | (typingsJapgolly.xstate.typesMod.InvokeCreator[TContext, typingsJapgolly.xstate.typesMod.AnyEventObject, js.Any])
  type SingleOrArray[T] = js.Array[T] | T
  type Spawnable = (typingsJapgolly.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]) | js.Promise[js.Any] | typingsJapgolly.xstate.typesMod.InvokeCallback | typingsJapgolly.xstate.typesMod.Subscribable[js.Any]
  type StandardMachineConfig[TContext, TStateSchema /* <: typingsJapgolly.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
  type StateFrom[TMachine /* <: typingsJapgolly.xstate.typesMod.StateMachine[_, _, _, _] */] = typingsJapgolly.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: TMachine['transition'] */ js.Any
  ]
  type StateKey = java.lang.String | (typingsJapgolly.xstate.stateMod.State[js.Any, typingsJapgolly.xstate.typesMod.EventObject, js.Any, js.Any])
  type StateNodesConfig[TContext, TStateSchema /* <: typingsJapgolly.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/StateNode.StateNode<TContext, TStateSchema['states'][K], TEvent, any>}
    */ typingsJapgolly.xstate.xstateStrings.StateNodesConfig with TStateSchema
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xstate.xstateStrings.atomic
    - typingsJapgolly.xstate.xstateStrings.compound
    - typingsJapgolly.xstate.xstateStrings.parallel
    - typingsJapgolly.xstate.xstateStrings.`final`
    - typingsJapgolly.xstate.xstateStrings.history
    - java.lang.String
  */
  type StateTypes = typingsJapgolly.xstate.typesMod._StateTypes | java.lang.String
  type StateValue = java.lang.String | typingsJapgolly.xstate.typesMod.StateValueMap
  type StatesConfig[TContext, TStateSchema /* <: typingsJapgolly.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ typingsJapgolly.xstate.xstateStrings.StatesConfig with TStateSchema
  type StatesDefinition[TContext, TStateSchema /* <: typingsJapgolly.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ typingsJapgolly.xstate.xstateStrings.StatesDefinition with TStateSchema
  type Transition[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = java.lang.String | (typingsJapgolly.xstate.typesMod.TransitionConfig[TContext, TEvent]) | (typingsJapgolly.xstate.typesMod.ConditionalTransitionConfig[TContext, TEvent])
  type TransitionConfigTargetShortcut[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.UndefOr[
    java.lang.String | (typingsJapgolly.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionDefinitionMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject>>}
    */ typingsJapgolly.xstate.xstateStrings.TransitionDefinitionMap with TEvent
  type TransitionTarget[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = typingsJapgolly.xstate.typesMod.SingleOrArray[
    java.lang.String | (typingsJapgolly.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionTargets[TContext] = js.Array[
    java.lang.String | (typingsJapgolly.xstate.stateNodeMod.StateNode[TContext, js.Any, typingsJapgolly.xstate.typesMod.EventObject, js.Any])
  ]
  type TransitionsConfig[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = (typingsJapgolly.xstate.typesMod.TransitionsConfigMap[TContext, TEvent]) | (typingsJapgolly.xstate.typesMod.TransitionsConfigArray[TContext, TEvent])
  type TransitionsConfigArray[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event  :K}}[TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*'] */ js.Any
  ]
  type TransitionsConfigMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]:? xstate.xstate/lib/types.SingleOrArray<xstate.xstate/lib/types.TransitionConfigTargetShortcut<TContext, TEvent> | xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event? :undefined}>}
    */ typingsJapgolly.xstate.xstateStrings.TransitionsConfigMap with TEvent
  type ValueAdjacencyMap[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.std.Record[
      java.lang.String, 
      typingsJapgolly.xstate.stateMod.State[TContext, TEvent, js.Any, js.Any]
    ]
  ]
}
