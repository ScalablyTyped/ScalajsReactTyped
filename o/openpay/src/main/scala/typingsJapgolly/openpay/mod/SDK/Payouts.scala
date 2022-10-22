package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payouts extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def get(transactionId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
}
object Payouts {
  
  inline def apply(
    create: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    get: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    list: (Any, Callback[Any]) => japgolly.scalajs.react.Callback
  ): Payouts = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (create(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (get(t0, t1)).runNow()), list = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (list(t0, t1)).runNow()))
    __obj.asInstanceOf[Payouts]
  }
  
  extension [Self <: Payouts](x: Self) {
    
    inline def setCreate(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setList(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
  }
}
