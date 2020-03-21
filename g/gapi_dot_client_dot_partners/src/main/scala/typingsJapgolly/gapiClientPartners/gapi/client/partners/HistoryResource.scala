package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonEntireCompany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the Historical Offers for the current user (or user's entire company) */
  def list(request: AnonEntireCompany): Request_[ListOffersHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(list: AnonEntireCompany => CallbackTo[Request_[ListOffersHistoryResponse]]): HistoryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonEntireCompany) => list(t0).runNow()))
    __obj.asInstanceOf[HistoryResource]
  }
}

