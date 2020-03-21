package typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons for which a buyer was not billed
  * for a winning bid.
  */
@js.native
trait SchemaListNonBillableWinningBidsResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListNonBillableWinningBidsRequest.pageToken field in the subsequent call
    * to the nonBillableWinningBids.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of rows, with counts of bids not billed aggregated by reason.
    */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[SchemaNonBillableWinningBidStatusRow]] = js.native
}

object SchemaListNonBillableWinningBidsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    nonBillableWinningBidStatusRows: js.Array[SchemaNonBillableWinningBidStatusRow] = null
  ): SchemaListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nonBillableWinningBidStatusRows != null) __obj.updateDynamic("nonBillableWinningBidStatusRows")(nonBillableWinningBidStatusRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNonBillableWinningBidsResponse]
  }
}

