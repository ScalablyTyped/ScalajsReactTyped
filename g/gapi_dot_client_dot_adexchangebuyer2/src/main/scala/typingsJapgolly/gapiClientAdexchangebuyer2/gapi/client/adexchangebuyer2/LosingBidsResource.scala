package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LosingBidsResource extends js.Object {
  /**
    * List all reasons for which bids lost in the auction, with the number of
    * bids that lost for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListLosingBidsResponse]
}

object LosingBidsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => CallbackTo[Request_[ListLosingBidsResponse]]): LosingBidsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId) => list(t0).runNow()))
    __obj.asInstanceOf[LosingBidsResource]
  }
}

