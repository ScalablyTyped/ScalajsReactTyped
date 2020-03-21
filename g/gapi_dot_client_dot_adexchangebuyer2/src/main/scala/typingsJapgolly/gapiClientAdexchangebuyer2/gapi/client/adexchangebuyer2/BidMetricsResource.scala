package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of bids. */
  def list(request: AnonFilterSetId): Request_[ListBidMetricsResponse]
}

object BidMetricsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => CallbackTo[Request_[ListBidMetricsResponse]]): BidMetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId) => list(t0).runNow()))
    __obj.asInstanceOf[BidMetricsResource]
  }
}

