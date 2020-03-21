package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreativeStatusBreakdownByDetailResponse extends js.Object {
  /** The type of detail that the detail IDs represent. */
  var detailType: js.UndefOr[String] = js.undefined
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[FilteredBidDetailRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativeStatusBreakdownByDetailRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.details.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCreativeStatusBreakdownByDetailResponse {
  @scala.inline
  def apply(
    detailType: String = null,
    filteredBidDetailRows: js.Array[FilteredBidDetailRow] = null,
    nextPageToken: String = null
  ): ListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    if (detailType != null) __obj.updateDynamic("detailType")(detailType.asInstanceOf[js.Any])
    if (filteredBidDetailRows != null) __obj.updateDynamic("filteredBidDetailRows")(filteredBidDetailRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreativeStatusBreakdownByDetailResponse]
  }
}

