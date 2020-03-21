package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.AnonAllowVaulting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodGateway extends js.Object {
  def create(request: PaymentMethodCreateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
  def delete(token: String): js.Promise[Unit]
  def find(token: String): js.Promise[PaymentMethod]
  def grant(sharedPaymentMethodToken: String, options: AnonAllowVaulting): js.Promise[String]
  def revoke(sharedPaymentMethodToken: String): js.Promise[Unit]
  def update(token: String, updates: PaymentMethodUpdateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
}

object PaymentMethodGateway {
  @scala.inline
  def apply(
    create: PaymentMethodCreateRequest => CallbackTo[js.Promise[ValidatedResponse[PaymentMethod]]],
    delete: String => CallbackTo[js.Promise[Unit]],
    find: String => CallbackTo[js.Promise[PaymentMethod]],
    grant: (String, AnonAllowVaulting) => CallbackTo[js.Promise[String]],
    revoke: String => CallbackTo[js.Promise[Unit]],
    update: (String, PaymentMethodUpdateRequest) => CallbackTo[js.Promise[ValidatedResponse[PaymentMethod]]]
  ): PaymentMethodGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.braintree.mod.PaymentMethodCreateRequest) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.updateDynamic("grant")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.braintree.AnonAllowVaulting) => grant(t0, t1).runNow()))
    __obj.updateDynamic("revoke")(js.Any.fromFunction1((t0: java.lang.String) => revoke(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.braintree.mod.PaymentMethodUpdateRequest) => update(t0, t1).runNow()))
    __obj.asInstanceOf[PaymentMethodGateway]
  }
}

