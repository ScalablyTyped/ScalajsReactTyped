package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNonBillableWinningBidsResponse extends js.Object {
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListNonBillableWinningBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.nonBillableWinningBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** List of rows, with counts of bids not billed aggregated by reason. */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[NonBillableWinningBidStatusRow]] = js.undefined
}

object ListNonBillableWinningBidsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    nonBillableWinningBidStatusRows: js.Array[NonBillableWinningBidStatusRow] = null
  ): ListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nonBillableWinningBidStatusRows != null) __obj.updateDynamic("nonBillableWinningBidStatusRows")(nonBillableWinningBidStatusRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNonBillableWinningBidsResponse]
  }
}

