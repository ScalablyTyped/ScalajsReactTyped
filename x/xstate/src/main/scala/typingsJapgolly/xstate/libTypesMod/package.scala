package typingsJapgolly.xstate.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Record
import typingsJapgolly.xstate.anon.Activities
import typingsJapgolly.xstate.anon.Context
import typingsJapgolly.xstate.anon.DataAny
import typingsJapgolly.xstate.anon.Delays
import typingsJapgolly.xstate.anon.Guards
import typingsJapgolly.xstate.anon.Services
import typingsJapgolly.xstate.anon.TypeString
import typingsJapgolly.xstate.anon.`1`
import typingsJapgolly.xstate.anon.`2`
import typingsJapgolly.xstate.anon.`3`
import typingsJapgolly.xstate.libInterpreterMod.Interpreter
import typingsJapgolly.xstate.libStateMod.State
import typingsJapgolly.xstate.libStateNodeMod.StateNode
import typingsJapgolly.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenConstraint
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled
import typingsJapgolly.xstate.xstateBooleans.`false`
import typingsJapgolly.xstate.xstateStrings.actions
import typingsJapgolly.xstate.xstateStrings.delays
import typingsJapgolly.xstate.xstateStrings.guards
import typingsJapgolly.xstate.xstateStrings.missingImplementations
import typingsJapgolly.xstate.xstateStrings.resolved
import typingsJapgolly.xstate.xstateStrings.services
import typingsJapgolly.xstate.xstateStrings.xstateDotguard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Action[TContext, TEvent /* <: EventObject */] = ActionType | (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])

type ActionFunction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ ActionMeta[TContext, TEvent, TAction], 
Unit]

type ActionType = String

type Actions[TContext, TEvent /* <: EventObject */] = SingleOrArray[Action[TContext, TEvent]]

type Activity[TContext, TEvent /* <: EventObject */] = String | (ActivityDefinition[TContext, TEvent])

type ActivityConfig[TContext, TEvent /* <: EventObject */] = js.Function2[
/* ctx */ TContext, 
/* activity */ ActivityDefinition[TContext, TEvent], 
DisposeActivityFunction | Unit]

type ActivityMap = StringDictionary[(ActivityDefinition[Any, Any]) | `false`]

type AdjacencyMap = StringDictionary[Record[String, TransitionMap]]

type AnyActorRef = ActorRef[Any, Any]

type AnyInterpreter = Interpreter[Any, Any, Any, Any, Any]

type AnyState = State[Any, Any, Any, Any, Any]

type AnyStateConfig = StateConfig[Any, AnyEventObject]

type AnyStateMachine = StateMachine[Any, Any, Any, Any, Any, Any, Any]

type AnyStateNodeDefinition = StateNodeDefinition[Any, Any, Any]

type Assigner[TContext, TEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ AssignMeta[TContext, TEvent], 
Partial[TContext]]

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.SimpleActionsOf<TAction>['type'] * / js.Any
  - TAction
  - typingsJapgolly.xstate.libTypesMod.RaiseAction[scala.Any]
  - typingsJapgolly.xstate.libTypesMod.SendAction[TContext, TEvent, scala.Any]
  - typingsJapgolly.xstate.libTypesMod.AssignAction[TContext, TEvent]
  - typingsJapgolly.xstate.libTypesMod.LogAction[TContext, TEvent]
  - typingsJapgolly.xstate.libTypesMod.CancelAction
  - typingsJapgolly.xstate.libTypesMod.StopAction[TContext, TEvent]
  - typingsJapgolly.xstate.libTypesMod.ChooseAction[TContext, TEvent]
  - typingsJapgolly.xstate.libTypesMod.ActionFunction[TContext, TEvent, typingsJapgolly.xstate.libTypesMod.BaseActionObject]
*/
type BaseAction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = (_BaseAction[TContext, TEvent, TAction]) | RaiseAction[Any] | (SendAction[TContext, TEvent, Any]) | (ActionFunction[TContext, TEvent, BaseActionObject]) | (/* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.SimpleActionsOf<TAction>['type'] */ js.Any) | TAction

