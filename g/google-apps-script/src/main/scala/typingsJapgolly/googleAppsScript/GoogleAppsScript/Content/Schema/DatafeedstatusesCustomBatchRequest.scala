package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[DatafeedstatusesCustomBatchRequestEntry]] = js.undefined
}

object DatafeedstatusesCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[DatafeedstatusesCustomBatchRequestEntry] = null): DatafeedstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedstatusesCustomBatchRequest]
  }
}

