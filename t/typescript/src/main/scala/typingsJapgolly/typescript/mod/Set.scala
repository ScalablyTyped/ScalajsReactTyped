package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Set interface. */
trait Set[T]
  extends StObject
     with ReadonlySet[T]
     with Collection[T] {
  
  def add(value: T): this.type
}
object Set {
  
  inline def apply[T](
    add: T => Set[T],
    clear: Callback,
    delete: T => Boolean,
    entries: CallbackTo[Iterator[js.Tuple2[T, T]]],
    forEach: js.Function2[T, T, Unit] => Callback,
    has: T => Boolean,
    keys: CallbackTo[Iterator[T]],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): Set[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = clear.toJsFn, delete = js.Any.fromFunction1(delete), entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function2[T, T, Unit]) => forEach(t0).runNow()), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[Set[T]]
  }
  
  extension [Self <: Set[?], T](x: Self & Set[T]) {
    
    inline def setAdd(value: T => Set[T]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
  }
}
