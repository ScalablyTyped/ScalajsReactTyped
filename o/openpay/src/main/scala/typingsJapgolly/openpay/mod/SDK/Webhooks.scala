package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webhooks extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(webhook_id: String, callback: Callback[Any]): Unit
  
  def get(webhook_id: String, callback: Callback[Any]): Unit
  
  def list(callback: Callback[Any]): Unit
  
  def verify(webhook_id: String, verification_code: String, callback: Callback[Any]): Unit
}
object Webhooks {
  
  inline def apply(
    create: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    delete: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    get: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    list: Callback[Any] => japgolly.scalajs.react.Callback,
    verify: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback
  ): Webhooks = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (delete(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (get(t0, t1)).runNow()), list = js.Any.fromFunction1((t0: Callback[Any]) => list(t0).runNow()), verify = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (verify(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Webhooks]
  }
  
  extension [Self <: Webhooks](x: Self) {
    
    inline def setCreate(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setDelete(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setList(value: Callback[Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction1((t0: Callback[Any]) => value(t0).runNow()))
    
    inline def setVerify(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "verify", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
  }
}
