package typingsJapgolly.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPqueueMod {
  
  @JSImport("webcola/dist/src/pqueue", "PairingHeap")
  @js.native
  open class PairingHeap[T] protected () extends StObject {
    def this(elem: T) = this()
    
    def contains(h: PairingHeap[T]): Boolean = js.native
    
    def count(): Double = js.native
    
    def decreaseKey(
      subheap: PairingHeap[T],
      newValue: T,
      setHeapNode: js.Function2[/* e */ T, /* h */ PairingHeap[T], Unit],
      lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]
    ): PairingHeap[T] = js.native
    
    var elem: T = js.native
    
    def empty(): Boolean = js.native
    
    def forEach(f: Any): Unit = js.native
    
    def insert(obj: T, lessThan: Any): PairingHeap[T] = js.native
    
    def isHeap(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = js.native
    
    def merge(heap2: PairingHeap[T], lessThan: Any): PairingHeap[T] = js.native
    
    def mergePairs(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]): PairingHeap[T] = js.native
    
    def min(): T = js.native
    
    def removeMin(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]): PairingHeap[T] = js.native
    
    /* private */ var subheaps: Any = js.native
    
    def toString(selector: Any): String = js.native
  }
  
  @JSImport("webcola/dist/src/pqueue", "PriorityQueue")
  @js.native
  open class PriorityQueue[T] protected () extends StObject {
    def this(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]) = this()
    
    def count(): Double = js.native
    
    def empty(): Boolean = js.native
    
    def forEach(f: Any): Unit = js.native
    
    def isHeap(): Boolean = js.native
    
    /* private */ var lessThan: Any = js.native
    
    def pop(): T = js.native
    
    def push(args: T*): PairingHeap[T] = js.native
    
    def reduceKey(heapNode: PairingHeap[T], newKey: T): Unit = js.native
    def reduceKey(
      heapNode: PairingHeap[T],
      newKey: T,
      setHeapNode: js.Function2[/* e */ T, /* h */ PairingHeap[T], Unit]
    ): Unit = js.native
    
    /* private */ var root: Any = js.native
    
    def toString(selector: Any): String = js.native
    
    def top(): T = js.native
  }
}
