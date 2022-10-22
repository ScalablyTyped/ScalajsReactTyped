package typingsJapgolly.trimblemapsTrimblemapsJs.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: Addr
  
  var failure: js.UndefOr[js.Function1[/* response */ Any, Unit]] = js.undefined
  
  var listSize: js.UndefOr[Double] = js.undefined
  
  def success(response: Any): Unit
}
object Address {
  
  inline def apply(address: Addr, success: Any => Callback): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: Any) => success(t0).runNow()))
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: Addr): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFailure(value: /* response */ Any => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: /* response */ Any) => value(t0).runNow()))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setListSize(value: Double): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
    
    inline def setListSizeUndefined: Self = StObject.set(x, "listSize", js.undefined)
    
    inline def setSuccess(value: Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
