package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientVpnEndpointResult extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
}

object CreateClientVpnEndpointResult {
  @scala.inline
  def apply(ClientVpnEndpointId: String = null, DnsName: String = null, Status: ClientVpnEndpointStatus = null): CreateClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId.asInstanceOf[js.Any])
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnEndpointResult]
  }
}

