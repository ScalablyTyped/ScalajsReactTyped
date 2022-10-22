package typingsJapgolly.threeTdsLoader.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCache extends StObject {
  
  def add(key: String, file: Any): Unit
  
  def clear(): Unit
  
  /**
    * @default false
    */
  var enabled: Boolean
  
  /**
    * @default {}
    */
  var files: Any
  
  def get(key: String): Any
  
  def remove(key: String): Unit
}
object TypeofCache {
  
  inline def apply(
    add: (String, Any) => Callback,
    clear: Callback,
    enabled: Boolean,
    files: Any,
    get: String => Any,
    remove: String => Callback
  ): TypeofCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: Any) => (add(t0, t1)).runNow()), clear = clear.toJsFn, enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
    __obj.asInstanceOf[TypeofCache]
  }
  
  extension [Self <: TypeofCache](x: Self) {
    
    inline def setAdd(value: (String, Any) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
