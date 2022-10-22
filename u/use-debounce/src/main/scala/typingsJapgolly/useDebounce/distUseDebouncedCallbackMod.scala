package typingsJapgolly.useDebounce

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseDebouncedCallbackMod {
  
  @JSImport("use-debounce/dist/useDebouncedCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T): DebouncedState[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[DebouncedState[T]]
  inline def default[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T, wait: Double): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def default[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T, wait: Double, options: Options): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def default[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T, wait: Unit, options: Options): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  
  trait CallOptions extends StObject {
    
    /**
      * Controls if the function should be invoked on the leading edge of the timeout.
      */
    var leading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if the function should be invoked on the trailing edge of the timeout.
      */
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object CallOptions {
    
    inline def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    extension [Self <: CallOptions](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  trait ControlFunctions extends StObject {
    
    /**
      * Cancel pending function invocations
      */
    def cancel(): Unit
    
    /**
      * Immediately invoke pending function invocations
      */
    def flush(): Unit
    
    /**
      * Returns `true` if there are any pending function invocations
      */
    def isPending(): Boolean
  }
  object ControlFunctions {
    
    inline def apply(cancel: Callback, flush: Callback, isPending: CallbackTo[Boolean]): ControlFunctions = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, flush = flush.toJsFn, isPending = isPending.toJsFn)
      __obj.asInstanceOf[ControlFunctions]
    }
    
    extension [Self <: ControlFunctions](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setIsPending(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPending", value.toJsFn)
    }
  }
  
  @js.native
  trait DebouncedState[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */]
    extends StObject
       with ControlFunctions {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): js.UndefOr[ReturnType[T]] = js.native
  }
  
  trait Options
    extends StObject
       with CallOptions {
    
    /**
      * The maximum time the given function is allowed to be delayed before it's invoked.
      */
    var maxWait: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
    }
  }
}
