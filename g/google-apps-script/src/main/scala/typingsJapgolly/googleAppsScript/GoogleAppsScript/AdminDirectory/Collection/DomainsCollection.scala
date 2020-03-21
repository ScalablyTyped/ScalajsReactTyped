package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainsCollection extends js.Object {
  // Retrieves a domain of the customer.
  def get(customer: String, domainName: String): Domains
  // Inserts a domain of the customer.
  def insert(resource: Domains, customer: String): Domains
  // Lists the domains of the customer.
  def list(customer: String): Domains2
  // Deletes a domain of the customer.
  def remove(customer: String, domainName: String): Unit
}

object DomainsCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[Domains],
    insert: (Domains, String) => CallbackTo[Domains],
    list: String => CallbackTo[Domains2],
    remove: (String, String) => Callback
  ): DomainsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains, t1: java.lang.String) => insert(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[DomainsCollection]
  }
}

