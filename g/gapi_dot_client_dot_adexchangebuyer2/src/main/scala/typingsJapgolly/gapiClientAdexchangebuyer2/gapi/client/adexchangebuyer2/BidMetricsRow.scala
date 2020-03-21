package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidMetricsRow extends js.Object {
  /** The number of bids that Ad Exchange received from the buyer. */
  var bids: js.UndefOr[MetricValue] = js.undefined
  /** The number of bids that were permitted to compete in the auction. */
  var bidsInAuction: js.UndefOr[MetricValue] = js.undefined
  /** The number of bids for which the buyer was billed. */
  var billedImpressions: js.UndefOr[MetricValue] = js.undefined
  /** The number of bids that won an impression. */
  var impressionsWon: js.UndefOr[MetricValue] = js.undefined
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  /**
    * The number of bids for which the corresponding impression was viewable (as
    * defined by Active View).
    */
  var viewableImpressions: js.UndefOr[MetricValue] = js.undefined
}

object BidMetricsRow {
  @scala.inline
  def apply(
    bids: MetricValue = null,
    bidsInAuction: MetricValue = null,
    billedImpressions: MetricValue = null,
    impressionsWon: MetricValue = null,
    measurableImpressions: MetricValue = null,
    rowDimensions: RowDimensions = null,
    viewableImpressions: MetricValue = null
  ): BidMetricsRow = {
    val __obj = js.Dynamic.literal()
    if (bids != null) __obj.updateDynamic("bids")(bids.asInstanceOf[js.Any])
    if (bidsInAuction != null) __obj.updateDynamic("bidsInAuction")(bidsInAuction.asInstanceOf[js.Any])
    if (billedImpressions != null) __obj.updateDynamic("billedImpressions")(billedImpressions.asInstanceOf[js.Any])
    if (impressionsWon != null) __obj.updateDynamic("impressionsWon")(impressionsWon.asInstanceOf[js.Any])
    if (measurableImpressions != null) __obj.updateDynamic("measurableImpressions")(measurableImpressions.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (viewableImpressions != null) __obj.updateDynamic("viewableImpressions")(viewableImpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidMetricsRow]
  }
}

