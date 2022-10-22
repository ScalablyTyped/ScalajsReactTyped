package typingsJapgolly.store

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreJsStorage extends StObject {
  
  def clearAll(): Unit
  
  def each(callback: js.Function2[/* val */ String, /* key */ String, Any]): Unit
  
  var name: String
  
  def read(key: String): String | Null
  
  def remove(key: String): Unit
  
  def write(key: String, data: String): Unit
}
object StoreJsStorage {
  
  inline def apply(
    clearAll: Callback,
    each: js.Function2[/* val */ String, /* key */ String, Any] => Callback,
    name: String,
    read: String => String | Null,
    remove: String => Callback,
    write: (String, String) => Callback
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = clearAll.toJsFn, each = js.Any.fromFunction1((t0: js.Function2[/* val */ String, /* key */ String, Any]) => each(t0).runNow()), name = name.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), write = js.Any.fromFunction2((t0: String, t1: String) => (write(t0, t1)).runNow()))
    __obj.asInstanceOf[StoreJsStorage]
  }
  
  extension [Self <: StoreJsStorage](x: Self) {
    
    inline def setClearAll(value: Callback): Self = StObject.set(x, "clearAll", value.toJsFn)
    
    inline def setEach(value: js.Function2[/* val */ String, /* key */ String, Any] => Callback): Self = StObject.set(x, "each", js.Any.fromFunction1((t0: js.Function2[/* val */ String, /* key */ String, Any]) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRead(value: String => String | Null): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWrite(value: (String, String) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
