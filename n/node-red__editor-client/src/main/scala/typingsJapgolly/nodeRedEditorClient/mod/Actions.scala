package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeRedEditorClient.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  def add(name: String, handler: js.Function0[Unit]): Unit
  
  def get(name: String): js.Function0[Unit]
  
  def invoke(name: String, args: Any): Unit
  
  def list(): js.Array[Id]
  
  def remove(name: String): Unit
}
object Actions {
  
  inline def apply(
    add: (String, js.Function0[Unit]) => Callback,
    get: String => js.Function0[Unit],
    invoke: (String, Any) => Callback,
    list: CallbackTo[js.Array[Id]],
    remove: String => Callback
  ): Actions = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (add(t0, t1)).runNow()), get = js.Any.fromFunction1(get), invoke = js.Any.fromFunction2((t0: String, t1: Any) => (invoke(t0, t1)).runNow()), list = list.toJsFn, remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setAdd(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: String => js.Function0[Unit]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setInvoke(value: (String, Any) => Callback): Self = StObject.set(x, "invoke", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setList(value: CallbackTo[js.Array[Id]]): Self = StObject.set(x, "list", value.toJsFn)
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
