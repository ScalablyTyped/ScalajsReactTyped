package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Map interface, only read methods included. */
trait ReadonlyESMap[K, V]
  extends StObject
     with ReadonlyCollection[K] {
  
  def entries(): Iterator[js.Tuple2[K, V]]
  
  def forEach(action: js.Function2[/* value */ V, /* key */ K, Unit]): Unit
  
  def get(key: K): js.UndefOr[V]
  
  def values(): Iterator[V]
}
object ReadonlyESMap {
  
  inline def apply[K, V](
    entries: CallbackTo[Iterator[js.Tuple2[K, V]]],
    forEach: js.Function2[/* value */ V, /* key */ K, Unit] => Callback,
    get: K => js.UndefOr[V],
    has: K => Boolean,
    keys: CallbackTo[Iterator[K]],
    size: Double,
    values: CallbackTo[Iterator[V]]
  ): ReadonlyESMap[K, V] = {
    val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function2[/* value */ V, /* key */ K, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[ReadonlyESMap[K, V]]
  }
  
  extension [Self <: ReadonlyESMap[?, ?], K, V](x: Self & (ReadonlyESMap[K, V])) {
    
    inline def setEntries(value: CallbackTo[Iterator[js.Tuple2[K, V]]]): Self = StObject.set(x, "entries", value.toJsFn)
    
    inline def setForEach(value: js.Function2[/* value */ V, /* key */ K, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* value */ V, /* key */ K, Unit]) => value(t0).runNow()))
    
    inline def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setValues(value: CallbackTo[Iterator[V]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
