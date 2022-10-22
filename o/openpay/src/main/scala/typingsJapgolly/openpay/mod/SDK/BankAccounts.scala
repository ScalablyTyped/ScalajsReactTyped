package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAccounts extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(bankId: String, callback: Callback[Any]): Unit
  
  def get(bankId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
}
object BankAccounts {
  
  inline def apply(
    create: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    delete: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    get: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    list: (Any, Callback[Any]) => japgolly.scalajs.react.Callback
  ): BankAccounts = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (delete(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (get(t0, t1)).runNow()), list = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (list(t0, t1)).runNow()))
    __obj.asInstanceOf[BankAccounts]
  }
  
  extension [Self <: BankAccounts](x: Self) {
    
    inline def setCreate(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setDelete(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setList(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
  }
}
