package typingsJapgolly.jestWorker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinHeap[TItem /* <: HeapItem */] extends StObject {
  
  /* private */ val _heap: Any
  
  def add(item: TItem): Unit
  
  def peek(): TItem | Null
  
  def poll(): TItem | Null
}
object MinHeap {
  
  inline def apply[TItem /* <: HeapItem */](_heap: Any, add: TItem => Callback, peek: CallbackTo[TItem | Null], poll: CallbackTo[TItem | Null]): MinHeap[TItem] = {
    val __obj = js.Dynamic.literal(_heap = _heap.asInstanceOf[js.Any], add = js.Any.fromFunction1((t0: TItem) => add(t0).runNow()), peek = peek.toJsFn, poll = poll.toJsFn)
    __obj.asInstanceOf[MinHeap[TItem]]
  }
  
  extension [Self <: MinHeap[?], TItem /* <: HeapItem */](x: Self & MinHeap[TItem]) {
    
    inline def setAdd(value: TItem => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: TItem) => value(t0).runNow()))
    
    inline def setPeek(value: CallbackTo[TItem | Null]): Self = StObject.set(x, "peek", value.toJsFn)
    
    inline def setPoll(value: CallbackTo[TItem | Null]): Self = StObject.set(x, "poll", value.toJsFn)
    
    inline def set_heap(value: Any): Self = StObject.set(x, "_heap", value.asInstanceOf[js.Any])
  }
}
