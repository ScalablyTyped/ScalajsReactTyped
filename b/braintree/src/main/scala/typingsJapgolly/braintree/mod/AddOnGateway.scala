package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gateways
  */
trait AddOnGateway extends StObject {
  
  def all(): js.Promise[js.Array[AddOn]]
}
object AddOnGateway {
  
  inline def apply(all: CallbackTo[js.Promise[js.Array[AddOn]]]): AddOnGateway = {
    val __obj = js.Dynamic.literal(all = all.toJsFn)
    __obj.asInstanceOf[AddOnGateway]
  }
  
  extension [Self <: AddOnGateway](x: Self) {
    
    inline def setAll(value: CallbackTo[js.Promise[js.Array[AddOn]]]): Self = StObject.set(x, "all", value.toJsFn)
  }
}
