package typingsJapgolly.mobservable

import typingsJapgolly.mobservable.libInterfacesMod.IContextInfoStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDnodeMod {
  
  @JSImport("mobservable/lib/dnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable/lib/dnode", "DataNode")
  @js.native
  open class DataNode protected () extends StObject {
    def this(context: IContextInfoStruct) = this()
    
    def addObserver(node: ViewNode): Unit = js.native
    
    var context: IContextInfoStruct = js.native
    
    def dispose(): Unit = js.native
    
    var externalRefenceCount: Double = js.native
    
    var id: Double = js.native
    
    /* protected */ var isDisposed: Boolean = js.native
    
    def markReady(stateDidActuallyChange: Boolean): Unit = js.native
    
    def markStale(): Unit = js.native
    
    def notifyObserved(): Unit = js.native
    
    def notifyObservers(): Unit = js.native
    def notifyObservers(stateDidActuallyChange: Boolean): Unit = js.native
    
    var observers: js.Array[ViewNode] = js.native
    
    def removeObserver(node: ViewNode): Unit = js.native
    
    def setRefCount(delta: Double): Unit = js.native
    
    var state: NodeState = js.native
  }
  
  @js.native
  sealed trait NodeState extends StObject
  @JSImport("mobservable/lib/dnode", "NodeState")
  @js.native
  object NodeState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeState & Double] = js.native
    
    @js.native
    sealed trait PENDING
      extends StObject
         with NodeState
    /* 1 */ val PENDING: typingsJapgolly.mobservable.libDnodeMod.NodeState.PENDING & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with NodeState
    /* 2 */ val READY: typingsJapgolly.mobservable.libDnodeMod.NodeState.READY & Double = js.native
    
    @js.native
    sealed trait STALE
      extends StObject
         with NodeState
    /* 0 */ val STALE: typingsJapgolly.mobservable.libDnodeMod.NodeState.STALE & Double = js.native
  }
  
  @JSImport("mobservable/lib/dnode", "ViewNode")
  @js.native
  open class ViewNode protected () extends DataNode {
    def this(context: IContextInfoStruct) = this()
    
    /* private */ def bindDependencies(): Any = js.native
    
    def compute(): Boolean = js.native
    
    def computeNextState(): Unit = js.native
    
    /* private */ var dependencyChangeCount: Any = js.native
    
    /* private */ var dependencyStaleCount: Any = js.native
    
    /* private */ def findCycle(node: Any): Any = js.native
    
    var hasCycle: Boolean = js.native
    
    var isSleeping: Boolean = js.native
    
    def notifyStateChange(observable: DataNode, stateDidActuallyChange: Boolean): Unit = js.native
    
    var observing: js.Array[DataNode] = js.native
    
    /* private */ var onSleepEmitter: Any = js.native
    
    def onceSleep(onSleep: js.Function1[/* lastValue */ Any, Unit]): Unit = js.native
    
    /* private */ var prevObserving: Any = js.native
    
    /* private */ def trackDependencies(): Any = js.native
    
    def tryToSleep(): Unit = js.native
    
    def wakeUp(): Unit = js.native
  }
  
  inline def checkIfStateIsBeingModifiedDuringView(context: IContextInfoStruct): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateIsBeingModifiedDuringView")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isComputingView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingView")().asInstanceOf[Boolean]
  
  inline def isInTransaction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTransaction")().asInstanceOf[Boolean]
  
  inline def runAfterTransaction(action: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runAfterTransaction")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stackDepth(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stackDepth")().asInstanceOf[Any]
  
  inline def transaction[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def transaction[T](action: js.Function0[T], thisArg: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
}
