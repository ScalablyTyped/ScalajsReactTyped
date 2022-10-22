package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricUtilities.anon.Leading
import typingsJapgolly.uifabricUtilities.anon.MaxWait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAsyncMod {
  
  @JSImport("@uifabric/utilities/lib/Async", "Async")
  @js.native
  open class Async () extends StObject {
    def this(parent: js.Object) = this()
    def this(parent: js.Object, onError: js.Function1[/* e */ Any, Unit]) = this()
    def this(parent: Unit, onError: js.Function1[/* e */ Any, Unit]) = this()
    
    /* private */ var _animationFrameIds: Any = js.native
    
    /* private */ var _immediateIds: Any = js.native
    
    /* private */ var _intervalIds: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* protected */ def _logError(e: Any): Unit = js.native
    
    /* private */ var _noop: Any = js.native
    
    /* private */ var _onErrorHandler: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _timeoutIds: Any = js.native
    
    def cancelAnimationFrame(id: Double): Unit = js.native
    def cancelAnimationFrame(id: Double, targetElement: Element): Unit = js.native
    
    /**
      * Clears the immediate.
      * @param id - Id to cancel.
      * @param targetElement - Optional target element to use for identifying the correct window.
      */
    def clearImmediate(id: Double): Unit = js.native
    def clearImmediate(id: Double, targetElement: Element): Unit = js.native
    
    /**
      * Clears the interval.
      * @param id - Id to cancel.
      */
    def clearInterval(id: Double): Unit = js.native
    
    /**
      * Clears the timeout.
      * @param id - Id to cancel.
      */
    def clearTimeout(id: Double): Unit = js.native
    
    /**
      * Creates a function that will delay the execution of func until after wait milliseconds have
      * elapsed since the last time it was invoked. Provide an options object to indicate that func
      * should be invoked on the leading and/or trailing edge of the wait timeout. Subsequent calls
      * to the debounced function will return the result of the last func call.
      *
      * Note: If leading and trailing options are true func will be called on the trailing edge of
      * the timeout only if the debounced function is invoked more than once during the wait
      * timeout.
      *
      * @param func - The function to debounce.
      * @param wait - The number of milliseconds to delay.
      * @param options - The options object.
      * @returns The new debounced function.
      */
    def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): ICancelable[T] & T = js.native
    def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): ICancelable[T] & T = js.native
    def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double, options: MaxWait): ICancelable[T] & T = js.native
    def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Unit, options: MaxWait): ICancelable[T] & T = js.native
    
    /**
      * Dispose function, clears all async operations.
      */
    def dispose(): Unit = js.native
    
    def requestAnimationFrame(callback: js.Function0[Unit]): Double = js.native
    def requestAnimationFrame(callback: js.Function0[Unit], targetElement: Element): Double = js.native
    
    /**
      * SetImmediate override, which will auto cancel the immediate during dispose.
      * @param callback - Callback to execute.
      * @param targetElement - Optional target element to use for identifying the correct window.
      * @returns The setTimeout id.
      */
    def setImmediate(callback: js.Function0[Unit]): Double = js.native
    def setImmediate(callback: js.Function0[Unit], targetElement: Element): Double = js.native
    
    /**
      * SetInterval override, which will auto cancel the timeout during dispose.
      * @param callback - Callback to execute.
      * @param duration - Duration in milliseconds.
      * @returns The setTimeout id.
      */
    def setInterval(callback: js.Function0[Unit], duration: Double): Double = js.native
    
    /**
      * SetTimeout override, which will auto cancel the timeout during dispose.
      * @param callback - Callback to execute.
      * @param duration - Duration in milliseconds.
      * @returns The setTimeout id.
      */
    def setTimeout(callback: js.Function0[Unit], duration: Double): Double = js.native
    
    /**
      * Creates a function that, when executed, will only call the func function at most once per
      * every wait milliseconds. Provide an options object to indicate that func should be invoked
      * on the leading and/or trailing edge of the wait timeout. Subsequent calls to the throttled
      * function will return the result of the last func call.
      *
      * Note: If leading and trailing options are true func will be called on the trailing edge of
      * the timeout only if the throttled function is invoked more than once during the wait timeout.
      *
      * @param func - The function to throttle.
      * @param wait - The number of milliseconds to throttle executions to. Defaults to 0.
      * @param options - The options object.
      * @returns The new throttled function.
      */
    def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T = js.native
    def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T = js.native
    def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double, options: Leading): T = js.native
    def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Unit, options: Leading): T = js.native
  }
  
  trait ICancelable[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    def cancel(): Unit
    
    def flush(): ReturnType[T]
    
    def pending(): Boolean
  }
  object ICancelable {
    
    inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](cancel: Callback, flush: CallbackTo[ReturnType[T]], pending: CallbackTo[Boolean]): ICancelable[T] = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, flush = flush.toJsFn, pending = pending.toJsFn)
      __obj.asInstanceOf[ICancelable[T]]
    }
    
    extension [Self <: ICancelable[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & ICancelable[T]) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setFlush(value: CallbackTo[ReturnType[T]]): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setPending(value: CallbackTo[Boolean]): Self = StObject.set(x, "pending", value.toJsFn)
    }
  }
}
