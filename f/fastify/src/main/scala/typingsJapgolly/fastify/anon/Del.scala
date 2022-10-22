package typingsJapgolly.fastify.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Del extends StObject {
  
  def del(version: String): Unit
  
  def empty(): Unit
  
  def get(version: String): String | Null
  
  def set(version: String, store: js.Function): Unit
}
object Del {
  
  inline def apply(
    del: String => Callback,
    empty: Callback,
    get: String => String | Null,
    set: (String, js.Function) => Callback
  ): Del = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1((t0: String) => del(t0).runNow()), empty = empty.toJsFn, get = js.Any.fromFunction1(get), set = js.Any.fromFunction2((t0: String, t1: js.Function) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[Del]
  }
  
  extension [Self <: Del](x: Self) {
    
    inline def setDel(value: String => Callback): Self = StObject.set(x, "del", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEmpty(value: Callback): Self = StObject.set(x, "empty", value.toJsFn)
    
    inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, js.Function) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
  }
}
