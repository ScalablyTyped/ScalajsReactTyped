package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewaySoftwareNowOutput extends js.Object {
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object UpdateGatewaySoftwareNowOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): UpdateGatewaySoftwareNowOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewaySoftwareNowOutput]
  }
}

