package typingsJapgolly.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopContinuousExportResponse extends js.Object {
  /**
    * Timestamp that represents when this continuous export started collecting data.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * Timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[js.Date] = js.native
}

object StopContinuousExportResponse {
  @scala.inline
  def apply(startTime: js.Date = null, stopTime: js.Date = null): StopContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContinuousExportResponse]
  }
}

