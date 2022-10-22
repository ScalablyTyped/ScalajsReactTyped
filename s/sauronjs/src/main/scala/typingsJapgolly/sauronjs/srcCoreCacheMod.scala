package typingsJapgolly.sauronjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreCacheMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(id: String): Cache = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  @JSImport("sauronjs/src/core/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Cache extends StObject {
    
    def clear(): Unit
    
    def exists(key: String): Boolean
    
    def forEach(fn: js.Function2[/* key */ String, /* value */ Any, Unit]): Unit
    
    def get(key: String): Any
    
    def keys(): js.Array[String]
    
    def set(key: String, value: Any): Unit
    
    def size(): Double
  }
  object Cache {
    
    inline def apply(
      clear: Callback,
      exists: String => Boolean,
      forEach: js.Function2[/* key */ String, /* value */ Any, Unit] => Callback,
      get: String => Any,
      keys: CallbackTo[js.Array[String]],
      set: (String, Any) => Callback,
      size: CallbackTo[Double]
    ): Cache = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, exists = js.Any.fromFunction1(exists), forEach = js.Any.fromFunction1((t0: js.Function2[/* key */ String, /* value */ Any, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), keys = keys.toJsFn, set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()), size = size.toJsFn)
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function2[/* key */ String, /* value */ Any, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* key */ String, /* value */ Any, Unit]) => value(t0).runNow()))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    }
  }
}
