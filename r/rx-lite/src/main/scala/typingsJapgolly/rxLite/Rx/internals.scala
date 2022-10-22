package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internals {
  
  // Priority Queue for Scheduling
  trait PriorityQueue[TTime] extends StObject {
    
    def dequeue(): ScheduledItem[TTime]
    
    def enqueue(item: ScheduledItem[TTime]): Unit
    
    def heapify(index: Double): Unit
    
    def isHigherPriority(left: Double, right: Double): Boolean
    
    var length: Double
    
    def peek(): ScheduledItem[TTime]
    
    def percolate(index: Double): Unit
    
    def remove(item: ScheduledItem[TTime]): Boolean
    
    def removeAt(index: Double): Unit
  }
  object PriorityQueue {
    
    inline def apply[TTime](
      dequeue: CallbackTo[ScheduledItem[TTime]],
      enqueue: ScheduledItem[TTime] => Callback,
      heapify: Double => Callback,
      isHigherPriority: (Double, Double) => Boolean,
      length: Double,
      peek: CallbackTo[ScheduledItem[TTime]],
      percolate: Double => Callback,
      remove: ScheduledItem[TTime] => Boolean,
      removeAt: Double => Callback
    ): PriorityQueue[TTime] = {
      val __obj = js.Dynamic.literal(dequeue = dequeue.toJsFn, enqueue = js.Any.fromFunction1((t0: ScheduledItem[TTime]) => enqueue(t0).runNow()), heapify = js.Any.fromFunction1((t0: Double) => heapify(t0).runNow()), isHigherPriority = js.Any.fromFunction2(isHigherPriority), length = length.asInstanceOf[js.Any], peek = peek.toJsFn, percolate = js.Any.fromFunction1((t0: Double) => percolate(t0).runNow()), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1((t0: Double) => removeAt(t0).runNow()))
      __obj.asInstanceOf[PriorityQueue[TTime]]
    }
    
    extension [Self <: PriorityQueue[?], TTime](x: Self & PriorityQueue[TTime]) {
      
      inline def setDequeue(value: CallbackTo[ScheduledItem[TTime]]): Self = StObject.set(x, "dequeue", value.toJsFn)
      
      inline def setEnqueue(value: ScheduledItem[TTime] => Callback): Self = StObject.set(x, "enqueue", js.Any.fromFunction1((t0: ScheduledItem[TTime]) => value(t0).runNow()))
      
      inline def setHeapify(value: Double => Callback): Self = StObject.set(x, "heapify", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setIsHigherPriority(value: (Double, Double) => Boolean): Self = StObject.set(x, "isHigherPriority", js.Any.fromFunction2(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: CallbackTo[ScheduledItem[TTime]]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setPercolate(value: Double => Callback): Self = StObject.set(x, "percolate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setRemove(value: ScheduledItem[TTime] => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAt(value: Double => Callback): Self = StObject.set(x, "removeAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait ScheduledItem[TTime] extends StObject {
    
    def action(scheduler: IScheduler, state: Any): IDisposable
    
    def compareTo(other: ScheduledItem[TTime]): Double
    
    def comparer(x: TTime, y: TTime): Double
    
    var disposable: SingleAssignmentDisposable
    
    var dueTime: TTime
    
    def invoke(): Unit
    
    def invokeCore(): IDisposable
    
    def isCancelled(): Boolean
    
    var scheduler: IScheduler
    
    var state: TTime
  }
  object ScheduledItem {
    
    inline def apply[TTime](
      action: (IScheduler, Any) => IDisposable,
      compareTo: ScheduledItem[TTime] => Double,
      comparer: (TTime, TTime) => Double,
      disposable: SingleAssignmentDisposable,
      dueTime: TTime,
      invoke: Callback,
      invokeCore: CallbackTo[IDisposable],
      isCancelled: CallbackTo[Boolean],
      scheduler: IScheduler,
      state: TTime
    ): ScheduledItem[TTime] = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), compareTo = js.Any.fromFunction1(compareTo), comparer = js.Any.fromFunction2(comparer), disposable = disposable.asInstanceOf[js.Any], dueTime = dueTime.asInstanceOf[js.Any], invoke = invoke.toJsFn, invokeCore = invokeCore.toJsFn, isCancelled = isCancelled.toJsFn, scheduler = scheduler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduledItem[TTime]]
    }
    
    extension [Self <: ScheduledItem[?], TTime](x: Self & ScheduledItem[TTime]) {
      
      inline def setAction(value: (IScheduler, Any) => IDisposable): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      inline def setCompareTo(value: ScheduledItem[TTime] => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
      
      inline def setComparer(value: (TTime, TTime) => Double): Self = StObject.set(x, "comparer", js.Any.fromFunction2(value))
      
      inline def setDisposable(value: SingleAssignmentDisposable): Self = StObject.set(x, "disposable", value.asInstanceOf[js.Any])
      
      inline def setDueTime(value: TTime): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
      
      inline def setInvoke(value: Callback): Self = StObject.set(x, "invoke", value.toJsFn)
      
      inline def setInvokeCore(value: CallbackTo[IDisposable]): Self = StObject.set(x, "invokeCore", value.toJsFn)
      
      inline def setIsCancelled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCancelled", value.toJsFn)
      
      inline def setScheduler(value: IScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setState(value: TTime): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
