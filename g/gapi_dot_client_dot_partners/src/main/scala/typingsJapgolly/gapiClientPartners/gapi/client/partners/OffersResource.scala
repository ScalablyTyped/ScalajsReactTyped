package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffersResource extends js.Object {
  var history: HistoryResource
  /** Lists the Offers available for the current user */
  def list(request: AnonFields): Request_[ListOffersResponse]
}

object OffersResource {
  @scala.inline
  def apply(history: HistoryResource, list: AnonFields => CallbackTo[Request_[ListOffersResponse]]): OffersResource = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[OffersResource]
  }
}

