package typingsJapgolly.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressUpdate extends js.Object {
  /**
    * The new IP address.
    */
  var Ip: js.UndefOr[typingsJapgolly.awsSdk.route53resolverMod.Ip] = js.native
  /**
    *  Only when removing an IP address from a resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  /**
    * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
    */
  var SubnetId: js.UndefOr[typingsJapgolly.awsSdk.route53resolverMod.SubnetId] = js.native
}

object IpAddressUpdate {
  @scala.inline
  def apply(Ip: Ip = null, IpId: ResourceId = null, SubnetId: SubnetId = null): IpAddressUpdate = {
    val __obj = js.Dynamic.literal()
    if (Ip != null) __obj.updateDynamic("Ip")(Ip.asInstanceOf[js.Any])
    if (IpId != null) __obj.updateDynamic("IpId")(IpId.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressUpdate]
  }
}

