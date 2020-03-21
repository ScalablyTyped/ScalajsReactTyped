package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Privileges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivilegesCollection extends js.Object {
  // Retrieves a paginated list of all privileges for a customer.
  def list(customer: String): Privileges
}

object PrivilegesCollection {
  @scala.inline
  def apply(list: String => CallbackTo[Privileges]): PrivilegesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[PrivilegesCollection]
  }
}

