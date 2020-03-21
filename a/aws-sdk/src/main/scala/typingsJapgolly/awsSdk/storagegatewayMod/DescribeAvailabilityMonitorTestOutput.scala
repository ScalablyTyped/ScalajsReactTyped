package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityMonitorTestOutput extends js.Object {
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The time the High Availability monitoring test was started. If a test hasn't been performed, the value of this field is null.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is null.
    */
  var Status: js.UndefOr[AvailabilityMonitorTestStatus] = js.native
}

object DescribeAvailabilityMonitorTestOutput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN = null,
    StartTime: js.Date = null,
    Status: AvailabilityMonitorTestStatus = null
  ): DescribeAvailabilityMonitorTestOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityMonitorTestOutput]
  }
}

