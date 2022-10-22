package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCache extends StObject {
  
  def delete(id: String): Boolean
  
  def get[T](id: String): T
  
  def has(id: String): Boolean
  
  def set[T](id: String, value: T): Unit
}
object PluginCache {
  
  inline def apply(
    delete: String => Boolean,
    get: String => Any,
    has: String => Boolean,
    set: (String, Any) => Callback
  ): PluginCache = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[PluginCache]
  }
  
  extension [Self <: PluginCache](x: Self) {
    
    inline def setDelete(value: String => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
