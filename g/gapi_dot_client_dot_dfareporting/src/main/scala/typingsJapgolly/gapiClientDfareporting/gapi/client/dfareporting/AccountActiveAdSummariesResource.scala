package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesResource extends js.Object {
  /** Gets the account's active ad summary by account ID. */
  def get(request: AnonAlt): Request_[AccountActiveAdSummary]
}

object AccountActiveAdSummariesResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[AccountActiveAdSummary]]): AccountActiveAdSummariesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[AccountActiveAdSummariesResource]
  }
}

