package typingsJapgolly.reactReconciler.mod

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactReconciler.anon.Disconnect
import typingsJapgolly.reactReconciler.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reconciler[Container, Instance, TextInstance, SuspenseInstance, PublicInstance] extends StObject {
  
  def attemptContinuousHydration(fiber: Fiber): Unit = js.native
  
  def attemptDiscreteHydration(fiber: Fiber): Unit = js.native
  
  def attemptHydrationAtCurrentPriority(fiber: Fiber): Unit = js.native
  
  def attemptSynchronousHydration(fiber: Fiber): Unit = js.native
  
  def batchedUpdates[A, R](fn: js.Function1[/* a */ A, R], a: A): R = js.native
  
  def createComponentSelector(component: ReactAbstractComponent[scala.Nothing, Any]): ComponentSelector = js.native
  
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createContainer(
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  
  def createHasPseudoClassSelector(selectors: js.Array[Selector]): HasPseudoClassSelector = js.native
  
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: js.Function0[Unit],
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Null,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: Null,
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Boolean,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit]
  ): OpaqueRoot = js.native
  def createHydrationContainer(
    initialChildren: Node,
    callback: Unit,
    containerInfo: Container,
    tag: RootTag,
    hydrationCallbacks: SuspenseHydrationCallbacks[SuspenseInstance],
    isStrictMode: Boolean,
    concurrentUpdatesByDefaultOverride: Null,
    identifierPrefix: String,
    onRecoverableError: js.Function1[/* error */ js.Error, Unit],
    transitionCallbacks: TransitionTracingCallbacks
  ): OpaqueRoot = js.native
  
  def createPortal(
    children: Node,
    containerInfo: Any,
    // TODO: figure out the API for cross-renderer implementation.
  implementation: Any
  ): ReactPortal = js.native
  def createPortal(
    children: Node,
    containerInfo: Any,
    // TODO: figure out the API for cross-renderer implementation.
  implementation: Any,
    key: String
  ): ReactPortal = js.native
  
  def createRoleSelector(role: String): RoleSelector = js.native
  
  def createTestNameSelector(id: String): TestNameSelector = js.native
  
  def createTextSelector(text: String): TextSelector = js.native
  
  def deferredUpdates[A](fn: js.Function0[A]): A = js.native
  
  def discreteUpdates[A, B, C, D, R](
    fn: js.Function4[/* arg0 */ A, /* arg1 */ B, /* arg2 */ C, /* arg3 */ D, R],
    a: A,
    b: B,
    c: C,
    d: D
  ): R = js.native
  
  def findAllNodes(hostRoot: Instance, selectors: js.Array[Selector]): js.Array[Instance] = js.native
  
  def findBoundingRects(hostRoot: Instance, selectors: js.Array[Selector]): js.Array[BoundingRect] = js.native
  
  def findHostInstance(component: Any): PublicInstance | Null = js.native
  
  def findHostInstanceWithNoPortals(fiber: Fiber): PublicInstance | Null = js.native
  
  def findHostInstanceWithWarning(component: Any, methodName: String): PublicInstance | Null = js.native
  
  def flushControlled(fn: js.Function0[Any]): Unit = js.native
  
  def flushPassiveEffects(): Boolean = js.native
  
  def flushSync(): Unit = js.native
  def flushSync[R](fn: js.Function0[R]): R = js.native
  
  def focusWithin(hostRoot: Instance, selectors: js.Array[Selector]): Boolean = js.native
  
  def getCurrentUpdatePriority(): LanePriority = js.native
  
  def getFindAllNodesFailureDescription(hostRoot: Instance, selectors: js.Array[Selector]): String | Null = js.native
  
  def getPublicRootInstance(container: OpaqueRoot): (Component[Any & js.Object, js.Object]) | PublicInstance | Null = js.native
  
  def injectIntoDevTools(devToolsConfig: DevToolsConfig[Instance, TextInstance, Any]): Boolean = js.native
  
  def isAlreadyRendering(): Boolean = js.native
  
  def observeVisibleRects(
    hostRoot: Instance,
    selectors: js.Array[Selector],
    callback: js.Function1[/* intersections */ js.Array[Ratio], Unit]
  ): Disconnect = js.native
  def observeVisibleRects(
    hostRoot: Instance,
    selectors: js.Array[Selector],
    callback: js.Function1[/* intersections */ js.Array[Ratio], Unit],
    options: IntersectionObserverOptions
  ): Disconnect = js.native
  
  def registerMutableSourceForHydration(root: FiberRoot, mutableSource: MutableSource): Unit = js.native
  
  def runWithPriority[T](priority: LanePriority, fn: js.Function0[T]): T = js.native
  
  def shouldError(fiber: Fiber): js.UndefOr[Boolean] = js.native
  
  def shouldSuspend(fiber: Fiber): Boolean = js.native
  
  def updateContainer(element: Node, container: OpaqueRoot): Lane = js.native
  def updateContainer(element: Node, container: OpaqueRoot, parentComponent: Component[Any & js.Object, js.Object]): Lane = js.native
  def updateContainer(
    element: Node,
    container: OpaqueRoot,
    parentComponent: Component[Any & js.Object, js.Object],
    callback: js.Function0[Unit]
  ): Lane = js.native
  def updateContainer(element: Node, container: OpaqueRoot, parentComponent: Null, callback: js.Function0[Unit]): Lane = js.native
  def updateContainer(element: Node, container: OpaqueRoot, parentComponent: Unit, callback: js.Function0[Unit]): Lane = js.native
}
