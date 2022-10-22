package typingsJapgolly.swr.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.swr.distTypesMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<swr.swr/dist/types.Cache<any>> */
trait ReadonlyCacheany extends StObject {
  
  val delete: js.Function1[/* key */ Key, Unit]
  
  val get: js.Function1[/* key */ Key, js.UndefOr[Any | Null]]
  
  val set: js.Function2[/* key */ Key, /* value */ Any, Unit]
}
object ReadonlyCacheany {
  
  inline def apply(
    delete: /* key */ Key => Callback,
    get: /* key */ Key => js.UndefOr[Any | Null],
    set: (/* key */ Key, /* value */ Any) => Callback
  ): ReadonlyCacheany = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1((t0: /* key */ Key) => delete(t0).runNow()), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2((t0: /* key */ Key, t1: /* value */ Any) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[ReadonlyCacheany]
  }
  
  extension [Self <: ReadonlyCacheany](x: Self) {
    
    inline def setDelete(value: /* key */ Key => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: /* key */ Key) => value(t0).runNow()))
    
    inline def setGet(value: /* key */ Key => js.UndefOr[Any | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (/* key */ Key, /* value */ Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: /* key */ Key, t1: /* value */ Any) => (value(t0, t1)).runNow()))
  }
}
