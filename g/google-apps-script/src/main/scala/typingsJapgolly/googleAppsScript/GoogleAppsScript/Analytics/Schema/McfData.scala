package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfData extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[McfDataColumnHeaders]] = js.undefined
  var containsSampledData: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var previousLink: js.UndefOr[String] = js.undefined
  var profileInfo: js.UndefOr[McfDataProfileInfo] = js.undefined
  var query: js.UndefOr[McfDataQuery] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[McfDataRows]]] = js.undefined
  var sampleSize: js.UndefOr[String] = js.undefined
  var sampleSpace: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
  var totalsForAllResults: js.UndefOr[js.Object] = js.undefined
}

object McfData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[McfDataColumnHeaders] = null,
    containsSampledData: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    profileInfo: McfDataProfileInfo = null,
    query: McfDataQuery = null,
    rows: js.Array[js.Array[McfDataRows]] = null,
    sampleSize: String = null,
    sampleSpace: String = null,
    selfLink: String = null,
    totalResults: Int | Double = null,
    totalsForAllResults: js.Object = null
  ): McfData = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(containsSampledData)) __obj.updateDynamic("containsSampledData")(containsSampledData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink.asInstanceOf[js.Any])
    if (profileInfo != null) __obj.updateDynamic("profileInfo")(profileInfo.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (sampleSpace != null) __obj.updateDynamic("sampleSpace")(sampleSpace.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (totalsForAllResults != null) __obj.updateDynamic("totalsForAllResults")(totalsForAllResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[McfData]
  }
}

