package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodNonceGateway extends StObject {
  
  def create(paymentMethodToken: String): js.Promise[ValidatedResponse[PaymentMethodNonce]]
  
  def find(paymentMethodNonce: String): js.Promise[PaymentMethodNonce]
}
object PaymentMethodNonceGateway {
  
  inline def apply(
    create: String => js.Promise[ValidatedResponse[PaymentMethodNonce]],
    find: String => js.Promise[PaymentMethodNonce]
  ): PaymentMethodNonceGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PaymentMethodNonceGateway]
  }
  
  extension [Self <: PaymentMethodNonceGateway](x: Self) {
    
    inline def setCreate(value: String => js.Promise[ValidatedResponse[PaymentMethodNonce]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setFind(value: String => js.Promise[PaymentMethodNonce]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
  }
}
