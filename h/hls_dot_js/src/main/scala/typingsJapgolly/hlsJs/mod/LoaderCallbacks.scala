package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.hlsJs.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderCallbacks[T /* <: LoaderContext */] extends StObject {
  
  var onAbort: js.UndefOr[LoaderOnAbort[T]] = js.undefined
  
  def onError(error: Code, context: T, networkDetails: Any): Unit
  @JSName("onError")
  var onError_Original: LoaderOnError[T]
  
  var onProgress: js.UndefOr[LoaderOnProgress[T]] = js.undefined
  
  def onSuccess(response: LoaderResponse, stats: LoaderStats, context: T, networkDetails: Any): Unit
  @JSName("onSuccess")
  var onSuccess_Original: LoaderOnSuccess[T]
  
  def onTimeout(stats: LoaderStats, context: T, networkDetails: Any): Unit
  @JSName("onTimeout")
  var onTimeout_Original: LoaderOnTimeout[T]
}
object LoaderCallbacks {
  
  inline def apply[T /* <: LoaderContext */](
    onError: (/* error */ Code, T, /* networkDetails */ Any) => Callback,
    onSuccess: (/* response */ LoaderResponse, /* stats */ LoaderStats, T, /* networkDetails */ Any) => Callback,
    onTimeout: (/* stats */ LoaderStats, T, /* networkDetails */ Any) => Callback
  ): LoaderCallbacks[T] = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction3((t0: /* error */ Code, t1: T, t2: /* networkDetails */ Any) => (onError(t0, t1, t2)).runNow()), onSuccess = js.Any.fromFunction4((t0: /* response */ LoaderResponse, t1: /* stats */ LoaderStats, t2: T, t3: /* networkDetails */ Any) => (onSuccess(t0, t1, t2, t3)).runNow()), onTimeout = js.Any.fromFunction3((t0: /* stats */ LoaderStats, t1: T, t2: /* networkDetails */ Any) => (onTimeout(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[LoaderCallbacks[T]]
  }
  
  extension [Self <: LoaderCallbacks[?], T /* <: LoaderContext */](x: Self & LoaderCallbacks[T]) {
    
    inline def setOnAbort(value: (/* stats */ LoaderStats, T, /* networkDetails */ Any) => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction3((t0: /* stats */ LoaderStats, t1: T, t2: /* networkDetails */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnError(value: (/* error */ Code, T, /* networkDetails */ Any) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction3((t0: /* error */ Code, t1: T, t2: /* networkDetails */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnProgress(
      value: (/* stats */ LoaderStats, T, /* data */ String | js.typedarray.ArrayBuffer, /* networkDetails */ Any) => Callback
    ): Self = StObject.set(x, "onProgress", js.Any.fromFunction4((t0: /* stats */ LoaderStats, t1: T, t2: /* data */ String | js.typedarray.ArrayBuffer, t3: /* networkDetails */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnSuccess(
      value: (/* response */ LoaderResponse, /* stats */ LoaderStats, T, /* networkDetails */ Any) => Callback
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction4((t0: /* response */ LoaderResponse, t1: /* stats */ LoaderStats, t2: T, t3: /* networkDetails */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnTimeout(value: (/* stats */ LoaderStats, T, /* networkDetails */ Any) => Callback): Self = StObject.set(x, "onTimeout", js.Any.fromFunction3((t0: /* stats */ LoaderStats, t1: T, t2: /* networkDetails */ Any) => (value(t0, t1, t2)).runNow()))
  }
}
