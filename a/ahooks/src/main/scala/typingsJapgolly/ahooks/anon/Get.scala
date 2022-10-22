package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get[K, T] extends StObject {
  
  def get(key: K): js.UndefOr[T]
  
  def remove(key: K): Unit
  
  def reset(): Unit
  
  def set(key: K, entry: T): Unit
  
  def setAll(newMap: js.Iterable[js.Tuple2[K, T]]): Unit
}
object Get {
  
  inline def apply[K, T](
    get: K => js.UndefOr[T],
    remove: K => Callback,
    reset: Callback,
    set: (K, T) => Callback,
    setAll: js.Iterable[js.Tuple2[K, T]] => Callback
  ): Get[K, T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1((t0: K) => remove(t0).runNow()), reset = reset.toJsFn, set = js.Any.fromFunction2((t0: K, t1: T) => (set(t0, t1)).runNow()), setAll = js.Any.fromFunction1((t0: js.Iterable[js.Tuple2[K, T]]) => setAll(t0).runNow()))
    __obj.asInstanceOf[Get[K, T]]
  }
  
  extension [Self <: Get[?, ?], K, T](x: Self & (Get[K, T])) {
    
    inline def setGet(value: K => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemove(value: K => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSet(value: (K, T) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: K, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setSetAll(value: js.Iterable[js.Tuple2[K, T]] => Callback): Self = StObject.set(x, "setAll", js.Any.fromFunction1((t0: js.Iterable[js.Tuple2[K, T]]) => value(t0).runNow()))
  }
}
