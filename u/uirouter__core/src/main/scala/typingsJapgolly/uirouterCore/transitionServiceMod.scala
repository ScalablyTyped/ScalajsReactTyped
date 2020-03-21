package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook
import typingsJapgolly.uirouterCore.interfaceMod.Disposable
import typingsJapgolly.uirouterCore.pathNodeMod.PathNode
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import typingsJapgolly.uirouterCore.targetStateMod.TargetState
import typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType
import typingsJapgolly.uirouterCore.transitionHookMod.GetErrorHandler
import typingsJapgolly.uirouterCore.transitionHookMod.GetResultHandler
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookRegOptions
import typingsJapgolly.uirouterCore.transitionInterfaceMod.IHookRegistry
import typingsJapgolly.uirouterCore.transitionInterfaceMod.PathType
import typingsJapgolly.uirouterCore.transitionInterfaceMod.PathTypes
import typingsJapgolly.uirouterCore.transitionInterfaceMod.RegisteredHooks
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionCreateHookFn
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookScope
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionOptions
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import typingsJapgolly.uirouterCore.viewViewMod.ViewService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/transitionService", JSImport.Namespace)
@js.native
object transitionServiceMod extends js.Object {
  @js.native
  class TransitionService protected ()
    extends IHookRegistry
       with Disposable {
    /** @hidden */
    def this(_router: UIRouter) = this()
    /** @hidden */
    @JSName("$view")
    var $view: ViewService = js.native
    /** @hidden The  paths on a criteria object */
    var _criteriaPaths: js.Any = js.native
    /** @hidden */
    var _defineCoreEvents: js.Any = js.native
    /** @hidden */
    var _defineCorePaths: js.Any = js.native
    /**
      * Adds a Path to be used as a criterion against a TreeChanges path
      *
      * For example: the `exiting` path in [[HookMatchCriteria]] is a STATE scoped path.
      * It was defined by calling `defineTreeChangesCriterion('exiting', TransitionHookScope.STATE)`
      * Each state in the exiting path is checked against the criteria and returned as part of the match.
      *
      * Another example: the `to` path in [[HookMatchCriteria]] is a TRANSITION scoped path.
      * It was defined by calling `defineTreeChangesCriterion('to', TransitionHookScope.TRANSITION)`
      * Only the tail of the `to` path is checked against the criteria and returned as part of the match.
      *
      * @hidden
      */
    var _definePathType: js.Any = js.native
    /**
      * This object has hook de-registration functions for the built-in hooks.
      * This can be used by third parties libraries that wish to customize the behaviors
      *
      * @hidden
      */
    var _deregisterHookFns: AnonActivateViews = js.native
    /** @hidden The transition hook types, such as `onEnter`, `onStart`, etc */
    var _eventTypes: js.Any = js.native
    /** @hidden */
    var _getEvents: js.Any = js.native
    /** * @hidden */
    var _getPathTypes: js.Any = js.native
    /** @internalapi */
    var _pluginapi: TransitionServicePluginAPI = js.native
    /** @hidden */
    var _registerCoreTransitionHooks: js.Any = js.native
    /** @hidden The registered transition hooks */
    @JSName("_registeredHooks")
    var _registeredHooks_TransitionService: RegisteredHooks = js.native
    /** @hidden */
    var _router: js.Any = js.native
    /** @hidden */
    var _transitionCount: Double = js.native
    /** @hidden */
    def _defineEvent(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ): Unit = js.native
    /**
      * Creates a new [[Transition]] object
      *
      * This is a factory function for creating new Transition objects.
      * It is used internally by the [[StateService]] and should generally not be called by application code.
      *
      * @param fromPath the path to the current state (the from state)
      * @param targetState the target state (destination)
      * @returns a Transition
      */
    def create(fromPath: js.Array[PathNode], targetState: TargetState): Transition = js.native
    /**
      * Registers a [[TransitionHookFn]], called *while a transition is being constructed*.
      *
      * Registers a transition lifecycle hook, which is invoked during transition construction.
      *
      * This low level hook should only be used by plugins.
      * This can be a useful time for plugins to add resolves or mutate the transition as needed.
      * The Sticky States plugin uses this hook to modify the treechanges.
      *
      * ### Lifecycle
      *
      * `onCreate` hooks are invoked *while a transition is being constructed*.
      *
      * ### Return value
      *
      * The hook's return value is ignored
      *
      * @internalapi
      * @param criteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be invoked.
      * @param options the registration options
      * @returns a function which deregisters the hook.
      */
    def onCreate(criteria: HookMatchCriteria, callback: TransitionCreateHookFn): js.Function = js.native
    def onCreate(criteria: HookMatchCriteria, callback: TransitionCreateHookFn, options: HookRegOptions): js.Function = js.native
  }
  
  @js.native
  trait TransitionServicePluginAPI extends js.Object {
    /**
      * Defines a transition hook type and returns a transition hook registration
      * function (which can then be used to register hooks of this type).
      */
    def _defineEvent(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    /**
      * Adds a Path to be used as a criterion against a TreeChanges path
      *
      * For example: the `exiting` path in [[HookMatchCriteria]] is a STATE scoped path.
      * It was defined by calling `defineTreeChangesCriterion('exiting', TransitionHookScope.STATE)`
      * Each state in the exiting path is checked against the criteria and returned as part of the match.
      *
      * Another example: the `to` path in [[HookMatchCriteria]] is a TRANSITION scoped path.
      * It was defined by calling `defineTreeChangesCriterion('to', TransitionHookScope.TRANSITION)`
      * Only the tail of the `to` path is checked against the criteria and returned as part of the match.
      */
    def _definePathType(name: String, hookScope: TransitionHookScope): js.Any = js.native
    /**
      * Returns the known event types, such as `onBefore`
      * If a phase argument is provided, returns only events for the given phase.
      */
    def _getEvents(): js.Array[TransitionEventType] = js.native
    def _getEvents(phase: TransitionHookPhase): js.Array[TransitionEventType] = js.native
    /**
      * Gets a Path definition used as a criterion against a TreeChanges path
      */
    def _getPathTypes(): PathTypes = js.native
    /** Returns the hooks registered for the given hook name */
    def getHooks(hookName: String): js.Array[RegisteredHook] = js.native
  }
  
  var defaultTransOpts: TransitionOptions = js.native
}

