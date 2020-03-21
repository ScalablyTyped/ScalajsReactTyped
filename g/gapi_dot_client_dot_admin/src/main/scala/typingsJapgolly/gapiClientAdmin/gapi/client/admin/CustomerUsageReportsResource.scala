package typingsJapgolly.gapiClientAdmin.gapi.client.admin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdmin.AnonDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerUsageReportsResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a specific customer. */
  def get(request: AnonDate): Request_[UsageReports]
}

object CustomerUsageReportsResource {
  @scala.inline
  def apply(get: AnonDate => CallbackTo[Request_[UsageReports]]): CustomerUsageReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdmin.AnonDate) => get(t0).runNow()))
    __obj.asInstanceOf[CustomerUsageReportsResource]
  }
}

