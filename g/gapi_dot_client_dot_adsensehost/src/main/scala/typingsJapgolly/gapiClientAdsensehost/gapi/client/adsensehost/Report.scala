package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import typingsJapgolly.gapiClientAdsensehost.AnonCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var averages: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The header information of the columns requested in the report. This is a list of headers; one for each dimension in the request, followed by one for
    * each metric in the request.
    */
  var headers: js.UndefOr[js.Array[AnonCurrency]] = js.undefined
  /** Kind this is, in this case adsensehost#report. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request. The
    * dimension cells contain strings, and the metric cells contain numbers.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /**
    * The total number of rows matched by the report request. Fewer rows may be returned in the response due to being limited by the row count requested or
    * the report row limit.
    */
  var totalMatchedRows: js.UndefOr[String] = js.undefined
  /** The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var totals: js.UndefOr[js.Array[String]] = js.undefined
  /** Any warnings associated with generation of the report. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    averages: js.Array[String] = null,
    headers: js.Array[AnonCurrency] = null,
    kind: String = null,
    rows: js.Array[js.Array[String]] = null,
    totalMatchedRows: String = null,
    totals: js.Array[String] = null,
    warnings: js.Array[String] = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (averages != null) __obj.updateDynamic("averages")(averages.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (totalMatchedRows != null) __obj.updateDynamic("totalMatchedRows")(totalMatchedRows.asInstanceOf[js.Any])
    if (totals != null) __obj.updateDynamic("totals")(totals.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
}

