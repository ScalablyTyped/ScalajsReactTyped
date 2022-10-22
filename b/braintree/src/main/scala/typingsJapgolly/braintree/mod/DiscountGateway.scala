package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountGateway extends StObject {
  
  def all(): js.Promise[js.Array[Discount]]
}
object DiscountGateway {
  
  inline def apply(all: CallbackTo[js.Promise[js.Array[Discount]]]): DiscountGateway = {
    val __obj = js.Dynamic.literal(all = all.toJsFn)
    __obj.asInstanceOf[DiscountGateway]
  }
  
  extension [Self <: DiscountGateway](x: Self) {
    
    inline def setAll(value: CallbackTo[js.Promise[js.Array[Discount]]]): Self = StObject.set(x, "all", value.toJsFn)
  }
}
