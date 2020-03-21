package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonBillableWinningBidsResource extends js.Object {
  /**
    * List all reasons for which winning bids were not billable, with the number
    * of bids not billed for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListNonBillableWinningBidsResponse]
}

object NonBillableWinningBidsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => CallbackTo[Request_[ListNonBillableWinningBidsResponse]]): NonBillableWinningBidsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId) => list(t0).runNow()))
    __obj.asInstanceOf[NonBillableWinningBidsResource]
  }
}

