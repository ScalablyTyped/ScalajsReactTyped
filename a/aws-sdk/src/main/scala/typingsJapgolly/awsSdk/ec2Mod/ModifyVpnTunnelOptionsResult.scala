package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnTunnelOptionsResult extends js.Object {
  var VpnConnection: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.VpnConnection] = js.native
}

object ModifyVpnTunnelOptionsResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): ModifyVpnTunnelOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelOptionsResult]
  }
}

