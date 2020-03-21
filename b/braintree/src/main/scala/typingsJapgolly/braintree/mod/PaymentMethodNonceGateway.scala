package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodNonceGateway extends js.Object {
  def create(paymentMethodToken: String): js.Promise[ValidatedResponse[PaymentMethodNonce]]
  def find(paymentMethodNonce: String): js.Promise[PaymentMethodNonce]
}

object PaymentMethodNonceGateway {
  @scala.inline
  def apply(
    create: String => CallbackTo[js.Promise[ValidatedResponse[PaymentMethodNonce]]],
    find: String => CallbackTo[js.Promise[PaymentMethodNonce]]
  ): PaymentMethodNonceGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.asInstanceOf[PaymentMethodNonceGateway]
  }
}

