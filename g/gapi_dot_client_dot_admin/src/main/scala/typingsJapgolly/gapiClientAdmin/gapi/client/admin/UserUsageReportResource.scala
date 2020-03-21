package typingsJapgolly.gapiClientAdmin.gapi.client.admin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdmin.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: AnonFields): Request_[UsageReports]
}

object UserUsageReportResource {
  @scala.inline
  def apply(get: AnonFields => CallbackTo[Request_[UsageReports]]): UserUsageReportResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdmin.AnonFields) => get(t0).runNow()))
    __obj.asInstanceOf[UserUsageReportResource]
  }
}

