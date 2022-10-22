package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Map interface. */
trait ESMap[K, V]
  extends StObject
     with ReadonlyESMap[K, V]
     with Collection[K] {
  
  def set(key: K, value: V): this.type
}
object ESMap {
  
  inline def apply[K, V](
    clear: Callback,
    delete: K => Boolean,
    entries: CallbackTo[Iterator[js.Tuple2[K, V]]],
    forEach: js.Function2[V, K, Unit] => Callback,
    get: K => js.UndefOr[V],
    has: K => Boolean,
    keys: CallbackTo[Iterator[K]],
    set: (K, V) => ESMap[K, V],
    size: Double,
    values: CallbackTo[Iterator[V]]
  ): ESMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, delete = js.Any.fromFunction1(delete), entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function2[V, K, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[ESMap[K, V]]
  }
  
  extension [Self <: ESMap[?, ?], K, V](x: Self & (ESMap[K, V])) {
    
    inline def setSet(value: (K, V) => ESMap[K, V]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
