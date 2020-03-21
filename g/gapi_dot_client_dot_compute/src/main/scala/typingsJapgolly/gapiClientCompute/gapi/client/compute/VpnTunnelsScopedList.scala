package typingsJapgolly.gapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsScopedList extends js.Object {
  /** List of vpn tunnels contained in this scope. */
  var vpnTunnels: js.UndefOr[js.Array[VpnTunnel]] = js.undefined
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object VpnTunnelsScopedList {
  @scala.inline
  def apply(vpnTunnels: js.Array[VpnTunnel] = null, warning: AnonCode = null): VpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    if (vpnTunnels != null) __obj.updateDynamic("vpnTunnels")(vpnTunnels.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnTunnelsScopedList]
  }
}

