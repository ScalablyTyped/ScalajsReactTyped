package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plans extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(planId: String, callback: Callback[Any]): Unit
  
  def get(planId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
  
  def listSubscriptions(planId: String, data: Any, callback: Callback[Any]): Unit
  
  def update(planId: String, data: Any, callback: Callback[Any]): Unit
}
object Plans {
  
  inline def apply(
    create: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    delete: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    get: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    list: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    listSubscriptions: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    update: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
  ): Plans = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (delete(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (get(t0, t1)).runNow()), list = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (list(t0, t1)).runNow()), listSubscriptions = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (listSubscriptions(t0, t1, t2)).runNow()), update = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Plans]
  }
  
  extension [Self <: Plans](x: Self) {
    
    inline def setCreate(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setDelete(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setList(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setListSubscriptions(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "listSubscriptions", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
  }
}
