package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Set interface, only read methods included. */
trait ReadonlySet[T]
  extends StObject
     with ReadonlyCollection[T] {
  
  def entries(): Iterator[js.Tuple2[T, T]]
  
  def forEach(action: js.Function2[/* value */ T, /* key */ T, Unit]): Unit
  
  def values(): Iterator[T]
}
object ReadonlySet {
  
  inline def apply[T](
    entries: CallbackTo[Iterator[js.Tuple2[T, T]]],
    forEach: js.Function2[/* value */ T, /* key */ T, Unit] => Callback,
    has: T => Boolean,
    keys: CallbackTo[Iterator[T]],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): ReadonlySet[T] = {
    val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function2[/* value */ T, /* key */ T, Unit]) => forEach(t0).runNow()), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[ReadonlySet[T]]
  }
  
  extension [Self <: ReadonlySet[?], T](x: Self & ReadonlySet[T]) {
    
    inline def setEntries(value: CallbackTo[Iterator[js.Tuple2[T, T]]]): Self = StObject.set(x, "entries", value.toJsFn)
    
    inline def setForEach(value: js.Function2[/* value */ T, /* key */ T, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* value */ T, /* key */ T, Unit]) => value(t0).runNow()))
    
    inline def setValues(value: CallbackTo[Iterator[T]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