type BaseActions[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = SingleOrArray[BaseAction[TContext, TEvent, TAction]]

type Compute[A /* <: Any */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: A[K]} */ js.Any) & Any

type Condition[TContext, TEvent /* <: EventObject */] = String | (ConditionPredicate[TContext, TEvent]) | (Guard[TContext, TEvent])

type ConditionPredicate[TContext, TEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ GuardMeta[TContext, TEvent], 
Boolean]

type ConditionalTransitionConfig[TContext, TEvent /* <: EventObject */] = js.Array[TransitionConfig[TContext, TEvent]]

type DefaultContext = js.UndefOr[Record[String, Any]]

type DefaultGuardType = xstateDotguard

type DelayConfig[TContext, TEvent /* <: EventObject */] = Double | (DelayExpr[TContext, TEvent])

type DelayExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, Double]

type DelayFunctionMap[TContext, TEvent /* <: EventObject */] = Record[String, DelayConfig[TContext, TEvent]]

type DelayedTransitions[TContext, TEvent /* <: EventObject */] = (Record[String | Double, String | (SingleOrArray[TransitionConfig[TContext, TEvent]])]) | (js.Array[
(TransitionConfig[TContext, TEvent]) & (typingsJapgolly.xstate.anon.Delay[TContext, TEvent])])

type DisposeActivityFunction = js.Function0[Unit]

type Event[TEvent /* <: EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent

type EventData = (Record[String, Any]) & `1`

type EventType = String

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in std.Exclude<keyof A, 'type'> ]: A[K]}
  }}}
  */
type ExcludeType[A] = A

type Expr[TContext, TEvent /* <: EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]

type ExprWithMeta[TContext, TEvent /* <: EventObject */, T] = js.Function3[/* context */ TContext, /* event */ TEvent, /* meta */ SCXMLEventMeta[TEvent], T]

type GenerateActionsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[actions, Prop[TMissingImplementations, actions], TRequireMissingImplementations]) & (`2`[TContext, TResolvedTypesMeta])

type GenerateDelaysConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[delays, Prop[TMissingImplementations, delays], TRequireMissingImplementations]) & (Delays[TContext, TResolvedTypesMeta])

type GenerateGuardsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[guards, Prop[TMissingImplementations, guards], TRequireMissingImplementations]) & (Guards[TContext, TResolvedTypesMeta])

type GenerateServicesConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[services, Prop[TMissingImplementations, services], TRequireMissingImplementations]) & (Services[TContext, TResolvedTypesMeta])

type Guard[TContext, TEvent /* <: EventObject */] = (GuardPredicate[TContext, TEvent]) | ((Record[String, Any]) & TypeString)

type InternalMachineOptions[TContext, TEvent /* <: EventObject */, TResolvedTypesMeta, TRequireMissingImplementations /* <: Boolean */, TMissingImplementations] = (GenerateActionsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateDelaysConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateGuardsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateServicesConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (Activities[TContext, TEvent])

type InvokeCallback[TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] = js.Function2[
/* callback */ Sender[TSentEvent], 
/* onReceive */ Receiver[TEvent], 
js.Function0[Unit] | js.Promise[Any] | Unit]

type InvokeCreator[TContext, TSourceEvent /* <: EventObject */, TFinalContext, TInputEvent /* <: EventObject */, // keeping a slot for it here, but it's actually not used right now to ensure that the communication contract between actors is satisfied
TOutputEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TSourceEvent, 
/* meta */ InvokeMeta, 
PromiseLike[TFinalContext] | (StateMachine[TFinalContext, Any, Any, Any, Any, Any, Any]) | Subscribable[EventObject] | (InvokeCallback[TInputEvent, TOutputEvent]) | (Behavior[Any, Any])]

type IsAny[T] = Equals[T, Any]

type LogExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, Any]

type LowInfer[T] = T & js.Object

