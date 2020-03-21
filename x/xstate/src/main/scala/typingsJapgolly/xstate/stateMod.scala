package typingsJapgolly.xstate

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import typingsJapgolly.xstate.actorMod.Actor
import typingsJapgolly.xstate.stateNodeMod.StateNode
import typingsJapgolly.xstate.typesMod.ActionObject
import typingsJapgolly.xstate.typesMod.ActivityMap
import typingsJapgolly.xstate.typesMod.AnyEventObject
import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.EventType
import typingsJapgolly.xstate.typesMod.HistoryValue
import typingsJapgolly.xstate.typesMod.SCXML.Event
import typingsJapgolly.xstate.typesMod.StateConfig
import typingsJapgolly.xstate.typesMod.StateSchema
import typingsJapgolly.xstate.typesMod.StateValue
import typingsJapgolly.xstate.typesMod.TransitionDefinition
import typingsJapgolly.xstate.typesMod.Typestate
import typingsJapgolly.xstate.xstateStrings.configuration
import typingsJapgolly.xstate.xstateStrings.transitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/State", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  @js.native
  class State[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */] protected () extends js.Object {
    /**
      * Creates a new State instance.
      * @param value The state value
      * @param context The extended state
      * @param historyValue The tree representing historical values of the state nodes
      * @param history The previous state
      * @param actions An array of action objects to execute as side-effects
      * @param activities A mapping of activities and whether they are started (`true`) or stopped (`false`).
      * @param meta
      * @param events Internal event queue. Should be empty with run-to-completion semantics.
      * @param configuration
      */
    def this(config: StateConfig[TContext, TEvent]) = this()
    var _event: Event[TEvent] = js.native
    var _sessionid: String | Null = js.native
    var actions: js.Array[ActionObject[TContext, TEvent]] = js.native
    var activities: ActivityMap = js.native
    /**
      * Indicates whether the state has changed from the previous state. A state is considered "changed" if:
      *
      * - Its value is not equal to its previous value, or:
      * - It has any new actions (side-effects) to execute.
      *
      * An initial state (with no history) will return `undefined`.
      */
    var changed: js.UndefOr[Boolean] = js.native
    /**
      * An object mapping actor IDs to spawned actors/invoked services.
      */
    var children: Record[String, Actor[_, AnyEventObject]] = js.native
    /**
      * The enabled state nodes representative of the state value.
      */
    var configuration: js.Array[StateNode[TContext, _, TEvent, _]] = js.native
    var context: TContext = js.native
    /**
      * Indicates whether the state is a final state.
      */
    var done: js.UndefOr[Boolean] = js.native
    var event: TEvent = js.native
    var events: js.Array[TEvent] = js.native
    var history: js.UndefOr[State[TContext, TEvent, TStateSchema, _]] = js.native
    var historyValue: js.UndefOr[HistoryValue] = js.native
    var meta: js.Any = js.native
    /**
      * The next events that will cause a transition from the current state.
      */
    var nextEvents: js.Array[EventType] = js.native
    /**
      * The transition definitions that resulted in this state.
      */
    var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
    var value: StateValue = js.native
    /**
      * Whether the current state value is a subset of the given parent state value.
      * @param parentStateValue
      */
    def matches[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */](parentStateValue: TSV): Boolean = js.native
    def toJSON(): Pick[this.type, Exclude[String, configuration | transitions]] = js.native
    /**
      * Returns an array of all the string leaf state node paths.
      * @param stateValue
      * @param delimiter The character(s) that separate each subpath in the string state node path.
      */
    def toStrings(): js.Array[String] = js.native
    def toStrings(stateValue: StateValue): js.Array[String] = js.native
    def toStrings(stateValue: StateValue, delimiter: String): js.Array[String] = js.native
  }
  
  def bindActionToState[TC, TE /* <: EventObject */](action: ActionObject[TC, TE], state: State[TC, TE, _, _]): ActionObject[TC, TE] = js.native
  def isState[TContext, TEvent /* <: EventObject */](state: String): /* is xstate.xstate/lib/State.State<TContext, TEvent, any, any> */ Boolean = js.native
  def isState[TContext, TEvent /* <: EventObject */](state: js.Object): /* is xstate.xstate/lib/State.State<TContext, TEvent, any, any> */ Boolean = js.native
  def stateValuesEqual(): Boolean = js.native
  def stateValuesEqual(a: js.UndefOr[StateValue], b: StateValue): Boolean = js.native
  def stateValuesEqual(a: StateValue): Boolean = js.native
  /* static members */
  @js.native
  object State extends js.Object {
    /**
      * Creates a new State instance for the given `config`.
      * @param config The state config
      */
    def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): State[TC, TE, _, _] = js.native
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    def from[TC, TE /* <: EventObject */](stateValue: State[TC, TE, _, _]): State[TC, TE, _, _] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: State[TC, TE, _, _], context: TC): State[TC, TE, _, _] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue): State[TC, TE, _, _] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): State[TC, TE, _, _] = js.native
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    def inert[TC, TE /* <: EventObject */](stateValue: State[TC, TE, _, _], context: TC): State[TC, TE, _, _] = js.native
    def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): State[TC, TE, _, _] = js.native
  }
  
}

