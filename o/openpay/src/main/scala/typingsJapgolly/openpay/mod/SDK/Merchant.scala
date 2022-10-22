package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merchant extends StObject {
  
  def get(callback: Callback[Any]): Unit
}
object Merchant {
  
  inline def apply(get: Callback[Any] => japgolly.scalajs.react.Callback): Merchant = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1((t0: Callback[Any]) => get(t0).runNow()))
    __obj.asInstanceOf[Merchant]
  }
  
  extension [Self <: Merchant](x: Self) {
    
    inline def setGet(value: Callback[Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction1((t0: Callback[Any]) => value(t0).runNow()))
  }
}
