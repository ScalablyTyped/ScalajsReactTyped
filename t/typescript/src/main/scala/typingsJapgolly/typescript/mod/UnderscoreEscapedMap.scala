package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderscoreEscapedMap[T]
  extends StObject
     with ESMap[String, T]
object UnderscoreEscapedMap {
  
  inline def apply[T](
    clear: Callback,
    delete: String => Boolean,
    entries: CallbackTo[Iterator[js.Tuple2[String, T]]],
    forEach: js.Function2[T, String, Unit] => Callback,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: CallbackTo[Iterator[String]],
    set: (String, T) => UnderscoreEscapedMap[T],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): UnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, delete = js.Any.fromFunction1(delete), entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function2[T, String, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[UnderscoreEscapedMap[T]]
  }
}
