package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGateway extends js.Object {
  def create(request: CustomerCreateRequest): js.Promise[ValidatedResponse[Customer]]
  def delete(customerId: String): js.Promise[Unit]
  def find(customerId: String): js.Promise[Customer]
  def search(searchFn: js.Any): Readable
  def update(customerId: String, updates: CustomerUpdateRequest): js.Promise[ValidatedResponse[Customer]]
}

object CustomerGateway {
  @scala.inline
  def apply(
    create: CustomerCreateRequest => CallbackTo[js.Promise[ValidatedResponse[Customer]]],
    delete: String => CallbackTo[js.Promise[Unit]],
    find: String => CallbackTo[js.Promise[Customer]],
    search: js.Any => CallbackTo[Readable],
    update: (String, CustomerUpdateRequest) => CallbackTo[js.Promise[ValidatedResponse[Customer]]]
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.braintree.mod.CustomerCreateRequest) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: js.Any) => search(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.braintree.mod.CustomerUpdateRequest) => update(t0, t1).runNow()))
    __obj.asInstanceOf[CustomerGateway]
  }
}

