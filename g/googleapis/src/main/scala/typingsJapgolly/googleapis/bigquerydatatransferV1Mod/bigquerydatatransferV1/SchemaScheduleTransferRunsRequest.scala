package typingsJapgolly.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to schedule transfer runs for a time range.
  */
@js.native
trait SchemaScheduleTransferRunsRequest extends js.Object {
  /**
    * End time of the range of transfer runs. For example,
    * `&quot;2017-05-30T00:00:00+00:00&quot;`.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the range of transfer runs. For example,
    * `&quot;2017-05-25T00:00:00+00:00&quot;`.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaScheduleTransferRunsRequest {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): SchemaScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScheduleTransferRunsRequest]
  }
}

