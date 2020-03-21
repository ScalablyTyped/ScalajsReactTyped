package typingsJapgolly.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclickbidmanager.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieves stored reports. */
  def listreports(request: AnonFields): Request_[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(listreports: AnonFields => CallbackTo[Request_[ListReportsResponse]]): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listreports")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonFields) => listreports(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

