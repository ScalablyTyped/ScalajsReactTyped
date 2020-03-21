package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardGateway extends js.Object {
  def create(request: CreditCardCreateRequest): js.Promise[ValidatedResponse[CreditCard]]
  def delete(creditCardToken: String): js.Promise[Unit]
  def expiringBetween(startDate: js.Date, endDate: js.Date): js.Promise[CreditCard]
  def find(creditCardToken: String): js.Promise[CreditCard]
  def update(creditCardToken: String, updates: CreditCardUpdateRequest): js.Promise[ValidatedResponse[CreditCard]]
}

object CreditCardGateway {
  @scala.inline
  def apply(
    create: CreditCardCreateRequest => CallbackTo[js.Promise[ValidatedResponse[CreditCard]]],
    delete: String => CallbackTo[js.Promise[Unit]],
    expiringBetween: (js.Date, js.Date) => CallbackTo[js.Promise[CreditCard]],
    find: String => CallbackTo[js.Promise[CreditCard]],
    update: (String, CreditCardUpdateRequest) => CallbackTo[js.Promise[ValidatedResponse[CreditCard]]]
  ): CreditCardGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.braintree.mod.CreditCardCreateRequest) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("expiringBetween")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => expiringBetween(t0, t1).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.braintree.mod.CreditCardUpdateRequest) => update(t0, t1).runNow()))
    __obj.asInstanceOf[CreditCardGateway]
  }
}

