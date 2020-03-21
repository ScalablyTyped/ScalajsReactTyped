package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastRegisteredGroupSources extends js.Object {
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The IDs of the network interfaces members registered with the transit gateway multicast group.
    */
  var RegisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastRegisteredGroupSources {
  @scala.inline
  def apply(
    GroupIpAddress: String = null,
    RegisteredNetworkInterfaceIds: ValueStringList = null,
    TransitGatewayMulticastDomainId: String = null
  ): TransitGatewayMulticastRegisteredGroupSources = {
    val __obj = js.Dynamic.literal()
    if (GroupIpAddress != null) __obj.updateDynamic("GroupIpAddress")(GroupIpAddress.asInstanceOf[js.Any])
    if (RegisteredNetworkInterfaceIds != null) __obj.updateDynamic("RegisteredNetworkInterfaceIds")(RegisteredNetworkInterfaceIds.asInstanceOf[js.Any])
    if (TransitGatewayMulticastDomainId != null) __obj.updateDynamic("TransitGatewayMulticastDomainId")(TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayMulticastRegisteredGroupSources]
  }
}

