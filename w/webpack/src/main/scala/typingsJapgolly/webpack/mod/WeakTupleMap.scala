package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeakTupleMap[T /* <: js.Array[Any] */, V] extends StObject {
  
  def clear(): Unit
  
  def delete(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Unit
  
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): V
  
  def has(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Boolean
  
  def provide(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [T, ...Array<(): V>] is not an array type */ args: Array[T | js.Function0[V]]
  ): V
  
  def set(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [T, ...Array<V>] is not an array type */ args: Array[T | V]
  ): Unit
}
object WeakTupleMap {
  
  inline def apply[T /* <: js.Array[Any] */, V](
    clear: Callback,
    delete: T => Callback,
    get: T => V,
    has: T => Boolean,
    provide: Array[T | js.Function0[V]] => V,
    set: Array[T | V] => Callback
  ): WeakTupleMap[T, V] = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, delete = js.Any.fromFunction1((t0: T) => delete(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), provide = js.Any.fromFunction1(provide), set = js.Any.fromFunction1((t0: Array[T | V]) => set(t0).runNow()))
    __obj.asInstanceOf[WeakTupleMap[T, V]]
  }
  
  extension [Self <: WeakTupleMap[?, ?], T /* <: js.Array[Any] */, V](x: Self & (WeakTupleMap[T, V])) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDelete(value: T => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setGet(value: T => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setProvide(value: Array[T | js.Function0[V]] => V): Self = StObject.set(x, "provide", js.Any.fromFunction1(value))
    
    inline def setSet(value: Array[T | V] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Array[T | V]) => value(t0).runNow()))
  }
}
