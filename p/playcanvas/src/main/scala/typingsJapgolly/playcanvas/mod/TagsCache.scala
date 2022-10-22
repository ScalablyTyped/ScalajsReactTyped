package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsCache extends StObject {
  
  var _key: Any
  
  def add(tag: Any, item: Any): Unit
  
  def addItem(item: Any): Unit
  
  def find(args: Any): js.Array[Any]
  
  def remove(tag: Any, item: Any): Unit
  
  def removeItem(item: Any): Unit
}
object TagsCache {
  
  inline def apply(
    _key: Any,
    add: (Any, Any) => Callback,
    addItem: Any => Callback,
    find: Any => js.Array[Any],
    remove: (Any, Any) => Callback,
    removeItem: Any => Callback
  ): TagsCache = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any], add = js.Any.fromFunction2((t0: Any, t1: Any) => (add(t0, t1)).runNow()), addItem = js.Any.fromFunction1((t0: Any) => addItem(t0).runNow()), find = js.Any.fromFunction1(find), remove = js.Any.fromFunction2((t0: Any, t1: Any) => (remove(t0, t1)).runNow()), removeItem = js.Any.fromFunction1((t0: Any) => removeItem(t0).runNow()))
    __obj.asInstanceOf[TagsCache]
  }
  
  extension [Self <: TagsCache](x: Self) {
    
    inline def setAdd(value: (Any, Any) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setAddItem(value: Any => Callback): Self = StObject.set(x, "addItem", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setFind(value: Any => js.Array[Any]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setRemove(value: (Any, Any) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemoveItem(value: Any => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def set_key(value: Any): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
  }
}
