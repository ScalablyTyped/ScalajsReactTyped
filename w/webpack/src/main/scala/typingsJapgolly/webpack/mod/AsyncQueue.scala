package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.anon.Added
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncQueue[T, K, R] extends StObject {
  
  def add(item: T, callback: CallbackAsyncQueue[R]): Unit
  
  def clear(): Unit
  
  def decreaseParallelism(): Unit
  
  var hooks: Added[T, R]
  
  def increaseParallelism(): Unit
  
  def invalidate(item: T): Unit
  
  def isDone(item: T): Boolean
  
  def isProcessing(item: T): Boolean
  
  def isQueued(item: T): Boolean
  
  def stop(): Unit
  
  /**
  	 * Waits for an already started item
  	 */
  def waitFor(item: T, callback: CallbackAsyncQueue[R]): Unit
}
object AsyncQueue {
  
  inline def apply[T, K, R](
    add: (T, CallbackAsyncQueue[R]) => Callback,
    clear: Callback,
    decreaseParallelism: Callback,
    hooks: Added[T, R],
    increaseParallelism: Callback,
    invalidate: T => Callback,
    isDone: T => Boolean,
    isProcessing: T => Boolean,
    isQueued: T => Boolean,
    stop: Callback,
    waitFor: (T, CallbackAsyncQueue[R]) => Callback
  ): AsyncQueue[T, K, R] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: T, t1: CallbackAsyncQueue[R]) => (add(t0, t1)).runNow()), clear = clear.toJsFn, decreaseParallelism = decreaseParallelism.toJsFn, hooks = hooks.asInstanceOf[js.Any], increaseParallelism = increaseParallelism.toJsFn, invalidate = js.Any.fromFunction1((t0: T) => invalidate(t0).runNow()), isDone = js.Any.fromFunction1(isDone), isProcessing = js.Any.fromFunction1(isProcessing), isQueued = js.Any.fromFunction1(isQueued), stop = stop.toJsFn, waitFor = js.Any.fromFunction2((t0: T, t1: CallbackAsyncQueue[R]) => (waitFor(t0, t1)).runNow()))
    __obj.asInstanceOf[AsyncQueue[T, K, R]]
  }
  
  extension [Self <: AsyncQueue[?, ?, ?], T, K, R](x: Self & (AsyncQueue[T, K, R])) {
    
    inline def setAdd(value: (T, CallbackAsyncQueue[R]) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: T, t1: CallbackAsyncQueue[R]) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDecreaseParallelism(value: Callback): Self = StObject.set(x, "decreaseParallelism", value.toJsFn)
    
    inline def setHooks(value: Added[T, R]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setIncreaseParallelism(value: Callback): Self = StObject.set(x, "increaseParallelism", value.toJsFn)
    
    inline def setInvalidate(value: T => Callback): Self = StObject.set(x, "invalidate", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setIsDone(value: T => Boolean): Self = StObject.set(x, "isDone", js.Any.fromFunction1(value))
    
    inline def setIsProcessing(value: T => Boolean): Self = StObject.set(x, "isProcessing", js.Any.fromFunction1(value))
    
    inline def setIsQueued(value: T => Boolean): Self = StObject.set(x, "isQueued", js.Any.fromFunction1(value))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setWaitFor(value: (T, CallbackAsyncQueue[R]) => Callback): Self = StObject.set(x, "waitFor", js.Any.fromFunction2((t0: T, t1: CallbackAsyncQueue[R]) => (value(t0, t1)).runNow()))
  }
}
