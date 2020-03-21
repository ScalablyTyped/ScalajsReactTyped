package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionResult extends js.Object {
  /**
    * Information about the VPN connection.
    */
  var VpnConnection: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.VpnConnection] = js.native
}

object CreateVpnConnectionResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): CreateVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnConnectionResult]
  }
}

