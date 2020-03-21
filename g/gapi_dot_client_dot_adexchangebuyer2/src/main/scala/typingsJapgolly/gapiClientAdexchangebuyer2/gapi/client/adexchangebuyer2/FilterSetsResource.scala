package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFields
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonIsTransient
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSetsResource extends js.Object {
  var bidMetrics: BidMetricsResource
  var bidResponseErrors: BidResponseErrorsResource
  var bidResponsesWithoutBids: BidResponsesWithoutBidsResource
  var filteredBidRequests: FilteredBidRequestsResource
  var filteredBids: FilteredBidsResource
  var impressionMetrics: ImpressionMetricsResource
  var losingBids: LosingBidsResource
  var nonBillableWinningBids: NonBillableWinningBidsResource
  /** Creates the specified filter set for the account with the given account ID. */
  def create(request: AnonIsTransient): Request_[FilterSet]
  /**
    * Deletes the requested filter set from the account with the given account
    * ID.
    */
  def delete(request: AnonPp): Request_[js.Object]
  /**
    * Retrieves the requested filter set for the account with the given account
    * ID.
    */
  def get(request: AnonPp): Request_[FilterSet]
  /** Lists all filter sets for the account with the given account ID. */
  def list(request: AnonFields): Request_[ListFilterSetsResponse]
}

object FilterSetsResource {
  @scala.inline
  def apply(
    bidMetrics: BidMetricsResource,
    bidResponseErrors: BidResponseErrorsResource,
    bidResponsesWithoutBids: BidResponsesWithoutBidsResource,
    create: AnonIsTransient => CallbackTo[Request_[FilterSet]],
    delete: AnonPp => CallbackTo[Request_[js.Object]],
    filteredBidRequests: FilteredBidRequestsResource,
    filteredBids: FilteredBidsResource,
    get: AnonPp => CallbackTo[Request_[FilterSet]],
    impressionMetrics: ImpressionMetricsResource,
    list: AnonFields => CallbackTo[Request_[ListFilterSetsResponse]],
    losingBids: LosingBidsResource,
    nonBillableWinningBids: NonBillableWinningBidsResource
  ): FilterSetsResource = {
    val __obj = js.Dynamic.literal(bidMetrics = bidMetrics.asInstanceOf[js.Any], bidResponseErrors = bidResponseErrors.asInstanceOf[js.Any], bidResponsesWithoutBids = bidResponsesWithoutBids.asInstanceOf[js.Any], filteredBidRequests = filteredBidRequests.asInstanceOf[js.Any], filteredBids = filteredBids.asInstanceOf[js.Any], impressionMetrics = impressionMetrics.asInstanceOf[js.Any], losingBids = losingBids.asInstanceOf[js.Any], nonBillableWinningBids = nonBillableWinningBids.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonIsTransient) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonPp) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonPp) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[FilterSetsResource]
  }
}

