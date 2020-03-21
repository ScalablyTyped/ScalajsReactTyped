package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressGateway extends js.Object {
  def create(request: AddressCreateRequest): js.Promise[ValidatedResponse[Address]]
  def delete(customerId: String, addressId: String): js.Promise[Unit]
  def find(customerId: String, addressId: String): js.Promise[Address]
  def update(customerId: String, addressId: String, updates: AddressUpdateRequest): js.Promise[ValidatedResponse[Address]]
}

object AddressGateway {
  @scala.inline
  def apply(
    create: AddressCreateRequest => CallbackTo[js.Promise[ValidatedResponse[Address]]],
    delete: (String, String) => CallbackTo[js.Promise[Unit]],
    find: (String, String) => CallbackTo[js.Promise[Address]],
    update: (String, String, AddressUpdateRequest) => CallbackTo[js.Promise[ValidatedResponse[Address]]]
  ): AddressGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.braintree.mod.AddressCreateRequest) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => delete(t0, t1).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => find(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.braintree.mod.AddressUpdateRequest) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AddressGateway]
  }
}

