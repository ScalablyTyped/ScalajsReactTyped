package typingsJapgolly.xstate

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.xstate.mod.State
import typingsJapgolly.xstate.stateNodeMod.StateNode
import typingsJapgolly.xstate.typesMod.Action
import typingsJapgolly.xstate.typesMod.ActionType
import typingsJapgolly.xstate.typesMod.ActionTypes.NullEvent
import typingsJapgolly.xstate.typesMod.AssignAction
import typingsJapgolly.xstate.typesMod.Condition
import typingsJapgolly.xstate.typesMod.ConditionPredicate
import typingsJapgolly.xstate.typesMod.Event
import typingsJapgolly.xstate.typesMod.EventData
import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.EventType
import typingsJapgolly.xstate.typesMod.Guard
import typingsJapgolly.xstate.typesMod.HistoryValue
import typingsJapgolly.xstate.typesMod.Mapper
import typingsJapgolly.xstate.typesMod.PropertyMapper
import typingsJapgolly.xstate.typesMod.SingleOrArray
import typingsJapgolly.xstate.typesMod.StateLike
import typingsJapgolly.xstate.typesMod.StateValue
import typingsJapgolly.xstate.typesMod.Subscribable
import typingsJapgolly.xstate.typesMod.TransitionConfig
import typingsJapgolly.xstate.typesMod.TransitionConfigTargetShortcut
import typingsJapgolly.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val symbolObservable: String | js.Symbol = js.native
  var warn: js.Function2[/* condition */ Boolean | js.Error, /* message */ String, Unit] = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def getActionType(action: Action[_, _]): ActionType = js.native
  def getEventType[TEvent /* <: EventObject */](event: Event[TEvent]): /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  def isActor(value: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = js.native
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isBuiltInEvent(eventType: EventType): Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def isMachine(value: js.Any): /* is xstate.xstate/lib/types.StateMachine<any, any, any, any> */ Boolean = js.native
  def isObservable[T](value: js.Any): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = js.native
  def isObservable[T](value: Subscribable[T]): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = js.native
  def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def isStateLike(state: js.Any): /* is xstate.xstate/lib/types.StateLike<any> */ Boolean = js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  def keys[T /* <: js.Object */](value: T): js.Array[String] = js.native
  def mapContext[TContext, TEvent /* <: EventObject */](
    mapper: Mapper[TContext, TEvent],
    context: TContext,
    _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]
  ): js.Any = js.native
  def mapContext[TContext, TEvent /* <: EventObject */](
    mapper: PropertyMapper[TContext, TEvent],
    context: TContext,
    _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]
  ): js.Any = js.native
  def mapFilterValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function3[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], P],
    predicate: js.Function1[/* item */ T, Boolean]
  ): StringDictionary[P] = js.native
  def mapValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function4[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], /* i */ Double, P]
  ): StringDictionary[P] = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  def nestedPath[T /* <: Record[String, _] */](props: js.Array[String], accessorProp: String): js.Function1[/* object */ T, T] = js.native
  def normalizeTarget[TContext, TEvent /* <: EventObject */](): js.UndefOr[js.Array[String | (StateNode[TContext, _, TEvent, _])]] = js.native
  def normalizeTarget[TContext, TEvent /* <: EventObject */](target: SingleOrArray[String | (StateNode[TContext, _, TEvent, _])]): js.UndefOr[js.Array[String | (StateNode[TContext, _, TEvent, _])]] = js.native
  def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = js.native
  def path[T /* <: Record[String, _] */](props: js.Array[String]): js.Any = js.native
  def pathToStateValue(statePath: js.Array[String]): StateValue = js.native
  def pathsToStateValue(paths: js.Array[js.Array[String]]): StateValue = js.native
  def reportUnhandledExceptionOnInvocation(originalError: js.Any, currentError: js.Any, id: String): Unit = js.native
  def toArray[T](): js.Array[T] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toArrayStrict[T](value: T): js.Array[T] = js.native
  def toArrayStrict[T](value: js.Array[T]): js.Array[T] = js.native
  def toEventObject[TEvent /* <: EventObject */](event: Event[TEvent]): TEvent = js.native
  def toEventObject[TEvent /* <: EventObject */](event: Event[TEvent], payload: EventData): TEvent = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](condition: Condition[TContext, TEvent]): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](
    condition: Condition[TContext, TEvent],
    guardMap: Record[String, ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent]): typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent] = js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent], scxmlEvent: Partial[typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]]): typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent] = js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]): typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent] = js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](
    event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent],
    scxmlEvent: Partial[typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]]
  ): typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent] = js.native
  def toStatePath(stateId: String, delimiter: String): js.Array[String] = js.native
  def toStatePath(stateId: js.Array[String], delimiter: String): js.Array[String] = js.native
  def toStatePaths(): js.Array[js.Array[String]] = js.native
  def toStatePaths(stateValue: StateValue): js.Array[js.Array[String]] = js.native
  def toStateValue(stateValue: js.Array[String], delimiter: String): StateValue = js.native
  def toStateValue(stateValue: StateLike[_], delimiter: String): StateValue = js.native
  def toStateValue(stateValue: StateValue, delimiter: String): StateValue = js.native
  def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: NullEvent,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTargetShortcut[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) with AnonEvent[TEvent]] = js.native
  def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: Asterisk,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTargetShortcut[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) with AnonEvent[TEvent]] = js.native
  @JSName("toTransitionConfigArray")
  def toTransitionConfigArray_type[TContext, TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTargetShortcut[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) with AnonEvent[TEvent]] = js.native
  def uniqueId(): String = js.native
  def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent]]
  ): TContext = js.native
  def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent]],
    state: State[TContext, TEvent, _, _]
  ): TContext = js.native
  def updateHistoryStates(hist: HistoryValue, stateValue: StateValue): Record[String, js.UndefOr[HistoryValue]] = js.native
  def updateHistoryValue(hist: HistoryValue, stateValue: StateValue): HistoryValue = js.native
}

