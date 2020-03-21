package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponsesWithoutBidsResource extends js.Object {
  /**
    * List all reasons for which bid responses were considered to have no
    * applicable bids, with the number of bid responses affected for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListBidResponsesWithoutBidsResponse]
}

object BidResponsesWithoutBidsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => CallbackTo[Request_[ListBidResponsesWithoutBidsResponse]]): BidResponsesWithoutBidsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId) => list(t0).runNow()))
    __obj.asInstanceOf[BidResponsesWithoutBidsResource]
  }
}

