package typingsJapgolly.pulumiAws.inputMod.ec2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionVgwTelemetry extends js.Object {
  var acceptedRouteCount: js.UndefOr[Input[Double]] = js.native
  var lastStatusChange: js.UndefOr[Input[String]] = js.native
  var outsideIpAddress: js.UndefOr[Input[String]] = js.native
  var status: js.UndefOr[Input[String]] = js.native
  var statusMessage: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionVgwTelemetry {
  @scala.inline
  def apply(
    acceptedRouteCount: Input[Double] = null,
    lastStatusChange: Input[String] = null,
    outsideIpAddress: Input[String] = null,
    status: Input[String] = null,
    statusMessage: Input[String] = null
  ): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal()
    if (acceptedRouteCount != null) __obj.updateDynamic("acceptedRouteCount")(acceptedRouteCount.asInstanceOf[js.Any])
    if (lastStatusChange != null) __obj.updateDynamic("lastStatusChange")(lastStatusChange.asInstanceOf[js.Any])
    if (outsideIpAddress != null) __obj.updateDynamic("outsideIpAddress")(outsideIpAddress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
}

