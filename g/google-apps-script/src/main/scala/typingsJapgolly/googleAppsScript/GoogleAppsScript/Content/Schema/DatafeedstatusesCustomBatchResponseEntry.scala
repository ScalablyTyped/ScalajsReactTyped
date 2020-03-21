package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var datafeedStatus: js.UndefOr[DatafeedStatus] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
}

object DatafeedstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(batchId: Int | Double = null, datafeedStatus: DatafeedStatus = null, errors: Errors = null): DatafeedstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeedStatus != null) __obj.updateDynamic("datafeedStatus")(datafeedStatus.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponseEntry]
  }
}

