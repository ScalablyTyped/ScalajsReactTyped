package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loader[T /* <: LoaderContext */] extends StObject {
  
  def abort(): Unit
  
  var context: T
  
  def destroy(): Unit
  
  /**
    * `getCacheAge()` is called by hls.js to get the duration that a given object
    * has been sitting in a cache proxy when playing live.  If implemented,
    * this should return a value in seconds.
    *
    * For HTTP based loaders, this should return the contents of the "age" header.
    *
    * @returns time object being lodaded
    */
  var getCacheAge: js.UndefOr[js.Function0[Double | Null]] = js.undefined
  
  def load(context: LoaderContext, config: LoaderConfiguration, callbacks: LoaderCallbacks[T]): Unit
  
  var stats: LoaderStats
}
object Loader {
  
  inline def apply[T /* <: LoaderContext */](
    abort: Callback,
    context: T,
    destroy: Callback,
    load: (LoaderContext, LoaderConfiguration, LoaderCallbacks[T]) => Callback,
    stats: LoaderStats
  ): Loader[T] = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, context = context.asInstanceOf[js.Any], destroy = destroy.toJsFn, load = js.Any.fromFunction3((t0: LoaderContext, t1: LoaderConfiguration, t2: LoaderCallbacks[T]) => (load(t0, t1, t2)).runNow()), stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader[T]]
  }
  
  extension [Self <: Loader[?], T /* <: LoaderContext */](x: Self & Loader[T]) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetCacheAge(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getCacheAge", value.toJsFn)
    
    inline def setGetCacheAgeUndefined: Self = StObject.set(x, "getCacheAge", js.undefined)
    
    inline def setLoad(value: (LoaderContext, LoaderConfiguration, LoaderCallbacks[T]) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction3((t0: LoaderContext, t1: LoaderConfiguration, t2: LoaderCallbacks[T]) => (value(t0, t1, t2)).runNow()))
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