type MachineOptions[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */] = InternalMachineOptions[
TContext, 
TEvent, 
ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap], 
`false`, 
Prop[
  Prop[ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap], resolved], 
  missingImplementations
]]

type Mapper[TContext, TEvent /* <: EventObject */, TParams /* <: js.Object */] = js.Function2[/* context */ TContext, /* event */ TEvent, TParams]

type Merge[M, N] = (Omit[M, /* keyof N */ String]) & N

type MetaObject = Record[String, Any]

type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : any] */ js.Any

type PartialAssigner[TContext, TEvent /* <: EventObject */, TKey /* <: /* keyof TContext */ String */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ AssignMeta[TContext, TEvent], 
/* import warning: importer.ImportType#apply Failed type conversion: TContext[TKey] */ js.Any]

type PathMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathItem[TContext, TEvent]]

type PathsMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathsItem[TContext, TEvent]]

type PredictableActionArgumentsExec = js.Function3[
/* action */ ActionObject[Any, EventObject], 
/* context */ Any, 
/* _event */ typingsJapgolly.xstate.libTypesMod.SCXML.Event[EventObject], 
Unit]

type Receiver[TEvent /* <: EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, Unit], Unit]

type SendExpr[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, TSentEvent]

type Sender[TEvent /* <: EventObject */] = js.Function1[/* event */ Event[TEvent], Unit]

type ServiceConfig[TContext, TEvent /* <: EventObject */] = String | AnyStateMachine | (InvokeCreator[TContext, TEvent, Any, Any, TEvent])

type ServiceMap = Record[String, DataAny]

type SimpleEventsOf[TEvent /* <: EventObject */] = ExtractWithSimpleSupport[TEvent]

type SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = (AtomicStateNodeConfig[TContext, TEvent]) | (StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject])

type SingleOrArray[T] = js.Array[T] | T

type Spawnable = AnyStateMachine | PromiseLike[Any] | (InvokeCallback[AnyEventObject, AnyEventObject]) | InteropObservable[Any] | Subscribable[Any] | (Behavior[Any, Any])

type SpawnedActorRef[TEvent /* <: EventObject */, TEmitted] = ActorRef[TEvent, TEmitted]

type StandardMachineConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject]

type StateKey = String | AnyState

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xstate.xstateStrings.atomic
  - typingsJapgolly.xstate.xstateStrings.compound
  - typingsJapgolly.xstate.xstateStrings.parallel
  - typingsJapgolly.xstate.xstateStrings.`final`
  - typingsJapgolly.xstate.xstateStrings.history
  - java.lang.String
*/
type StateTypes = _StateTypes | String

type StateValue = String | StateValueMap

type Transition[TContext, TEvent /* <: EventObject */] = String | (TransitionConfig[TContext, TEvent]) | (ConditionalTransitionConfig[TContext, TEvent])

type TransitionConfigOrTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[
(TransitionConfigTarget[TContext, TEvent]) | (TransitionConfig[TContext, TEvent])]

type TransitionConfigTarget[TContext, TEvent /* <: EventObject */] = js.UndefOr[
String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[
String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionTargets[TContext] = js.Array[
String | (StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionsConfig[TContext, TEvent /* <: EventObject */] = (TransitionsConfigMap[TContext, TEvent]) | (TransitionsConfigArray[TContext, TEvent])

type TransitionsConfigArray[TContext, TEvent /* <: EventObject */] = js.Array[
(/* import warning: importer.ImportType#apply Failed type conversion: TEvent extends xstate.xstate/lib/types.EventObject ? xstate.xstate/lib/types.TransitionConfig<TContext, TEvent> & {  event :TEvent['type']} : never */ js.Any) | ((TransitionConfig[TContext, TEvent]) & typingsJapgolly.xstate.anon.Event) | ((TransitionConfig[TContext, TEvent]) & `3`)]

type ValueAdjacencyMap[TContext, TEvent /* <: EventObject */] = StringDictionary[Record[String, State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]]]

type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
