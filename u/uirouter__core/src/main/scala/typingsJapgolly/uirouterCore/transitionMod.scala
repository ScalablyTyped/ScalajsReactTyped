package typingsJapgolly.uirouterCore

import typingsJapgolly.std.Error
import typingsJapgolly.uirouterCore.pathNodeMod.PathNode
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import typingsJapgolly.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsJapgolly.uirouterCore.stateObjectMod.StateObject
import typingsJapgolly.uirouterCore.targetStateMod.TargetState
import typingsJapgolly.uirouterCore.transitionHookMod.ErrorHandler
import typingsJapgolly.uirouterCore.transitionHookMod.GetErrorHandler
import typingsJapgolly.uirouterCore.transitionHookMod.GetResultHandler
import typingsJapgolly.uirouterCore.transitionHookMod.ResultHandler
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookFn
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookMatchCriterion
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookRegOptions
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookResult
import typingsJapgolly.uirouterCore.transitionInterfaceMod.IHookRegistry
import typingsJapgolly.uirouterCore.transitionInterfaceMod.PathType
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  @js.native
  class HookBuilder protected ()
    extends typingsJapgolly.uirouterCore.hookBuilderMod.HookBuilder {
    def this(transition: typingsJapgolly.uirouterCore.transitionTransitionMod.Transition) = this()
  }
  
  @js.native
  class RegisteredHook protected ()
    extends typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook {
    def this(
      tranSvc: typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService,
      eventType: typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
    ) = this()
    def this(
      tranSvc: typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService,
      eventType: typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
      options: HookRegOptions
    ) = this()
  }
  
  @js.native
  class Rejection protected ()
    extends typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
  }
  
  @js.native
  class Transition protected ()
    extends typingsJapgolly.uirouterCore.transitionTransitionMod.Transition {
    /**
      * Creates a new Transition object.
      *
      * If the target state is not valid, an error is thrown.
      *
      * @internalapi
      *
      * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
      *        encapsulates the "from state".
      * @param targetState The target state and parameters being transitioned to (also, the transition options)
      * @param router The [[UIRouter]] instance
      */
    def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
  }
  
  @js.native
  class TransitionEventType protected ()
    extends typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType {
    def this(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
  }
  
  @js.native
  class TransitionHook protected ()
    extends typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook {
    def this(
      transition: typingsJapgolly.uirouterCore.transitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook,
      options: TransitionHookOptions
    ) = this()
  }
  
  @js.native
  class TransitionService protected ()
    extends typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService {
    /** @hidden */
    def this(_router: UIRouter) = this()
  }
  
  var defaultTransOpts: TransitionOptions = js.native
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
  ): Boolean = js.native
  @js.native
  object RejectType extends js.Object {
    /* 3 */ val ABORTED: typingsJapgolly.uirouterCore.rejectFactoryMod.RejectType.ABORTED with Double = js.native
    /* 6 */ val ERROR: typingsJapgolly.uirouterCore.rejectFactoryMod.RejectType.ERROR with Double = js.native
    /* 5 */ val IGNORED: typingsJapgolly.uirouterCore.rejectFactoryMod.RejectType.IGNORED with Double = js.native
    /* 4 */ val INVALID: typingsJapgolly.uirouterCore.rejectFactoryMod.RejectType.INVALID with Double = js.native
    /* 2 */ val SUPERSEDED: typingsJapgolly.uirouterCore.rejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uirouterCore.rejectFactoryMod.RejectType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Rejection extends js.Object {
    /** Returns a Rejection due to aborted transition */
    def aborted(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def aborted(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to aborted transition */
    def errored(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def errored(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to ignored transition */
    def ignored(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def ignored(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to invalid transition */
    def invalid(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def invalid(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    def isRejectionPromise(obj: js.Any): Boolean = js.native
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    def normalize(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def normalize(detail: Error): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def normalize(detail: typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to redirected transition */
    def redirected(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def redirected(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to transition superseded */
    def superseded(): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any, options: js.Any): typingsJapgolly.uirouterCore.rejectFactoryMod.Rejection = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    /** @hidden */
    var diToken: TypeofTransition = js.native
  }
  
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("HANDLE_RESULT")
    var HANDLE_RESULT_Original: GetResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("LOG_ERROR")
    var LOG_ERROR_Original: GetErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: GetResultHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: GetErrorHandler = js.native
    @JSName("THROW_ERROR")
    var THROW_ERROR_Original: GetErrorHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def LOG_ERROR(hook: typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    def LOG_REJECTED_RESULT(hook: typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = js.native
    def REJECT_ERROR(hook: typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = js.native
    def THROW_ERROR(hook: typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * Chains together an array of TransitionHooks.
      *
      * Given a list of [[TransitionHook]] objects, chains them together.
      * Each hook is invoked after the previous one completes.
      *
      * #### Example:
      * ```js
      * var hooks: TransitionHook[] = getHooks();
      * let promise: Promise<any> = TransitionHook.chain(hooks);
      *
      * promise.then(handleSuccess, handleError);
      * ```
      *
      * @param hooks the list of hooks to chain together
      * @param waitFor if provided, the chain is `.then()`'ed off this promise
      * @returns a `Promise` for sequentially invoking the hooks (in order)
      */
    def chain(hooks: js.Array[typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook]): js.Promise[_] = js.native
    def chain(
      hooks: js.Array[typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook],
      waitFor: js.Promise[_]
    ): js.Promise[_] = js.native
    /**
      * Invokes all the provided TransitionHooks, in order.
      * Each hook's return value is checked.
      * If any hook returns a promise, then the rest of the hooks are chained off that promise, and the promise is returned.
      * If no hook returns a promise, then all hooks are processed synchronously.
      *
      * @param hooks the list of TransitionHooks to invoke
      * @param doneCallback a callback that is invoked after all the hooks have successfully completed
      *
      * @returns a promise for the async result, or the result of the callback
      */
    def invokeHooks[T](
      hooks: js.Array[typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook]): Unit = js.native
  }
  
  @js.native
  object TransitionHookPhase extends js.Object {
    /* 1 */ val BEFORE: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
    /* 0 */ val CREATE: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
    /* 4 */ val ERROR: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
    /* 2 */ val RUN: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
    /* 3 */ val SUCCESS: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase with Double
      ] = js.native
  }
  
  @js.native
  object TransitionHookScope extends js.Object {
    /* 1 */ val STATE: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
    /* 0 */ val TRANSITION: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookScope with Double
      ] = js.native
  }
  
}

