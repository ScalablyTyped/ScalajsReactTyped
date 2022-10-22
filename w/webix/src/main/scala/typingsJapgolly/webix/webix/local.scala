package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait local extends StObject {
  
  def clear(): Unit
  
  def get(name: String): Any
  
  def put(name: String, value: Any): Unit
  
  def remove(name: String): Unit
}
object local {
  
  inline def apply(clear: Callback, get: String => Any, put: (String, Any) => Callback, remove: String => Callback): local = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = js.Any.fromFunction1(get), put = js.Any.fromFunction2((t0: String, t1: Any) => (put(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
    __obj.asInstanceOf[local]
  }
  
  extension [Self <: local](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setPut(value: (String, Any) => Callback): Self = StObject.set(x, "put", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
