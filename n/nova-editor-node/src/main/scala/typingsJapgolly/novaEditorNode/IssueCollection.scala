package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/issue-collection/
trait IssueCollection extends StObject {
  
  def append(uri: String, issues: js.Array[Issue]): Unit
  
  def clear(): Unit
  
  def dispose(): Unit
  
  def get(uri: String): js.Array[Issue]
  
  def has(uri: String): Boolean
  
  var name: String
  
  def remove(uri: String): Unit
  
  def set(uri: String, issues: js.Array[Issue]): Unit
}
object IssueCollection {
  
  inline def apply(
    append: (String, js.Array[Issue]) => Callback,
    clear: Callback,
    dispose: Callback,
    get: String => js.Array[Issue],
    has: String => Boolean,
    name: String,
    remove: String => Callback,
    set: (String, js.Array[Issue]) => Callback
  ): IssueCollection = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2((t0: String, t1: js.Array[Issue]) => (append(t0, t1)).runNow()), clear = clear.toJsFn, dispose = dispose.toJsFn, get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), set = js.Any.fromFunction2((t0: String, t1: js.Array[Issue]) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[IssueCollection]
  }
  
  extension [Self <: IssueCollection](x: Self) {
    
    inline def setAppend(value: (String, js.Array[Issue]) => Callback): Self = StObject.set(x, "append", js.Any.fromFunction2((t0: String, t1: js.Array[Issue]) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGet(value: String => js.Array[Issue]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet(value: (String, js.Array[Issue]) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: js.Array[Issue]) => (value(t0, t1)).runNow()))
  }
}
