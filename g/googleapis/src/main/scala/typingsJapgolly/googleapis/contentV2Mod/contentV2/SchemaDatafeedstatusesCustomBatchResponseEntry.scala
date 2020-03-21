package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch datafeedstatuses response.
  */
@js.native
trait SchemaDatafeedstatusesCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The requested data feed status. Defined if and only if the request was
    * successful.
    */
  var datafeedStatus: js.UndefOr[SchemaDatafeedStatus] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
}

object SchemaDatafeedstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    datafeedStatus: SchemaDatafeedStatus = null,
    errors: SchemaErrors = null
  ): SchemaDatafeedstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeedStatus != null) __obj.updateDynamic("datafeedStatus")(datafeedStatus.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedstatusesCustomBatchResponseEntry]
  }
}

