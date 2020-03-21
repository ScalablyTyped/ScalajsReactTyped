package typingsJapgolly.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterCore.paramsInterfaceMod.RawParams
import typingsJapgolly.uirouterCore.resolvableMod.Resolvable
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import typingsJapgolly.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsJapgolly.uirouterCore.stateInterfaceMod.StateOrName
import typingsJapgolly.uirouterCore.stateInterfaceMod._StateDeclaration
import typingsJapgolly.uirouterCore.stateRegistryMod.StateRegistryListener
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionOptions
import typingsJapgolly.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  @js.native
  class StateBuilder protected ()
    extends typingsJapgolly.uirouterCore.stateBuilderMod.StateBuilder {
    def this(
      matcher: typingsJapgolly.uirouterCore.stateMatcherMod.StateMatcher,
      urlMatcherFactory: UrlMatcherFactory
    ) = this()
  }
  
  @js.native
  class StateMatcher protected ()
    extends typingsJapgolly.uirouterCore.stateMatcherMod.StateMatcher {
    def this(_states: StringDictionary[typingsJapgolly.uirouterCore.stateObjectMod.StateObject]) = this()
  }
  
  @js.native
  /** @deprecated use State.create() */
  class StateObject ()
    extends typingsJapgolly.uirouterCore.stateObjectMod.StateObject {
    def this(config: StateDeclaration) = this()
  }
  
  @js.native
  class StateQueueManager protected ()
    extends typingsJapgolly.uirouterCore.stateQueueManagerMod.StateQueueManager {
    def this(
      router: UIRouter,
      states: StringDictionary[typingsJapgolly.uirouterCore.stateObjectMod.StateObject],
      builder: typingsJapgolly.uirouterCore.stateBuilderMod.StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
  }
  
  @js.native
  class StateRegistry protected ()
    extends typingsJapgolly.uirouterCore.stateRegistryMod.StateRegistry {
    /** @internalapi */
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class StateService protected ()
    extends typingsJapgolly.uirouterCore.stateServiceMod.StateService {
    /** @internalapi */
    def this(/** @hidden */ router: UIRouter) = this()
  }
  
  @js.native
  class TargetState protected ()
    extends typingsJapgolly.uirouterCore.targetStateMod.TargetState {
    /**
      * The TargetState constructor
      *
      * Note: Do not construct a `TargetState` manually.
      * To create a `TargetState`, use the [[StateService.target]] factory method.
      *
      * @param _stateRegistry The StateRegistry to use to look up the _definition
      * @param _identifier An identifier for a state.
      *    Either a fully-qualified state name, or the object used to define the state.
      * @param _params Parameters for the target state
      * @param _options Transition options.
      *
      * @internalapi
      */
    def this(
      _stateRegistry: typingsJapgolly.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName
    ) = this()
    def this(
      _stateRegistry: typingsJapgolly.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams
    ) = this()
    def this(
      _stateRegistry: typingsJapgolly.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams,
      _options: TransitionOptions
    ) = this()
  }
  
  def resolvablesBuilder(state: typingsJapgolly.uirouterCore.stateObjectMod.StateObject): js.Array[Resolvable] = js.native
  /* static members */
  @js.native
  object StateObject extends js.Object {
    /**
      * Create a state object to put the private/internal implementation details onto.
      * The object's prototype chain looks like:
      * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
      *
      * @param stateDecl the user-supplied State Declaration
      * @returns {StateObject} an internal State object
      */
    def create(stateDecl: _StateDeclaration): typingsJapgolly.uirouterCore.stateObjectMod.StateObject = js.native
    /** Predicate which returns true if the object is an internal [[StateObject]] object */
    def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = js.native
    /** Predicate which returns true if the object is an class with @State() decorator */
    def isStateClass(stateDecl: _StateDeclaration): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetState extends js.Object {
    /** Returns true if the object has a state property that might be a state or state name */
    def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = js.native
  }
  
}

