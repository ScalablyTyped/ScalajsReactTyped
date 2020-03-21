package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersCollection extends js.Object {
  // Retrieves a customer.
  def get(customerKey: String): Customer
  // Updates a customer. This method supports patch semantics.
  def patch(resource: Customer, customerKey: String): Customer
  // Updates a customer.
  def update(resource: Customer, customerKey: String): Customer
}

object CustomersCollection {
  @scala.inline
  def apply(
    get: String => CallbackTo[Customer],
    patch: (Customer, String) => CallbackTo[Customer],
    update: (Customer, String) => CallbackTo[Customer]
  ): CustomersCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer, t1: java.lang.String) => patch(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer, t1: java.lang.String) => update(t0, t1).runNow()))
    __obj.asInstanceOf[CustomersCollection]
  }
}

