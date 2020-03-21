package typingsJapgolly.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportData extends js.Object {
  /**
    * The last time the data in the report was refreshed. All the hits received
    * before this timestamp are included in the calculation of the report.
    */
  var dataLastRefreshed: js.UndefOr[String] = js.undefined
  /**
    * Indicates if response to this request is golden or not. Data is
    * golden when the exact same request will not produce any new results if
    * asked at a later point in time.
    */
  var isDataGolden: js.UndefOr[Boolean] = js.undefined
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when
    * rowCount is zero.
    */
  var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when
    * rowCount is zero.
    */
  var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
  /** Total number of matching rows for this query. */
  var rowCount: js.UndefOr[Double] = js.undefined
  /** There's one ReportRow for every unique combination of dimensions. */
  var rows: js.UndefOr[js.Array[ReportRow]] = js.undefined
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192),
    * this returns the total number of samples read, one entry per date range.
    * If the results are not sampled this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192),
    * this returns the total number of
    * samples present, one entry per date range. If the results are not sampled
    * this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * For each requested date range, for the set of all rows that match
    * the query, every requested value format gets a total. The total
    * for a value format is computed by first totaling the metrics
    * mentioned in the value format and then evaluating the value
    * format as a scalar expression.  E.g., The "totals" for
    * `3 / (ga:sessions + 2)` we compute
    * `3 / ((sum of all relevant ga:sessions) + 2)`.
    * Totals are computed before pagination.
    */
  var totals: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}

object ReportData {
  @scala.inline
  def apply(
    dataLastRefreshed: String = null,
    isDataGolden: js.UndefOr[Boolean] = js.undefined,
    maximums: js.Array[DateRangeValues] = null,
    minimums: js.Array[DateRangeValues] = null,
    rowCount: Int | Double = null,
    rows: js.Array[ReportRow] = null,
    samplesReadCounts: js.Array[String] = null,
    samplingSpaceSizes: js.Array[String] = null,
    totals: js.Array[DateRangeValues] = null
  ): ReportData = {
    val __obj = js.Dynamic.literal()
    if (dataLastRefreshed != null) __obj.updateDynamic("dataLastRefreshed")(dataLastRefreshed.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataGolden)) __obj.updateDynamic("isDataGolden")(isDataGolden.asInstanceOf[js.Any])
    if (maximums != null) __obj.updateDynamic("maximums")(maximums.asInstanceOf[js.Any])
    if (minimums != null) __obj.updateDynamic("minimums")(minimums.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (samplesReadCounts != null) __obj.updateDynamic("samplesReadCounts")(samplesReadCounts.asInstanceOf[js.Any])
    if (samplingSpaceSizes != null) __obj.updateDynamic("samplingSpaceSizes")(samplingSpaceSizes.asInstanceOf[js.Any])
    if (totals != null) __obj.updateDynamic("totals")(totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportData]
  }
}

